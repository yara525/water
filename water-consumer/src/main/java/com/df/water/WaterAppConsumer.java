package com.df.water;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

/**
 * 消费端启动类
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 */

@SpringBootApplication
@ConfigurationProperties(locations = {"classpath:application.properties"})
@ImportResource(locations = {"classpath:dubbo-consumer.xml"})
public class WaterAppConsumer {

	public static void main(String[] args) {
		SpringApplication.run(WaterAppConsumer.class, args);
	}
}
