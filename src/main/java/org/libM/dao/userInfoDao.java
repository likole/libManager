package org.libM.dao;

import org.apache.ibatis.annotations.Param;
import org.libM.entity.userInfo;

import java.util.List;

public interface userInfoDao {


    /**
     *
     * @param username
     * @return
     */
    userInfo queryByUsername(String username);

    /**
     *
     * @param offset
     * @param num
     * @return
     */
    List<userInfo> queryAll(@Param("offset") int offset, @Param("num") int num);



    /**
     * 登录接口
     * @param username
     * @param password
     * @return userId 返回用户id
     */
    userInfo login(@Param("username") String username ,@Param("password") String password);


    /**
     * 添加用户
     * @param username
     * @param password
     * @param name
     * @param power  用户权限  1是管理员 0是普通用户
     * @return
     */
    boolean addUser(@Param("username") String username,@Param("password") String password,@Param("name") String name, @Param("power") int power);



    /**
     * 删除用户
     * @param userId
     * @return
     */
    boolean deleteUser(int userId);




}
