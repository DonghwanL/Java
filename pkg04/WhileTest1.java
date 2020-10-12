package pkg04;
public class WhileTest1 {

	public static void main(String[] args) {
		/* while 구문을 사용
		 3 * 1 = 3
		 3 * 2 = 6
		 ...
		 3 * 9 = 27
		 
		 */
		
		int i = 1;
		int dan = 3;
		
		while(i < 10) {			
			String imsi = dan + " * " + i + " = " + (dan * i);
			System.out.println(imsi);
			i++;
		}

	}

}
