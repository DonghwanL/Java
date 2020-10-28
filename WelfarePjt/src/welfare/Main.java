package welfare;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Main {
	// mgr : 관리자 객체
	private static Manager mgr = new Manager();

	public static void main(String[] args) {
		// 메인 클래스

		String menufile = "c:\\imsi\\menu.txt";
		Properties prop = null;
		String menu_caption = null;

		try {
			prop = new Properties();
			prop.load(new FileReader(new File(menufile)));
			menu_caption = prop.toString();

		} catch (Exception e) {
			e.printStackTrace();
		}

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(menu_caption);
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				SelectAll01();
				break;
			case 2:
				SelectAll02();
				break;
			case 3:
				SelectAll03();
				break;
			case 4:
				Insert();
				break;
			case 5:
				SelectOne();
				break;
			case 6:
				Update();
				break;
			case 7:
				Delete();
				break;
			case 8:
				FileSave();
				break;
			case 9:
				AgegGrouping();
				break;
			case 10:
				Religion();
				break;	
			default:
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}

	private static void Religion() {
		// 종교 유무의 개수를 반환해 줍니다.
		
		Map<String, Integer> maps = mgr.Religion();
		
		Set<String> keyset = maps.keySet();
		
		for(String key : keyset) {
			Integer value = maps.get(key);
			
			String imsi = key + " : " + value;
			System.out.println(imsi);
		}
		
	}

	private static void AgegGrouping() {
		// 연령대별로 소득의 총합과 개수를 반환해 줍니다.

		Map<String, List<Object>> maps = mgr.AgegGrouping() ;
		
		Set<String> keyset = maps.keySet() ;
		for(String key : keyset) {
			List<Object> value = maps.get(key) ;
			String imsi = key + " : " + value.get(0) + "/" + value.get(1) ;
			System.out.println(imsi);
		}
	}

	private static void FileSave() {
		// 해당 컬렉션을 파일로 저장합니다.
		mgr.FileSave();
	}

	private static void Delete() {
		// 이름을 입력하면 해당 멤버 정보를 삭제합니다.
		Scanner scan = new Scanner(System.in);
				
		System.out.println("삭제할 사람을 입력 해주세요.");
		String name = scan.next();
		
		int cnt = -1;
		cnt = mgr.Delete(name);
		
		if (cnt == 1) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}

	private static void Update() {
		// 1건에 대해서 수정을 합니다.
		Scanner scan = new Scanner(System.in);
		
		// 편의상 이름과 성별만 입력 받습니다.
		System.out.println("수정할 이름 : ");
		String name = scan.next();
		
		System.out.println("성별 : ");
		String gender = scan.next();
		
		Welfare wel = new Welfare();
		wel.setName(name);
		wel.setGender(gender);
		wel.setAge(100);
		wel.setAgeg("청년");
		wel.setArea("경기");
		wel.setIncome(1000);
		wel.setJob("의사");
		wel.setMarriage("미혼");
		wel.setReligion("없음");
		
		int cnt = -1;
		cnt = mgr.Update(wel);
		
		if (cnt == 1) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
		
	}

	private static void SelectOne() {
		// 이름을 입력하면 해당 멤버 정보를 출력해 줍니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("찾을 사람을 입력 해주세요.");
		String name = scan.next();
		
		Welfare wel = mgr.SelectOne(name);
		
		if (wel == null) {
			System.out.println("존재하지 않는 사람 입니다.");
		} else {
			Display(wel);
		}
	}

	private static void Display(Welfare wel) {
		// 1행에 대한 정보를 출력 해줍니다. 
		String name = wel.getName();
		
		String imsi = "";
		imsi += "이름 : " + wel.getName() + "\n";
		imsi += "성별 : " + wel.getGender() + "\n";
		imsi += "나이 : " + wel.getAge() + "\n";
		imsi += "연령대 : " + wel.getAgeg() + "\n";
		imsi += "결혼 여부 : " + wel.getMarriage() + "\n";
		imsi += "종교 유무 : " + wel.getReligion() + "\n";
		imsi += "소득 : " + wel.getIncome() + "\n";
		imsi += "직업 : " + wel.getJob() + "\n";
		imsi += "생활권역 : " + wel.getArea() + "\n";
		
		System.out.println(imsi);
	}

	private static void Insert() {
		// 데이터 1건을 추가 합니다.
		Scanner scan = new Scanner(System.in);
		
		// 편의상 이름과 성별만 입력 받습니다.
		System.out.println("이름 : ");
		String name = scan.next();
		
		System.out.println("성별 : ");
		String gender = scan.next();
		
		Welfare wel = new Welfare();
		wel.setName(name);
		wel.setGender(gender);
		wel.setAge(10);
		wel.setAgeg("청년");
		wel.setArea("경기");
		wel.setIncome(100);
		wel.setJob("의사");
		wel.setMarriage("미혼");
		wel.setReligion("없음");
		
		int cnt = -1;
		cnt = mgr.Insert(wel);
		
		if (cnt == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	private static void SelectAll03() {
		// 페이징 처리를 하여 데이터를 추출 합니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 페이지를 보시겠습니까?");
		int pageNumber = scan.nextInt();
		
		System.out.print("페이지당 몇 개씩 보시겠습니까?");
		int pageSize = scan.nextInt();
		
		int beginRow = (pageNumber - 1) * pageSize + 1;
		int endRow = pageNumber * pageSize;
		
		List<Welfare> lists = mgr.SelectAll(beginRow, endRow);
		
		Display(lists);
	}

	private static void SelectAll02() {
		// 지정한 성별만 조회하여 보여 줍니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("검색 모드 : (1) 남자, (2) 여자");
		int su = scan.nextInt();

		List<Welfare> lists = mgr.SelectAll(su);

		Display(lists);
	}

	private static void Display(List<Welfare> lists) {
		for(Welfare wel : lists) {
			String name = wel.getName();
			String gender = wel.getGender();
			int age = wel.getAge();
			String ageg = wel.getAgeg();
			String marriage = wel.getMarriage();
			String religion = wel.getReligion();
			double income = wel.getIncome();
			String job = wel.getJob();
			String area = wel.getArea();
			
			String imsi = name + "\t";
			imsi += gender + "\t";
			imsi += age + "\t";
			imsi += ageg + "\t";
			imsi += marriage + "\t";
			imsi += religion + "\t";
			imsi += income + "\t";
			imsi += job + "\t";
			imsi += area + "\t";
			
			System.out.println(imsi);
		}
	}

	private static void SelectAll01() {
		// 전체 데이터를 읽어서 보여 줍니다.
		List<Welfare> lists = mgr.SelectAll();

		Display(lists);
	}

}
