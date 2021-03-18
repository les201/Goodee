
public class Test05 {
	
	public static void main(String[] args) {
		int a = 3;
		
		switch(a) {
		case 1 : System.out.println("1이다.");
				break;
		case 3 : System.out.println("3이다.");
		        break;
		case 5 : System.out.println("5이다.");
				break;
		default : System.out.println("기본이다.");
		}
		
		int score = 77;
		//성적 출력
		//a : 90~ 100, b : 80~89, c : 70~79,d : 60~69, f :  나머지 
		switch(score/10) {
		case 10 : case 9 :
			System.out.println("a");
			break;
		case 8 :
			System.out.println("b");
        	break;
		case 7 : 
			System.out.println("c");
			break;
		case 6 : 
			System.out.println("d");
			break;
		default : System.out.println("f");
		}
		
		if(score <= 100 && score >= 90) {
			System.out.println("A이다.");
		} else if (score < 90 && score >= 80) {
			System.out.println("B이다.");
		} else if (score < 80 && score >= 70) {
			System.out.println("C이다.");
		} else if (score < 70 && score >= 60) {
			System.out.println("D이다.");
		} else {
			System.out.println("F이다.");
		} 
	}

}
