package com.company;

import java.util.ArrayList;

public class Book {
    private ArrayList<Author> authors = new ArrayList<Author>();
    String title;
    double price;
    int yearOfRelease;
    Genre genre;


    Book(){
        //Author author = new Author();
        this.authors = authors;
        this.title = " ";
        double price = 0d;
        int yearOfRelease = 0000;
        Genre genre = Genre.UNKNOWN;
    }

    Book(String title, Genre genre, int yearOfRelease, double price){
        this.title = title;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Author: " + authors + ", title: " + title + ", price = " + price + ", yearOfRelease = " + yearOfRelease +
                ", genre = " + genre;
    }
}
