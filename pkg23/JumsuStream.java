package pkg23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class JumsuStream {
	
	private static String makeStr(String imsi) {
		String[] arr = imsi.split(",");
		
		String name = arr[0];
		
		double kor = Double.parseDouble(arr[1]);
		double eng = Double.parseDouble(arr[2]);
		double math = Double.parseDouble(arr[3]);
		
		// 중간 단계의 변수 _ 붙임
		double _total = kor + eng + math;
		double _average = _total / 3.0;
		
		String pattern = "###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		String total = df.format(_total);
		String average = df.format(_average);
		
		String gender = arr[4].equalsIgnoreCase("M") ? "남자" : "여자";
				
		String result = name + "/" + gender + "/" + total + "/" + average;
		
		return result;
	}

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		File src = new File("c:\\imsi\\jumsu.txt");
		File dst = new File("c:\\imsi\\result.txt");
		
		try {
			fr = new FileReader(src);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(dst);
			bw = new BufferedWriter(fw);
			
			String imsi = "";
			while((imsi = br.readLine()) != null) {
				String result = makeStr(imsi);
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
