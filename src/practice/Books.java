package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Books {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		List<HashMap<String, String>> books = new ArrayList<HashMap<String, String>>();
		while (flag) {
			System.out.println("1.추가\t2.정렬\t3.조회\t9.종료");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				while (true) {
					try {
						HashMap<String, String> book = new HashMap<String, String>();
						System.out.println("책번호를 입력하세요.");
						book.put("no", sc.nextLine());
						Integer.parseInt(book.get("no"));
						System.out.println("책제목를 입력하세요.");
						book.put("title", sc.nextLine());
						System.out.println("작성자를 입력하세요.");
						book.put("author", sc.nextLine());
						System.out.println("발행일을 입력하세요.");
						book.put("dt", sc.nextLine());
						System.out.println("출판사를 입력하세요.");
						book.put("co", sc.nextLine());

						books.add(book);
						break;
					} catch (Exception e) {
						System.out.println("잘못 입력하셨습니다.");
						e.printStackTrace();
					}
				}
				break;
			case "2":
				boolean sFlag = true;
				while (sFlag) {
					HashMap<String, String> temp;
					System.out.println("1.오름차순\t2.내림차순");
					switch (sc.nextLine()) {
					case "1":
						for (int i = 0; i < books.size() - 1; i++) {
							for (int j = i + 1; j < books.size(); j++) {
								if (Integer.parseInt(books.get(i).get("no")) 
										> Integer.parseInt(books.get(j).get("no"))) {
									temp = books.get(i);
									books.set(i, books.get(j));
									books.set(j, temp);
								}
							}
						}
						sFlag = false;
						break;
					case "2":
						for (int i = 0; i < books.size() - 1; i++) {
							for (int j = i + 1; j < books.size(); j++) {
								if (Integer.parseInt(books.get(i).get("no")) 
										< Integer.parseInt(books.get(j).get("no"))) {
									temp = books.get(i);
									books.set(i, books.get(j));
									books.set(j, temp);
								}
							}
						}
						sFlag = false;
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
					}
				}
				break;
			case "3":
				System.out.println("책번호\t책제목\t저자\t발행일\t출판사 ");
				for (HashMap<String, String> book : books) {
					System.out.println(book.get("no") + "\t" + book.get("title") + "\t" + book.get("author") + "\t"
							+ book.get("dt") + "\t" + book.get("co") + "\t");
				}
				break;
			case "9":
				flag = false;
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
			}
		}
	}

}
