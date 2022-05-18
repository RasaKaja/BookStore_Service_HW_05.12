package com.company;

import java.util.ArrayList;

public class Book implements Comparable {
    ArrayList<Author> authorList;
    String title;
    double price;
    Integer yearOfRelease; //because we are going to compare, it should be wrapper class
    Genre genre;


    Book(String title, double price, int yearOfRelease, Genre genre){
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.authorList = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Book{" +
                "authorList=" + authorList +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", yearOfRelease=" + yearOfRelease +
                ", genre=" + genre +
                '}';
    }

    public int compareTo(Object o){
        return this.yearOfRelease.compareTo(((Book) o).yearOfRelease);
    }
}
