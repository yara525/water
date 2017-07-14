package com.df.water.vo.user;

import com.llq.commons.utils.verify.annotations.NotNull;

/**
 *
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
public class UpdateUserVO {

    @NotNull
    private Long id;

    private String name;

    private String nickname;

    private String sex;
}
