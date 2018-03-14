package org.libM.entity;

public class userInfo {

    private int userId;

    private String userUserName;

    private String userPassword;

    private String userName;

    private int userPower;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserUserName() {
        return userUserName;
    }

    public void setUserUserName(String userUserName) {
        this.userUserName = userUserName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPower() {
        return userPower;
    }

    public void setUserPower(int userPower) {
        this.userPower = userPower;
    }

    @Override
    public String toString() {
        return "userInfo{" +
                "userId=" + userId +
                ", userUserName='" + userUserName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userPower=" + userPower +
                '}';
    }
}
