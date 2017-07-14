package com.df.water.service.impl;

import com.df.water.facade.service.ComplaintService;
import com.df.water.service.dao.ComplaintDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 投诉, 业务逻辑层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Service(value = "complaintServiceImpl")
public class ComplaintServiceImpl implements ComplaintService {

    private static final Logger logger = LoggerFactory.getLogger(ComplaintServiceImpl.class);

    @Autowired
    private ComplaintDao complaintDao;
}
