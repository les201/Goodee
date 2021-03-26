package com.gd.test.controller;

import com.gd.test.bean.TestBean;
import com.gd.test.service.TestService1;

public class TestController1 {

	public static void main(String[] args) {
		TestService1 ts1 = new TestService1();
		
		//System.out.println(ts1.a);
		//System.out.println(ts1.b);
		
		TestBean tb = new TestBean();
		
		tb.setNo(1);
		tb.setName("홍길동");
		tb.setAge(300);
		
		System.out.println(tb.getNo() + " " + tb.getName() + " " + tb.getAge());
		
		float f = 3.141529f;
		
		System.out.println(Math.ceil(f)); //ceil(값) : 올림-여전히 실수
		System.out.println(Math.round(f)); //round(값) : 반올림-정수처리
		System.out.println(Math.floor(f)); //floor(값) : 내림-여전히 실수
		
		int a = -23;
		
		System.out.println(Math.abs(a)); //abs(값) : 절대값
		
		System.out.println(Math.pow(2,10)); //pow(숫자1, 숫자2) : 숫자1의 숫자2승
		System.out.println(Math.sqrt(4)); //sqrt(숫자) : 숫자의 루트
		
		System.out.println(Math.random()); //random() : 0.0 이상 1.0 미만의 난수 생성
		// 15 ~ 25 : 큰 수 - 작은 수 + 1 => 11
		System.out.println(Math.floor(Math.random()*11)+15);
	}

}
