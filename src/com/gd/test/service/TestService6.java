package com.gd.test.service;

public class TestService6 {
	public static String s = "static 변수임"; //static 영역에 있기 떄문에 객제생성없이 호출가능
	public static final String SF = "상수임";
	
	public void test() {
		SingletonService ss = SingletonService.getInstance();
		
		System.out.println(ss.a);
	}

}
