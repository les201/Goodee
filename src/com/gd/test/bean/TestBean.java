package com.gd.test.bean;

public class TestBean {
	private int no;
	private String name;
	private int age;
	
	public int getNo() { //getter는 가져올 때
		return no;
	}
	public void setNo(int no) {// setter는 값을 넣을 때
		this.no = no;		   // 전역변수 no에  지역변수 no를 넣는다
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
