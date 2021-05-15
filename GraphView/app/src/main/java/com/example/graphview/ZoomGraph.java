package com.example.graphview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.PointsGraphSeries;

public class ZoomGraph extends AppCompatActivity {

    GraphView graphView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_graph);
        graphView=findViewById(R.id.graphview);
        PointsGraphSeries<DataPoint> series=new PointsGraphSeries<>(getDataPoint());

        graphView.addSeries(series);
        series.setShape(PointsGraphSeries.Shape.TRIANGLE);
        series.setSize(50);
        series.setColor(Color.RED);
        graphView.getViewport().setXAxisBoundsManual(true);
        graphView.getViewport().setMinX(2);
        graphView.getViewport().setMaxX(6);

        graphView.getViewport().setYAxisBoundsManual(true);
        graphView.getViewport().setMinY(2);
        graphView.getViewport().setMaxY(6);

        graphView.getViewport().setScrollable(true);
        graphView.getViewport().setScalableY(true);

        graphView.getViewport().setScalable(true);
        graphView.getViewport().setScalableY(true);
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
