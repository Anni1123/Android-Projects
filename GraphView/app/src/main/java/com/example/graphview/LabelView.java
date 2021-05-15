package com.example.graphview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.PointsGraphSeries;

public class LabelView extends AppCompatActivity {

    GraphView graphView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_label_view);
        graphView=findViewById(R.id.graphview);
        PointsGraphSeries<DataPoint> series=new PointsGraphSeries<>(getDataPoint());

        graphView.addSeries(series);
        series.setShape(PointsGraphSeries.Shape.TRIANGLE);
        series.setSize(50);
        series.setColor(Color.RED);
        graphView.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter(){
               @Override
               public String formatLabel(double value, boolean isValueX) {
                   if (isValueX) {
                       return "$"+super.formatLabel(value, isValueX);
                   }

                   return super.formatLabel(value, isValueX);
               }
           });
    }

    private DataPoint[] getDataPoint() {
        DataPoint[] dp=new DataPoint[]{
                new DataPoint(0,1),
                new DataPoint(2,7),
                new DataPoint(3,5),
                new DataPoint(5,2),
                new DataPoint(6,7),
        };
        return dp;
    }
}
