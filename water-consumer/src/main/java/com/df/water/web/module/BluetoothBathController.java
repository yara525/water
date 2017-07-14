package com.df.water.web.module;

import com.df.water.web.common.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 蓝牙洗浴, 控制层
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/water/bluetoothBath")
public class BluetoothBathController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BluetoothBathController.class);
}
