package welfare;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Main {
	// mgr : ������ ��ü
	private static Manager mgr = new Manager();

	public static void main(String[] args) {
		// ���� Ŭ����

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
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}
	}

	private static void Religion() {
		// ���� ������ ������ ��ȯ�� �ݴϴ�.
		
		Map<String, Integer> maps = mgr.Religion();
		
		Set<String> keyset = maps.keySet();
		
		for(String key : keyset) {
			Integer value = maps.get(key);
			
			String imsi = key + " : " + value;
			System.out.println(imsi);
		}
		
	}

	private static void AgegGrouping() {
		// ���ɴ뺰�� �ҵ��� ���հ� ������ ��ȯ�� �ݴϴ�.

		Map<String, List<Object>> maps = mgr.AgegGrouping() ;
		
		Set<String> keyset = maps.keySet() ;
		for(String key : keyset) {
			List<Object> value = maps.get(key) ;
			String imsi = key + " : " + value.get(0) + "/" + value.get(1) ;
			System.out.println(imsi);
		}
	}

	private static void FileSave() {
		// �ش� �÷����� ���Ϸ� �����մϴ�.
		mgr.FileSave();
	}

	private static void Delete() {
		// �̸��� �Է��ϸ� �ش� ��� ������ �����մϴ�.
		Scanner scan = new Scanner(System.in);
				
		System.out.println("������ ����� �Է� ���ּ���.");
		String name = scan.next();
		
		int cnt = -1;
		cnt = mgr.Delete(name);
		
		if (cnt == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}

	private static void Update() {
		// 1�ǿ� ���ؼ� ������ �մϴ�.
		Scanner scan = new Scanner(System.in);
		
		// ���ǻ� �̸��� ������ �Է� �޽��ϴ�.
		System.out.println("������ �̸� : ");
		String name = scan.next();
		
		System.out.println("���� : ");
		String gender = scan.next();
		
		Welfare wel = new Welfare();
		wel.setName(name);
		wel.setGender(gender);
		wel.setAge(100);
		wel.setAgeg("û��");
		wel.setArea("���");
		wel.setIncome(1000);
		wel.setJob("�ǻ�");
		wel.setMarriage("��ȥ");
		wel.setReligion("����");
		
		int cnt = -1;
		cnt = mgr.Update(wel);
		
		if (cnt == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
	}

	private static void SelectOne() {
		// �̸��� �Է��ϸ� �ش� ��� ������ ����� �ݴϴ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ã�� ����� �Է� ���ּ���.");
		String name = scan.next();
		
		Welfare wel = mgr.SelectOne(name);
		
		if (wel == null) {
			System.out.println("�������� �ʴ� ��� �Դϴ�.");
		} else {
			Display(wel);
		}
	}

	private static void Display(Welfare wel) {
		// 1�࿡ ���� ������ ��� ���ݴϴ�. 
		String name = wel.getName();
		
		String imsi = "";
		imsi += "�̸� : " + wel.getName() + "\n";
		imsi += "���� : " + wel.getGender() + "\n";
		imsi += "���� : " + wel.getAge() + "\n";
		imsi += "���ɴ� : " + wel.getAgeg() + "\n";
		imsi += "��ȥ ���� : " + wel.getMarriage() + "\n";
		imsi += "���� ���� : " + wel.getReligion() + "\n";
		imsi += "�ҵ� : " + wel.getIncome() + "\n";
		imsi += "���� : " + wel.getJob() + "\n";
		imsi += "��Ȱ�ǿ� : " + wel.getArea() + "\n";
		
		System.out.println(imsi);
	}

	private static void Insert() {
		// ������ 1���� �߰� �մϴ�.
		Scanner scan = new Scanner(System.in);
		
		// ���ǻ� �̸��� ������ �Է� �޽��ϴ�.
		System.out.println("�̸� : ");
		String name = scan.next();
		
		System.out.println("���� : ");
		String gender = scan.next();
		
		Welfare wel = new Welfare();
		wel.setName(name);
		wel.setGender(gender);
		wel.setAge(10);
		wel.setAgeg("û��");
		wel.setArea("���");
		wel.setIncome(100);
		wel.setJob("�ǻ�");
		wel.setMarriage("��ȥ");
		wel.setReligion("����");
		
		int cnt = -1;
		cnt = mgr.Insert(wel);
		
		if (cnt == 1) {
			System.out.println("�߰� ����");
		} else {
			System.out.println("�߰� ����");
		}
	}

	private static void SelectAll03() {
		// ����¡ ó���� �Ͽ� �����͸� ���� �մϴ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �������� ���ðڽ��ϱ�?");
		int pageNumber = scan.nextInt();
		
		System.out.print("�������� �� ���� ���ðڽ��ϱ�?");
		int pageSize = scan.nextInt();
		
		int beginRow = (pageNumber - 1) * pageSize + 1;
		int endRow = pageNumber * pageSize;
		
		List<Welfare> lists = mgr.SelectAll(beginRow, endRow);
		
		Display(lists);
	}

	private static void SelectAll02() {
		// ������ ������ ��ȸ�Ͽ� ���� �ݴϴ�.
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻� ��� : (1) ����, (2) ����");
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
		// ��ü �����͸� �о ���� �ݴϴ�.
		List<Welfare> lists = mgr.SelectAll();

		Display(lists);
	}

}
