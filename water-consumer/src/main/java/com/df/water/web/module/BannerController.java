package com.df.water.web.module;

import com.df.water.annotation.EnableAccessPermission;
import com.df.water.constant.UnifyErrorCode;
import com.df.water.constant.UnifyErrorMsg;
import com.df.water.dto.BannerDTO;
import com.df.water.facade.domain.Banner;
import com.df.water.facade.service.BannerService;
import com.df.water.utils.Result;
import com.df.water.web.common.BaseController;
import com.llq.commons.utils.format.BeanCopyUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * 首页轮播图, 控制层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/water/banner")
public class BannerController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BannerController.class);

    @Autowired
    private BannerService bannerServiceImpl;

    @EnableAccessPermission
    @ApiOperation(value = "banner", notes = "首页轮播图")
    @ApiImplicitParam(paramType = "path", name = "type", value = "类型", required = true, dataType = "Integer")
    @RequestMapping(value = "/listBannersByType/{type}", method = RequestMethod.GET)
    public Result listBannersByType(@PathVariable(value = "type") Integer type) {

        List<BannerDTO> bannerDTOList = new ArrayList<>();
        List<Banner> bannerList = null;

        try {
            bannerList = bannerServiceImpl.listBannersByType(type);
        } catch (Exception e) {
            logger.error("根据类型查询banner列表失败, e = {}", e.getMessage());
            return Result.create(UnifyErrorMsg.ACCESS_FAILURE, UnifyErrorCode.ACCESS_FAILURE, bannerDTOList);
        }


        if (CollectionUtils.isNotEmpty(bannerList)) {
            BannerDTO bannerDTO = null;
            for (Banner banner : bannerList) {
                bannerDTO = new BannerDTO();
                if (null != banner) {
                    BeanCopyUtils.copyBean(bannerDTO, banner);
                    bannerDTOList.add(bannerDTO);
                }
            }

            return Result.create(UnifyErrorMsg.ACCESS_SUCCESS, UnifyErrorCode.ACCESS_SUCCESS, bannerDTOList);
        }

        return Result.create(UnifyErrorMsg.ACCESS_FAILURE, UnifyErrorCode.ACCESS_FAILURE, bannerDTOList);
    }


}
