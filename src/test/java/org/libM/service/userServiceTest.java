package org.libM.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.libM.dto.loginInfo;
import org.libM.dto.userAddInfo;
import org.libM.dto.userDelInfo;
import org.libM.entity.userInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.ws.Service;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class userServiceTest {


    @Autowired
    private userService userService;
    @Test
    public void getUserList() {
        List<userInfo> users=userService.getUserList();
        for (userInfo user:users){
            System.out.println(user);
        };
    }

    @Test
    public void login() {
        String username="spj1";
        String password="123123";
        loginInfo loginInfo=userService.login(username,password);
        if(loginInfo.isSuccess()){
            System.out.println(loginInfo.getUserId()+"---"+loginInfo.getLoginInfo());
        }
    }

    @Test
    public void addUser() {

        String username="spj5";
        String password="123123";
        String name="spj";
        int power=1;
        userAddInfo addInfo=userService.addUser(username,password,name,power);
        System.out.println(addInfo);
    }


    @Test
    public void deleteUIer() {
        int userId=1004;
        userDelInfo deleteInfo=userService.deleteUser(userId);
        System.out.println(deleteInfo);
    }
}