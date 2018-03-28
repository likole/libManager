package org.libM.dto;

import org.libM.entity.book;

public class bookAddInfo {

    private boolean success;

    private String information;

    //private book book;  需要的话加上


    public bookAddInfo(boolean success, String information) {
        this.success = success;
        this.information = information;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }


    @Override
    public String toString() {
        return "bookAddInfo{" +
                "success=" + success +
                ", information='" + information + '\'' +
                '}';
    }
}
