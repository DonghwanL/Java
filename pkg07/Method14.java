package pkg07;
public class Method14 {
	public static void main(String[] args) {
		String str = "gugudan" ;
		System.out.println(str.length()); //���ڿ��� ����
		
		System.out.println(str.charAt(4)); //4��° ��ġ�� ���ڸ� ��ȯ
		
		//��� ���ڿ��� �������� ����Ͻÿ�.
		reverse(str) ; //nadugug
		
		//2��° ��ҿ��� 5��° ��ұ��� �����Ͽ� �������� ��� 
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
