package pkg22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader03 {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("ù ��° ���� �Է��ϼ���. :");
			int first = Integer.parseInt(br.readLine());
			
			System.out.print("�� ��° ���� �Է��ϼ���. : ");
			int second = Integer.parseInt(br.readLine());
			
			int max = first > second ? first : second;
			System.out.println("ū �� : " + max);
			
			System.out.println("�۾� ����");
		
		} catch (IOException e) {	
			System.out.println("������ ����¿� ������ �ֽ��ϴ�.");
 			e.printStackTrace();
 			
		} catch (NumberFormatException e) {	
			System.out.println("���� �������� �Է� ���ּ���.");
 			e.printStackTrace();
 			
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
			e.printStackTrace();
			
		} finally { // ����� ��� ��ü�� �ݵ�� ���� �۾��� ����
			try {
				if (br != null) {br.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}

	}

}
