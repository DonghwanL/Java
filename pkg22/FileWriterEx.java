package pkg22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) {
		String pathname = "c:\\imsi\\abcd.txt";	
		File dest = new File(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(dest);
			bw = new BufferedWriter(fw);
			
			bw.write("강감찬,호호,10,abc");
			bw.newLine();
			bw.write("을지문덕,크크,20,def");
			bw.newLine();
			
			for (int i = 0; i <= 100; i++) {
				bw.write(String.valueOf(i * i));
				bw.newLine();
			}
			
			System.out.println("작업 완료");
			
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
			e.printStackTrace();
			
		} catch (Exception e) {	
			System.out.println("기타 예외 발생");
			e.printStackTrace();
			
		} finally {
			try {
				if(bw != null) {bw.close();}
				if(fw != null) {fw.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
