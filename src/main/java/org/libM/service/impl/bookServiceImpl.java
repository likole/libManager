package org.libM.service.impl;

import org.libM.entity.book;
import org.libM.service.bookService;

import java.util.List;

public class bookServiceImpl implements bookService {



    public List<book> getByParams(String bookIsbn, String bookTitle, String bookIntro, String bookAuthor) {
        return null;
    }

    public List<book> getBookList() {
        return null;
    }

    public int addBook(String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle, String bookIntro, String bookAuthor, String authorIntro) {
        return 0;
    }

    public int editBook(String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle, String bookIntro, String bookAuthor, String authorIntro) {
        return 0;
    }

    public String getImageUrl(int bookId) {
        return null;
    }
}
