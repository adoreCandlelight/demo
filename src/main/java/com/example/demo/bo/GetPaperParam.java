package com.example.demo.bo;

/**
 * @author Li Huiqin
 * @version 1.0
 * @date 2020/1/13 11:33
 */
public class GetPaperParam {

    /**
     * 文章id
     */
    private Long paperId;

    public Long getPaperId() {
        return paperId;
    }

    public void setPaperId(Long paperId) {
        this.paperId = paperId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetPaperParam{");
        sb.append("paperId=").append(paperId);
        sb.append('}');
        return sb.toString();
    }
}
