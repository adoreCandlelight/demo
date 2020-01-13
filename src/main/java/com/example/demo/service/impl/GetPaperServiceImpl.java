package com.example.demo.service.impl;

import com.example.demo.dao.mapper.PaperMapper;
import com.example.demo.dao.model.PaperDO;
import com.example.demo.service.GetPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Li Huiqin
 * @version 1.0
 * @date 2020/1/13 11:27
 */
@Service
public class GetPaperServiceImpl implements GetPaperService {

    @Autowired
    private PaperMapper paperMapper;

    @Override
    public PaperDO getPaperByPaperId(Long paperId) {

        PaperDO paper = paperMapper.selectByPrimaryKey(paperId);
        return paper;
    }
}
