package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Publications;

public interface Library {


    boolean addBookIntoLibrary(Book bookDetail);

    void getBookInfo();
    double getBookPriceByBookName(String bookName);
    Publications getPublicationNameByBookId(int BookId);
    Publications getPublicationByBookName(String bookName);
    double getBookPriceByBookId(int bookId);
    String getAuthorNameByBookId(int bookId);
    String getAuthorNameByBookName(String bookName);
    int getNoOfPagesByBookId(int bookId);
    int getNoOfPagesByBookName(String bookName);
    boolean updateBookNameByBookId(int bookId, String newBookName);
    boolean updateAuthorNameByBookId(int bookId, String newAuthorName);
    boolean updateNoOfPagesByBookId(int bookId, int newNoOfPages);
    boolean updateBookPriceByBookId(int bookId, double newBookPrice);
    boolean updatePublicationByBookId(int bookId, Publications newPublication);

}
