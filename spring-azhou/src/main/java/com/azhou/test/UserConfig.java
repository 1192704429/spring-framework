package com.azhou.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 配置类
 * @author: azhou
 * @create: 2022-01-11 09:59
 **/
@Configuration
@ComponentScan
public class UserConfig {

	@Bean
	public User user() {
		return new User("azhou", 18);
	}

}
