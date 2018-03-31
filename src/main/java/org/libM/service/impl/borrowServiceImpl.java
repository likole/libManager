package org.libM.service.impl;

import org.libM.dao.bookDao;
import org.libM.dao.borrowInfoDao;
import org.libM.dao.userInfoDao;
import org.libM.dto.borrowDto;
import org.libM.dto.borrowInfoDto;
import org.libM.entity.book;
import org.libM.entity.borrowInfo;
import org.libM.entity.userInfo;
import org.libM.service.borrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class borrowServiceImpl implements borrowService {


    @Autowired
    private borrowInfoDao borrowInfoDao;
    @Autowired
    private bookDao bookDao;
    @Autowired
    private userInfoDao userInfoDao;

    public List<borrowInfoDto> getBorrowInfos() {
        List<borrowInfo> borrowInfos=borrowInfoDao.queryAll(0,10000);
        List<borrowInfoDto> borrowInfoDtos=new ArrayList<borrowInfoDto>();
        for (borrowInfo borrowInfo1:borrowInfos){
            book book=bookDao.queryOne(borrowInfo1.getBookId());
            userInfo userInfo=userInfoDao.getOne(borrowInfo1.getBorrowUserId());
            borrowInfoDtos.add(new borrowInfoDto(borrowInfo1,userInfo,book));
        }
        return borrowInfoDtos;
    }

    public borrowDto addInfo(int userId, int bookId) {

        int borrowSuccess=bookDao.borrow(bookId);
        if(borrowSuccess!=0){
            int success=borrowInfoDao.addInfo(userId,bookId);
            if(success!=0){
                return new borrowDto(true,"borrow_success");
            }else return new borrowDto(false,"borrow_failed caused by addInfo failed");
        }else return new borrowDto(false,"borrow_failed caused by num<0");
    }

    public borrowDto updateInfo(int borrowId,int bookId) {
        int success1=borrowInfoDao.updateInfo(borrowId);
        int success2=bookDao.returnB(bookId);
        if(success1!=0&&success2!=0)return new borrowDto(true,"return_success");
        return new borrowDto(false,success1==0?"borrowInfo_update_failed":"bookInfo_update_failed");
    }
}
