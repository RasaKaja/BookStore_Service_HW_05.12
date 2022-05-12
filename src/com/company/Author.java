package com.company;

public class Author {
    String name;
    String lastname;
    String gender;

    Author(){
        this.name = "unknown";
        this.lastname = "unknown";
        //this.gender = "not indicated";
    }

    Author(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
        this.gender = "not indicated";
    }

    Author(String name, String lastname, String gender){
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setAuthorInfo(String name, String lastname, String gender){
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author: " + name + " " + lastname + ", gender: " + gender;
    }
}
