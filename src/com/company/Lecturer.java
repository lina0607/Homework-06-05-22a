package com.company;

public class Lecturer extends Person {

    String specialization = "Informatics & Software Development";
    float salary = 3500;

    Lecturer(String specialization, float salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public Lecturer() {

    }

    static void printDetails() {
    }

    String getSpecialization() {
        return specialization;
    }

    Float getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" + "specialization='" + specialization + '\'' + ", salary=" + salary + '}';
    }
}


