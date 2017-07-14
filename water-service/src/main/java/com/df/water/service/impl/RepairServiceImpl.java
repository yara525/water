package com.df.water.service.impl;

import com.df.water.facade.service.RepairService;
import com.df.water.service.dao.RepairDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 报修, 业务逻辑层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Service(value = "repairServiceImpl")
public class RepairServiceImpl implements RepairService {

    private static final Logger logger = LoggerFactory.getLogger(RepairServiceImpl.class);

    @Autowired
    private RepairDao repairDao;
}
