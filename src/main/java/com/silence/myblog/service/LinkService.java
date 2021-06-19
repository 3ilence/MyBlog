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
     *
     * @return
     */
    int getTotalLinks();

    /**
     *
     * @param link
     * @return
     */
    Boolean saveLink(BlogLink link);

    /**
     *
     * @param id
     * @return
     */
    BlogLink selectById(Integer id);

    /**
     *
     * @param tempLink
     * @return
     */
    Boolean updateLink(BlogLink tempLink);

    /**
     *
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
