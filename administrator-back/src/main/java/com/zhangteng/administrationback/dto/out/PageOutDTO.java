package com.zhangteng.administrationback.dto.out;

import java.util.List;

/**
 * ClassName: PageOutDTO <br/>
 * Description: <br/>
 * date: 2020/2/26 17:06<br/>
 *
 * @author 雷神<br />
 * @since JDK 1.8
 */
public class PageOutDTO<T> {
    private Long total;
    private Integer pageSize;
    private Integer pageNum;
    private List<T> list;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
