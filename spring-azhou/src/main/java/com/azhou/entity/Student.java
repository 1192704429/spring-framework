package com.azhou.entity;

/**
 * @description: 学生
 * @author: azhou
 * @create: 2022-01-14 10:39
 **/
public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}

}
