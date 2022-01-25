package com.azhou.selftag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @description: user
 * @author: azhou
 * @create: 2022-01-25 15:02
 **/
public class UserNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
