package com.silence.myblog.dao;

import com.silence.myblog.entity.BlogConfig;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName : BlogConfigMapper
 * @Author : Silence
 * @Date: 2021/6/14 18:39
 * @Description :
 */
@Mapper
public interface BlogConfigMapper {
    /**
     * 查询所有博客设置
     * @return 设置对象的列表
     */
    List<BlogConfig> selectAll();

    /**
     * 根据主码查询设置对象
     * @param configName 设置名，亦主码
     * @return 查询得到的设置对象
     */
    BlogConfig selectByPrimaryKey(String configName);

    /**
     * 选择性更新博客设置，不是每个字段都更新
     * @param record 待更新的设置对象
     * @return 更新成功返回1，否则返回0
     */
    int updateByPrimaryKeySelective(BlogConfig record);
}
