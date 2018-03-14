package org.libM.entity;

import java.util.Date;

public class borrowInfo {

    private int borrowId;

    private int borrowUserId;

    private Date borrowTime;

    private Date returnTime;

    private int borrowState;

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getBorrowUserId() {
        return borrowUserId;
    }

    public void setBorrowUserId(int borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public Date getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public int getBorrowState() {
        return borrowState;
    }

    public void setBorrowState(int borrowState) {
        this.borrowState = borrowState;
    }

    @Override
    public String toString() {
        return "borrowInfo{" +
                "borrowId=" + borrowId +
                ", borrowUserId=" + borrowUserId +
                ", borrowTime=" + borrowTime +
                ", returnTime=" + returnTime +
                ", borrowState=" + borrowState +
                '}';
    }
}
