package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Publications;
import com.xworkz.libraryapp.library.impl.LibraryImpl;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int size = scanner.nextInt();
        LibraryImpl library = new LibraryImpl(size);

        for(int index =0; index<size ;index++){

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

        System.out.println("enter book name to get price");
        double price = library.getBookPriceByBookName(scanner.next());
        System.out.println(price);

        System.out.println(" enter book id to get publication name");
        Publications publications = library.getPublicationNameByBookId(scanner.nextInt());
        System.out.println(publications);

        System.out.println("enter book name to get publication");
         publications = library.getPublicationByBookName(scanner.next());
        System.out.println(publications);

        System.out.println("enter book id to get price");
        price = library.getBookPriceByBookId(scanner.nextInt());
        System.out.println(price);

        System.out.println("enter book id to get author name");
        String  author = library.getAuthorNameByBookId(scanner.nextInt());
        System.out.println(author);

        System.out.println("enter book name to get author name");
          author = library.getAuthorNameByBookName(scanner.next());
        System.out.println(author);

        System.out.println("enter book id to get no of pages");
        int  noOfPages = library.getNoOfPagesByBookId(scanner.nextInt());
        System.out.println(noOfPages);

        System.out.println("enter book name to get no of pages");
          noOfPages = library.getNoOfPagesByBookName(scanner.next());
        System.out.println(noOfPages);

        //update

        System.out.println("enter bookid to update name");
        int id= scanner.nextInt();
        System.out.println("enter updated book name");
        String bookName = scanner.next();
        boolean isbookNAmeUpdated= library.updateBookNameByBookId(id,bookName);
        if(isbookNAmeUpdated){
            library.getBookInfo();
        }

        System.out.println("enter bookid to update Author name");
         id= scanner.nextInt();
        System.out.println("enter updated book name");
        String authorName = scanner.next();
        boolean isAuthorNAmeUpdated= library.updateAuthorNameByBookId(id,bookName);
        if(isAuthorNAmeUpdated){
            library.getBookInfo();
        }

        System.out.println("enter bookid to update no of pages");
         id= scanner.nextInt();
        System.out.println("enter updated book name");
        int  noOfpages = scanner.nextInt();
        boolean isNoOfPagesUpdated= library.updateNoOfPagesByBookId(id,noOfpages);
        if(isNoOfPagesUpdated){
            library.getBookInfo();
        }

        System.out.println("enter bookid to update price");
        id= scanner.nextInt();
        System.out.println("enter updated book name");
        double  bookprice = scanner.nextDouble();
        boolean isBookpriceUpdated= library.updateBookPriceByBookId(id,bookprice);
        if(isBookpriceUpdated){
            library.getBookInfo();
        }

        System.out.println("enter bookid to update price");
        id= scanner.nextInt();
        System.out.println("enter updated book name");
        Publications publications1= Publications.valueOf(scanner.next().toUpperCase());
        boolean isPublicationUpdated= library.updatePublicationByBookId(id,publications1);
        if(isPublicationUpdated){
            library.getBookInfo();
        }



    }
}
