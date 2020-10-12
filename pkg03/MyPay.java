package pkg03;

public class MyPay {

	public static void main(String[] args) {
		/* 
		임금 계산
		8시간 까지는 시급이 5000원이고, 8시간 초과분에 대해서는 1.5배의 시급을 지급하는 알바가 있다.
		예를 들어서 5시간 근무이면 임금 = 5000 * 5 =  25000이다.
				15시간 근무이면 임금 = 5000 * 8 + 5000 * 1.5 * 7  = 92500이다. 
		출력 예시) 15시간 근무시의 임금은 92500입니다.		
		*/
		
        int RATE = 5000; //기본 시급
        double pay; // 임금
        int hours; // 근무 시간
        double FIRST = 8.0; // 분기 시간
        
        hours = 5; 
        
        if(hours > 8) { 	
        	pay = RATE * FIRST + (int)(1.5 * RATE * (hours - FIRST)); 
        } else {
        	pay = RATE * hours;
        }
        System.out.printf("임금은 " + (int)pay + "입니다.\n");
        
        
        /*
         근무 시간   기본 시급 
		1 ~ 10      5,000원
		11 ~ 20     기본 시급의 1.5배 
		21 이상     기본 시급의 2.0배 
        */
        double SECOND = 20.0;
        pay = 0.0;
        FIRST = 10.0; // 분기, 시간
        
        hours = 15;
        
        if(hours < FIRST) {
        	pay = RATE * hours;  	
        } else if (hours < SECOND) {
        	pay = (10 * RATE + (int)((hours - 10) * RATE * 1.5));  
		} else if (hours <= 21) {
			pay = (10 * RATE + (int)((hours - 10) * RATE * 1.5));  
		}
        System.out.printf("임금은 " + (int)pay + "입니다. \n" );
        
        
        /*
          5시간 근무  = 5000 * 5 =  25,000원
		  15시간 근무  = 5000 * 10 + 5000 * 1.5 * 5 = 87,500원
   		  25시간 근무  = 5000 * 10 + 5000 * 1.5 * 10 + 5000 * 2.0 * 5 = 175,000원		
			
         */
        
        // 	for 구문을 사용하여 다음 문제를 풀어 보세요. (1*2 + 2*3 + 3*4 + … + 100*101 = 343400)
        
        int total = 0;
        
        for (int i = 1; i < 101; i++) {
        	total += i*(i+1);
        }
        System.out.println("총합 : " + total);
	}

}
