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
	     // 11 > 16�� �����̹Ƿ� x + z ����
	     // result = x + z = 11 + 15 = 26
	     
	     System.out.println( "result : " + result );
	        
	        
	        /* ���� ������ ���ǽ����� ��Ÿ ���ÿ�.
	        (1) a�� b���� ũ�ų� ����. a >= b
	        (2) a�� b���� �۰� c���� ũ��. c < a < b
	        (3) a ���ϱ� 3�� 10�� ���� �ʴ�. a + 3 != 10
	        (4) a�� 10���� ũ�ų� b�� ����. b == a > 10
	        */
	}

}
