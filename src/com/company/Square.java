package com.company;

public class Square extends Rectangle{

        Square() {          //non-argument constructor
        super();
    }

    Square(double length, String color, boolean isFilled) {
        super(length,length, color, isFilled);
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    public void setWidth(double width) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square with width= " + width + "and length" + length + "which is a subclass off " + super.toString();
    }
}
