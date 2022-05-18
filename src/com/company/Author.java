package com.company;

public class Author {
    String name;
    String lastname;
    String gender;

    Author(String name, String lastname, String gender){
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author: " + name + " " + lastname + ", gender: " + gender;
    }
}
