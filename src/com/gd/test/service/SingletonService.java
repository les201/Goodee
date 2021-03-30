package com.gd.test.service;

public class SingletonService {
	// 정적변수 선언
	private static SingletonService instance = null;
	
	//객체취득 메소드
	public static SingletonService getInstance() {
		if(instance == null) {
			//객체 생성
			instance = new SingletonService();
		}
		
		return instance;
	}
	
	public int a = 10;
}

