package org.libM.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.libM.entity.borrowInfo;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class borrowInfoDaoTest {

    @Resource
    private borrowInfoDao borrowInfoDao;

    @Test
    public void queryAll() {
        List<borrowInfo> brInfos=borrowInfoDao.queryAll(0,100);
        for (borrowInfo borrowInfo:brInfos){
            System.out.println(borrowInfo);
        }
    }


    @Test
    public void addInfo() {
        int borrowUserId=1000;
        int borrowBookId=1000;
        int success=borrowInfoDao.addInfo(borrowUserId,borrowBookId);
        System.out.println(success);
    }

    @Test
    public void updateInfo() {
        int borrowId=1000;
        int success=borrowInfoDao.updateInfo(borrowId);
        System.out.println(success);
    }
}