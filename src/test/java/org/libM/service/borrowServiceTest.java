package org.libM.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.libM.dto.borrowDto;
import org.libM.dto.borrowInfoDto;
import org.libM.entity.borrowInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class borrowServiceTest {

    @Autowired
    private borrowService borrowService;

    @Test
    public void getBorrowInfos() {
        List<borrowInfoDto> borrowInfoDtos=borrowService.getBorrowInfos();
        for (borrowInfoDto borrowInfoDto:borrowInfoDtos){
            System.out.println(borrowInfoDto);
        }
    }

    @Test
    public void addInfo() {
        int borrowUserId=1000;
        int borrowBoodId=1000;
        borrowDto borrowDto=borrowService.addInfo(borrowUserId,borrowBoodId);
        System.out.println(borrowDto);
    }

    @Test
    public void updateInfo() {
        int borrowId=1003;
        int bookId=1000;
        borrowDto borrowDto=borrowService.updateInfo(borrowId,bookId);
        System.out.println(borrowDto);
    }
}