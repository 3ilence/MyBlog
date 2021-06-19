package com.silence.myblog.service;

import com.silence.myblog.entity.BlogTagCount;
import com.silence.myblog.util.PageQueryUtil;
import com.silence.myblog.util.PageResult;

import java.util.List;

/**
 * @ClassName : TagService
 * @Author : Silence
 * @Date: 2021/6/17 15:47
 * @Description :
 */
public interface TagService {
    /**
     * 查询标签的分页数据
     * @param pageUtil
     * @return
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    /**
     * 查询标签总数
     * @return
     */
    int getTotalTags();

    /**
     * 新增标签
     * @param tagName 待插入的标签
     * @return
     */
    Boolean saveTag(String tagName);

    /**
     * 批量删除标签
     * @param ids 标签id数组
     * @return
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     *
     * @return
     */
    List<BlogTagCount> getBlogTagCountForIndex();
}
