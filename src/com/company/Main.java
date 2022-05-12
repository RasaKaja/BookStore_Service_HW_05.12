package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Welcome to the BOOK SERVICE!");
//        BookService bookService = new BookService();
//        Scanner scanner1 = new Scanner(System.in);
//
//
//        String input = "";
//        do{
//            System.out.println("Please choose an activity:");
//            System.out.println("""
//                    1. Add a NEW Book
//                    2. Show the List of ALL Books
//                    3. Show the List of FANTASY books
//                    4. Show the List of Books released BEFORE 1999
//                    5. Show the most EXPENSIVE Book
//                    6. Show the CHEAPEST Book
//                    7. VERIFY Book
//                    8. Show the List of Books by AUTHOR
//                    9. Show the List oof Books BY THREE AUTHORS
//                    10. Remove the Book from the List
//                    0. Quit
//                    """);
//
//            input = scanner1.nextLine();
//            switch (input){
//                case "1":
//                    bookService.addBook();
//                    break;
//                case "2":
//                    bookService.listBooks();
//                    break;
//                case "3":
//                    bookService.listBooksByFantasy();
//                    break;
//                case "4":
//                    bookService.listBookBefore1999();
//                    break;
//                case "5":
//                    bookService.getMostExpensiveBook();
//                    break;
//                case "6":
//                    bookService.getCheapestBook();
//                    break;
//                case "7":
//                    bookService.verifyBook();
//                    break;
//                case "8":
//                    bookService.getBooksByAuthor();
//                    break;
//                case "9":
//                    bookService.getBookBy3Authors();
//                    break;
//                case "10":
//                    bookService.removeBook();
//                    break;
//                case "0":
//                    System.out.println("Quiting Application.");
//            }
//        } while (!input.equals("0"));


//        Author author = new Author("Yann", "Martel", "male");
//        Author author1 = new Author("Alexandre", "Dumas", "male");
//        System.out.println(author);
//        System.out.println(author1);
//
//        Book book = new Book("Life of Pi", Genre.ADVENTURE, 2001, 15d);
//        Book book1 = new Book("The Three Musketeers", Genre.ADVENTURE, 1844, 25d);
//        System.out.println(book);
//        System.out.println(book1);

        Book book = new Book("Life of Pi", Genre.FANTASY, 2001, 15d);
        System.out.println(book);



    }
}
