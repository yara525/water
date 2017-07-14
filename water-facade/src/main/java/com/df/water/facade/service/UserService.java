package com.df.water.facade.service;


import com.df.water.facade.domain.User;

/**
 * 用户基本信息, 对外暴露服务(接口)
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public interface UserService {

    Long signIn(User user);

    Long signUp(User user);

    Integer deleteByUserId(Long userId);

    String getPhoneByUserId(Long userId);
}
