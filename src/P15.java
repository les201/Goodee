
public class P15 {
	public static void main(String[] args) {
//문1: 다음 수 중 57에 가장 가까운 수를 구하시오
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
		System.out.println("57에 가장 가까운 수: "+ arr[b]);
		
//문2: 1~100, 4의배수 개수, 값 출력
		
		int sum=0;	
		int count=0;
		
		for(int i = 1 ; i <=100 ; i++) {
			if(i%4==0) {
			sum+=i;
			count++;
			}
		}
		System.out.println("개수 : "+count+"  합 : "+ sum);
		
//문3: 54321초가 몇시간 몇분 몇초인가?
		int h,m,s;
		int tt=54321;
		
		m = tt / 60;
		s = tt % m;
		h = m / 60;
		m = m - 60*h;

		
		System.out.println(h+"시간 "+m+ "분 "+s+"초");

	}
}

