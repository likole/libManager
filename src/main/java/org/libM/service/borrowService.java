package org.libM.service;

import org.libM.entity.borrowInfo;

import java.util.List;

public interface borrowService {


    List<borrowInfo> getBorrowInfos();


    int addInfo(int borrowUserId);


    int updateInfo(int borrowId);



}
