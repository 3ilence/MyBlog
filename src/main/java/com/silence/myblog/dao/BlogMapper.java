package com.silence.myblog.dao;

import com.silence.myblog.entity.Blog;
import com.silence.myblog.util.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName : BlogMapper
 * @Author : Silence
 * @Date: 2021/6/14 18:39
 * @Description :
 */
@Mapper
public interface BlogMapper {
    /**
     * 根据博客id删除博客
     * @param blogId 博客id
     * @return 删除成功则返回1，否则返回0
     */
    int deleteByPrimaryKey(Long blogId);

    /**
     * 增加博客，要求增加的博客对象每个字段都有值
     * @param record 需要增加的博客对象
     * @return 增加成功则返回1，否则返回0
     */
    int insert(Blog record);

    /**
     * 增加博客对象，不要求增加的博客对象每个字段都有值
     * @param record 需要增加的博客对象
     * @return 增加成功则返回1，否则返回0
     */
    int insertSelective(Blog record);

    /**
     * 根据博客id查找博客
     * @param blogId 博客id
     * @return 查找到的博客
     */
    Blog selectByPrimaryKey(Long blogId);

    /**
     * 根据博客id查找博客并选择性的更新该博客的字段信息
     * @param record 要更新的博客
     * @return 更新成功则返回1，否则返回0
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeyWithBLOBs(Blog record);

    /**
     * 根据博客id查找博客并且更新该博客对象所有字段的信息
     * @param record 要更新的博客
     * @return 更新成功则返回1，否则返回0
     */
    int updateByPrimaryKey(Blog record);

    /**
     *
     * @param pageUtil
     * @return
     */
    List<Blog> findBlogList(PageQueryUtil pageUtil);

    /**
     *
     * @param type
     * @param limit
     * @return
     */
    List<Blog> findBlogListByType(@Param("type") int type, @Param("limit") int limit);

    /**
     *
     * @param pageUtil
     * @return
     */
    int getTotalBlogs(PageQueryUtil pageUtil);

    /**
     * 批量删除博客
     * @param ids 要删除的博客的id的数组
     * @return 删除成功的博客的数量
     */
    int deleteBatch(Integer[] ids);

    /**
     *
     * @param pageUtil
     * @return
     */
    List<Blog> getBlogsPageByTagId(PageQueryUtil pageUtil);

    /**
     *
     * @param pageUtil
     * @return
     */
    int getTotalBlogsByTagId(PageQueryUtil pageUtil);

    /**
     * 根据url获得博客
     * @param subUrl
     * @return
     */
    Blog selectBySubUrl(String subUrl);

    /**
     * 更新博客的类别信息，把所有类别id在ids中的类别都改成新的id
     * @param categoryName
     * @param categoryId
     * @param ids
     * @return
     */
    int updateBlogCategorys(@Param("categoryName") String categoryName, @Param("categoryId") Integer categoryId, @Param("ids")Integer[] ids);

}
