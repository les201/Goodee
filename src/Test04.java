
public class Test04 {
	
	public static void main(String[] args) {

		int a = 5;
		int b = 7;
		int c = 3;
		// 작업: 오름차순 정렬
		int d;
		if(a>b) {
			d=a;
			a=b;
			b=d;
		} 
		if(a>c) {
			d=a;
			a=c;
			c=d;
		}
		if(b>c) {
			d=b;
			b=c;
			c=d;
		}
		System.out.println(a); //3
		System.out.println(b); //5 
		System.out.println(c); //7
	}
}