package org.libM.service.impl;

import org.libM.dao.bookDao;
import org.libM.entity.book;
import org.libM.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookServiceImpl implements bookService {

    @Autowired
    private bookDao bookDao;

    public List<book> getByParams(String bookIsbn, String bookTitle, String bookIntro, String bookAuthor) {
        formatParam(bookIsbn,bookTitle,bookIntro,bookAuthor);
        return bookDao.queryByParams(bookIsbn,bookTitle,bookIntro,bookAuthor);
    }

    public List<book> getBookList() {
        return bookDao.queryAll(0,100);
    }

    public int addBook(String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle, String bookIntro, String bookAuthor, String authorIntro) {
        int success=bookDao.addBook(bookIsbn,bookNumber,bookBorrow,bookImage,bookTitle,bookIntro,bookAuthor,authorIntro);
        if(success!=0)return 1;
        return 0;
    }

    public int editBook(int bookId,String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle, String bookIntro, String bookAuthor, String authorIntro) {
        int success=bookDao.editBook(bookId,bookIsbn,bookNumber,bookBorrow,bookImage,bookTitle,bookIntro,bookAuthor,authorIntro);
        if(success!=0)return 1;
        return 0;
    }

    public String getImageUrl(int bookId) {
        book book=bookDao.getImage(bookId);
        if(book!=null)return book.getBookImage();
        return null;
    }


    private void formatParam(String bookIsbn, String bookTitle, String bookIntro, String bookAuthor){
        if(bookIsbn==null)bookIsbn="%%";
        else bookIsbn="%"+bookIsbn+"%";
        if(bookTitle==null)bookTitle="%%";
        else bookTitle="%"+bookTitle+"%";
        if(bookIntro==null)bookIntro="%%";
        else bookIntro="%"+bookIntro+"%";
        if(bookAuthor==null)bookAuthor="%%";
        else bookAuthor="%"+bookAuthor+"%";
    }
}
