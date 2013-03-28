package com.raistudies.domain;

import java.io.Serializable;


public class User implements Serializable{
	
	private static final long serialVersionUID = 3647233284813657927L;
	
	private String id;
	private String name = null;
	private String standard = null;
	private String age;
	private String sex = null;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", standard=" + standard + ", age=" + age
				+ ", sex=" + sex + "]";
	}
}
