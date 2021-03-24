
public class Test14C extends Test14P {
	String s = "자식의 반란";
	
	public String getPs() {
		//super : 부모 클래스, 상속받은 곳에서만 사용가능 (내 부로 클래스)
		return super.s;
		//super.s를 돌려주겠다..!
	}
	public void p() {
		System.out.println("자식이 덮어쓴 메소드");
	}
}
