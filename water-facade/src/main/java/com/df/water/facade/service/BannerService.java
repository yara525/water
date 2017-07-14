package com.df.water.facade.service;

import com.df.water.facade.domain.Banner;

import java.util.List;

/**
 * banner信息, 暴露服务接口
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public interface BannerService {

    /**
     * 根据类型查询 banner列表
     *
     * @param type
     * @return
     */
    List<Banner> listBannersByType(Integer type);
}
