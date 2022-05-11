package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Point3D point = new Point3D(3, 4, 5);

        System.out.println(Arrays.toString(point.getXYZ()));
        System.out.println(point.getX());
        System.out.println(point.getZ());


        Student student = new Student("BSc", 2022, 1000 );
        student.setName("Lina");
        student.setAddress("6 test drive ave");
        System.out.println(student);


        Lecturer lecturer = new Lecturer("Data Analysis", 75000);
        student.setName("Lina");
        student.setAddress("6 test drive ave");
        System.out.println(lecturer);


//        Shape blueShape = new Shape("blue", true);
//        Shape redShape = new Shape("red", true);
//        Shape shape = new Shape();
//        System.out.println(blueShape);
//        System.out.println(redShape);
//        System.out.println(shape);

        Circle circle = new Circle();
        Circle bigCircle = new Circle("red", true, 4);
        System.out.println(circle);
        System.out.println(bigCircle);


        Rectangle rectangle = new Rectangle(23, 15, "yellow", false);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        Line line = new Line(0f,0f,5f,5f);
        System.out.println(line.getLength());
        System.out.println(line.getCenter());
    }
}





