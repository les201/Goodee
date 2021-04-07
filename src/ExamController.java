/* 엘리베이터 (4인승, 3개층)
 * 목표층 입력, 자동으로 내림
 * 엘리베이터는 무조건 올라갔다 내려갔다
 * 기능: (1.탑승 2.상세보기 3.이동 9.종료);
 * */

public class ExamController {

	public static void main(String[] args) {
		ExamService ss = new ExamService();
		
		System.out.println("---- Welcome Elevator ----");
		
		ss.run();
	}

}
