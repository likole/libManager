package org.libM.dao;

import org.apache.ibatis.annotations.Param;
import org.libM.entity.borrowInfo;

import java.util.List;

public interface borrowInfoDao {

    /**
     *
     * @return
     */
    List<borrowInfo> queryAll(@Param("offset")int offset,@Param("num")int num);


    /**
     *
     * @param borrowUserId
     * @param borrowBookId
     * @return
     */
    int addInfo(@Param("borrowUserId") int borrowUserId,@Param("borrowBookId") int borrowBookId);

    /**
     *
     * @param borrowId
     * @return
     */
    int updateInfo(int borrowId);



}
