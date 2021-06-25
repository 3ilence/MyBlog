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
 * @Description : 博客服务层
 */
public interface BlogService {
    /**
     * 新增博客
     * @param blog 待插入的博客
     * @return 插入成功返回"success",否则返回"保存失败"
     */
    String saveBlog(Blog blog);

    /**
     * 分页查询博客
     * @param pageUtil 分页工具类对象
     * @return PageResult
     */
    PageResult getBlogsPage(PageQueryUtil pageUtil);

    /**
     * 批量删除博客
     * @param ids 博客id列表
     * @return 删除成功返回true，否则返回false
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     * 获取博客总数
     * @return 已发布博客总数
     */
    int getTotalBlogs();

    /**
     * 根据id获取博客
     * @param blogId 博客id
     * @return Blog对象
     */
    Blog getBlogById(Long blogId);

    /**
     * 后台更新博客信息
     * @param blog 待更新的博客对象
     * @return 更新结果信息
     */
    String updateBlog(Blog blog);

    /**
     * 获取首页文章第page页的文章列表
     * @param page 第几页
     * @return PageResult
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
     * @param categoryName 分类id
     * @param page 第几页
     * @return PageResult
     */
    PageResult getBlogsPageByCategory(String categoryName, int page);

    /**
     * 根据搜索获取文章列表
     * @param keyword 搜索关键字
     * @param page 第几页
     * @return PageResult
     */
    PageResult getBlogsPageBySearch(String keyword, int page);

    /**
     * 根据网页Url获取博客
     * @param subUrl url
     * @return BlogDetailVO对象
     */
    BlogDetailVO getBlogDetailBySubUrl(String subUrl);
}
