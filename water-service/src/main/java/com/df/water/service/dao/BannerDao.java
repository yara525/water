package com.df.water.service.dao;

import com.df.water.facade.domain.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 首页轮播图, 数据访问层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public interface BannerDao {

    /**
     * 根据类型查询 banner列表
     *
     * @param type
     * @return
     */
    List<Banner> listBannersByType(@Param(value = "type") Integer type);

}
