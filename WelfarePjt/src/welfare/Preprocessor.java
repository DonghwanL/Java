package welfare;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Preprocessor {

	public static void main(String[] args) {
		// '����������.csv' ������ �о� �ͼ� ��ó���� �����մϴ�.
		// ���� ������� '����������Clean.txt' ���Ϸ� �����մϴ�.
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		File src = new File("c:\\imsi\\����������.csv");
		File dst = new File("c:\\imsi\\����������Clean.csv");
		
		try {
			fr = new FileReader(src);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(dst);
			bw = new BufferedWriter(fw);
			
			Processing proc = new Processing();
			
			String imsi = "";
			while((imsi = br.readLine()) != null) {
//				System.out.println(imsi);
				String result = proc.makeStr(imsi);
				bw.write(result);
				bw.newLine();
			}
			
			System.out.println("�۾� ����");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();		
		
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();		
			
		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
			e.printStackTrace();
			
		} finally {
			try {
				if (br != null) {br.close();}
				if (fr != null) {fr.close();}
				
				if (bw != null) {bw.close();}
				if (fw != null) {fw.close();}
				
			} catch (Exception e2) {
				System.out.println("���� �۾����� ������ �߻��Ͽ����ϴ�.");
				e2.printStackTrace();
			}
		}

	}

}
