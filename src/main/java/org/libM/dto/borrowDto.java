package org.libM.dto;

public class borrowDto {

    private boolean success;

    private String information;

    public borrowDto(boolean success, String information) {
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
        return "borrowDto{" +
                "success=" + success +
                ", information='" + information + '\'' +
                '}';
    }
}
