package Travel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TravelMain {
	private static TravelManager tmr = new TravelManager();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("  ┌──────────────────────────────┐");
			System.out.println("  │ ----- 여행자 관리 프로그램  -----  │");
			System.out.println("  └──────────────────────────────┘");
			System.out.println("    원하시는 서비스의 번호를 입력 해주세요. \n");

			System.out.println("[1] 전체 보기 [2] 등급별 보기 [3] 페이지별 보기");
			System.out.println("[4] 예약 추가 [5] 예약 수정 [6] 예약 취소");
			System.out.println("[7] 예약자 검색 [8] 프로그램 종료");

			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				viewAll();
				break;
			case 2:
				viewGrade();
				break;
			case 3:
				viewPage();
				break;
			case 4:
				 booking();
				break;
			case 5:
				update();
				break;
			case 6:
				cancel();
				break;
			case 7:
				viewOne();
				break;
			case 8:
				System.out.println(" * 프로그램을 종료 합니다.");
				System.exit(8);
			}

		}

	}

	private static void viewOne() {
		// 이름을 입력하면 해당 이름의 정보를 출력

		Scanner scan = new Scanner(System.in);

		System.out.println(" * 성함을 입력 해주세요.");

		System.out.print("이름 :");
		String name = scan.next();

		Travel trl = tmr.viewOne(name);

		if (trl == null) {
			System.out.println("존재하지 않는 이름 입니다.");
		} else {
			display(trl);
		}

	}

	private static void cancel() {
		// 예약 1건을 취소

		Scanner scan = new Scanner(System.in);

		System.out.println(" * 성함을 입력 해주세요.");

		System.out.print("이름 : ");
		String name = scan.next();

		if (tmr.compareTime(name)) {
			int check = tmr.cancel(name);

			if (check == 1) {
				System.out.println(" * 취소가 완료 되었습니다.");
			}
			
		} else {
			System.out.println(" * 예약 취소가 불가 합니다. (최초 예약 30일 경과)");
		}
	}


	private static void update() {
		// 예약 1건을 수정

		Scanner scan = new Scanner(System.in);

		System.out.println(" * 수정은 여행지만 가능하며, 취소는 취소 메뉴에서 진행 해주세요.");
		System.out.println(" * 기존 입금된 경비는 환불처리 되며, 재입금이 필요합니다. \n");

		System.out.print("이름 :");
		String name = scan.next();

		System.out.print("여행지 :");
		String tplace = scan.next();
		System.out.println();

		Travel trl = new Travel();
		trl.setName(name);
		trl.setTplace(tplace);

		int check = tmr.update(trl);

		if (check == 1) {
			System.out.println(" * 수정이 완료 되었습니다.");
		} else {
			System.out.println(" * 수정에 실패 했습니다.");
		}
	}

	private static void booking() {
		// 예약 1건을 추가

		Scanner scan = new Scanner(System.in);

		System.out.println(" * 예약 추가를 위한 양식을 입력 하세요. \n");

		System.out.print("이름 :");
		String name = scan.next();

		System.out.print("성별 :");
		String gender = scan.next();

		System.out.print("나이 :");
		int age = scan.nextInt();

		System.out.print("여행지 :");
		String tplace = scan.next();
		System.out.println();

		Travel trl = new Travel();
		trl.setName(name);
		trl.setGender(gender);
		trl.setAge(age);
		trl.setTplace(tplace);
		trl.setPrice(500);
		trl.setGrade("일반");
		trl.setBstate("예약 대기");

		Date date = new Date();
		String format = "yyyy/MM/dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String nowDate = sdf.format(date);

		trl.setBdate(nowDate);

		int check = tmr.booking(trl);

		if (check == 1) {
			System.out.println(" * 예약이 완료 되었습니다.");
		} else {
			System.out.println(" * 예약에 실패 했습니다.");
		}
	}

	private static void viewPage() {
		// 페이징 처리

		Scanner scan = new Scanner(System.in);

		System.out.print(" * 페이지 번호를 입력 해주세요.");
		int pageNumber = scan.nextInt();

		System.out.print(" * 확인할 데이터의 개수를 입력 해주세요.");
		int pageSize = scan.nextInt();

		int beginRow = (pageNumber - 1) * pageSize + 1;
		int endRow = pageNumber * pageSize;

		List<Travel> lists = tmr.viewPage(beginRow, endRow);

		display(lists);
	}

	private static void viewGrade() {
		// 등급별 보기

		Scanner scan = new Scanner(System.in);

		System.out.println(" * 검색을 원하시는 등급의 번호를 입력 해주세요.");
		System.out.println("[1] VIP, [2] 우수, [3] 일반");
		int num = scan.nextInt();

		List<Travel> lists = tmr.viewGrade(num);

		display(lists);
	}

	private static void viewAll() {
		// 리스트 전체 보기

		List<Travel> lists = tmr.viewAll();

		display(lists);
	}

	private static void display(List<Travel> lists) {
		// 출력을 위한 메소드
		
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");

		for (Travel trl : lists) {
			String name = trl.getName();
			String gender = trl.getGender();
			int age = trl.getAge();
			String tplace = trl.getTplace();
			double price = trl.getPrice();
			String grade = trl.getGrade();
			String bstate = trl.getBstate();
			String bdate = trl.getBdate();

			String temp = "";
			temp += name + "\t";
			temp += gender + "\t";
			temp += age + "\t";
			temp += tplace + "\t";
			temp += price + "\t";
			temp += grade + "\t";
			temp += bstate + "\t";
			temp += bdate;

			System.out.println(temp);
		}
		
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	}

	private static void display(Travel trl) {
		// 예약 1건에 대한 정보 출력

		String temp = "";
		temp += trl.getName() + "\t";
		temp += trl.getGender() + "\t";
		temp += trl.getAge() + "\t";
		temp += trl.getTplace() + "\t";
		temp += trl.getPrice() + "\t";
		temp += trl.getGrade() + "\t";
		temp += trl.getBstate() + "\t";
		temp += trl.getBdate();
		
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println(temp);
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	}

}
