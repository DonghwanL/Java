package pkg02;

public class Condition01 {

	public static void main(String[] args) {
		// x가 y보다 크다면 5를, 아니면 3을 출력하는 프로그램 
		int x = 3, y = 2;
		
		int result = x > y ? 5 : 3;
		
		System.out.println("결과01 : " + result);
		
		// a가 b보다 크면, 숫자 5를, 그렇지 않으면 a+2를 출력하는 프로그램 작성
		
		int a = 7, b = 4;
		result = a > b ? 5 : a+2;
		
		System.out.println("결과02 : " + result);
		
		
		x = 5;
		// x가 짝수이면 x+3을, 홀수이면 x의 제곱 값을 출력
		result = x%2 == 0 ? x+3 : x*x; 
		
		System.out.println("결과03 : " + result);
		
		x = 7;
		y = 5;
		// 두 수 중에서 큰 수를 출력하기
		result = x > y ? x : y;
		System.out.println("결과04 : " + result);
		
		x = 7;
		y = 12;
		// x가 y의 약수이면 "예"를, 그렇지 않으면 "아니오"를 출력하기
		String abcd = y%x == 0 ? "예" : "아니오";
		System.out.println("결과05 : " + abcd);
		
		
		// 조건 연산자를 이용하여 다음 3 숫자 중에서 가장 큰 수를 출력하세요. 최대 값 변수 이름 : max
		x = 3;
		y = 8;
		int z = 4;
		int max;
		
		max = x > y ? x : y;
		max = max > z ? max : z;
		
		System.out.println("결과06 : " + max);
		
		int large; // 중첩
		
		large = x > y ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("제일 큰 수 : " + large);		
		
		int min;
		
		min = x < y ? x : y;
		min = min < z ? min : z;
		
		System.out.println("결과07 : " + min);
	
		
		// x와 y의 합이 홀수이면 x를, 짝수이면 y를 출력해 보세요.
		// 출력 결과 : 3, 8, 4 중 최대 수는 8입니다. x = 3, y = 8이므로, 결과는 3임.
		
		result = (x+y)%2 == 0 ? y : x;
		System.out.println("결과08 : " + result);
		

	}

}
