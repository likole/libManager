package org.libM.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.libM.entity.book;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class bookDaoTest {

    @Resource
    private bookDao bookDao;

    //目前没完成排除null错误的功能。当传入参数为null时会返回null
    @Test
    public void queryByParams() {
        String bookIsbn = "";
        String bookTile = "";
        String bookIntro = "";
        String bookAuthor = "";
        List<book> books = bookDao.queryByParams(bookIsbn, bookTile, bookIntro, bookAuthor);
        for (book book0 : books) {
            System.out.println(book0);
        }
    }

    @Test
    public void queryAll() {
        List<book> books = bookDao.queryAll(0, 100);
        for (book book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void addBook() {
        String bookIsbn = "BX8888";
        int bookNumber = 100;
        int bookBorrow = 0;
        String bookImage = "SADLHJKALSHFJKLASHNFLASKFNAKSL";
        String bookTitle = "张泰龙大帅比";
        String bookIntro = "张泰龙是个很帅很帅的b";
        String bookAuthor = "张泰龙";
        String authorIntro = "这个人是个帅比";
        boolean success = bookDao.addBook(bookIsbn, bookNumber, bookBorrow, bookImage, bookTitle, bookIntro, bookAuthor, authorIntro);
        System.out.println(success);
    }

    @Test
    public void editBook() {
        int bookId = 1000;
        String bookIsbn = "BX8888";
        int bookNumber = 100;
        int bookBorrow = 0;
        String bookImage = "SADLHJKALSHFJKLASHNFLASKFNAKSL";
        String bookTitle = "张泰龙大帅比";
        String bookIntro = "张泰龙是个很帅很帅的bb";
        String bookAuthor = "张泰龙";
        String authorIntro = "这个人是个帅比";
        boolean success = bookDao.editBook(bookId, bookIsbn, bookNumber, bookBorrow, bookImage, bookTitle, bookIntro, bookAuthor, authorIntro);
        System.out.println(success);
    }

    @Test
    public void getImage() {
        int bookId = 1000;
        book book1 = bookDao.getImage(bookId);
        System.out.println(book1.getBookImage());
    }

}