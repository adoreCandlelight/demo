package com.example.demo.service;

import com.example.demo.dao.model.PaperDO;

/**
 * @author Li Huiqin
 * @version 1.0
 * @date 2020/1/13 11:26
 */
public interface GetPaperService {

    /**
     * 通过paperId获取文章信息
     * @param paperId
     * @return
     */
    PaperDO getPaperByPaperId(Long paperId);
}
