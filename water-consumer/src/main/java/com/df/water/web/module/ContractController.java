package com.df.water.web.module;

import com.df.water.facade.service.ContractService;
import com.df.water.web.common.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 合同相关内容, 控制层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/water/contract")
public class ContractController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(ContractController.class);

    @Autowired
    private ContractService contractServiceImpl;
}
