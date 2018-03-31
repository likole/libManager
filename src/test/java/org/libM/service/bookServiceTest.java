package org.libM.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.libM.dto.bookAddInfo;
import org.libM.entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class bookServiceTest {


    @Autowired
    private bookService bookService;
    @Test
    public void getByParams() {
        String bookIsbn=null;
        String bookTile=null;
        String bookIntro=null;
        String bookAuthor=null;
        List<book> books = bookService.getByParams(bookIsbn, bookTile, bookIntro, bookAuthor,0,100);
        for (book book0 : books) {
            System.out.println(book0);
        }
    }

    @Test
    public void getBookList() {
        List<book> books = bookService.getBookList(0,10);
        for (book book0 : books) {
            System.out.println(book0);
        }
    }

    @Test
    public void addBook() {
        String bookIsbn = "BX8888";
        int bookNumber = 100;
        int bookBorrow = 0;
        String bookImage = "SADLHJKALSHFJKLASHNFLASKFNAKSL";
        String bookTitle = "张泰龙大帅比4";
        String bookIntro = "张泰龙是个很帅很帅的b5";
        String bookAuthor = "张泰龙";
        String authorIntro = "这个人是个帅比";
        bookAddInfo addInfo = bookService.addBook(bookIsbn, bookNumber, bookBorrow, bookImage, bookTitle, bookIntro, bookAuthor, authorIntro);
        System.out.println(addInfo);
    }

    @Test
    public void editBook() {
    }

}