package com.example.character_identification;

import java.nio.file.Path;

public class FingerPath {

    public int color;
    public boolean emboos;
    public boolean blur;
    public int strokeWidth;
    public Path path;

    public FingerPath(int color, boolean emboos, boolean blur, int strokeWidth, Path path) {
        this.color = color;
        this.emboos = emboos;
        this.blur = blur;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}
