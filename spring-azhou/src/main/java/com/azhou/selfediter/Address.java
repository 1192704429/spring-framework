package com.azhou.selfediter;

/**
 * @description: 地址
 * @author: azhou
 * @create: 2022-01-26 09:33
 **/
public class Address {

	private String province;

	private String city;

	private String area;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", area='" + area + '\'' +
				'}';
	}
}
