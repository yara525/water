package com.df.water.web.module;

import com.df.water.facade.domain.About;
import com.df.water.facade.service.AboutService;
import com.df.water.web.common.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 关于节能, 控制层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/water/about")
public class AboutController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(AboutController.class);

    @Autowired
    private AboutService aboutServiceImpl;
    
}
