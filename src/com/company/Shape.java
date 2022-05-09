package com.company;

public class Shape {

    public boolean isFilled;
    String color;
    boolean shape;

    Shape() {
        String color = "unknown";
        boolean isFilled = false;
    }

    Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = false;
    }

    String getColor() {
        return color;
    }

    Boolean getShape() {
        return false;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setShape(boolean shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Shape{" + "with color of=" + color + " and filled/Not filled" + shape + '}';
    }
}

 //   Shape with color of ? and filled/NotFilled`,
 //   where ? is a placeholder for the color and the `filled`/`not filled` info should be returned depending on the `isFilled` field