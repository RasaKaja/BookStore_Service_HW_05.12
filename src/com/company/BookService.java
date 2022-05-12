package com.company;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Author> authors = new ArrayList<Author>();

    Scanner scanner = new Scanner(System.in);

    public void addBook(){
        // declare and initialize new book
        Book book = new Book();

        System.out.println("Please input the necessary info about the book.");

        System.out.print("Author: ");
        //authors. = scanner.nextLine();

        System.out.print("Title: ");
        book.title = scanner.nextLine();

        System.out.print("Genre: ");
        book.genre = Genre.valueOf(scanner.nextLine());

        System.out.print("Year of Release: ");
        book.yearOfRelease = scanner.nextInt();

        System.out.print("Price: ");
        book.price = scanner.nextDouble();

        this.books.add(book);
    }

    void removeBook() {

    }

    void listBooks(){
        System.out.println("This is the List of Books: \n");
        for (Book book : books){
            System.out.println("Book " + book);
        }
    }

    public void listBooksByFantasy(){
        System.out.println("This is the List of FANTASY Books: ");
        for (Book book : books) {
            if (books.contains("FANTASY")) {
                System.out.println();
            }
        }
    }

    void listBookBefore1999(){

    }

    void getMostExpensiveBook(){

    }

    void getCheapestBook(){

    }

    void getSortedBooks(){

    }

    void verifyBook(){

    }

    void getBooksByAuthor(){

    }

    void getBookBy3Authors(){

    }




}
