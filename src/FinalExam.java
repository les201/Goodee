
import java.util.Scanner;

public class FinalExam {

	public static void main(String[] args) {

		int[] car = { -1, -1, -1, -1 };
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int now = 0;

		boolean flag = true;
		while (flag) {
			System.out.println("=================================");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.승하차\t2.속도조절\t3.상태\t4.종료");
			System.out.println("=================================");

			switch (sc.nextLine()) {

			case "1":
				boolean iFlag = true;
				while (iFlag) {
					System.out.println("1.승차\t2.하차\t3.메뉴");
					switch (sc.nextLine()) {
					case "1": // 승차
						if (cnt != 4 && now == 0) {
							System.out.println("승차할 좌석을 선택하세요");
							System.out.println("현재 빈 좌석: ");
							for (int i = 0; i < car.length; i++) {
								if (car[i] == -1) {
									System.out.print((i + 1) + "번 좌석  ");
								}
							}
							System.out.println();
							String input = sc.nextLine();
							int t = Integer.parseInt(input) - 1;
							if (car[t] == -1) {
								car[t] = 1;
								cnt++;
								iFlag = false;
							} else {
								System.out.println("빈 좌석을 선택하세요");
							}
						} else if (now != 0) {
							System.out.println("주행 중에는 탑승할 수 없습니다.");
							iFlag = false;
						} else {
							System.out.println("빈 좌석이 없습니다.");
							iFlag = false;
						}
						break;
					case "2":// 하차
						if (cnt != 0 && now == 0) {
							System.out.println("하차할 좌석을 선택하세요");
							System.out.println("현재 탑승좌석: ");
							for (int i = 0; i < car.length; i++) {
								if (car[i] != -1) {
									System.out.print((i + 1) + "번 좌석 ");
								}
							}
							System.out.println();
							String input = sc.nextLine();
							int t = Integer.parseInt(input) - 1;
							if (car[t] != -1) {
								car[t] = -1;
								cnt--;
								iFlag = false;
							} else {
								System.out.println("빈 좌석을 선택하세요");
							}
						} else if (now != 0) {
							System.out.println("주행 중에는 하차할 수 없습니다.");
							iFlag = false;
						} else {
							System.out.println("탑승자가 없습니다.");
							iFlag = false;
						}
						break;
					case "3":
						iFlag = false;
						break;
					default:
						System.out.println("잘못 입력하였습니다.");
						break;
					}
				}
				break;
			case "2":
				boolean sFlag = true;
				while (sFlag) {
					System.out.println("1.엑셀\t2.브레이크\t3.메뉴");
					switch (sc.nextLine()) {
					case "1":
						if (car[0] == 1) {
							if (now != 150) {
								now += 10;
								System.out.println("현재 속도: " + now);
							} else {
								System.out.println("현재 속도가 150입니다.");
							}
						} else {
							System.out.println("(1번 좌석) 운전자가 탑승해야합니다");
						}
						break;
					case "2":
						if (car[0] == 1) {
							if (now != 0) {
								now -= 10;
								System.out.println("현재 속도: " + now);
							} else {
								System.out.println("현재 속도가 0입니다.");
							}
						} else {
							System.out.println("(1번 좌석) 운전자가 탑승해야합니다");
						}
						break;
					case "3":
						sFlag = false;
						break;
					default:
						break;
					}
				}
				break;
			case "3":
				System.out.print("현재 탑승 좌석: ");
				for (int i = 0; i < car.length; i++) {
					if (car[i] != -1) {
						System.out.print((i + 1) + "번 좌석 ");
					}
				}
				if (cnt == 0) {
					System.out.println("전 좌석이 비어있습니다.");
				}
				System.out.println();
				System.out.println("현재 속도 : " + now);
				break;
			case "4":
				flag = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}
	}
}
