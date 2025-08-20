package com.xworkz.bookapp;

import com.xworkz.bookapp.book.Book;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("main Started ");

        Book book1 =new Book();

        book1.setBookId(503);
        book1.getBookId();
        book1.setBookName("Rich dad Poor dad");
        book1.getBookName();
        book1.setAuthorName("abhinanda");
       book1.getAuthorName();
        book1.getBookInfo();

        System.out.println("main ended ");

    }
}
