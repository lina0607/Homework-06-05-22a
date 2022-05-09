package com.company;

public class Student extends Person{

    String typeOfStudy = "Java Developer";
    int yearOfStudy = 2022;
    float studyPrice = 100;

    Student() {
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.studyPrice = studyPrice;
    }

    public static void printDetails() {
    }

    String getTypeOfStudy() {
        return typeOfStudy;
    }

    int getYearOfStudy() {
        return yearOfStudy;
    }

    float getStudyPrice() {
        return studyPrice;
    }

    public float[] getLecturer() {
        return new float[]{Float.parseFloat(typeOfStudy), yearOfStudy, studyPrice};
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setStudyPrice(float studyPrice) {
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
