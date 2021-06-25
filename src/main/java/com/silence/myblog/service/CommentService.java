package com.silence.myblog.service;

import com.silence.myblog.entity.BlogComment;
import com.silence.myblog.util.PageQueryUtil;
import com.silence.myblog.util.PageResult;

/**
 * @ClassName : CommentService
 * @Author : Silence
 * @Date: 2021/6/17 15:46
 * @Description :
 */
public interface CommentService {
    /**
     * 添加评论
     * @param blogComment 待插入的评论对象
     * @return 添加成功与否
     */
    Boolean addComment(BlogComment blogComment);

    /**
     * 后台管理系统中评论分页功能
     * @param pageUtil  分页查询工具类对象
     * @return PageResult
     */
    PageResult getCommentsPage(PageQueryUtil pageUtil);

    /**
     * 获取评论总数量
     * @return 评论总数
     */
    int getTotalComments();

    /**
     * 批量审核评论
     * @param ids 评论id数组
     * @return 审核是否成功
     */
    Boolean checkDone(Integer[] ids);

    /**
     * 批量删除评论
     * @param ids 评论id数组
     * @return 删除是否成功
     */
    Boolean deleteBatch(Integer[] ids);

    /**
     * 添加回复
     * @param commentId 要回复的评论的id
     * @param replyBody 回复内容
     * @return 回复是否成功
     */
    Boolean reply(Long commentId, String replyBody);

    /**
     * 根据文章id和分页参数获取文章的评论列表
     * @param blogId 文章id
     * @param page 第几页
     * @return PageResult
     */
    PageResult getCommentPageByBlogIdAndPageNum(Long blogId, int page);
}
