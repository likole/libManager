package org.libM.web;


import org.libM.dto.bookAddInfo;
import org.libM.dto.bookEdtInfo;
import org.libM.entity.book;
import org.libM.service.bookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/book")
public class bookController {

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private bookService bookService;

    @RequestMapping(value = "/getBook")
    @ResponseBody
    public book getBook(int bookId){
        return bookService.getOne(bookId);
    }



    @RequestMapping(value = "/partList",method = RequestMethod.POST)
    @ResponseBody
    public List<book> partList(String bookIsbn,String bookTitle,String bookIntro,String bookAuthor){
        List<book> partList=bookService.getByParams(bookIsbn,bookTitle,bookIntro,bookAuthor);
        return partList;
    }


    @RequestMapping(value = "/entireList",method = RequestMethod.GET)
    @ResponseBody
    public List<book> entireList(int offset,int num){
        List<book> entireList=bookService.getBookList(offset,num);
        return entireList;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public bookAddInfo addBook(String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle,String bookIntro, String bookAuthor,String authorIntro){
        bookAddInfo addInfo=bookService.addBook(bookIsbn,bookNumber,bookBorrow,bookImage,bookTitle,bookIntro,bookAuthor,authorIntro);
        return addInfo;
    }


    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ResponseBody
    public bookEdtInfo editBook(int bookId, String bookIsbn, int bookNumber, int bookBorrow, String bookImage, String bookTitle, String bookIntro, String bookAuthor, String authorIntro){
        bookEdtInfo edtInfo=bookService.editBook(bookId,bookIsbn,bookNumber,bookBorrow,bookImage,bookTitle,bookIntro,bookAuthor,authorIntro);
        return edtInfo;
    }


}
