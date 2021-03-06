package com.df.water.service.impl;

import com.df.water.facade.service.AirConditionerService;
import com.df.water.service.dao.AirConditionerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by daniel lee on 17-7-13.
 */
@Service(value = "airConditionerServiceImpl")
public class AirConditionerServiceImpl implements AirConditionerService {

    private static final Logger logger = LoggerFactory.getLogger(AirConditionerServiceImpl.class);

    @Autowired
    private AirConditionerDao airConditionerDao;
}
