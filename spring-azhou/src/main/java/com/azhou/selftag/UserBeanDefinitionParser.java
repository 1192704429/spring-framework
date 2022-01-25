package com.azhou.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @description: user解析器
 * @author: azhou
 * @create: 2022-01-25 14:58
 **/
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String userName = element.getAttribute("userName");
		String passWord = element.getAttribute("passWord");
		String nickName = element.getAttribute("nickName");
		if (StringUtils.hasText(userName)) {
			builder.addPropertyValue("userName", userName);
		}
		if (StringUtils.hasText(passWord)) {
			builder.addPropertyValue("passWord", passWord);
		}
		if (StringUtils.hasText(nickName)) {
			builder.addPropertyValue("nickName", nickName);
		}
	}
}
