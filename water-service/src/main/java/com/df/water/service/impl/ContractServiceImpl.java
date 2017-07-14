package com.df.water.service.impl;

import com.df.water.facade.service.ContractService;
import com.df.water.service.dao.ContractDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 合同, 业务逻辑层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Service(value = "contractServiceImpl")
public class ContractServiceImpl implements ContractService {

    private static final Logger logger = LoggerFactory.getLogger(ContractServiceImpl.class);

    @Autowired
    private ContractDao contractDao;

}
