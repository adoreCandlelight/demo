package com.example.demo.controller;

import com.example.demo.bo.GetPaperParam;
import com.example.demo.dao.model.PaperDO;
import com.example.demo.service.GetPaperService;
import com.example.demo.vo.PaperDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author Li Huiqin
 * @version 1.0
 * @date 2020/1/13 11:32
 */
@RestController
@RequestMapping(path = "/paper")
public class PaperController {

    @Autowired
    private GetPaperService getPaperService;

    @RequestMapping(path = "/paperDetail", method = RequestMethod.POST)
    public PaperDetailVO getPaperDetail(@RequestBody GetPaperParam param) {
        System.out.println(param);
        PaperDO paper = getPaperService.getPaperByPaperId(param.getPaperId());
        PaperDetailVO detailVo = new PaperDetailVO();
        detailVo.setFileName(paper.getFileName());
        detailVo.setFileSize(paper.getFileSize());
        detailVo.setPaperId(paper.getPaperId());
        detailVo.setSignature(paper.getSignature());
        detailVo.setUrl(paper.getUrl());
        detailVo.setUserId(paper.getUserId());
        detailVo.setCreateTime(paper.getCreateTime());
        return detailVo;
    }
}
