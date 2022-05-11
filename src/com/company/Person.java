package com.company;

abstract class Person {

    String name, address;

    Person() {
        this.name = "";
        this.address = "";
    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
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
        return "name->" + name + "address->" + address;

    }
}


