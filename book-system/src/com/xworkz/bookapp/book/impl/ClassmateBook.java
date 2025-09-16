package com.xworkz.bookapp.book.impl;

import com.xworkz.bookapp.book.Book;

public class ClassmateBook implements Book {
    @Override
    public void toWrite() {
        System.out.println("writing the notes");
    }

    @Override
    public void toOrganize() {
        System.out.println("organizing the concepts");
    }
}
