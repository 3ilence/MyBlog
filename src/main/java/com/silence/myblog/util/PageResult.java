package com.silence.myblog.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName : PageResult
 * @Author : Silence
 * @Date: 2021/6/14 19:43
 * @Description : 查询结果包装类
 */
@Data
public class PageResult implements Serializable {
    //总记录数
    private int totalCount;
    //每页记录数
    private int pageSize;
    //总页数
    private int totalPage;
    //当前页数
    private int currPage;
    //列表数据
    private List<?> list;

    /**
     *  分页
     * @param list 列表数据
     * @param totalCount 总记录数
     * @param pageSize 每页记录数
     * @param currPage 当前页数
     */
    public PageResult(List<?> list, int totalCount, int pageSize, int currPage) {
        this.list = list;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currPage = currPage;
        //总页数等于总记录数除以每页记录数再向上取整
        this.totalPage = (int) Math.ceil((double) totalCount / pageSize);
    }
}
