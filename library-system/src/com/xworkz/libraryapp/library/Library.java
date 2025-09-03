package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.bookvalidator.BookValidator;

public class Library {
    Book bookDetails[]= new Book[13];
    int index;

    public boolean addBookIntoLibrary(Book bookDetail){
       boolean isBookAdded=false;

        BookValidator bookValidator=new BookValidator();
       boolean book= bookValidator.isBookDetailsValid(bookDetail);
       if(book){
//           this.bookDetails=bookDetails;
           bookDetails[index] = bookDetail;
           index++;
           isBookAdded=true;
//           System.out.println("the book Details are valid ");
     }
       else{
           System.out.println("the book details is not valid");
       }
       return  isBookAdded;

    }
    public void getBookInfo(){
        for(Book bookDetail: bookDetails) {
            System.out.println("the id of the book is " + bookDetail.getBookId());
            System.out.println("the name of the book is " + bookDetail.getBookName());
            System.out.println("the author name of the book is " + bookDetail.getAuthorName());
            System.out.println("the no of pages of the book is " + bookDetail.getNoOfPages());
            System.out.println("the publication of the book is " + bookDetail.getPublication());
            System.out.println("the price of the book is " + bookDetail.getBookPrice());
            System.out.println(" ");
        }
    }
}
