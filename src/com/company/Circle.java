package com.company;

public class Circle extends Shape{

    int radius;

    Circle() {
        color = "unknown";
        boolean isFilled = false;
        int radius = 1;
    }

    Circle(String color, boolean isFilled, int radius) {
        this.color = color;
        this.isFilled = false;
        this.radius = radius;
    }

    int getRadius() {
        return radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius*radius*Math.PI;
    }

    double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "with radius=" + radius + getShape() + getColor() + '}';
    }
}

