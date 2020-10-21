package pkg19;
import java.util.Scanner;

public class JumsuMain {

	public static void main(String[] args) {
		Scanner scan = null;
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double average = 0.0;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("������ �Է� : ");
			name = scan.next();
			System.out.println("���� �Է� : ");
			kor = scan.nextInt(); 
			System.out.println("���� �Է� : ");
			eng = scan.nextInt(); 
			System.out.println("���� �Է� : ");
			math = scan.nextInt(); 
			
			total = kor + eng + math;
			
			if (kor <= 40 || eng <= 40 || math <= 40) {
				throw new MinJumsuException("����");
			}
			
			if (total < 180) {
				throw new FailedException("��� ���� ����");
			}
			
			// ��հ� ���� ���
			average = (double)total / 3.0;
			System.out.println("���� : " + total);
			System.out.printf("��� : %.2f\n", average);
		
		
		} catch (MinJumsuException e) { // ��� ���� ���� 40 ����
			String imsi = "";
			imsi += "������ �Է�: " + name + "\n";
			imsi += "���� ���� : " + kor + "\n";
			imsi += "���� ���� : " + eng + "\n";
			imsi += "���� ���� : " + math;
			
			System.out.println(imsi);
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		
		} catch (FailedException e) { // 3���� ���� 180 �̸�
			String imsi = "";
			imsi += "������ �Է�: " + name + "\n";
			imsi += "���� ���� : " + kor + "\n";
			imsi += "���� ���� : " + eng + "\n";
			imsi += "���� ���� : " + math;
			
			System.out.println(imsi);
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println("������ ���� �߻� ");
			
		} finally {
			scan.close();
		}
		

	}

}
