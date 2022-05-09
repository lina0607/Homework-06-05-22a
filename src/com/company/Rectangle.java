package com.company;

public class Rectangle extends Shape {

    double width;
    double length;

    Rectangle() {
        color = "unknown";
        boolean isFilled = false;
        double width = 1;
        double length = 1;
    }

    Rectangle(String color, boolean isFilled, double width, double length) {
        this.color = color;
        this.isFilled = false;
        this.width = width;
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return width*length;
    }

    double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + getShape() + getColor() +'}';
    }
}
