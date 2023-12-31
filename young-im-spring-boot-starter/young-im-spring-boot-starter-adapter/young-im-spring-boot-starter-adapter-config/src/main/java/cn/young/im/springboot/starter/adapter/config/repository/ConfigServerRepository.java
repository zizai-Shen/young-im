package cn.young.im.springboot.starter.adapter.config.repository;

import com.alibaba.nacos.api.config.ConfigService;

/**
 * 作者：沈自在 <a href="https://www.szz.tax">Blog</a>
 *
 * @description 配置中心仓储
 * @date 2023/12/16
 */
public interface ConfigServerRepository {

    String getConfig(String configKey, String groupId);


    ConfigService getConfigService();
}
