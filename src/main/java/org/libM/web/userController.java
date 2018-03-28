package org.libM.web;


import org.libM.dto.loginInfo;
import org.libM.dto.userAddInfo;
import org.libM.dto.userDelInfo;
import org.libM.entity.userInfo;
import org.libM.service.userService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class userController {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private userService userService;

    @RequestMapping(value = "/userList",method = RequestMethod.POST)
    @ResponseBody
    public List<userInfo> userList(){
        List<userInfo> userList=userService.getUserList();
        return userList;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public loginInfo login(String username, String password){
        loginInfo loginInfo=userService.login(username,password);
        return loginInfo;
    }

    @RequestMapping(value = "/add",method =RequestMethod.POST)
    @ResponseBody
    public userAddInfo addUser(String username,String password,String name,int power){
        userAddInfo addInfo=userService.addUser(username,password,name,power);
        return addInfo;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public userDelInfo deleteUser(int userId){
        userDelInfo delInfo=userService.deleteUser(userId);
        return delInfo;
    }


}
