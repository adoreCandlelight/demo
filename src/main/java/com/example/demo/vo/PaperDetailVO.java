package com.example.demo.vo;

import java.util.Date;

/**
 * @author Li Huiqin
 * @version 1.0
 * @date 2020/1/13 11:35
 */
public class PaperDetailVO {

    private Long paperId;

    private Long userId;

    private String url;

    private String fileName;

    private Long fileSize;

    private String signature;

    private Date createTime;

    public Long getPaperId() {
        return paperId;
    }

    public void setPaperId(Long paperId) {
        this.paperId = paperId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaperDetailVO{");
        sb.append("paperId=").append(paperId);
        sb.append(", userId=").append(userId);
        sb.append(", url='").append(url).append('\'');
        sb.append(", fileName='").append(fileName).append('\'');
        sb.append(", fileSize=").append(fileSize);
        sb.append(", signature='").append(signature).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
