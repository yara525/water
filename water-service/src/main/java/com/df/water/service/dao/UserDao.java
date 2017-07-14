package com.df.water.service.dao;


import com.df.water.facade.domain.User;

/**
 * 用户基本信息, 数据访问层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public interface UserDao {

    Integer signIn(User user);

    Integer deleteById(Long id);
}
