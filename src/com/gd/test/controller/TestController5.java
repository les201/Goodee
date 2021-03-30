package com.gd.test.controller;

import com.gd.test.service.TestService5;

public class TestController5 {

	public static void main(String[] args) {
		try {
			String s = "abc";
			//int a = Integer.parseInt(s);
			throw new NumberFormatException();
			//System.out.println("?????");// dead code: 위에서 예외처리를 발생시켰기 때문에 실행될 일 없음 
		}catch(NumberFormatException ne) {
			ne.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("끝난거 맞음.");
		
		TestService5 ts = new TestService5();
		
		try {
			ts.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
