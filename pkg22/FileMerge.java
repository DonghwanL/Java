package pkg22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerge {
	public static void main(String[] args) {
		File source1 = new File("c:\\myid.txt") ; //읽어 올 파일
		File source2 = new File("c:\\text.txt") ; //읽어 올 파일
		File target = new File("c:\\result.txt") ; //기록이 될 파일
		
		FileReader fr1 = null ;
		BufferedReader br1 = null ;
		FileReader fr2 = null ;
		BufferedReader br2 = null ;
		FileWriter fw = null ; 
		BufferedWriter bw = null ;
		
		try {
			fr1 = new FileReader( source1 ) ;
			br1 = new BufferedReader( fr1) ;
			fr2 = new FileReader( source2 ) ;
			br2 = new BufferedReader( fr2) ;			 
			fw = new FileWriter( target ) ;
			bw = new BufferedWriter( fw ) ;
			
			String imsi = ""; //읽어 들인 1줄을 저장할 임시 변수 
			
			while(( imsi = br1.readLine() ) != null ){ 
				bw.write( imsi ) ;//bw에 쓰기한다. 
				bw.newLine() ; //엔터 키 효과이다.
			}			
			while(( imsi = br2.readLine() ) != null ){  
				bw.write( imsi ) ;//bw에 쓰기한다. 
				bw.newLine() ; //엔터 키 효과이다.
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
				if( br1 != null ){ br1.close() ; }
				if( fr1 != null ){ fr1.close() ; }
				if( br2 != null ){ br2.close() ; }
				if( fr2 != null ){ fr2.close() ; }				
				if( bw != null ){ bw.close() ; }
				if( fw != null ){ fw.close() ; } 
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
}
