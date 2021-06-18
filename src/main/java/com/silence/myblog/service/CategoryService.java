package com.silence.myblog.service;

import com.silence.myblog.entity.BlogCategory;
import com.silence.myblog.util.PageQueryUtil;
import com.silence.myblog.util.PageResult;

import java.util.List;

/**
 * @ClassName : CategoryService
 * @Author : Silence
 * @Date: 2021/6/17 15:46
 * @Description :
 */
public interface CategoryService {

    /**
     * 查询分类的分页数据
     * @param pageUtil
     * @return PageResult
     */
    PageResult getBlogCategoryPage(PageQueryUtil pageUtil);

    /**
     * 获取分类总数
     * @return 分类总数
     */
    int getTotalCategories();

    /**
     * 添加分类数据
     * @param categoryName 分类名
     * @param categoryIcon 分类图标
     * @return 添加成功返回true，否则返回false
     */
    Boolean saveCategory(String categoryName,String categoryIcon);

    /**
     *
     * @param categoryId 类别id
     * @param categoryName 类别名
     * @param categoryIcon 类别图标
     * @return 更新成功返回true，否则返回false
     */
    Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

    /**
     * 批量删除分类
     * @param ids 类别id列表
     * @return
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     * 获取所有的博客分类
     * @return BlogCategory列表
     */
    List<BlogCategory> getAllCategories();
}
