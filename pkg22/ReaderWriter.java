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
		File source = new File("c:\\imsi\\abc.txt") ; //읽어 올 파일
		File target = new File("c:\\\\imsi\\def.txt") ; //기록이 될 파일
		
		FileReader fr = null ;
		BufferedReader br = null ;
		
		FileWriter fw = null ; 
		BufferedWriter bw = null ;
		
		try {
			fr = new FileReader( source) ;
			br = new BufferedReader(fr) ;
			
			fw = new FileWriter( target ) ;
			bw = new BufferedWriter( fw ) ;
			
			String imsi = ""; //읽어 들인 1줄을 저장할 임시 변수 
			
			while(( imsi = br.readLine() ) != null ){//br에서 읽어 와서 
				bw.write( imsi ) ;//bw에 쓰기한다. 
				bw.newLine() ; //엔터 키 효과이다.
			}
			
			for (int i = 1; i <= 9 ; i++) {
				String temp = i + " * " + i + " = " + ( i *  i ) ;
				bw.write( temp ) ;
				bw.newLine() ; 
			}
			
			System.out.println("작업 완료"); 
		
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다.") ;
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("입출력 문제 발생.") ;
			e.printStackTrace();
			
		} finally{
			try { //사용된 모든 객체는 close()을 이용하여 종료시켜야 한다.
				if( br != null ){ br.close() ; }
				if( fr != null ){ fr.close() ; }
				
				if( bw != null ){ bw.close() ; }
				if( fw != null ){ fw.close() ; } 
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
}
