package com.df.water.service.impl;

import com.df.water.facade.domain.Banner;
import com.df.water.facade.service.BannerService;
import com.df.water.service.dao.BannerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * banner页, 业务逻辑层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Service(value = "bannerServiceImpl")
public class BannerServiceImpl implements BannerService {

    private static final Logger logger = LoggerFactory.getLogger(BannerServiceImpl.class);

    @Autowired
    private BannerDao bannerDao;

    /**
     * 根据类型查询 banner列表
     *
     * @param type
     * @return
     */
    @Override
    public List<Banner> listBannersByType(Integer type) {
        List<Banner> bannerList = new ArrayList<>();

        try {
            bannerList = bannerDao.listBannersByType(type);
        } catch (Exception e) {
            logger.error("根据类型获取banner列表失败, e = {}", e.getMessage());
            return bannerList;
        }

        return bannerList;
    }
}
