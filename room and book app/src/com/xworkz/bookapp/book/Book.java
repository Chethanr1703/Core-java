package com.xworkz.bookapp.book;

public class Book {
    private int bookId;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void getBookInfo(){
        System.out.println("the id of the book"+bookId);
        System.out.println("the name of the book"+bookName);
        System.out.println("the author of the book"+authorName);




    }
}
