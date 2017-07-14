package com.df.water.service.impl;

import com.df.water.facade.service.CardService;
import com.df.water.service.dao.CardDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IC卡相关, 包括绑卡、挂失卡、解绑、重新绑卡, 业务逻辑层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Service(value = "cardServiceImpl")
public class CardServiceImpl implements CardService {

    private static final Logger logger = LoggerFactory.getLogger(CardServiceImpl.class);

    @Autowired
    private CardDao cardDao;
}
