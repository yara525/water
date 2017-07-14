package com.df.water.service.impl;

import com.df.water.facade.domain.About;
import com.df.water.facade.service.AboutService;
import com.df.water.service.dao.AboutDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 关于节能, 业务逻辑层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Service(value = "aboutServiceImpl")
public class AboutServiceImpl implements AboutService {

    private static final Logger logger = LoggerFactory.getLogger(AboutServiceImpl.class);

}
