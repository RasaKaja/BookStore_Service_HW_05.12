package com.company;


import java.util.*;

public class BookService {
    ArrayList<Book> books = new ArrayList<>();

    // Method for add book
    void addBook(Book book){ // any 'book' given here
        books.add(book); // is added to array list 'books'
    }

    Book findByTitle(String title){
        for (Book book: books){
            if (title.equals(book.title)){
                return book;
            }
        }
        return null; // if title doesn't match, it will return null
    }

    void removeBook(Book book) {
        books.remove(book);
    }

    ArrayList<Book> listBooks (){
        return books;
    }

    ArrayList<Book> listBooksByFantasyType () {
        // create new array list to store books by fantasy type
        ArrayList<Book> fantasyBooks = new ArrayList<>();

        // loop through the book in bookstore and add any book that is of fantasy type to the new array list
        for (Book book: books){
            if (book.genre == Genre.FANTASY){
                fantasyBooks.add(book);
            }
        }
        // return the new array list when loop is completed
        return fantasyBooks;
    }

    ArrayList<Book> listBookBefore1999(){
        ArrayList<Book> bookList = new ArrayList<>();

        // loop through the books in the store and add any book published before 1999 to the arraylist
        for (Book book: books){
            if (book.yearOfRelease < 1999){
                bookList.add(book);
            }
        }
        return bookList;
    }

    Book mostExpensiveBook(){
        Book mostExpensiveBook = books.get(0);

        for (Book book: books){
            if (book.price > mostExpensiveBook.price){
                mostExpensiveBook = book;
            }
        }
        return mostExpensiveBook;
    }

    Book cheapestBook(){
        Book cheapestBookInStore = books.get(0);
        for (Book book: books){
            if (book.price < cheapestBookInStore.price){
                cheapestBookInStore = book;
            }
        }
        return cheapestBookInStore;
    }

    Book bookBy3Authors(){
        // loop through all the books in the arraylist
        for (Book book: books){
            if (book.authorList.size() == 3){
                return book; //return any book that has 3 authors
            }
        }
        return null; //return null if no book does
    }

    boolean verifyBook(Book book){
        if (books.contains(book)){
            return true;
        } else {
            return false;
        }
    }

    ArrayList<Book> findBooksByAuthor(Author author){
        ArrayList<Book> booksByProvidedAuthor = new ArrayList<>();

        // loop through all books and check if provided author is among the authors for each book.
        // if yes add the book to the new arraylist of books
        for (Book book: books){
            if (book.authorList.contains(author)){
                booksByProvidedAuthor.add(book);
            }
        }
        return booksByProvidedAuthor;
    }
}
