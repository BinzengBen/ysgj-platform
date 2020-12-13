package com.ysgj.food.platform.dao;


import java.util.List;
import com.ysgj.food.platform.entity.DccpPage;

public interface DccpPageMapper {
    int deleteByPrimaryKey(String pageId);

    int insert(DccpPage record);

    int insertSelective(DccpPage record);

    DccpPage selectByPrimaryKey(String pageId);

    int updateByPrimaryKeySelective(DccpPage record);

    int updateByPrimaryKey(DccpPage record);
    
    List<DccpPage> selectAll();
}