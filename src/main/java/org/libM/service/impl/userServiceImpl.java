package org.libM.service.impl;

import org.libM.dao.userInfoDao;
import org.libM.dto.loginInfo;
import org.libM.entity.userInfo;
import org.libM.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userInfoDao userInfoDao;

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

    public int addUser(String username, String password, String name, int power) {
        int success=userInfoDao.addUser(username,password,name,power);
        if(success>=1)return 1;
        return 0;
    }

    public int deleteUser(int userId) {
        int success=userInfoDao.deleteUser(userId);
        if(success>=1)return 1;
        return 0;
    }
}
