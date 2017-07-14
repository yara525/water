package com.df.water.service.impl;


import com.df.water.facade.domain.User;
import com.df.water.facade.service.UserService;
import com.df.water.service.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户基本信息, 服务实现 (interface-oriented programming)
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@Service(value = "userServiceImpl")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;


    @Override
    public Long signIn(User user) {
        return null;
    }

    @Override
    public Long signUp(User user) {
        return null;
    }

    // 服务提供者不要加事务控制, 不拼接多个业务操作(提供单一服务), 业务拼接放到服务消费端

    @Override
    public Integer deleteByUserId(Long userId) {
        Integer rows = 0;

        try {
            String result = "userId = " + userId;
            System.out.println(result);
            return 5;
        } catch (Exception e) {
            logger.error("根据id删除用户信息失败, e = {}", e.getMessage());
        }

        return rows;
    }

    @Override
    public String getPhoneByUserId(Long userId) {
        return null;
    }
}
