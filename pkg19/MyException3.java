package pkg19;

public class MyException3 {

	public static void main(String[] args) {
		
		try {
			String xx = "aa" ;
			first(xx); // first() 메소드 호출
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("잘못된 숫자 형식 입니다.");
		} catch (Exception e) {
			System.out.println("나머지 예외");
		}	
		
	}
		
	static void first(String xx) throws ArithmeticException, NumberFormatException {
		second(); // second() 메소드 호출
		int x = Integer.parseInt(xx);
	}
		
	static void second() throws ArithmeticException {
		third(); // third() 메소드 호출
	}
		
	static void third() throws ArithmeticException {
		int i = 1, j = 0;
		System.out.println(i / j);
	}
	

}
