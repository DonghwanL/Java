package pkg10;

public class EqualsTest {

	public static void main(String[] args) {
		String str = "java";
		
		String str1 = new String("JAVA");
		String str2 = new String("java");
		
		if(str1 == str2) { // 참조 대상이 같은가?
			System.out.println("참조가 동일함");
		}else {
			System.out.println("참조가 다름");
		}
		
		if(str1.equals(str2)) { // 값 비교
			System.out.println("값이 동일함");
		}else {
			System.out.println("값이 다름");
		}
		
		if(str1.equalsIgnoreCase(str2)) { // 대소문자 무시
			System.out.println("값이 동일함");
		}else {
			System.out.println("값이 다름");
		}
		
	}

}
