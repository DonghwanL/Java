package pkg04;

public class FourthTest {

	public static void main(String[] args) {

		// 1부터 10까지의 정수중에서 i가 홀수이면 각 값에 3을 더한 결과의 총합 (1+3)+(3+3)+(5+3)+(7+3)+(9+3)=40
		// i가 짝수이면 각 값의 제곱에 -1을 한 값의 총합 (4-1)+(16-1)+(36-1)+(64-1)+(100-1)=215를 출력해주는
		// 프로그램 작성

		int odd = 0, even = 0; // 홀수 짝수 변수 선언

		for (int i = 1; i < 11; i++) { // 10번 반복되는 반복문 설정
			if (i % 2 == 0) { // i가 짝수일 경우
				even += (i * i - 1); // 각 값에 제곱 -1
			} else { // i가 홀수일 경우
				odd += (i + 3); // 각 값에 +3
			}
		}

		System.out.printf("짝수의 총합 : %d\n", even);
		System.out.printf("홀수의 총합 : %d\n", odd);

		// 1-1/2+1/3-1/4+ … +1/99-1/100의 합을 구하시오.
		// 조건 연산자 혹은 양자 택일 if를 사용하여 덧셈하시오.
		// 총합 +=구할 변수의 이름은 total으로 선언한다.
		// 총합 = 0.6881721… 짝수이면 ? 빼기 : 더하기 ;
		// 총합을 

		double odd2 = 0.0, even2 = 0.0; // 총합 변수 선언
		double total2 = 0.0;

		for (int i = 1; i < 101; i++) { // 100번 반복되는 반복문 설정

			 total2 += 1 % 2 == 0 ? -(double) 1 / i : +(double) 1 / i;

//			if (i % 2 == 0) { // i가 짝수일 경우
//				even2 += 1.0 / i;
//			} else {
//				odd2 -= (double) 1 / i;
//			}

		}
		System.out.println("결과 : " + (odd2 - even2));
		System.out.println("결과 : " + total2);

		
		// 2/1 + 3/2 + 4/3 + ..... + 101/100

		double total = 0;
		for (int i = 1; i < 101; i++) { // 1부터 100까지 반복되는 반복문 설정
			total += (double) (i + 1) / i;
		}

		System.out.println("총합 : " + total);

	}
}
