
import java.util.Scanner;

public class ExamService {
	int[] floor = {1,2,3};
	int now = 0; //층
	int[] elevator = {-1, -1, -1, -1};
	int pos = -1;
	int cnt = 0;
	Scanner sc = new Scanner(System.in);
	
	public void run() {
		boolean r = true;
		
		while (r) {
			System.out.println("=================================");
			System.out.println("현재  " + (now+1) + "층 입니다.");
			System.out.println("=================================");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.탑승 2.상세보기 3.이동 9.종료");
			
			switch(sc.nextLine()) {
			case "1" : join();
			break;
			case "2" : status();
			break;
			case "3" : move();
			break;
			case "9" : r = false;
					   System.out.println("운행을 종료합니다.");
					   break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void join() {
		System.out.println("--------- 탑승가능 현황 ---------");	
		System.out.println("탑승인원 : " + cnt + "명 입니다.");

			if(cnt < 4) {
				System.out.println("목적지를 선택해 주세요.");				
				for(int j = 0 ; j < floor.length ; j++) {
					if(now != j) {
						System.out.print((j + 1) + "." + floor[j] + "층\t");
					}
				}	
				
				System.out.println();
				String input = sc.nextLine();
				int s = Integer.parseInt(input) - 1;		
				if(s == now) {
					System.out.println("목적지로 현재층은 안됩니다.");
				} else {
					for(int j = 0 ; j < elevator.length ; j++) {
						if(elevator[j] == -1) {
							elevator[j] = s;
							cnt++;
							break;
						}
					}
				}			
			} else {
				System.out.println("만원");
			}			
	}
	
	public void status() {
		System.out.println("---- 탑승 현황 (손님:목적지)----");
		
		for(int i = 0 ; i < elevator.length ; i++) {
			if(elevator[i]== -1)
			{
				System.out.print((i + 1) + "번은 비었습니다.");
			}else {
				System.out.print((i + 1) + "번 손님 : " + (elevator[i] + 1) + "층");
			}
			System.out.println();
		}
	}

	public void move() {	
		if(now == floor.length - 1 || now == 0) {
			pos *= -1;
		}	
		now += pos;	
		for(int i = 0 ; i < elevator.length ; i++) {
				if(elevator[i] == now) {				
					elevator[i] = -1;
					cnt--;
				}			
		}
		System.out.println("탑승인원 : " + cnt + "명 입니다.");
	}

}
