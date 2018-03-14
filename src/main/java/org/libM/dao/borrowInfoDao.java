package org.libM.dao;

import org.apache.ibatis.annotations.Param;
import org.libM.entity.borrowInfo;

import java.util.List;

public interface borrowInfoDao {

    /**
     *
     * @return
     */
    List<borrowInfo> queryAll();



    /**
     *
     * @param borrowUserId
     * @return
     */
    boolean addInfo(int borrowUserId);

    /**
     *
     * @param borrowId
     * @return
     */
    boolean updateInfo(int borrowId);



}
