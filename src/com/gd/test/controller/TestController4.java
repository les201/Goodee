package com.gd.test.controller;

import java.util.Scanner;

public class TestController4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 선택하시오.");
			System.out.println("1.계속 \t9.종료");
			int input = sc.nextInt();
			sc.nextLine();
			
			if(input == 9) {
				break;
			}
		}
		System.out.println("종료되었습니다.");

	}

}
