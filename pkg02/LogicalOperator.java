package pkg02;

public class LogicalOperator {

	public static void main(String[] args) {
		int x = 3, y = 2;
		
		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		System.out.println(x < y);
		System.out.println(x == y);
		System.out.println(x != y);
		
		
		boolean result = (3 > 2) && (3 > 4);
		System.out.println(result);
		
		result = (x != y) && (-1 > 0);
		System.out.println(result);
		
		result = !result;
		System.out.println(result);
		System.out.println("");
		
		
		int a = 10, b = 8;
		
		boolean bool1 = a != b;
		boolean bool2 = --a == b++;
		boolean bool3 = a++ != --b;
		boolean bool4 = bool3 && (5 > 7);
		boolean bool5 = !bool4 || (bool1 && bool2);
		
		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		System.out.println("bool3 : " + bool3);
		System.out.println("bool4 : " + bool4);
		System.out.println("bool5 : " + bool5);
	
		
	}

}
