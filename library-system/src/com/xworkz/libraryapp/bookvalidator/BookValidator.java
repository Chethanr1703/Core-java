package com.xworkz.libraryapp.bookvalidator;

import com.xworkz.libraryapp.book.Book;

public class BookValidator {

    public boolean isBookDetailsValid(Book bookDetails){
       boolean isBookDetailsValid=false;

       boolean isBookIdValid =false;
       boolean isBookNameValid=false;
       boolean isAuthorNameValid=false;
       boolean isNoOfPagesValid=false;
       boolean isPublicationValid=false;
       boolean isPriceValid=false;


       if(bookDetails.getBookId()>0){
           isBookIdValid=true;
       }else{
           System.out.println("the book id is not valid");
       }
       if(bookDetails.getBookName()!=null &&  !bookDetails.getBookName().isEmpty()){
           isBookNameValid=true;
       }else{
           System.out.println("the book name is not valid");
       }
       if(bookDetails.getAuthorName()!=null && !bookDetails.getAuthorName().isEmpty()){
           isAuthorNameValid=true;
       }else{
           System.out.println("the book author name is not valid");
       }
       if(bookDetails.getNoOfPages()>0){
           isNoOfPagesValid=true;
       }else{
           System.out.println("the book no of pages is not valid");
       }
       if(bookDetails.getPublication()!= null && !bookDetails.getPublication().isEmpty()){
           isPublicationValid=true;
       }else{
           System.out.println("the book publication name  is not valid");
       }
       if(bookDetails.getBookPrice()>0.0){
           isPriceValid=true;
       }else{
           System.out.println("the book price is not valid");
       }
       if(isBookIdValid&&isBookNameValid&&isAuthorNameValid&&isNoOfPagesValid&&isPublicationValid&&isPriceValid){
           isBookDetailsValid=true;
       }else{
           System.out.println("the book info  is not valid");
       }
return  isBookDetailsValid;
    }
}
