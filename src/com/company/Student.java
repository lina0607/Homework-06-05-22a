package com.company;

public class Student extends Person{

    private String typeOfStudy;
    private int yearOfStudy;
    private double studyPrice;

    Student(String typeOfStudy, int yearOfStudy, double studyPrice) {
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }


    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public double getStudyPrice() {
        return studyPrice;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setStudyPrice(double studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", studyPrice=" + studyPrice +
                '}';
    }
}
