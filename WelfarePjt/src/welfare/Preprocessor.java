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
		// '복지데이터.csv' 파일을 읽어 와서 전처리를 수행합니다.
		// 최종 결과물을 '복지데이터Clean.txt' 파일로 저장합니다.
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		File src = new File("c:\\imsi\\복지데이터.csv");
		File dst = new File("c:\\imsi\\복지데이터Clean.csv");
		
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
			
			System.out.println("작업 종료");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();		
		
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
			e.printStackTrace();		
			
		} catch (Exception e) {
			System.out.println("기타 예외 발생");
			e.printStackTrace();
			
		} finally {
			try {
				if (br != null) {br.close();}
				if (fr != null) {fr.close();}
				
				if (bw != null) {bw.close();}
				if (fw != null) {fw.close();}
				
			} catch (Exception e2) {
				System.out.println("마감 작업에서 문제가 발생하였습니다.");
				e2.printStackTrace();
			}
		}

	}

}
