package com.azhou.selftag;

/**
 * @description: user
 * @author: azhou
 * @create: 2022-01-25 14:57
 **/
public class User {

	private String id;

	private String userName;

	private String passWord;

	private String nickName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", passWord='" + passWord + '\'' +
				", nickName='" + nickName + '\'' +
				'}';
	}
}
