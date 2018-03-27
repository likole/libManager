package org.libM.service;

import org.libM.dto.bookAddInfo;
import org.libM.dto.bookEdtInfo;
import org.libM.entity.book;

import java.util.List;

public interface bookService {

    book getOne(int bookId);

    List<book> getByParams(String bookIsbn,String bookTitle,String bookIntro,String bookAuthor);

    List<book> getBookList(int offset,int num);

    bookAddInfo addBook(String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle, String bookIntro, String bookAuthor, String authorIntro);

    bookEdtInfo editBook(int bookId, String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle, String bookIntro, String bookAuthor, String authorIntro);


}
