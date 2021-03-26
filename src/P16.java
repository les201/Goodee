
public class P16 {

	public static void main(String[] args) {
//문1: 주사위 6, 12, 20면체를 굴린 값의 합을 구하시오
//		int a = (int)Math.floor(Math.random()*6)+1;
//		int b = (int)Math.floor(Math.random()*12)+1;
//		int c = (int)Math.floor(Math.random()*20)+1;
//		
//		System.out.println("주사위의 합: "+(a+b+c));	
//		
//문2: 로또번호(1 ~ 45) 5번 생성. 회차 내 중복없이 6개의 숫자
//		int[] lotto = new int[6];	
//		
//		for(int k = 0 ;k < 5 ;k++) {
//		for(int i = 0 ; i < 6 ;i++) {
//			lotto[i] = (int) Math.floor(Math.random()* 45) + 1;
//
//			for(int j =0 ; j < i ; j++) { //비교
//				if(lotto[i] == lotto[j]) {
//				   i--;
//				   break;
//				} 
//						
//			}
//		}
//		for(int i = 0 ; i < lotto.length ;i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.println();
//	}		
//문2-2) 문자열 풀이		
// 값의 가공은 힘들다
		String s =",";
		
		for(int i =0 ; i < 6 ; i++) { //비교
			int temp = (int) Math.floor(Math.random()* 45) + 1;
			
			if(s.indexOf("," + temp + ",") != -1) {
				i--;
			} else {
				s += temp + ",";
			}					
		}
		System.out.println(s.substring(1,s.length() - 1));
	}		
}
