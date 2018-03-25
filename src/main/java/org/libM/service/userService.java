package org.libM.service;

import org.libM.dto.loginInfo;
import org.libM.dto.userAddInfo;
import org.libM.dto.userDelInfo;
import org.libM.entity.userInfo;

import java.util.List;

public interface userService {


    List<userInfo> getUserList();


    loginInfo login(String username, String passwrod);


    userAddInfo addUser(String username, String password, String name, int power);


    userDelInfo deleteUser(int userId);
}
