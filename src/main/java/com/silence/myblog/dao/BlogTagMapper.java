package com.silence.myblog.dao;

import com.silence.myblog.entity.BlogTag;
import com.silence.myblog.entity.BlogTagCount;
import com.silence.myblog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName : BlogTagMapper
 * @Author : Silence
 * @Date: 2021/6/14 18:39
 * @Description :
 */
@Mapper
public interface BlogTagMapper {
    /**
     * 根据主码删除博客标签
     * @param tagId 标签的id
     * @return 删除成功返回1，否则返回0
     */
    int deleteByPrimaryKey(Integer tagId);

    /**
     * 新增标签
     * @param record 待插入的标签对象
     * @return 插入成功返回1，否则返回0
     */
    int insert(BlogTag record);

    /**
     * 字段选择性新增标签
     * @param record 待插入的标签对象
     * @return 插入成功返回1，否则返回0
     */
    int insertSelective(BlogTag record);

    /**
     * 根据标签id查询标签
     * @param tagId 标签的id
     * @return 查询得到的标签对象
     */
    BlogTag selectByPrimaryKey(Integer tagId);

    /**
     * 根据标签名查询标签
     * @param tagName 标签名
     * @return 查询得到的标签对象
     */
    BlogTag selectByTagName(String tagName);

    /**
     * 字段选择性更新标签信息
     * @param record 待更新的标签
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKeySelective(BlogTag record);

    /**
     * 更新标签信息，每个字段都需要更新
     * @param record 待更新的标签
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKey(BlogTag record);

    /**
     * 分页查询标签
     * @param pageUtil 分页工具类对象
     * @return 标签列表
     */
    List<BlogTag> findTagList(PageQueryUtil pageUtil);

    /**
     * 查询标签总数
     * @return 标签总数
     */
    List<BlogTagCount> getTagCount();

    /**
     * 分页查询标签数量
     * @param pageUtil 分页工具类对象
     * @return 标签数目
     */
    int getTotalTags(PageQueryUtil pageUtil);

    /**
     * 批量删除标签
     * @param ids 标签id数组
     * @return 删除成功的标签数目
     */
    int deleteBatch(Integer[] ids);

    /**
     * 批量增加标签
     * @param tagList 待插入的标签列表
     * @return 插入成功的标签数目
     */
    int batchInsertBlogTag(List<BlogTag> tagList);
}
