package com.silence.myblog.dao;

import com.silence.myblog.entity.BlogTagRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName : BlogTagRelationMapper
 * @Author : Silence
 * @Date: 2021/6/14 18:40
 * @Description :
 */
@Mapper
public interface BlogTagRelationMapper {
    /**
     * 根据主码删除博客与博客标签之间的联系
     * @param relationId 联系的id
     * @return 删除成功返回1，否则返回0
     */
    int deleteByPrimaryKey(Long relationId);

    /**
     * 新增联系
     * @param record 待插入的联系
     * @return 插入成功返回1，否则返回0
     */
    int insert(BlogTagRelation record);

    /**
     * 字段选择性新增联系
     * @param record 待插入的联系
     * @return 插入成功返回1，否则返回0
     */
    int insertSelective(BlogTagRelation record);

    /**
     * 根据联系的id查询联系
     * @param relationId 联系的id
     * @return 查询得到的联系对象
     */
    BlogTagRelation selectByPrimaryKey(Long relationId);

    /**
     * 根据博客id和标签id查询联系
     * @param blogId 博客id
     * @param tagId 标签id
     * @return 查询得到的联系
     */
    BlogTagRelation selectByBlogIdAndTagId(@Param("blogId") Long blogId, @Param("tagId") Integer tagId);

    /**
     * 查询所有包含了参数tagId列表中id的Relation
     * @param tagIds 标签id列表
     * @return 联系id列表
     */
    List<Long> selectDistinctTagIds(Integer[] tagIds);

    /**
     * 字段选择性地更新联系
     * @param record 待更新的联系
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKeySelective(BlogTagRelation record);

    /**
     * 更新联系
     * @param record 待更新的联系
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKey(BlogTagRelation record);

    /**
     * 批量新增联系
     * @param blogTagRelationList 联系列表
     * @return 插入成功的数目
     */
    int batchInsert(@Param("relationList") List<BlogTagRelation> blogTagRelationList);

    /**
     * 根据博客的id删除联系
     * @param blogId 博客id
     * @return 删除成功的联系的数目
     */
    int deleteByBlogId(Long blogId);
}
