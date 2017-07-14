package com.df.water.web.module;

import com.df.water.facade.service.RepairService;
import com.df.water.web.common.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 报修服务, 控制层. 主要包括以下内容:
 * <li>热水报修</li>
 * <li>电力报修</li>
 * <li>桌椅报修</li>
 * <li>瓷砖报修</li>
 * <li>门窗报修</li>
 * <li>墙壁报修</li>
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/water/repair")
public class RepairController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(RepairController.class);

    @Autowired
    private RepairService repairServiceImpl;

}
