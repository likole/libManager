package org.libM.service;

import org.libM.entity.userInfo;

import java.util.List;

public interface userService {


    List<userInfo> getUserList();


    int login(String username,String passwrod);


    int addUser(String username,String password,String name,int power);


    int deleteUIer(int userId);
}
