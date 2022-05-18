package com.company;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    BookService bookService = new BookService();
    Author author = new Author("David", "Olabadone", "Male");

    public static void main(String[] args) {
        System.out.println("Welcome to the BOOK STORE. What would you like to do today?");
        Scanner scanner = new Scanner(System.in);

        Main main = new Main();

        // loop through options as long as user doesn't enter "0"
        String input = "";
        do {
            System.out.println("""
                    1. Add a NEW Book
                    2. Remove the Book from the List
                    3. List of ALL Books
                    4. List of FANTASY books
                    5. List of Books published BEFORE 1999
                    6. The most EXPENSIVE Book
                    7. The CHEAPEST Book
                    8. Add The Author to the book
                    9. Book with 3 Authors
                    10. VERIFY Book
                    11. Return a list of books written by provided Author
                    12. Ascending list of Books by year of release
                    13. Descending list of Books by year of release
                    14.
                    15.
                    0. Quit
                    """);

            input = scanner.nextLine();
            switch (input) {
                case "1":
                    main.addBook();
                    break;
                case "2":
                    main.removeBook();
                    break;
                case "3":
                    main.listBooks();
                    break;
                case "4":
                    main.fantasyBooks();
                    break;
                case "5":
                    main.booksBefore1999();
                    break;
                case "6":
                    main.mostExpensiveBook();
                    break;
                case "7":
                    main.cheapestBook();
                    break;
                case "8":
                    main.addAuthors();
                    break;
                case "9":
                    main.bookBy3Authors();
                    break;
                case "10":
                    main.verifyBook();
                    break;
                case "11":
                    main.findBooksByAuthor();
                    break;
                case "12":
                    main.ascending();
                case "13":
                    main.descending();
                case "0":
                    System.out.println("Quiting Application.");
                    break;
                default:
                    System.out.println("Please enter a valid option!");
            }
        } while (!input.equals("0"));

    }

    // add Book method: responsible for reading inputs from user and creating a new book
    void addBook() {
        System.out.println("Add a new Book to the store.");

        System.out.print("Enter the title: ");
        String title = scanner.nextLine();

        System.out.print("Entre the price: ");
        double price = intScanner.nextDouble();

        System.out.print("Enter the year of release: ");
        int yearOfRelease = intScanner.nextInt();

        System.out.print("Enter Genre: ");
        String stringGenre = scanner.nextLine();

        Genre genre;

        switch (stringGenre) {
            case "FANTASY":
                genre = Genre.FANTASY;
                break;
            case "Thriller":
                genre = Genre.THRILLER;
                break;
            case "Romance":
                genre = Genre.ROMANCE;
                break;
            default:
                genre = Genre.FANTASY;
                break;
        }

        Book book = new Book(title, price, yearOfRelease, genre);

        book.authorList.add(author);
        bookService.addBook(book);

        System.out.println(book.title + " added successfully.");
    }


    void listBooks() {
        System.out.println("List of ALL books in the Store: ");

        // loop through books returned from the bookStore.listbooks and print them to tje console
        for (Book book: bookService.listBooks()) {
            System.out.println(book);
        }
    }

    void removeBook(){
        System.out.println("Remove a book from the Store.");
        System.out.print("Enter the book title: ");

        String title = scanner.nextLine();

        Book book = bookService.findByTitle(title);

        // check if book is in store. If no then tell user the book doesn't exist, if YES - remove from the store.
        if (book == null){
            System.out.println("The book doesn't exist in store.");
            return;
        } else {
            bookService.removeBook(book);
        }
        System.out.println(title + " removed from the store.");
    }

    void fantasyBooks(){
        System.out.println("Books by FANTASY type:");

        for (Book book: bookService.listBooksByFantasyType()){
            System.out.println(book);
        }
    }

    void booksBefore1999(){
        System.out.println("List of books published before 1999.");

        for (Book book: bookService.listBookBefore1999()){
            System.out.println(book);
        }
    }

    void mostExpensiveBook(){
        System.out.println("The most expensive book in the Store is: ");
        System.out.println(bookService.mostExpensiveBook());
    }

    void cheapestBook(){
        System.out.println("The cheapest book in Store is: ");
        System.out.println(bookService.cheapestBook());
    }

    void addAuthors(){
        System.out.println("Add Authors to the book.");

        System.out.println("Enter the title of the book.");
        String title = scanner.nextLine();

        Book book = bookService.findByTitle(title);
        int index = bookService.books.indexOf(book);

        ArrayList<Author> authors = new ArrayList<>();

        String input = "";

        do{
            System.out.println("Add a new Author");

            System.out.print("Enter Authors the first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Authors the Second name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Authors Gender: ");
            String gender = scanner.nextLine();

            Author author = new Author(firstName, lastName, gender);

            authors.add(author);

            System.out.print("Enter 'yes' to add another Author, and 'no' to continue.");
            input = scanner.nextLine();

        } while (!input.equalsIgnoreCase("no"));

        book.authorList = authors;

        bookService.books.set(index, book);

        System.out.println("Author for " + book.title + " was updated successfully.");
    }

    void bookBy3Authors(){
        System.out.println("Here is a book that was written by 3 Authors: ");

        Book book = bookService.bookBy3Authors();
        if (book == null){
            System.out.println("Cannot find the books with 3 authors.");
            return;
        } else {
            System.out.println(book);
        }
    }

    void verifyBook(){
        System.out.println("Verify if a book is in the store");

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        Book book = bookService.findByTitle(title);

        System.out.println(bookService.verifyBook(book));
    }

    void findBooksByAuthor(){
        System.out.println("Books written by provided Author");

        bookService.findBooksByAuthor(author);
        for (Book book: bookService.findBooksByAuthor(author)) {
            System.out.println(book);
        }
    }

    void ascending(){
        System.out.println("Books sorted by year of release in ascending order");

        ArrayList<Book> sortedBooks = bookService.books;
        Collections.sort(sortedBooks);

        System.out.println(sortedBooks);
    }

    void descending() {
        System.out.println("Books sorted by year of release in descending order");

        ArrayList<Book> sortedBooks = bookService.books;
        Collections.sort(sortedBooks, Collections.reverseOrder());

        System.out.println(sortedBooks);
    }
}


//        Author author = new Author("Yann", "Martel", "male");
//        Author author1 = new Author("Alexandre", "Dumas", "male");
//        System.out.println(author);
//        System.out.println(author1);
//



//       List<Book> book = new ArrayList<Book>();
//       Book b1 = new Book("Life of Pi", Genre.ADVENTURE, 2001, 15d);
//       book.add(b1);
//       Book b2 = new Book("The Three Musketeers", Genre.ADVENTURE, 1844, 25d);
//       book.add(b2);
//       System.out.println(book);

//    }
//}
