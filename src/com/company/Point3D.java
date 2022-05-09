package com.company;

public class Point3D extends Point2D{
    private float z;

    Point3D(float x, float y, float z) {
        this.z = z;
        this.setXY(x, y);
    }

    float getZ() {

        return z;
    }

    public float[] getXYZ() {

        return new float[]{this.getX(), this.getY(), this.getZ()};
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        this.z = z;
        this.setXY(x, y);
    }

    @Override
    public String toString() {
        return "{" + getX() + "," + getY() + z +'}';
    }
}

