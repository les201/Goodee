//전역변수,지역변수 구분 (색깔) 
//18~ :형변환
public class Test11s {
	int a = 10;
	
	public void a(int b) {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(a);
		}
		for(int i = 0 ; i <10 ; i++) {
			
		}
		int a = 7;
		System.out.println(a);
		System.out.println(this.a); //this : 이 클래스, 구별 가능!
		
		System.out.println((float)a);
		float c = 3.5f;
		System.out.println((int)c);
		
		String s = Integer.toString(a);
		System.out.println(s);
		
		System.out.println(Integer.parseInt("123")*4);
		
		//System.out.println(Integer.parseInt("ABC")*4);
		//에러는 안나는데 실행했을 때 터짐..
		
		System.out.println((char)('a' - 32));
	}

}


