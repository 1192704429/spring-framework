package com.azhou.selfediter;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

/**
 * @description: 自定义编辑器
 * @author: azhou
 * @create: 2022-01-26 09:52
 **/
public class AddressEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setArea(s[2]);
		this.setValue(address);
	}

}
