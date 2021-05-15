package com.example.graphview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.PointsGraphSeries;

public class MainActivity extends AppCompatActivity {


    GraphView graphView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        graphView=findViewById(R.id.graphview);
        PointsGraphSeries<DataPoint> series=new PointsGraphSeries<>(getDataPoint());

        graphView.addSeries(series);
        series.setShape(PointsGraphSeries.Shape.TRIANGLE);
        series.setSize(50);
        series.setColor(Color.RED);
        series.setCustomShape(new PointsGraphSeries.CustomShape() {
            @Override
            public void draw(Canvas canvas, Paint paint, float x, float y, DataPointInterface dataPoint) {
                paint.setStrokeWidth(5);
                canvas.drawLine(x-20,    y,        x,y-20,paint);
                canvas.drawLine(       x,y-20,x+20,    y,paint);
                canvas.drawLine(x+20,    y,          x,y+20,paint);
                canvas.drawLine(x-20,    y,          x,y+20,paint);
            }
        });
        series.setTitle("Title");

        graphView.getLegendRenderer().setVisible(true);
        graphView.getLegendRenderer().setFixedPosition(4,5);
//        graphView.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        graphView.getLegendRenderer().setTextColor(Color.BLUE);
        graphView.getLegendRenderer().setTextSize(40);


        graphView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LabelView.class));

            }
        });
        graphView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(MainActivity.this,ZoomGraph.class));
                return false;

            }
        });
    }

    private DataPoint[] getDataPoint() {
        DataPoint[] dp=new DataPoint[]{
                new DataPoint(0,1),
                new DataPoint(2,1),
                new DataPoint(3,5),
                new DataPoint(6,2),
                new DataPoint(7,8),
        };
        return dp;
    }
}
