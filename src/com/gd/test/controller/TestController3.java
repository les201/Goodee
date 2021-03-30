package com.gd.test.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestController3 { //날짜처리
	
	public static void main(String[] args) {
		//Calendar는 시스템에서 객체를 취득한다
		Calendar c = Calendar.getInstance();
		//29-MAR-2021 이런식으로 보여줌
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1); // 배열에 문자열이 들어있는 형태라 인덱스번호가 출력, 인덱스번호는 0번부터 시작
		System.out.println(c.get(Calendar.DATE)); // 숫자를 그대로 보여주기 때문에
		System.out.println(c.get(Calendar.AM_PM)); //0 - AM, 1 - PM
		System.out.println(c.get(Calendar.HOUR)); //12시간 기준
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 24시간 기준
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 요일: 1-일요일 // 인덱스기반이 아니다. OF_WEEK은 일주일의 몇번째냐?
																		//요일을 가져오겠다: 0부터, 주에 몇번째 날인지의 경우는 1부터!
		//y 연
		//M 월
		//d 일
		//a am/pm
		//H 24시간기준 시
		//h 12시간기준 시
		//m 분
		//s 초

		String p = "yyyy-MM-dd HH:mm:ss";
		
		SimpleDateFormat sdf = new SimpleDateFormat(p);
		//현재날짜를 가져와서 해당 포맷으로 변환하여 문자열로 돌려줌
		String d = sdf.format(new Date());
		
		System.out.println(d);
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(s);
		
		int a = sc.nextInt();
		System.out.println(a);
		sc.nextLine();
		s = sc.nextLine();
		System.out.println(s);
	}


}
