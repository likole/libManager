package org.libM.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.libM.entity.userInfo;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class userInfoDaoTest {


    @Resource
    private userInfoDao userInfoDao;

    @Test
    public void queryByUsername() {
        String username="spj1";
        userInfo userInfo=userInfoDao.queryByUsername(username);
        System.out.println(userInfo.getUserId());
    }



    @Test
    public void queryAll() {
        List<userInfo> users=userInfoDao.queryAll(0,100);
        for (userInfo user:users){
            System.out.println(user);
        }
    }

    @Test
    public void login() {
        String username="spjsb";
        String password="123123";
        userInfo userInfo=userInfoDao.login(username,password);
        System.out.println("登录成功,userId="+userInfo.getUserId());
    }

    @Test
    public void addUser() {
        String username="encoding1";
        String password="123123";
        String name="沈鹏杰";
        int success=userInfoDao.addUser(username,password,name,0);
        System.out.println(success);
    }

    @Test
    public void deleteUser() {
        int userId=2;
        int success = userInfoDao.deleteUser(userId);
        System.out.println(success);
    }
}