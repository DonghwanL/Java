package pkg03;

public class LargeTest {

	public static void main(String[] args) {
		int su1 = 100;
		int su2 = 50;
		
		// 두개의 정수 중 큰 수를 출력해 보세요.
		if(su1 >= su2) {
			System.out.println(su1 + "은 " + su2 + "보다 큽니다");
		} else {
			System.out.println(su1 + "은 " + su2 + "보다 작습니다");
		}
		
		int x = 5, y = 12;
		
		// x는 y의 약수인지 확인하는 프로그램 작성
		if(y % x == 0) {
			System.out.println(x + "는 " + y + "의 약수입니다." );
		} else {
			System.out.println(x + "는 " + y + "의 약수가 아닙니다." );
		}
		
		String name;
		int age;
		
		name = "홍길동";
		age = 13;
		
		// 미성년자 체크 : 19세 이상이 성년이라고 가정
		// 출력 예시 : 13세인 '홍길동'은 "미성년자" 입니다.
		
		if(age >= 19) {
			System.out.println(age + "세인 \'" + name + "\'은 \"성인\" 입니다.");
		} else {
			System.out.println(age + "세인 \'" + name + "\'은 \"미성년자\" 입니다.");
		}
		
		// su가 3의 배수이면 제곱수를, 아니면 더하기 5한 결과를 출력하세요.
		int su = 3;
		
		if(su % 3 == 0) {
			System.out.println("결과 : " + (su * su));
		} else {
			System.out.println("결과 : " + (su + 5));
		}
		
		

	}

}
