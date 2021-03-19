
public class Test09 {

	public static void main(String[] args) {
		Test09s ts = new Test09s();
		Test09s ts2 = new Test09s();

		ts.a = 7;
		   
		System.out.println(ts.a);
		System.out.println(ts2.a);
		
		ts2 = ts; 
		System.out.println(ts.a);
		System.out.println(ts2.a);
		
		ts.a();
		System.out.println(ts.b("보낸 값"));
		ts.plus(3, 7);
		ts.minus(7, 4);
		ts.product(4, 5);
		ts.divide(8, 2);
		ts.gugu(128);
	}

}
