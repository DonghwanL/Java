package pkg02;

public class Casting {

	public static void main(String[] args) {
		double d = 100; // 암시적 캐스팅
		System.out.println("d : " + d);
		
		int i = (int)3.14; // 명시적 캐스팅
		System.out.println("i : " + i);
		
		System.out.println(14/5); // 2
		
		// (double)14/5--> 명시적 캐스팅 14.0/ --> 암시적 캐스팅 14.0/5.0 --> 2.8
		System.out.println((double)14/5);
		
		// (double)(14/5) --> (double)(2) --> 2.0
		System.out.println((double)(14/5));
		
		
		int kor = 50, eng = 60, math = 80;
		int total = 0;
		double average = 0.0;
		
		total = kor + eng + math;
		average = total / 3; // 암시적 형변환 63 --> 63.0
		average = (double)total / 3; // 명시적 형변환
				
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		char ch1 = 'c';
		char ch2 = 'a';
		
		boolean bool = ch1 > ch2;
		System.out.println(bool);
		
		int result = ch1 - ch2 + 3; // 99 - 97 + 3 = 5
		System.out.println(result);
		
		
		char ch3 = 'c';
		// 조건 연산자를 사용하여 ch3가 대문자인지 소문자 인지 판단하는 프로그램 생성
		String str = ch3 >= 'a' && ch3 <= 'z' ? "소문자" : "대문자";
		System.out.println(str);
		

	}

}
