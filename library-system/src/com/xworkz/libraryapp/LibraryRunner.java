package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book1 =new Book();

        book1.setBookId(1001);
        book1.setBookName("Rich Dad Poor Dad");
        book1.setAuthorName("Robert");
        book1.setNoOfPages(350);
        book1.setPublication("uk");
        book1.setBookPrice(99.00);

        Library library =new Library();
        boolean isAdded=library.addBookIntoLibrary(book1);
        if(isAdded==true){
            library.getBookInfo();
        }else{
            System.out.println("the book1 details is not valid");
        }

    }
}
