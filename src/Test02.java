
public class Test02 {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		a += 1;
		System.out.println(a);
		a -= 1;
		System.out.println(a);
		a *= 1;
		System.out.println(a);
		a /= 1;
		System.out.println(a);
		a %= 1;
		System.out.println(a);
		
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(a--);
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		String c = "A";
		
		System.out.println(a + b + c);
		System.out.println(c + (b + a));
		
	}

}
