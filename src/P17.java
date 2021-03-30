import java.util.*;

public class P17 {

	public static void main(String[] args) {
//하) a면체 주사위, b개 		
//		int a,b;
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		b = sc.nextInt();
//		
//		for(int i =1 ;i <= b;i++) {
//			System.out.println((int)Math.floor(Math.random()*a)+1);
//		}
//		
//하) 원하는 개수 입력, 로또번호 생성		
//		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int[] lt = new int[a];
//		for(int i = 0 ; i < lt.length ;i++) {
//			lt[i] = (int)Math.floor(Math.random()*45)+1;
//			for(int j =0 ; j < i ; j++) { //비교
//			if(lt[i] == lt[j]) {
//			   i--;
//			   break;
//			} 				
//		}
//		}
//		for(int i = 0 ; i < lt.length ;i++) {
//			System.out.print(lt[i] + " ");
//		}
//		System.out.println();
		
		List<HashMap<String, String>> board
		 = new ArrayList<HashMap<String, String>>();
		
		for(int i =10 ; i > 0 ; i--) {
			HashMap<String, String> data = new HashMap<String, String>();
			
			data.put("no", Integer.toString(i));
			data.put("title", "Test"+ (i));
			data.put("writer`", "Tester");
			
			board.add(data);
		}
		
		for(HashMap<String, String> data : board) {
			System.out.println(data.get("no")+ "\t" +data.get("title")+ "\t" + data.get("writer"));
		}
		
	}

}
