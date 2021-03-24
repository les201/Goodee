
public class P15 {
	public static void main(String[] args) {
		int[] arr = {28, 19, 87, 66 ,45, 6, 79, 30, 96, 33};
		int a;
		int b=0; //위치 값
		int min=57;

		
		for(int i = 0 ;i < arr.length ; i++ ) {
			a = arr[i]-57;	
			if(a<0) {
				a=-a;
			}
			if(min>a) {
				min=a;	
				b=i;
			}
		}
		System.out.println(arr[b]);
		
//문2) 1~100, 4의배수 개수, 값 출력
		
		int sum=0;	
		int count=0;
		
		for(int i = 1 ; i <=100 ; i++) {
			if(i%4==0) {
			sum+=i;
			count++;
			}
		}
		System.out.println("개수 : "+count+"  합 : "+ sum);

	}
}

