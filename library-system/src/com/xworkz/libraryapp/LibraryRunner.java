package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Publications;
import com.xworkz.libraryapp.library.impl.LibraryImpl;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        LibraryImpl library = new LibraryImpl(size);

        for (int index = 0; index < size; index++) {

            Book book = new Book();
            System.out.println(" enter the id of book ");
            book.setBookPrice(scanner.nextDouble());
            System.out.println("enter the name of the book ");
            book.setBookName(scanner.next());
            System.out.println("enter the no of pages ");
            book.setNoOfPages(scanner.nextInt());
            System.out.println("enter the publication name");
            book.setPublication(Publications.valueOf(scanner.next().toUpperCase()));
            System.out.println("emter the price of the book ");
            book.setBookPrice(scanner.nextDouble());

            library.addBookIntoLibrary(book);
        }

        library.getBookInfo();
        String input = null;
        do {
            System.out.println("press #1 to get book price by book name");
            System.out.println("press #2 to get publication name by book id");
            System.out.println("press #3 to get publication by book name");
            System.out.println("press #4 to get book price by book id");
            System.out.println("press #5 to get author name by book id");
            System.out.println("press #6 to get author name by book name");
            System.out.println("press #7 to get no of pages by book id");
            System.out.println("press #8 to get no of pages by book name");
            System.out.println("press #9 to update book name by book id");
            System.out.println("press #10 to update author name by book id");
            System.out.println("press #11 to update no of pages by book id");
            System.out.println("press #12 to update price by book id");
            System.out.println("press #13 to update publication by book id");
            System.out.println("press #14 to all book info");
            System.out.println(" ");
            System.out.println("enter the option which you require");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter book name to get price");
                    double price = library.getBookPriceByBookName(scanner.next());
                    System.out.println(price);
                    break;

                case 2:
                    System.out.println("enter book id to get publication name");
                    Publications publications = library.getPublicationNameByBookId(scanner.nextInt());
                    System.out.println(publications);
                    break;

                case 3:
                    System.out.println("enter book name to get publication");
                    publications = library.getPublicationByBookName(scanner.next());
                    System.out.println(publications);
                    break;

                case 4:
                    System.out.println("enter book id to get price");
                    price = library.getBookPriceByBookId(scanner.nextInt());
                    System.out.println(price);
                    break;

                case 5:
                    System.out.println("enter book id to get author name");
                    String author = library.getAuthorNameByBookId(scanner.nextInt());
                    System.out.println(author);
                    break;

                case 6:
                    System.out.println("enter book name to get author name");
                    author = library.getAuthorNameByBookName(scanner.next());
                    System.out.println(author);
                    break;

                case 7:
                    System.out.println("enter book id to get no of pages");
                    int noOfPages = library.getNoOfPagesByBookId(scanner.nextInt());
                    System.out.println(noOfPages);
                    break;

                case 8:
                    System.out.println("enter book name to get no of pages");
                    noOfPages = library.getNoOfPagesByBookName(scanner.next());
                    System.out.println(noOfPages);
                    break;

                case 9:
                    System.out.println("enter book id to update name");
                    int id = scanner.nextInt();
                    System.out.println("enter updated book name");
                    String bookName = scanner.next();
                    boolean isBookNameUpdated = library.updateBookNameByBookId(id, bookName);
                    if (isBookNameUpdated) {
                        library.getBookInfo();
                    }
                    break;

                case 10:
                    System.out.println("enter book id to update author name");
                    id = scanner.nextInt();
                    System.out.println("enter updated author name");
                    String authorName = scanner.next();
                    boolean isAuthorUpdated = library.updateAuthorNameByBookId(id, authorName);
                    if (isAuthorUpdated) {
                        library.getBookInfo();
                    }
                    break;

                case 11:
                    System.out.println("enter book id to update no of pages");
                    id = scanner.nextInt();
                    System.out.println("enter updated no of pages");
                    int updatedPages = scanner.nextInt();
                    boolean isPagesUpdated = library.updateNoOfPagesByBookId(id, updatedPages);
                    if (isPagesUpdated) {
                        library.getBookInfo();
                    }
                    break;

                case 12:
                    System.out.println("enter book id to update price");
                    id = scanner.nextInt();
                    System.out.println("enter updated price");
                    double updatedPrice = scanner.nextDouble();
                    boolean isPriceUpdated = library.updateBookPriceByBookId(id, updatedPrice);
                    if (isPriceUpdated) {
                        library.getBookInfo();
                    }
                    break;

                case 13:
                    System.out.println("enter book id to update publication");
                    id = scanner.nextInt();
                    System.out.println("enter updated publication");
                    Publications updatedPublication = Publications.valueOf(scanner.next().toUpperCase());
                    boolean isPublicationUpdated = library.updatePublicationByBookId(id, updatedPublication);
                    if (isPublicationUpdated) {
                        library.getBookInfo();
                    }
                    break;
                case 14:
                    library.getBookInfo();
                    break;

                default:
                    System.out.println("you entered wrong option");
            }

            System.out.println("do you want to continue yes / no ");
            input = scanner.next();

        } while (input.equalsIgnoreCase("yes"));

        System.out.println("thank you for visiting this app ........");


    }
}
