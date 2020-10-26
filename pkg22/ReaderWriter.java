package pkg22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) {
		String pathname = "c:\\imsi\\abc.txt";
		
		File source = null;
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			source = new File(pathname);
			fr = new FileReader(source);
			br = new BufferedReader(fr);
			
			pathname = "c:\\imsi\\def.txt";
			File dest = new File(pathname);
			fw = new FileWriter(dest);
			bw = new BufferedWriter(fw);
			
			String imsi = "";
			while((imsi = br.readLine()) != null) {
				bw.write(imsi);
				bw.newLine();
			}
			
			for (int i = 1; i < 10; i++) {
				imsi = i + " * " + i + " = " + i * i;
				bw.write(imsi);
				bw.newLine();
			}
			
			System.out.println("�۾� �Ϸ�");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println("�׿� ���� �߻�");
			e.printStackTrace();
			
		} finally {
			try {
				if(br != null) {br.close();}
				if(fr != null) {fr.close();}
				if(bw != null) {bw.close();}
				if(fw != null) {fw.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
