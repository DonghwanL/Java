package pkg22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		String pathname = "c:\\imsi\\jumsu.txt";
		
		File source = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			source = new File(pathname);
			System.out.println(source.exists());
			
			fr = new FileReader(source);
			br = new BufferedReader(fr);
			
			String imsi = "";
			while((imsi = br.readLine()) != null) {
				System.out.println(imsi);
			}
			
			System.out.println("작업 완료");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
			
		} catch (Exception e) {	
			System.out.println("기타 예외 발생");
			e.printStackTrace();
			
		} finally {
			try {
				if(br != null) {br.close();}
				if(fr != null) {fr.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
