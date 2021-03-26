package com.gd.test.controller;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class TestController2 {//list, map

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
//		
//		// add(값) : 리스트에 값을 추가한다.
//		list.add(1);
//		list.add(2);	
		//add(인덱스번호, 값): 해당 인덱스번호 위치에 값을 넣는다, 넣기 전 해당 인덱스 위치이후의 모든 것을 하나씩 뒤로 미룬다
//		list.add(0,4);
//		//get(인덱스 번호) : 리스트에서 해당 값을 가져온다
//		System.out.println(list.get(0));
//		//size() : 리스트의 크기를 돌려준다
//		System.out.println(list.size());
//		//set(인덱스번호, 값) : 인덱드번호에 해당하는 내용을 주어진 값으로 변경한다
//		list.set(0,7);
//		System.out.println(list.get(0));
//		//remove(인덱스번호) : 인덱스번호에 해당하는 것을 제거한다.
//		list.remove(0);
//		System.out.println(list.get(0));
//		//list.clear() : 리스트를 비운다
//		list.clear();
//		System.out.println(list.size());
//		list.add(3);
//		list.add(7);
//		//contains(값) : 값이 리스트에 존재하는지 여부를 돌려줌
//		System.out.println(list.contains(3));
//		//isEmpty() : 리스트가 비어있는지 여부를 돌려줌
//		System.out.println(list.isEmpty());
//		
		list.clear();
		list.add(5);
		list.add(7);
		list.add(3);
//문1: 오름차순		
//		for(int j = 1 ; j < list.size(); j++){
//			for(int i = 1 ; i < list.size() ; i++) {		
//				if((list.get(i-1))>list.get(i)) {
//					list.add(list.get(i-1));
//					list.remove(i-1);
//				}			
//			}
//		}
//		
//		for(int i = 0 ; i < list.size() ; i++) {
//			System.out.println(list.get(i));
//		}
//문1-2)		
//		for(int i = 0 ; i < list.size() - 1; i++){
//			for(int j = list.size()- 1; j > i ; j--) {	 //역순으로 하는 이유! 밀어넣었던 값은 제하는 위치 
//				if((list.get(i))>list.get(j)) {
//					list.add(list.get(i));
//					list.remove(i);
//				}			
//			}
//		}
//		
//		for(int i = 0 ; i < list.size() ; i++) {
//			System.out.println(list.get(i));
//		}
		
		list.sort(null);
		Object[] arr = list.toArray(); //object타입의 배열에 int타입의 list를 넣는다 /object: 나중에 형변환해서 써라, 뭘로도 변환할 수 있다
		System.out.println(Arrays.toString(arr));
		System.out.println(Integer.toString((int) arr[0]) + 10);
		
		HashMap<String, String> map = new HashMap <String, String>();
		
		//put(값1, 값2) : 값1을 키로 지정하고 해당 내용으로 값2를 지정한다. 
		map.put("가","abc");
		//get(값) : 값이 키와 동일한 것의 내용을 가져온다
		System.out.println(map.get("가"));
		System.out.println(map.get("나")); //현재 없는것
		//replace(값1,값2) : 값1이 키로 있는 해당 내용으로 값2를 지정한다// put을 쓴다 사장된 메소드...put과 달리 추가는 안됨!
		map.replace("가","ABC");
		System.out.println(map.get("가"));
		//put은 추가의 개념과 덮어씌운다는 의미도 있음 //추가, 수정
		map.put("가","abc");
		System.out.println(map.get("가"));
		//remove(값) : 값이 키인 것을 제거한다
		map.remove("가");
		System.out.println(map.get("가"));
		//isEmpty() : 맵이 비어있는지 여부를 돌려줌		
		System.out.println(map.isEmpty());
		//containsKey(값) : 값과 일치하는 키가 있는지 여부를 돌려줌
		//containsValue(값) : 값과 일치하는 내용이 있는지 여부를 돌려줌
		System.out.println(map.containsKey("가"));
		System.out.println(map.containsValue("abc"));
		//clear() : 맵에 있는 내용들을 제거
		map.clear();
		map.put("가","abc");
		map.put("나","123");
		map.put("다","가나다");
		
		//keySet() : 맵의 키들을 Set의 형태로 변환한다
		//Set : 값을 순차적으로 넣을 수 있다. 넣을 수만 있다.
		Set<String> keySet = map.keySet();
		//Iterator: 값을 순차적으로 꺼낼 수 있다. 꺼낼 수만 있다.무조건 순차적으로만 꺼낸다.
		//레코드판과 동일
		Iterator<String> keys = keySet.iterator();
		//hasNext() : 다음 값이 존재하는지 여부를 돌려줌
		while(keys.hasNext()) {
			//next() : 다음 값을 가져온다.
			System.out.println(map.get(keys.next()));
		}
	}

}
