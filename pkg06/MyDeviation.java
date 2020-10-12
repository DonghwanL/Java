package pkg06;

public class MyDeviation {

	public static void main(String[] args) {
        //초기화 기법으로 배열을 정의한다.
        int[] arr = {10, 30, 40, 80};

        double result = deviation(arr);
        System.out.println("결과 : " + result );
	}
	
	static double deviation(int[] arr) {
		int total = 0; // 총합을 구해주는 변수
		
		for (int i = 0; i < arr.length; i++) {
			total += arr[i]; // 배열 요소의 총합을 구한다.
		}
		
		double imsi = 0.0; // 분산을 구하기 위한 임시 변수
		double average = (double)total / arr.length; // 평균
		
		for (int i = 0; i < arr.length; i++) {
			// 배열의 요소와 평균의 차이를 제곱 시킨다.
			imsi += Math.pow((arr[i] - average), 2.0);
		}
		
		imsi /= arr.length;
		
		return Math.sqrt(imsi);
		
		
		/*
		 
			표준 편차 구하는 공식
			표준 편차(standard deviation)를 구하세요.
			 
			1) 평균을 구한다.
			    평균 = 총합(160)/arr.length = 160/4 = 40
			 
			2) (점수 - 평균)을 제곱을 모두 누적시킨다.
			    900 + 100 + 0 + 1600 = 2600 
			 
			3) 2)의 결과에 돗수를 나눈다
			    2600/arr.length = 650
			 
			4) 3)에 루트를 씌운다.
			    루트 650 = 25.4950975 
			    힌트 : Math.sqrt( 650 ) 
		
		 */
	
	}

}
