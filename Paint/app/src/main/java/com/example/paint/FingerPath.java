package com.example.paint;

import android.graphics.Path;

public class FingerPath {
    public int color;
    public boolean emboss;
    public boolean blur;

    public FingerPath(int color, boolean emboss, boolean blur, int strokeWidth, Path path) {
        this.color = color;
        this.emboss = emboss;
        this.blur = blur;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }

    public int strokeWidth;
    public android.graphics.Path path;

}
