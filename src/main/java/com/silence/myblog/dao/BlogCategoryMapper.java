package com.silence.myblog.dao;

import com.silence.myblog.entity.BlogCategory;
import com.silence.myblog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName : BlogCategoryMapper
 * @Author : Silence
 * @Date: 2021/6/14 18:38
 * @Description :
 */
@Mapper
public interface BlogCategoryMapper {
    /**
     * 根据主码删除博客类别
     * @param categoryId 类别id
     * @return 删除成功返回1，否则返回0
     */
    int deleteByPrimaryKey(Integer categoryId);

    /**
     * 增加博客类别对象，要求对象各个字段都有值
     * @param record 待插入的博客类别对象
     * @return 插入成功返回1，否则返回0
     */
    int insert(BlogCategory record);

    /**
     * 增加博客类别对象，不要求各个字段都有初值
     * @param record 待插入的博客类别对象
     * @return 插入成功返回1，否则返回0
     */
    int insertSelective(BlogCategory record);

    /**
     * 根据id查询博客类别对象
     * @param categoryId 类别id
     * @return 查找到的类别对象
     */
    BlogCategory selectByPrimaryKey(Integer categoryId);

    /**
     * 根据类别名查询类别对象
     * @param categoryName 博客类别名
     * @return 查找到的博客类别对象
     */
    BlogCategory selectByCategoryName(String categoryName);

    /**
     * 选择性更新BlogCategory对象信息，即只更新某几个字段的信息
     * @param record 待更新的博客类别对象
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKeySelective(BlogCategory record);

    /**
     *  更新BlogCategory对象信息，在sql语句中，每个字段都会更新
     * @param record 待更新的博客类别对象
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKey(BlogCategory record);

    /**
     * 查询某几页博客类别
     * @param pageUtil 博客分页查询工具类对象
     * @return 返回一个BlogCategory列表
     */
    List<BlogCategory> findCategoryList(PageQueryUtil pageUtil);

    /**
     * 根据id数组查询一组博客类别信息
     * @param categoryIds 类别id数组
     * @return 返回BlogCategory列表
     */
    List<BlogCategory> selectByCategoryIds(@Param("categoryIds") List<Integer> categoryIds);

    /**
     * 查询博客类别总数
     * @param pageUtil 分页查询工具类对象
     * @return 已经定义的博客类别总数
     */
    int getTotalCategories(PageQueryUtil pageUtil);

    /**
     *删除一组博客类别对象
     * @param ids id数组
     * @return 返回删除成功的博客类别表的行数
     */
    int deleteBatch(Integer[] ids);
}
