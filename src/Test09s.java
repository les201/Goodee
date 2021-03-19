
public class Test09s {
	int a = 10;
	
	public Test09s() {
		System.out.println("기본 생성자 실행중.");
	}
	
	public Test09s(String str) {
		System.out.println("추가 생성자:" + str);
	}
	
	public void a() {
		System.out.println("a 메소드 실행");
	}
	public String b(String str) {
		return "변경된 내용 : " + str;
	}
	
	
	
	public void plus(int a, int b) {
		System.out.println(" a + b = " + (a+b));
	}
	
	public void minus(int a, int b) {	
		System.out.println(" a - b = " + (a-b));
	}
	
	public void product(int a, int b) {
		System.out.println(" a * b = " + (a*b));
	} 
	public void divide(int a, int b) {
		System.out.println(" a / b = " + (a/b));
	}
	
	
	public void gugu(int dan) {
		for(int i =1 ; i < 10 ; i++) {
			System.out.println(dan + " * " + i + " = "+ dan * i);
		}
	}
}
