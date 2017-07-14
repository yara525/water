package com.df.water.common.utils;

import com.github.diamond.client.spring.MessagePropertyPlaceholderConfigurer;
import com.llq.commons.datasource.FetchDataSourcesConfigSpi;
import com.llq.commons.utils.format.JsonUtils;
import org.springframework.context.ApplicationContext;

import java.util.Map;
import java.util.Properties;

/**
 * 默认从远程配置中心取回数据源配置
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public class DefaultFetchDataSourceConfig implements FetchDataSourcesConfigSpi {

    /**
     * spring bean容器
     */
    private ApplicationContext applicationContext;

    /**
     * 数据源 key
     */
    private String dataSourceKey = "commonDatasSource";

    /**
     * 获取配置属性 Key/Value pair
     *
     * @return 配置中心数据源配置
     */
    @Override
    public Properties fetchConfigProp() {

        Map<String, MessagePropertyPlaceholderConfigurer> beansOfType = applicationContext.getBeansOfType(MessagePropertyPlaceholderConfigurer.class);

        if (beansOfType == null || beansOfType.isEmpty()) {
            return null;
        }

        MessagePropertyPlaceholderConfigurer messagePropertyPlaceholderConfigurer = beansOfType.values().iterator().next();

        Object mysqlDataSource = messagePropertyPlaceholderConfigurer.getContextProperty(dataSourceKey);

        if (mysqlDataSource == null || !(mysqlDataSource instanceof String)) {
            return null;
        }

        return JsonUtils.toProperties(JsonUtils.parseJson(String.valueOf(mysqlDataSource)));
    }

    /**
     * 设置bean容器
     *
     * @param applicationContext
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {

        this.applicationContext = applicationContext;
    }

    /**
     * 设置数据源 key
     *
     * @param dataSourceKey
     */
    public void setDataSourceKey(String dataSourceKey) {

        this.dataSourceKey = dataSourceKey;
    }
}
