package com.silence.myblog.service;

import java.util.Map;

/**
 * @ClassName : ConfigService
 * @Author : Silence
 * @Date: 2021/6/17 15:46
 * @Description : 配置服务层
 */
public interface ConfigService {
    /**
     * 修改配置项
     * @param configName 配置名
     * @param configValue 配置值
     * @return 修改成功返回1，否则返回0
     */
    int updateConfig(String configName, String configValue);

    /**
     * 获取所有的配置项
     * @return 配置Map<String, String>
     */
    Map<String,String> getAllConfigs();
}
