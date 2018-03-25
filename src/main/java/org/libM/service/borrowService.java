package org.libM.service;

import org.libM.dto.borrowDto;
import org.libM.entity.borrowInfo;

import java.util.List;

public interface borrowService {


    List<borrowInfo> getBorrowInfos();


    borrowDto addInfo(int borrowUserId, int borrowBookId);


    borrowDto updateInfo(int borrowId);



}
