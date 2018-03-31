package org.libM.service.impl;

import org.libM.dao.userInfoDao;
import org.libM.dto.loginInfo;
import org.libM.dto.userAddInfo;
import org.libM.dto.userDelInfo;
import org.libM.entity.userInfo;
import org.libM.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userInfoDao userInfoDao;

    public userInfo getUser(int userId){return userInfoDao.getOne(userId);}

    public List<userInfo> getUserList() {
        return userInfoDao.queryAll(0,100);
    }

    public loginInfo login(String username, String password) {
        userInfo userInfo=userInfoDao.login(username,password);
        if(userInfo.getUserId()!=0){
            return new loginInfo(userInfo.getUserId(),true,"login_success");
        }else{
            return new loginInfo(false,"login_failed");
        }
    }

    public userAddInfo addUser(String username, String password, String name, int power) {
        int success=userInfoDao.addUser(username,password,name,power);
        if(success!=0)return new userAddInfo(true,"add_success");
        return new userAddInfo(false,"add_failed");
    }

    public userDelInfo deleteUser(int userId) {
        int success=userInfoDao.deleteUser(userId);
        if(success>=1)return new userDelInfo(true,"del_success");
        return new userDelInfo(false,"del_failed");
    }
}
