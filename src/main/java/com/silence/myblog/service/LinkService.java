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
 * @Description :
 */
public interface LinkService {
    /**
     * 查询友链的分页数据
     * @param pageUtil
     * @return
     */
    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    /**
     * 获取友链总数
     * @return
     */
    int getTotalLinks();

    /**
     * 新增友链
     * @param link
     * @return
     */
    Boolean saveLink(BlogLink link);

    /**
     * 根据友链id查询友链
     * @param id
     * @return
     */
    BlogLink selectById(Integer id);

    /**
     * 更新友链信息
     * @param tempLink
     * @return
     */
    Boolean updateLink(BlogLink tempLink);

    /**
     * 批量删除友链
     * @param ids
     * @return
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回友链页面所需的所有数据
     * @return
     */
    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}
