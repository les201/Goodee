
public class Test13 {

	public static void main(String[] args) {
		String s = "Hello World!!";

		
		//한 줄 주석
		/*
		 * 멀티라인 주석 
		 */
		/**
		 * 정보주석
		 */
		
		//Hello World! -> 문자열은 0부터 시작
		//0123456789101112
		//substring(값1): 값1이상부터 자른다
		//substring(값1, 값2): 값1이상 값2 미만을 자른다
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 4));
		//orl 출력:
		System.out.println(s.substring(7,10));
		
		//length(): 글자 수
		System.out.println(s.length());
		
		//replace("값1", "값2"): 값1을 모두 찾아 값2로 변경한다.
		//replaceAll("값1", "값2"): 값1을 모두 찾아 값2로 변경한다.
		//replaceFirst("값1", "값2"): 값1의 첫번째를 찾아 값2로 변경한다.
		System.out.println(s.replace("l", "k"));
		System.out.println(s.replaceAll("l", "k"));
		System.out.println(s.replaceFirst("l", "k"));
		
		//indexOf(값): 해당 값의 위치를 앞에서부터 찾아준다
		//indexOf(값, 숫자): 해당 값의 위치를 숫자 이상위치부터 찾아준다
		//indexOf에서 찾고자 하는 앖이 없을 경우 -1. -1인 이유: 인덱스는 0부터기 때문에 -1은 존재할 수 없는 수\
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("l",5));
		System.out.println(s.indexOf("x"));
		//lastIndexOf(값): 해당 값의 위치를 뒤에서부터 찾아준다
		//lastIndexOf(값, 숫자): 해당 값의 위치를 숫자 이하위치부터 찾아준다
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.lastIndexOf("l",5));
		
		//charAt(값): 값에 해당하는 인덱스의 문자를 돌려준다
		System.out.println(s.charAt(1));
		
		//문자열 값 비교
		//equals(값): 문자열의 내용에서 값을 가져와 주어진 값과 비교하여 결과를 질의형으로 돌려줌
		System.out.println(s=="Hello World!!"); //사용금지! ==은 문자열에서 주소비교이기 때문
		System.out.println(s.contentEquals("Hello World!!"));
		
		//trim(): 앞 뒤 공백제거, 중간은 그대로
		System.out.println("    Hi~!    ".trim());
		
		//toLowerCase(): 모두 소문자로 변경
		System.out.println(s.toLowerCase());
		//toUpperCase(): 모두 대문자로 변경
		System.out.println(s.toUpperCase());
		
		s = "딸기,수박,참외";
		//split(값): 값을 기준점으로 문자열을 자르고 배열로 변환한다
		String [] arr =s.split(",");
		for(int i=0 ;i < arr.length ;i++) {
			System.out.println(arr[i]);
		}
	}

}
