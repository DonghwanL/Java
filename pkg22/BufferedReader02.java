package pkg22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReader02 {

	public static void main(String[] args) {
		InputStream in = null;
		
		// �긴�� ��Ʈ�� : ���ڿ��� ����Ʈ�� �Ǵ� ����Ʈ�� ���ڿ��� ��ȯ���ִ� ��Ʈ��
		// InputStreamReader : ����Ʈ --> ���ڿ�
 		InputStreamReader isr = null;
 		
 		// BufferedReader : Reader Ŭ������ ȿ������ ���̱� ���Ͽ� �������ִ� ���� ��Ʈ��
 		BufferedReader br = null;
 		
 		try {
 			in = System.in;
 			isr = new InputStreamReader(in);
 			br = new BufferedReader(isr);
 			
 			System.out.print("�غ� �Է� : ");
 			
 		// readLine() �޼ҵ� : �� �� ������ �н��ϴ�.
 			double width = Double.parseDouble(br.readLine()); 
 			
 			System.out.print("���� �Է� : ");
 			double height = Double.parseDouble(br.readLine());
 			
 			double area = width * height / 2.0;
 			
 			System.out.println("���� : " + area);
 			
 			System.out.println("�۾� �Ϸ�");
 			
 		} catch (IOException e) {
 			System.out.println("������ ����¿� ������ �ֽ��ϴ�.");
 			e.printStackTrace();
 			
 		} catch (NumberFormatException e) {	
 			System.out.println("�߸��� ���� ���� �Դϴ�.");
 			e.printStackTrace();
 			
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
			e.printStackTrace();
			
		} finally {
			try {
				if (br != null) {br.close();}
				if (isr != null) {isr.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
