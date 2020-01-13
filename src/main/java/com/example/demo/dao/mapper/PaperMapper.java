package com.example.demo.dao.mapper;

import com.example.demo.dao.model.PaperDO;

public interface PaperMapper {
    int deleteByPrimaryKey(Long paperId);

    int insert(PaperDO record);

    int insertSelective(PaperDO record);

    PaperDO selectByPrimaryKey(Long paperId);

    int updateByPrimaryKeySelective(PaperDO record);

    int updateByPrimaryKey(PaperDO record);
}