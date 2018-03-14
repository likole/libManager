package org.libM.service;

import org.libM.entity.book;

import java.util.List;

public interface bookService {


    List<book> getByParams(String bookIsbn,String bookTitle,String bookIntro,String bookAuthor);

    List<book> getBookList();

    int addBook(String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle,String bookIntro, String bookAuthor,String authorIntro);

    int editBook(String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle,String bookIntro, String bookAuthor,String authorIntro);

    String getImageUrl(int bookId);


}
