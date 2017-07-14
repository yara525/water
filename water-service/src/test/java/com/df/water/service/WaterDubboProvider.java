package com.df.water.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 开发环境, 使用spring容器加载dubbo
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */

public class WaterDubboProvider {

	private static final Logger logger = LoggerFactory.getLogger(WaterDubboProvider.class);

	/**
	 * 自定义main方法启动spring容器, 再通过spring容器加载dubbo容器
	 * (与部署不同, 线上环境使用dubbo自带的Main容器加载)
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// 查找当前classpath及jar包中的classpath, 扫入xml形式spring bean并在容器中注册
			ClassPathXmlApplicationContext applicationContext
					= new ClassPathXmlApplicationContext(
							"classpath*:config/spring/spring-beans.xml");

			// launch spring container
			applicationContext.start();
		} catch (Exception e) {
			logger.error("fail to launch spring ioc container, e = {}", e.getMessage());
		}

		// 类锁, 静态方法同步
		synchronized (WaterDubboProvider.class) {
			while (true) {
				try {
					WaterDubboProvider.class.wait();
				} catch (InterruptedException e) {
					logger.error("fail to synchronize static method, e = {}", e.getMessage());
				}
			}
		}


	}

}
