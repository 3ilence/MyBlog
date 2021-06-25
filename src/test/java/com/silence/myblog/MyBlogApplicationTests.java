package com.silence.myblog;

import com.silence.myblog.dao.BlogMapper;
import com.silence.myblog.entity.Blog;
import com.silence.myblog.service.BlogService;
import com.silence.myblog.service.impl.BlogServiceImpl;
import com.silence.myblog.util.PageResult;
import com.silence.myblog.util.Result;
import com.silence.myblog.util.ResultGenerator;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MyBlogApplicationTests {
    BlogService blogService;

    @Test
    void contextLoads() {
    }

    @Test
    public void insert() {
        blogService = new BlogServiceImpl();
        Blog blog = new Blog();
        blog.setBlogTitle("blogTitle");
        blog.setBlogSubUrl("blogSubUrl");
        blog.setBlogCategoryId(6);
        blog.setBlogTags("blogTags");
        blog.setBlogContent("blogContent");
        blog.setBlogCoverImage("blogCoverImage");
        blog.setBlogStatus((byte) 1);
        blog.setEnableComment((byte) 1);
        String saveBlogResult = blogService.saveBlog(blog);
        System.out.println(saveBlogResult);
    }
}
