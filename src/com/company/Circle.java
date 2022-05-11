package com.company;

public class Circle extends Shape{

    float radius;

    Circle() {
        super();
        this.radius = 1f;
    }

    Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);      //questo e'pari alla transcrizione this.setColor = color, this.setFilled = isFilled
        this.radius = radius;
    }

    float getRadius() {
        return radius;
    }

    void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with radius" + radius +"which is a subclass of " + super.toString();
    }
}

