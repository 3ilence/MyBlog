package com.silence.myblog.service;

import com.silence.myblog.entity.BlogLink;
import com.silence.myblog.util.PageQueryUtil;
import com.silence.myblog.util.PageResult;

import java.util.List;
import java.util.Map;

/**
 * @ClassName : LinkService
 * @Author : Silence
 * @Date: 2021/6/17 15:47
 * @Description : 友链服务层
 */
public interface LinkService {
    /**
     * 查询友链的分页数据
     * @param pageUtil 分页查询工具
     * @return PageResult
     */
    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    /**
     * 获取友链总数
     * @return 友链总数
     */
    int getTotalLinks();

    /**
     * 新增友链
     * @param link 链接
     * @return 添加是否成功
     */
    Boolean saveLink(BlogLink link);

    /**
     * 根据友链id查询友链
     * @param id 链接id
     * @return 查询到的链接对象
     */
    BlogLink selectById(Integer id);

    /**
     * 更新友链信息
     * @param tempLink 待更新的链接对象
     * @return 更新是否成功
     */
    Boolean updateLink(BlogLink tempLink);

    /**
     * 批量删除友链
     * @param ids 链接id数组
     * @return 删除是否成功
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回友链页面所需的所有数据
     * @return
     */
    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
