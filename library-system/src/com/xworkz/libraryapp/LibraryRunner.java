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

        Book book2 = new Book(101,"Let Us C","Yashavant Kanetkar",200,"BPB Publications",150.0);
        Book book3 = new Book(102,"Java: The Complete Reference"," Kanetkar",200,"BPB Publications",2050.0);
        Book book4 = new Book(103,"Python Crash Course","Yashavant ",200,"BPB Publications",2050.0);
        Book book5 = new Book(104,"Head First Java","havantKanetr",200,"BPB Publications",950.0);
        Book book6 = new Book(105,"Clean Code","veer",200,"BPB Publications",150.0);
        Book book7 = new Book(106,"Data Structures and Algorithms in Java "," Kanetkar",200,"BPB Publications",150.0);
        Book book8 = new Book(107,"Operating System Concepts","Yashavant ",200,"BPB Publications",650.0);
        Book book9 = new Book(108,"Database System Concepts","Yashavant veer",200,"BPB Publications",1540.0);
        Book book10 = new Book(109,"Computer Networks","Yashavant abhu",200,"BPB Publications",850.0);
        Book book11 = new Book(110,"Artificial Intelligence: A Modern Approach","nandan Kanetkar",200,"BPB Publications",650.0);
        Book book12 = new Book(111,"The Pragmatic Programmer","manoj Kanetkar",200,"BPB Publications",550.0);
        Book book13 = new Book(112,"Algorithms","shahsh Kanetkar",200,"BPB Publications",450.0);
        Book book14= new Book(113,"C Programming Language","bhi Kanetkar",200,"BPB Publications",250.0);

        boolean isAdded=library.addBookIntoLibrary(book1);
        isAdded = library.addBookIntoLibrary(book2);
        isAdded = library.addBookIntoLibrary(book3);
        isAdded = library.addBookIntoLibrary(book4);
        isAdded = library.addBookIntoLibrary(book5);
        isAdded = library.addBookIntoLibrary(book6);
        isAdded = library.addBookIntoLibrary(book7);
        isAdded = library.addBookIntoLibrary(book8);
        isAdded = library.addBookIntoLibrary(book9);
        isAdded = library.addBookIntoLibrary(book10);
        isAdded = library.addBookIntoLibrary(book11);
        isAdded = library.addBookIntoLibrary(book12);
        isAdded = library.addBookIntoLibrary(book13);


        if(isAdded==true){
            library.getBookInfo();
        }else{
            System.out.println("the book1 details is not valid");
        }

    }
}
