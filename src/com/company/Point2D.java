package com.company;

public class Point2D {

    private float x, y;

    //non-argument constructor
    Point2D() {
        this.x = 0;
        this.y = 0;
    }

    // 2 arguments constructor
    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + "," + y + '}';
    }
}

