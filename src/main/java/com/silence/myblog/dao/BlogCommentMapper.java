package com.silence.myblog.dao;

import com.silence.myblog.entity.BlogComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName : BlogCommentMapper
 * @Author : Silence
 * @Date: 2021/6/14 18:39
 * @Description :
 */
@Mapper
public interface BlogCommentMapper {
    /**
     * 根据评论id删除评论
     * @param commentId 评论的id
     * @return 删除成功返回1，否则返回0
     */
    int deleteByPrimaryKey(Long commentId);

    /**
     * 新增评论，要求待插入的评论对象每个属性都有初值
     * @param record 待增加的评论对象
     * @return 插入成功返回1，否则返回0
     */
    int insert(BlogComment record);

    /**
     * 新增评论，不要求待插入的评论对象每个属性都有初值
     * @param record 待增加的评论对象
     * @return 插入成功返回1，否则返回0
     */
    int insertSelective(BlogComment record);

    /**
     * 根据评论id查找评论
     * @param commentId 评论的id
     * @return 查找到的评论对象
     */
    BlogComment selectByPrimaryKey(Long commentId);

    /**
     * 字段选择性地更新评论信息
     * @param record 待更新的评论对象
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKeySelective(BlogComment record);

    /**
     * 更新评论信息，待更新的评论对象每个字段在sql语句中都会被更新，即使没有改变
     * @param record 待更新的评论对象
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKey(BlogComment record);

    /**
     * 查找一组评论
     * @param map
     * @return BlogComment列表
     */
    List<BlogComment> findBlogCommentList(Map map);

    /**
     * 获取评论总数
     * @param map map里有用来查询评论表的键值对
     * @return 评论总数
     */
    int getTotalBlogComments(Map map);

    /**
     * 将comment_status从0更改为1
     * @param ids id数组
     * @return
     */
    int checkDone(Integer[] ids);

    /**
     * 删除一组评论
     * @param ids 评论id数组
     * @return 成功删除的评论数量
     */
    int deleteBatch(Integer[] ids);
}
