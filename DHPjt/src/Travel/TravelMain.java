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

			System.out.println("  ����������������������������������������������������������������");
			System.out.println("  �� ----- ������ ���� ���α׷�  -----  ��");
			System.out.println("  ����������������������������������������������������������������");
			System.out.println("    ���Ͻô� ������ ��ȣ�� �Է� ���ּ���. \n");

			System.out.println("[1] ��ü ���� [2] ��޺� ���� [3] �������� ����");
			System.out.println("[4] ���� �߰� [5] ���� ���� [6] ���� ���");
			System.out.println("[7] ������ �˻� [8] ���α׷� ����");

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
				System.out.println(" * ���α׷��� ���� �մϴ�.");
				System.exit(8);
			}

		}

	}

	private static void viewOne() {
		// �̸��� �Է��ϸ� �ش� �̸��� ������ ���

		Scanner scan = new Scanner(System.in);

		System.out.println(" * ������ �Է� ���ּ���.");

		System.out.print("�̸� :");
		String name = scan.next();

		Travel trl = tmr.viewOne(name);

		if (trl == null) {
			System.out.println("�������� �ʴ� �̸� �Դϴ�.");
		} else {
			display(trl);
		}

	}

	private static void cancel() {
		// ���� 1���� ���

		Scanner scan = new Scanner(System.in);

		System.out.println(" * ������ �Է� ���ּ���.");

		System.out.print("�̸� : ");
		String name = scan.next();

		if (tmr.compareTime(name)) {
			int check = tmr.cancel(name);

			if (check == 1) {
				System.out.println(" * ��Ұ� �Ϸ� �Ǿ����ϴ�.");
			}
			
		} else {
			System.out.println(" * ���� ��Ұ� �Ұ� �մϴ�. (���� ���� 30�� ���)");
		}
	}


	private static void update() {
		// ���� 1���� ����

		Scanner scan = new Scanner(System.in);

		System.out.println(" * ������ �������� �����ϸ�, ��Ҵ� ��� �޴����� ���� ���ּ���.");
		System.out.println(" * ���� �Աݵ� ���� ȯ��ó�� �Ǹ�, ���Ա��� �ʿ��մϴ�. \n");

		System.out.print("�̸� :");
		String name = scan.next();

		System.out.print("������ :");
		String tplace = scan.next();
		System.out.println();

		Travel trl = new Travel();
		trl.setName(name);
		trl.setTplace(tplace);

		int check = tmr.update(trl);

		if (check == 1) {
			System.out.println(" * ������ �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println(" * ������ ���� �߽��ϴ�.");
		}
	}

	private static void booking() {
		// ���� 1���� �߰�

		Scanner scan = new Scanner(System.in);

		System.out.println(" * ���� �߰��� ���� ����� �Է� �ϼ���. \n");

		System.out.print("�̸� :");
		String name = scan.next();

		System.out.print("���� :");
		String gender = scan.next();

		System.out.print("���� :");
		int age = scan.nextInt();

		System.out.print("������ :");
		String tplace = scan.next();
		System.out.println();

		Travel trl = new Travel();
		trl.setName(name);
		trl.setGender(gender);
		trl.setAge(age);
		trl.setTplace(tplace);
		trl.setPrice(500);
		trl.setGrade("�Ϲ�");
		trl.setBstate("���� ���");

		Date date = new Date();
		String format = "yyyy/MM/dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String nowDate = sdf.format(date);

		trl.setBdate(nowDate);

		int check = tmr.booking(trl);

		if (check == 1) {
			System.out.println(" * ������ �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println(" * ���࿡ ���� �߽��ϴ�.");
		}
	}

	private static void viewPage() {
		// ����¡ ó��

		Scanner scan = new Scanner(System.in);

		System.out.print(" * ������ ��ȣ�� �Է� ���ּ���.");
		int pageNumber = scan.nextInt();

		System.out.print(" * Ȯ���� �������� ������ �Է� ���ּ���.");
		int pageSize = scan.nextInt();

		int beginRow = (pageNumber - 1) * pageSize + 1;
		int endRow = pageNumber * pageSize;

		List<Travel> lists = tmr.viewPage(beginRow, endRow);

		display(lists);
	}

	private static void viewGrade() {
		// ��޺� ����

		Scanner scan = new Scanner(System.in);

		System.out.println(" * �˻��� ���Ͻô� ����� ��ȣ�� �Է� ���ּ���.");
		System.out.println("[1] VIP, [2] ���, [3] �Ϲ�");
		int num = scan.nextInt();

		List<Travel> lists = tmr.viewGrade(num);

		display(lists);
	}

	private static void viewAll() {
		// ����Ʈ ��ü ����

		List<Travel> lists = tmr.viewAll();

		display(lists);
	}

	private static void display(List<Travel> lists) {
		// ����� ���� �޼ҵ�
		
		System.out.println("����������������������������������������������������");

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
		
		System.out.println("����������������������������������������������������");
	}

	private static void display(Travel trl) {
		// ���� 1�ǿ� ���� ���� ���

		String temp = "";
		temp += trl.getName() + "\t";
		temp += trl.getGender() + "\t";
		temp += trl.getAge() + "\t";
		temp += trl.getTplace() + "\t";
		temp += trl.getPrice() + "\t";
		temp += trl.getGrade() + "\t";
		temp += trl.getBstate() + "\t";
		temp += trl.getBdate();
		
		System.out.println("����������������������������������������������������");
		System.out.println(temp);
		System.out.println("����������������������������������������������������");
	}

}
