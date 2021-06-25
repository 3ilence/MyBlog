package com.silence.myblog.service;

import com.silence.myblog.entity.BlogTagCount;
import com.silence.myblog.util.PageQueryUtil;
import com.silence.myblog.util.PageResult;

import java.util.List;

/**
 * @ClassName : TagService
 * @Author : Silence
 * @Date: 2021/6/17 15:47
 * @Description : 博客标签服务层
 */
public interface TagService {
    /**
     * 查询标签的分页数据
     * @param pageUtil 分页查询工具
     * @return PageResult
     */
    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    /**
     * 查询标签总数
     * @return 标签总数
     */
    int getTotalTags();

    /**
     * 新增标签
     * @param tagName 待插入的标签
     * @return 添加是否成功
     */
    Boolean saveTag(String tagName);

    /**
     * 批量删除标签
     * @param ids 标签id数组
     * @return 删除是否成功
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回首页所需要的标签数据
     * @return 标签对象列表
     */
    List<BlogTagCount> getBlogTagCountForIndex();
}
