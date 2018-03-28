package org.libM.dto;

public class loginInfo {

    private int userId;

    private boolean success;

    private String loginInfo;

    public loginInfo(int userId, boolean success, String loginInfo) {
        this.userId = userId;
        this.success = success;
        this.loginInfo = loginInfo;
    }

    public loginInfo(boolean success, String loginInfo) {
        this.success = success;
        this.loginInfo = loginInfo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(String loginInfo) {
        this.loginInfo = loginInfo;
    }

    @Override
    public String toString() {
        return "loginInfo{" +
                "userId=" + userId +
                ", success=" + success +
                ", loginInfo='" + loginInfo + '\'' +
                '}';
    }
}
