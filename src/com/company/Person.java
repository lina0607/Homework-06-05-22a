package com.company;

abstract class Person {

    String name = "Lina Zitniak";
    String address = "94200 Kaunas, Manto gatve 7";

    Person() {
    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    String getName() {

        return name;
    }

    String getAddress() {

        return address;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + name + address +'}';

    }
}


