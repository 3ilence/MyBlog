package com.silence.myblog.service;

import java.util.Map;

/**
 * @ClassName : ConfigService
 * @Author : Silence
 * @Date: 2021/6/17 15:46
 * @Description :
 */
public interface ConfigService {
    /**
     * 修改配置项
     * @param configName
     * @param configValue
     * @return
     */
    int updateConfig(String configName, String configValue);

    /**
     * 获取所有的配置项
     * @return
     */
    Map<String,String> getAllConfigs();
}
