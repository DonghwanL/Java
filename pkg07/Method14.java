package pkg07;
public class Method14 {
	public static void main(String[] args) {
		String str = "gugudan" ;
		System.out.println(str.length()); //문자열의 길이
		
		System.out.println(str.charAt(4)); //4번째 위치의 글자를 반환
		
		//모든 문자열을 역순으로 출력하시오.
		reverse(str) ; //nadugug
		
		//2번째 요소에서 5번째 요소까지 추출하여 역순으로 출력 
		reverse(str, 2, 5) ; //adug
	}
	
	static void reverse(String str) {
        String result = "" ;   
        
        for (int i = str.length() - 1 ; i >= 0; i--) {
            result += str.charAt( i ) ;            
        }
        
        System.out.println( result ); 
    }

	
	static void reverse(String str, int begin, int end) {
        String result = "" ;     
        for (int i = end ; i >= begin ; i--) {            
            result += str.charAt( i ) ;            
        }
        System.out.println( result ); 
    }
} 
