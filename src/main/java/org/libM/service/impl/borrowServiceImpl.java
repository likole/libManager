package org.libM.service.impl;

import org.libM.dao.bookDao;
import org.libM.dao.borrowInfoDao;
import org.libM.dto.borrowDto;
import org.libM.entity.borrowInfo;
import org.libM.service.borrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class borrowServiceImpl implements borrowService {


    @Autowired
    private borrowInfoDao borrowInfoDao;
    @Autowired
    private bookDao bookDao;

    public List<borrowInfo> getBorrowInfos() {
        return borrowInfoDao.queryAll(0,100);
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

    public borrowDto updateInfo(int borrowId) {
        int success=borrowInfoDao.updateInfo(borrowId);
        if(success!=0)return new borrowDto(true,"return_success");
        return new borrowDto(false,"return_failed");
    }
}
