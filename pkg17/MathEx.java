package pkg17;

public class MathEx {

	public static void main(String[] args) {
		double d1 = -12.3456;
		double d2 = 34.56;
		
		double result = Math.abs(-11.22);
		System.out.println(result);
		
		System.out.println("절대값 : " + Math.abs(d1));
		System.out.println("파이 : " + Math.PI);
		System.out.println("오일러 상수 : " + Math.E);
		
		System.out.println("2의 3승근 : " + Math.cbrt(8));
		System.out.println("올림 : " + Math.ceil(d1));
		System.out.println("버림 : " + Math.floor(d1));
		System.out.println("큰 수 : " + Math.max(12, 15));
		System.out.println("작은 수 : " + Math.min(10, 20));
		System.out.println("2의 10승 : " + Math.pow(2, 10));
		
		
		System.out.println("난수 : " + Math.random());
		System.out.println("반올림 : " + Math.round(12.59));
		// 양수는 1, 음수는 -1, 0은 0으로 출력
		System.out.println("부호 값 : " + Math.signum(-12.3)); 
		System.out.println("루트 : " + Math.sqrt(16));
		
		// 두 변이 각각 3, 4라고 할 떄 가장 긴 변의 길이는 ? 5.0
		
		double x = 3.0;
		double y = 4.0;
		double z = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
		System.out.println("z : " + z);
		
		// 가장 긴 변이 13.0이고, 짧은 변이 5.0이라고 할 때 나머지 변의 길이	
		z = 13.0;
		y = 5.0;
		x = Math.sqrt(Math.pow(z, 2.0) - Math.pow(y, 2.0));
		System.out.println("x : " + x);
		
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		

	}

}
