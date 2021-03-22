
public class P12 {

	public static void main(String[] args) {

//오름차순으로 정렬하시오
//1. if만으로  2. for문 활용		
		int[] num = {5, 7, 3};
		int a;
//1.if*3
//		if(num[0] > num[1]) {
//			a= num[0];
//			num[0] = num[1];
//			num[1] = a;
//		}
//		if(num[0] > num[2]) {
//			a= num[0];
//			num[0] = num[2];
//			num[2] = a;
//		}
//		if(num[1] > num[2]) {
//			a= num[1];
//			num[1] = num[2];
//			num[2] = a;
//		}
//2.for*2 + if*1
		for(int i = 0 ; i < num.length ; i++ ) {
			for(int j = i ; j < num.length ; j++) {
				if(num[i] > num[j]) {
					a= num[i];
					num[i] = num[j];
					num[j] = a;
				} 
			}
		}
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println(num[i]);
		}
		
	}

}
