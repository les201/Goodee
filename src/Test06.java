
public class Test06 {

	public static void main(String[] args) {
		int a = 1;		
		while(a < 10) {
			System.out.println(2 +" * "+ a + " = " + 2*a);		
			a++;
		}

		do {
			System.out.println(a);
		} while (a<10);

		for(int i = 1 ; i < 10 ; i++) {
			if(i % 2 == 1) {
				continue; // 다음 단계로 넘어간다: 프린트ㄴㄴ 증감으로 넘어간다
			}
			System.out.println(i);
		}
	}	
}
