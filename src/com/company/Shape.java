package com.company;

public abstract class Shape {

    protected boolean isFilled;
    protected String color;

    Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFilled(boolean isFilled) {

        this.isFilled = isFilled;
    }

    //abstract methods are methods without a body
    public abstract double getArea();

    public abstract double getPerimeter();


    String getFilled() {
        if (isFilled) {
            return "filled";
        } else {
            return "not filled";
        }
    }

    @Override
    public String toString() {
        return "Shape with color " + color + " and" + getFilled();
    }
}

 //   Shape with color of ? and filled/NotFilled`,
 //   where ? is a placeholder for the color and the `filled`/`not filled` info should be returned depending on the `isFilled` field