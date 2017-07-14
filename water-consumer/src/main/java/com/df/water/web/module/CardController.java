package com.df.water.web.module;

import com.df.water.facade.service.CardService;
import com.df.water.utils.Result;
import com.df.water.web.common.BaseController;
import com.llq.login.common.domain.LlqWebUser;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生卡绑定, 解绑, 挂失等操作, 控制层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/water/card")
public class CardController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(CardController.class);

    @Autowired
    private CardService cardServiceImpl;


    @ApiOperation(value = "绑卡挂失", notes = "绑卡挂失")
    @RequestMapping(value = "/reportCardLoss", method = RequestMethod.POST)
    public Result reportsCardLoss() {
        LlqWebUser jolanWaterUser = this.getJolanWaterUser();
        return null;
    }


    @ApiOperation(value = "挂失后重绑新卡", notes = "挂失后重绑新卡")
    @RequestMapping(value = "/rebindsNewCardAfterCardLoss", method = RequestMethod.POST)
    public Result rebindsNewCardAfterCardLoss() {

        return null;
    }


    @ApiOperation(value = "绑卡解绑", notes = "绑卡解绑")
    @RequestMapping(value = "/unbindsCard", method = RequestMethod.POST)
    public Result unbindsCard() {

        return null;
    }


    @ApiOperation(value = "卡解绑后重绑", notes = "卡解绑后重绑")
    @RequestMapping(value = "rebindsCard", method = RequestMethod.POST)
    public Result rebindsCard() {

        return null;
    }

    /**
     * 用户卡挂失或者卡解绑后, 重新绑定新卡
     *
     * @return
     */
    private void bindsCard() {}

}
