package com.xworkz.libraryapp.library.impl;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.bookvalidator.BookValidator;
import com.xworkz.libraryapp.constants.Publications;
import com.xworkz.libraryapp.exception.*;
import com.xworkz.libraryapp.library.Library;

public class LibraryImpl implements Library {
    Book bookDetails[];
    int index;

    public LibraryImpl(int size) {
        bookDetails = new Book[size];
    }

    @Override
    public boolean addBookIntoLibrary(Book bookDetail) {
        boolean isBookAdded = false;

        BookValidator bookValidator = new BookValidator();
        boolean book = bookValidator.isBookDetailsValid(bookDetail);
        try {
            if (book) {
//           this.bookDetails=bookDetails;
                bookDetails[index] = bookDetail;
                index++;
                isBookAdded = true;
//
            } else {
                throw new BookNotAddedException("the book details is not valid");
            }
        } catch (BookNotAddedException e) {
            e.printStackTrace();
        }
        return isBookAdded;

    }

    @Override
    public void getBookInfo() {
        for (Book bookDetail : bookDetails) {
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
    public double getBookPriceByBookName(String bookName) {
        double price = 0;
        try {
            if (bookName != null) {
                for (Book book : bookDetails) {
                    if (book.getBookName().equals(bookName)) {
                        price = book.getBookPrice();
                    }
                }
            }
            if (price <= 0) {
                throw new PriceNotFoundException("enter valid name to get book price");
            }
        } catch (PriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public Publications getPublicationNameByBookId(int BookId) {
        Publications publications = null;
        try {
            if (BookId != 0) {
                for (Book book : bookDetails) {
                    if (book.getBookId() == BookId) {
                        publications = book.getPublication();
                    }
                }
            }
            if (publications == null) {
                throw new PublicationNotFoundException("enter valid ID to get Publication");
            }
        } catch (PublicationNotFoundException e) {
            e.printStackTrace();
        }

        return publications;
    }

    @Override
    public Publications getPublicationByBookName(String bookName) {
        Publications publications = null;
        try {
            if (bookName != null) {
                for (Book book : bookDetails) {
                    if (book.getBookName().equals(bookName)) {
                        publications = book.getPublication();
                    }
                }
            }
            if (publications == null) {
                throw new PublicationNotFoundException("enter valid name to get publication");
            }
        } catch (PublicationNotFoundException e) {
            e.printStackTrace();
        }

        return publications;
    }

    @Override
    public double getBookPriceByBookId(int bookId) {
        double price = 0;
        try {
            if (bookId != 0) {
                for (Book book : bookDetails) {
                    if (book.getBookId() == bookId) {
                        price = book.getBookPrice();
                    }
                }
            }
            if (price <= 0) {
                throw new PriceNotFoundException("enter valid ID to get price");
            }
        } catch (PriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public String getAuthorNameByBookId(int bookId) {
        String author = null;
        try {
            if (bookId != 0) {
                for (Book book : bookDetails) {
                    if (book.getBookId() == bookId) {
                        author = book.getAuthorName();
                    }
                }
            }
            if (author == null) {
                throw new AuthorNotFoundException("ID not found to get author");
            }
        } catch (AuthorNotFoundException e) {
            e.printStackTrace();
        }
        return author;
    }

    @Override
    public String getAuthorNameByBookName(String bookName) {
        String author = null;
        try {
            if (bookName != null) {
                for (Book book : bookDetails) {
                    if (book.getBookName().equals(bookName)) {
                        author = book.getAuthorName();
                    }
                }
            } else System.out.println("enter valid name");
            if (author == null) {
                throw new AuthorNotFoundException("name not found to get author");
            }
        } catch (AuthorNotFoundException e) {
            e.printStackTrace();
        }
        return author;
    }

    @Override
    public int getNoOfPagesByBookId(int bookId) {
        int pages = 0;
        if (bookId != 0) {
            for (Book book : bookDetails) {
                if (book.getBookId() == bookId) {
                    pages = book.getNoOfPages();
                }
            }
        } else System.out.println("enter valid ID");
        if (pages == 0) System.out.println("ID not found");
        return pages;
    }

    @Override
    public int getNoOfPagesByBookName(String bookName) {
        int pages = 0;
        try {
            if (bookName != null) {
                for (Book book : bookDetails) {
                    if (book.getBookName().equals(bookName)) {
                        pages = book.getNoOfPages();
                    }
                }
            } else System.out.println("enter valid name");
            if (pages == 0) {
                throw new NoOfPagesNotFoundException("name not valid to get pagess");
            }
        } catch (NoOfPagesNotFoundException e) {
            e.printStackTrace();
        }
        return pages;
    }

    //update
    @Override
    public boolean updateBookNameByBookId(int bookId, String newBookName) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : bookDetails) {
                    if (book.getBookId() == bookId) {
                        book.setBookName(newBookName);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new BookNameNotUpdatedException("enter correct ID to updated book name");
            }
        } catch (BookNameNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateAuthorNameByBookId(int bookId, String newAuthorName) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : bookDetails) {
                    if (book.getBookId() == bookId) {
                        book.setAuthorName(newAuthorName);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new AuthorNameNotUpdatedException("enter correct ID to updated book author name");
            }
        } catch (AuthorNameNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateNoOfPagesByBookId(int bookId, int newNoOfPages) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : bookDetails) {
                    if (book.getBookId() == bookId) {
                        book.setNoOfPages(newNoOfPages);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new NoOfPaggesNotUpdatedException("enter correct ID to updated book pagges");
            }
        } catch (NoOfPaggesNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateBookPriceByBookId(int bookId, double newBookPrice) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : bookDetails) {
                    if (book.getBookId() == bookId) {
                        book.setBookPrice(newBookPrice);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new PriceNotUpdatedException("enter correct ID to updated book price");
            }
        } catch (PriceNotUpdatedException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updatePublicationByBookId(int bookId, Publications newPublication) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : bookDetails) {
                    if (book.getBookId() == bookId) {
                        book.setPublication(newPublication);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                throw new PublicationNotUpdateException("enter correct ID to updated book name");
            }
        } catch (PublicationNotUpdateException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }
}
