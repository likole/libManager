package org.libM.service.impl;

import org.libM.dao.bookDao;
import org.libM.dto.bookAddInfo;
import org.libM.dto.bookEdtInfo;
import org.libM.entity.book;
import org.libM.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookServiceImpl implements bookService {

    @Autowired
    private bookDao bookDao;

    public book getOne(int bookId) {
        return bookDao.queryOne(bookId);
    }

    public List<book> getByParams(String bookIsbn, String bookTitle, String bookIntro, String bookAuthor,int offset, int num) {
        //formatParam(bookIsbn,bookTitle,bookIntro,bookAuthor);
        if(bookIsbn==null)bookIsbn="%%";
        else bookIsbn="%"+bookIsbn+"%";
        if(bookTitle==null)bookTitle="%%";
        else bookTitle="%"+bookTitle+"%";
        if(bookIntro==null)bookIntro="%%";
        else bookIntro="%"+bookIntro+"%";
        if(bookAuthor==null)bookAuthor="%%";
        else bookAuthor="%"+bookAuthor+"%";
        System.out.println(bookIsbn+"-"+bookTitle+"-"+bookIntro+"-"+bookAuthor+"-");
        return bookDao.queryByParams(bookIsbn,bookTitle,bookIntro,bookAuthor,offset,num);
    }

    public List<book> getBookList(int offset,int num) {
        return bookDao.queryAll(offset,num);
    }

    public bookAddInfo addBook(String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle, String bookIntro, String bookAuthor, String authorIntro) {
        int success=bookDao.addBook(bookIsbn,bookNumber,bookBorrow,bookImage,bookTitle,bookIntro,bookAuthor,authorIntro);
        if(success!=0)return new bookAddInfo(true,"add_success");
        return new bookAddInfo(false,"add_failed");
    }

    public bookEdtInfo editBook(int bookId, String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle, String bookIntro, String bookAuthor, String authorIntro) {
        int success=bookDao.editBook(bookId,bookIsbn,bookNumber,bookBorrow,bookImage,bookTitle,bookIntro,bookAuthor,authorIntro);
        if(success!=0)return new bookEdtInfo(true,"edit_success");
        return new bookEdtInfo(false,"edit_failed");
    }

    public bookEdtInfo editImage(int bookId, String bookImage) {
        int success=bookDao.editImage(bookId,bookImage);
        if(success!=0)return new bookEdtInfo(true,"edit_success");
        return new bookEdtInfo(false,"edit_failed");
    }



}
