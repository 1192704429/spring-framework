package com.azhou.selfediter;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;


/**
 * @description: 自定义
 * @author: azhou
 * @create: 2022-01-26 09:35
 **/
public class SelfEditorRegistrar implements PropertyEditorRegistrar {


	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class, new AddressEditor());
	}
}
