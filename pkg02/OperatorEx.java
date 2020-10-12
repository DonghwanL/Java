package pkg02;

public class OperatorEx {

	public static void main(String[] args) {
		 int a = 3 - -2, b = 3 ; 
		 // a = 3 + 2 = 5, b = 3
		 
	     int x = ( a >= b ) ? 5 : ( a + 2)  ;
	     // x = 5   
	     
	     x += ++a;   
	     // a = 5 + 1 = 6
	     // x = x + a = 5 + 6 = 11
	     
	     int y = ++a ; 
	     // a = 6 + 1 = 7
	     // y = 7
	     
	     y += a + --b  ; 
	     // y = y + a + --b
	     // --b = 3 - 1 = 2
	     // y = 7 + 7 + 2 = 16
	         
	     char ch3 = 'D' ; 
	     int z = ch3 >= 'A' && ch3 <= 'Z' ? --y  : x + 2  ;
	     // --y = 16 - 1 = 15
	     // z = 15
	        
	     int result = 0 ;
	     result = x > y ? z - y : x + z ;
	     // 11 > 16이 거짓이므로 x + z 실행
	     // result = x + z = 11 + 15 = 26
	     
	     System.out.println( "result : " + result );
	        
	        
	        /* 다음 문장을 조건식으로 나타 내시오.
	        (1) a는 b보다 크거나 같다. a >= b
	        (2) a는 b보다 작고 c보다 크다. c < a < b
	        (3) a 더하기 3은 10과 같지 않다. a + 3 != 10
	        (4) a는 10보다 크거나 b와 같다. b == a > 10
	        */
	}

}
