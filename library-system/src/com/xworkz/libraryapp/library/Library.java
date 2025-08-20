package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.bookvalidator.BookValidator;

public class Library {
    Book bookDetails;

    public boolean addBookIntoLibrary(Book bookDetails){
       boolean isBookAdded=false;

        BookValidator bookValidator=new BookValidator();
       boolean bookDetail= bookValidator.isBookDetailsValid(bookDetails);
       if(bookDetail){
           this.bookDetails=bookDetails;
           isBookAdded=true;
           System.out.println("the book Details are valid ");
       }
       else{
           System.out.println("the book details is not valid");
       }
       return  isBookAdded;

    }
    public void getBookInfo(){
        System.out.println("the id of the book is "+bookDetails.getBookId());
        System.out.println("the name of the book is "+bookDetails.getBookName());
        System.out.println("the author name of the book is "+bookDetails.getAuthorName());
        System.out.println("the no of pages of the book is "+bookDetails.getNoOfPages());
        System.out.println("the publication of the book is "+bookDetails.getPublication());
        System.out.println("the price of the book is "+bookDetails.getBookPrice());

    }
}
