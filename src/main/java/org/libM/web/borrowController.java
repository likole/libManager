package org.libM.web;


import org.libM.dto.borrowDto;
import org.libM.dto.borrowInfoDto;
import org.libM.entity.borrowInfo;
import org.libM.service.bookService;
import org.libM.service.borrowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/borrow")
public class borrowController {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private borrowService borrowService;
    @Autowired
    private bookService bookService;

    @RequestMapping(value = "/borrowList",method = RequestMethod.GET)
    @ResponseBody
    public List<borrowInfoDto> getByParam(){
        List<borrowInfoDto> List=borrowService.getBorrowInfos();
        return List;
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public borrowDto addInfo(int borrowUserId, int borrowBookId){
        borrowDto borrowDto=borrowService.addInfo(borrowUserId,borrowBookId);
        return borrowDto;
    }


    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public borrowDto updateInfo(int borrowId,int bookId){
        borrowDto borrowDto=borrowService.updateInfo(borrowId,bookId);
        return borrowDto;
    }
}
