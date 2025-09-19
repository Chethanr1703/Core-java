package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.bookvalidator.BookValidator;
import com.xworkz.libraryapp.constants.Publications;

public class LibraryImpl implements Library {
    Book bookDetails[];
    int index;

    public LibraryImpl(int size){
        bookDetails = new Book[size];
    }
    @Override
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
    @Override
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
    @Override
    public double getBookPriceByBookName(String bookName){
        double price = 0;
        if(bookName != null){
            for(Book book : bookDetails){
                if(book.getBookName().equals(bookName)){
                    price = book.getBookPrice();
                }
            }
        }else System.out.println("enter valid name");
        return price;
    }
    @Override
    public Publications getPublicationNameByBookId(int BookId){
        Publications publications = null;
        if(BookId != 0){
            for(Book book: bookDetails ){
                if(book.getBookId() == BookId){
                    publications = book.getPublication();
                }
            }
        }else System.out.println("enter valid ID");

        return publications;
    }
    @Override
    public Publications getPublicationByBookName(String bookName){
        Publications publications = null;
        if(bookName != null){
            for(Book book : bookDetails){
                if(book.getBookName().equals(bookName)){
                    publications = book.getPublication();
                }
            }
        }else System.out.println("enter valid name");

        return publications;
    }
    @Override
    public double getBookPriceByBookId(int bookId){
        double price = 0;
        if(bookId != 0){
            for(Book book : bookDetails){
                if(book.getBookId() == bookId){
                    price = book.getBookPrice();
                }
            }
        }else System.out.println("enter valid ID");
        return price;
    }
    @Override
    public String getAuthorNameByBookId(int bookId){
        String author = null;
        if(bookId != 0){
            for(Book book : bookDetails){
                if(book.getBookId() == bookId){
                    author = book.getAuthorName();
                }
            }
        }else System.out.println("enter valid ID");
        if(author == null) System.out.println("ID not found");
        return author;
    }
    @Override
    public String getAuthorNameByBookName(String bookName){
        String author = null;
        if(bookName != null){
            for(Book book : bookDetails){
                if(book.getBookName().equals(bookName)){
                    author = book.getAuthorName();
                }
            }
        }else System.out.println("enter valid name");
        if(author == null) System.out.println("name not found");
        return author;
    }
    @Override
    public int getNoOfPagesByBookId(int bookId){
        int pages = 0;
        if(bookId != 0){
            for(Book book : bookDetails){
                if(book.getBookId() == bookId){
                    pages = book.getNoOfPages();
                }
            }
        }else System.out.println("enter valid ID");
        if(pages == 0) System.out.println("ID not found");
        return pages;
    }
    @Override
    public int getNoOfPagesByBookName(String bookName){
        int pages = 0;
        if(bookName != null){
            for(Book book : bookDetails){
                if(book.getBookName().equals(bookName)){
                    pages = book.getNoOfPages();
                }
            }
        }else System.out.println("enter valid name");
        if(pages == 0) System.out.println("name not found");
        return pages;
    }

    //update
    @Override
    public boolean updateBookNameByBookId(int bookId, String newBookName){
        boolean isUpdated = false;
        if(bookId != 0){
            for(Book book : bookDetails){
                if(book.getBookId() == bookId){
                    book.setBookName(newBookName);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }
    @Override
    public boolean updateAuthorNameByBookId(int bookId, String newAuthorName){
        boolean isUpdated = false;
        if(bookId != 0){
            for(Book book : bookDetails){
                if(book.getBookId() == bookId){
                    book.setAuthorName(newAuthorName);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }
    @Override
    public boolean updateNoOfPagesByBookId(int bookId, int newNoOfPages){
        boolean isUpdated = false;
        if(bookId != 0){
            for(Book book : bookDetails){
                if(book.getBookId() == bookId){
                    book.setNoOfPages(newNoOfPages);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }
    @Override
    public boolean updateBookPriceByBookId(int bookId, double newBookPrice){
        boolean isUpdated = false;
        if(bookId != 0){
            for(Book book : bookDetails){
                if(book.getBookId() == bookId){
                    book.setBookPrice(newBookPrice);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }
    @Override
    public boolean updatePublicationByBookId(int bookId, Publications newPublication){
        boolean isUpdated = false;
        if(bookId != 0){
            for(Book book : bookDetails){
                if(book.getBookId() == bookId){
                    book.setPublication(newPublication);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }
}
