
public class Test08 {
	
	public static void main (String[] args) {
//		for(int i = 2 ; i<10 ; i++) {
//			for(int j = 1 ; j<10 ; j++) {
//				System.out.println(i + "*" + j + "=" + (i*j));
//			}
//		}
		
		int a;	
		for(int i = 2 ; i < 101 ; i++) {
			a=0;
			for(int j = 1 ; j <= i ; j++) {
				if(i % j == 0) {
					a++;	
				}			
			}
			if(a==2) {
				System.out.println(i);
			}
		
		}
		

		
	}

}
