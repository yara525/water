package com.df.water.service.impl;

import com.df.water.facade.service.WalletService;
import com.df.water.service.dao.WalletDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by daniel lee on 17-7-13.
 */
@Service(value = "walletServiceImpl")
public class WalletServiceImpl implements WalletService {

    private static final Logger logger = LoggerFactory.getLogger(WalletServiceImpl.class);

    @Autowired
    private WalletDao walletDao;
}
