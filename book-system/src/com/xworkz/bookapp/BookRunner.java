package com.xworkz.bookapp;

import com.xworkz.bookapp.book.Book;
import com.xworkz.bookapp.book.impl.ClassmateBook;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new ClassmateBook();
        book.toWrite();
        book.toOrganize();
        

    }
}
