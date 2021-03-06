package com.silence.myblog.service.impl;

import com.silence.myblog.dao.BlogTagMapper;
import com.silence.myblog.dao.BlogTagRelationMapper;
import com.silence.myblog.entity.BlogTag;
import com.silence.myblog.entity.BlogTagCount;
import com.silence.myblog.service.TagService;
import com.silence.myblog.util.PageQueryUtil;
import com.silence.myblog.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @ClassName : TagServiceImpl
 * @Author : Silence
 * @Date: 2021/6/18 9:58
 * @Description :
 */
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private BlogTagMapper blogTagMapper;
    @Autowired
    private BlogTagRelationMapper relationMapper;

    @Override
    public PageResult getBlogTagPage(PageQueryUtil pageUtil) {
        List<BlogTag> tags = blogTagMapper.findTagList(pageUtil);
        int total = blogTagMapper.getTotalTags(pageUtil);
        PageResult pageResult = new PageResult(tags, total, pageUtil.getLimit(), pageUtil.getPage());
        return pageResult;
    }

    @Override
    public int getTotalTags() {
        //参数为null的话就是查询标签总数
        return blogTagMapper.getTotalTags(null);
    }

    @Override
    public Boolean saveTag(String tagName) {
        BlogTag temp = blogTagMapper.selectByTagName(tagName);
        if (temp == null) {
            BlogTag blogTag = new BlogTag();
            blogTag.setTagName(tagName);
            return blogTagMapper.insertSelective(blogTag) > 0;
        }
        return false;
    }

    @Override
    public Boolean deleteBatch(Integer[] ids) {
        //已存在关联关系不删除
        List<Long> relations = relationMapper.selectDistinctTagIds(ids);
        if (!CollectionUtils.isEmpty(relations)) {
            return false;
        }
        //删除tag
        return blogTagMapper.deleteBatch(ids) > 0;
    }

    @Override
    public List<BlogTagCount> getBlogTagCountForIndex() {
        //这个函数的sql有点复杂，总之不是查询标签总数
        return blogTagMapper.getTagCount();
    }
}
