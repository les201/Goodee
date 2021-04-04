package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("1.시작\t2.종료");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				int cnt = 0;
				// 로또 개수 입력
				while (true) {
					System.out.println("로또 개수를 입력하세요.(숫자만 입력하세요.)");
					try {
						cnt = Integer.parseInt(sc.nextLine());
						break;
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				int[] lotto = new int[6];
				for(int i = 0 ; i < cnt ; i++) {
					for(int k = 0 ; k < 6 ; k++) {
						lotto[k] = (int)Math.floor(Math.random() * 45) + 1;
						
						for(int j = 0 ; j < k ; j++) {
							if(lotto[k] == lotto[j]) {
								k--;
								break; 
							}
						}
					}
					Arrays.sort(lotto);
					System.out.println(Arrays.toString(lotto));
				}
				break;
			case "2":
				flag = false;
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}

		}
	}

}
