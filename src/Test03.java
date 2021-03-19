
public class Test03 {

	public static void main(String[] args) {
		int a = 3;
		
		if(a > 5) {
			System.out.println("a는 5보다 크다");
		} else {
			System.out.println("a는 5보다 작거나 같다");
		}
		
		int score = 77;
		
		// 성적을 출력, a: 90~100, b: 80~89, c: 70~79, d: 60~69, f: 나머지
		System.out.print("성적:");
			if(score < 60) {
				System.out.println("f");
			} else if(score < 70) {
				System.out.println("d");
			} else if(score < 80) {
				System.out.println("c");
			} else if(score < 90) {
				System.out.println("b");
			} else {
				System.out.println("a");
			}
	}

}
