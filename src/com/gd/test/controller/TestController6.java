package com.gd.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gd.test.service.SingletonService;
import com.gd.test.service.TestService6;

public class TestController6 {
	public int a = 10;

	public static void main(String[] args) {
		TestService6.s = "Hi~";

		System.out.println(TestService6.s);

		// TestService6.SF = "Hi~"; //final떄문에 값변화ㄴㄴ
		// System.out.println(a); 불가능, 객체를 생성해줘야 사용이 가능하다
		TestController6 tc = new TestController6(); // 근데 main함수 포함된 클래스의 객체생성은 자원낭비라 TestService 객체생성을 해주고 있는 것

		SingletonService ss = SingletonService.getInstance();

		System.out.println(ss.a);

		ss.a = 7;

		TestService6 ts = new TestService6();

		ts.test();

		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
	}

}
