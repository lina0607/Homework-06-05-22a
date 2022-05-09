package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Point3D point = new Point3D(3, 4, 5);

        System.out.println(Arrays.toString(point.getXYZ()));
        System.out.println(point.getX());
        System.out.println(point.getZ());

        Student student = new Student();
        Lecturer lecturer = new Lecturer();

        Student.printDetails();
        Lecturer.printDetails();

        System.out.println(student.getName() + "," + student.getAddress());
        System.out.println(student.getTypeOfStudy() + "," + student.getYearOfStudy() + "," + student.getStudyPrice());

        System.out.println("LECTURER: specialization " + lecturer.getSpecialization() + ", with salary in euro: " + lecturer.getSalary());

        Circle circle = new Circle();
        System.out.println("The circle with radius of " + circle.getRadius() + ", shape of " + circle.getShape() + ", color " + circle.getColor());

        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle with width= " + rectangle.getWidth() + " and length= " + rectangle.getLength() + ", shape of " + rectangle.getShape() + ", color " + rectangle.getColor());


    }
}





