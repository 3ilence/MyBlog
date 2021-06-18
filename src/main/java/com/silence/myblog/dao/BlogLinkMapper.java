package com.silence.myblog.dao;

import com.silence.myblog.entity.BlogLink;
import com.silence.myblog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName : BlogLinkMapper
 * @Author : Silence
 * @Date: 2021/6/14 18:39
 * @Description :
 */
@Mapper
public interface BlogLinkMapper {
    /**
     * 根据主码删除博客链接
     * @param linkId 链接的主码
     * @return 删除成功返回1，否则返回0
     */
    int deleteByPrimaryKey(Integer linkId);

    /**
     * 插入博客链接
     * @param record 待插入的博客链接对象
     * @return 插入成功返回1，否则返回0
     */
    int insert(BlogLink record);

    /**
     * 字段选择性地插入博客链接
     * @param record 待插入的链接对象
     * @return 插入成功返回1，否则返回0
     */
    int insertSelective(BlogLink record);

    /**
     * 根据主码查询博客链接
     * @param linkId 链接的主码
     * @return 查询得到的链接对象
     */
    BlogLink selectByPrimaryKey(Integer linkId);

    /**
     * 字段选择性的更新博客链接
     * @param record 待更新的链接对象
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKeySelective(BlogLink record);

    /**
     * 更新博客链接信息
     * @param record 待更新的链接对象
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKey(BlogLink record);

    /**
     * 分页查询博客链接
     * @param pageUtil 分页查询工具类对象
     * @return 查询到的链接的列表
     */
    List<BlogLink> findLinkList(PageQueryUtil pageUtil);

    /**
     * 查询链接总数
     * @param pageUtil 分页查询工具类对象
     * @return 查询到的链接数目
     */
    int getTotalLinks(PageQueryUtil pageUtil);

    /**
     * 根据主码数组批量删除博客链接
     * @param ids id数组
     * @return 删除成功的链接的数目
     */
    int deleteBatch(Integer[] ids);
}
