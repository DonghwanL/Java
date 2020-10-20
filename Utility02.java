package pkg18;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Utility02 {

	public static void main(String[] args) {
		String str = "소녀시대 빅뱅 원더걸스 exid 걸스데이" ;
		
		StringTokenizer st1 = new StringTokenizer(str);
		System.out.println("토큰 개수 : " + st1.countTokens());
		
		String[] st2 = new String[5];
		for (int i = 0; i < st2.length; i++) {
			st2[i] = st1.nextToken();
			System.out.print(st2[i] + "\t");
		}
		System.out.println();
		
		Arrays.sort(st2);
		for (int i = 0; i < st2.length; i++) {
			System.out.print(st2[i] + "\t");
		}

	}

}
