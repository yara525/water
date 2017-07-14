package com.df.water.service.impl;

import com.df.water.facade.service.CollegeService;
import com.df.water.service.dao.CollegeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 学校信息, 业务逻辑层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Service(value = "collegeServiceImpl")
public class CollegeServiceImpl implements CollegeService {

    private static final Logger logger = LoggerFactory.getLogger(CollegeServiceImpl.class);

    @Autowired
    private CollegeDao collegeDao;
}
