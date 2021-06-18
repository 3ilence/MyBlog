package com.silence.myblog.service;

import com.silence.myblog.controller.vo.BlogDetailVO;
import com.silence.myblog.controller.vo.SimpleBlogListVO;
import com.silence.myblog.entity.Blog;
import com.silence.myblog.util.PageQueryUtil;
import com.silence.myblog.util.PageResult;

import java.util.List;

/**
 * @ClassName : BlogService
 * @Author : Silence
 * @Date: 2021/6/17 15:45
 * @Description :
 */
public interface BlogService {
    /**
     * 新增博客
     * @param blog 待插入的博客
     * @return
     */
    String saveBlog(Blog blog);

    /**
     * 分页查询博客
     * @param pageUtil
     * @return PageResult
     */
    PageResult getBlogsPage(PageQueryUtil pageUtil);

    /**
     * 批量删除博客
     * @param ids 博客id列表
     * @return 删除成功返回true，否则返回false
     */
    Boolean deleteBatch(Integer[] ids);

    int getTotalBlogs();

    /**
     * 根据id获取详情
     * @param blogId
     * @return Blog对象
     */
    Blog getBlogById(Long blogId);

    /**
     * 后台修改
     * @param blog 待更新的博客对象
     * @return
     */
    String updateBlog(Blog blog);

    /**
     * 获取首页文章列表
     * @param page
     * @return
     */
    PageResult getBlogsForIndexPage(int page);

    /**
     * 首页侧边栏数据列表
     * 0-点击最多 1-最新发布
     * @param type
     * @return
     */
    List<SimpleBlogListVO> getBlogListForIndexPage(int type);
    /**
     * 文章详情
     * @param blogId 博客id
     * @return
     */
    BlogDetailVO getBlogDetail(Long blogId);

    /**
     * 根据标签获取文章列表
     * @param tagName 标签id
     * @param page
     * @return
     */
    PageResult getBlogsPageByTag(String tagName, int page);

    /**
     * 根据分类获取文章列表
     * @param categoryId 分类id
     * @param page
     * @return
     */
    PageResult getBlogsPageByCategory(String categoryName, int page);

    /**
     * 根据搜索获取文章列表
     * @param keyword 搜索关键字
     * @param page
     * @return
     */
    PageResult getBlogsPageBySearch(String keyword, int page);

    /**
     *
     * @param subUrl
     * @return
     */
    BlogDetailVO getBlogDetailBySubUrl(String subUrl);
}
