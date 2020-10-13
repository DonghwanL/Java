package pkg13;

public class Note {
	
 /*
  
  - Day 01 -
  
  단축키 : Ctrl + M : 작업 창 최대화
	프로그램 작성 규칙 : 1) 대문자와 소문자를 구분.
				    2) 한 문장은 반드시 세미 콜론을 붙여야 함. (단, 중괄호가 있는 라인은 붙이지 않습니다.)
				    3) 문자열은 반드시 쌍따옴표로 둘러 싸야 함.
	메소드 : 어떠한 동작을 수행하는 주체
			println(문자열) 메소드 : 출력이라는 동작을 수행해주는 메소드, 내부적으로 엔터 키를 누른 효과를 나타냄.
			print() 메소드 : println() 메소드와 동일하나, 엔터 키를 누르지 않은 효과를 나타냄.
			main() 메소드 : Program Start Point
	+ 기호 : 문자열 결합 
	특수 문자 : 자바에는 다음과 같은 특수 문자들이 있음.
			 \n : 엔터
			 \t : 탭
			 \' : 외따옴표
			 \" : 쌍다옴표
			 \\ : 역슬래시
	주석 (Comment) : 프로그램 중간 중간에 작성해두는 설명 문구
			  		// 기호 : 1줄 주석
			  		/* 기호 : 여러 줄 주석  
	자료형 : int (정수), float, double (실수)
		   String (문자열), char (문자 1개)
		   boolean (진위)
	변수 : 자료를 읽기/쓰기를 수행하기 위한 데이터 저장 공간. 
		  1) 변수의 정의/선언 (자료형 변수이름;)
		  2) 변수의 정의는 무조건 1번만 가능함.
		  3) 변수에 값 대입 (변수명 = 값;)
	식별자 : 변수, 클래스, 패키지, 프로젝트, 메소드 등에 붙이는 이름
	 	   명명 규칙
	 	    1) 첫 글자는 한글, 영문 대소문자, '_', '$'로 시작해야 함.
	 	    2) 글자 수의 제한이 없음.
	 	    3) 공백 문자나 특수 문자는 사용이 불가 함.
	 	    4) 숫자는 1번째만 아니면 괜찮음.
	 	    5) 대소문자를 구분함.
	 	    6) 키워드는 사용 불가능 함.
	식별자 선언 예시 : String name; // 홍길동 
	  	    	  char ch; // 문자 'a'를 저장 
	  	    	  int age; // ~의 나이
	  	    	  boolean bool; // (참, 거짓)
	  	    	  double pi; // 수학의 파이
	선언과 동시에 값을 할당하기 : String name = "홍길동"; 
	 	    	  		  int age = 25;
	 	    	  		  double height = 175.2;
	 	    	  		  float weight = 60.3f; (float는 값 뒤에 f를 붙여 줘야 함)
	피연산자 : 연산의 대상이 되는 것 (변수, 메소드 등)
	연산자 : 데이터를 조작하기 위하여 이뤄지는 수식 계산
	       1) 산술 연산자 (Arithmetic01 클래스) : + - * % / (/ 연산시 큰 타입의 데이터로 형변환됨)
	       									% 연산자는 나머지를 구해주는 연산자임
	       2) 대입 연산자 (Assignment01 클래스) : x = 5 : x에 5라는 값을 대입시킴. (= 값을 할당/대입/지정하는 역할)
	       									x = x + 3; (현재 x의 값에 3을 더함, 누적)
	       									등가의 코딩은 x += 3; ('+='처럼 2개의 심벌로 만들어진 연산자 -> 복합 대입 연산자)
	       									복합 대입 연산자 (+=, *=, /=, %= 등등)
	       									
  - Day 02 -       									
	       									
	Assist Key 속성 : 키워드 몇 글자 입력 후 Ctrl+ Space를 누르면 자동으로 코드 기입이 가능함.
	 				  syso - System.out.println();
	 서식 (format) : 소수 둘째 자리까지 표시, 전체 몇 까지 표시, 마이너스는 빨간색으로 표시
	 서식 지정자 : %d : 정수, %f : 실수, %c : 문자 1개, %s : 문자열	
	 			  		 %f는 기본 값이 소수점 6자리까지 표시함.
	 			  		 %m.nf : 전체 m자리이고, 소수점은 n자리까지 표시 (단, m과 n은 정수)
	 printf() 메소드 : 출력시 서식을 지정하기 위한 메소드, 자체 엔터 기능은 없음.
	 형 변환 : (신자료형)구자료형변수
	 		 (double)i); // 정수 자료형을 실수 자료형으로 변환
   	 	     (int)d); // 실수 자료형을 정수 자료형으로 변환
	 아스키 코드 : 사용자가 입력한 문자를 컴퓨터는 숫자로 인식 함.
	 			A (65), a (97), 0 (48)
	 			(char)i; // 정수 65를 문자 A로 변경 
	 연산자 우선 순위 : 단항 > 산술 > 이항 > 관계 > 비트 > 논리 > 조건 > 대입
	               * 소괄호는 우선 순위를 변경 할 수 있음.
	 증감 연산자 (PlusMinus01 클래스) : 변수의 좌측 또는 우측에 ++(1씩 증가) 또는 --(1씩 감소)가 붙어 있는 연산자
	  							   변수의 좌측에 있는 항목이 가장 먼저 연산 됨.
	  							   변수의 우측에 있는 항목이 가장 나중에 연산 됨.
	  							   
	  							   ex) c = ++a + b++;
	  								   1) ++a --> a = a+1 = 10 + 1 = 11
	  								   2) c = a + b = 11 + 20 = 31
	  								   3) b++ --> b = b+1 = 20 + 1 = 21 
	 관계(비교) 연산자 (LogicalOperator 클래스) : 두개의 값을 일대일로 비교하는 연산자 
	                                       총 6개) > >= < <= ==(equal) !=(not equal)
	                                       연산의 결과가 진위형(true, false)이 됨.
	                                       제어문에 사용 됨. 
	 논리 연산자 : && (and 연산), || (or 연산), ! (부정)
	 논리 연산표 : 식1    식2    &&    ||   
	           false  false false false
	           false  true  false true
	           true   false false true
	           true   true  true  true
	           
	           값      부정
	           false  true
	           true   false
 	  
	  조건 연산자 : 형식) 조건식 ? 참일때 수행 : 거짓일때 수행
	             조건식 - 참 또는 거짓을 의미함.
	             3항 연산자라고 부름.
	             조건 연산자를 잘 하려면 관계, 산술, 논리를 잘 숙지 해야 함.
	  
				 x%2 == 0 // x가 짝수인가?
				 x%3 == 0 // x가 3의 배수인가?
				 y%x == 0 // y는 x의 약수인가?
				 x%3 == 0 || x%5 == 0 // x는 3의 배수이거나 5의 배수인가?
				 
	  캐스팅 (Casting) : 필요에 의하여 데이터의 유형을 일시적으로 바꾸는 것.
	  				   Type mismatch: cannot convert from double to int (형변환 예시 오류)
	  				   1) 암시적 캐스팅 : double d = 100; // 작은 범위(정수)의 타입이 큰 범위(실수) 타입으로 시스템이 알아서 변경
	  				   2) 명시적 캐스팅 : 큰 범위의 데이터 타입은 시스템이 알아서 처리하지 못함. // int i = (int)3.14;
	  				   				  (바뀔 타입)을 보통 캐스트 연산자라고 부름.
	  				                  소수점 데이터는 무조건 버려짐.
	  문자와 형변환 : 문자들은 아스키 코드로 바뀔 수 있음. A(65), a(97), 0(48)
	              문자 'A'를 입력하면 시스템이 65로 암시적 형변환됨.
	  아스키 코드의 특징 : 1) 문자 간의 뺄셈이 가능함. 'c' - 'a' = 2
	                  2) 비교 판단 가능. 'c' > 'a' = true
	                  3) 어떤 문자 ch가 소문자 인지, 아닌지. ch >= 'a' && ch <= 'z'        									
	       									
  - Day 03 -
  
  단축키 : Ctrl + F11 - 프로그램 실행 / Ctrl + Shift + F - 코드 정리
	제어문 : 선택문 + 반복문 + 기타 구문 (보조 제어문) 
	선택문 : 프로그램의 흐름을 조절/순서 변경을 수행하는 구문
	 	   if 구문, switch case 구문
	반복문 : 특정 구문을 반복적으로 수행하는 구문
	  	   for 구문, while 구문
	보조 제어문 : continue : 반복 구문에서 이후 실행 구문을 빠져 나가서 반복문의 처음으로 돌아감. 
	  	   	   break : 프로그램 루틴 중간에 강제로 빠져 나가기
	
	if 구문 : 1) 단순 if 구문 : 			 if(조건식) {
			 								'조건식'이 참이면 실행되는 영역
			 							 }
			 							 
			 2) 양자 택일 구문 (가장 보편적) : 동전 앞면/뒷면, 짝수와 홀수
			 							if(조건식) {
			 								'조건식'이 참이면 실행되는 영역
			 							}else {
			 								'조건식'이 거짓이면 실행되는 영역
			 							} 
			 							
			 3) 다중 택일 구문 : 학점 매기기, 주사위 던지기
			                           	if(조건식1) {
			 								'조건식'이 참이면 실행되는 영역
			 							else if(조건식2) {
			 								'조건식'이 참이면 실행되는 영역
			 							...
			 							}else{
			 								위의 어느 조건도 참이 아니면 실행되는 영역 (others)
			 							}
	
	switch case 구문 : 중간에 break를 하지 않으면 하단의 모든 코드가 실행 됨.
					  expr은 '식'으로써 정수나 문자열이 가능함.
	switch(expr) :    switch(식) {
					  case 식1:
					  	작업 명시
					    [break;]
					  case 식2:
					  	작업 명시
					    [break;]
					  ...
					  default:
					  	작업 명시 (어떤 것도 해당되지 않을 때)
					    [break;]	
	                  }
	
	if와 switch의 큰 차이점 : if (조건식) / switch (값 : 정수, 문자열)
						  일반적으로 유한개이면 switch가 더 좋음.
	
	for 반복문 : 1부터 100까지 반복 / 제어 변수 : 반복문이 실행될 때 마다 계속 바뀌는 변수로 일반적으로 i를 씀.
			   초기식 : int i = 1
			   조건식 : i <= 100 또는 i < 101
			   증감식 : i = i+1 또는 i+=1 또는 i++
			   
	for(초기식; 조건식; 증감식) {
		반복적으로 수행 할 부분
	}
	
	
  - Day 04 -	
  
	swap : 2개의 변수 값을 서로 맞바꾸는 기법;
	 
	 int sul = 6;
	 int su2 = 3;
	 int temp; (임시 변수)
	 
	 temp = su1;
	 su1 = su2;
	 su2 = temp;
	 
	 별 출력하기 
		star = 12
		*****
		*****
		**

		star = 8
		*****
		****
	
		1) 별 수를 의미하는 변수(star)를 정의 및 값을 대입함.
		2) 반복문을 이용하여 
		   초기식 : int i = 1;
		   조건식 : i <= star;
		   증감식 : i++
		   
		   만약 i가 5의 배수이면 엔터키를 누른다.
		   
		3) 단순한 엔터 기능은 println()를 사용하면 됨.
		   별 출력시 엔터키는 필요가 없으므로 print() 메소드를 사용해야 한다. 
		   
	
	위 문제에서 5의 배수마다 출력 했습니다.
	1줄에 n개씩 출력이 가능하도록 변형해 보세요.
	예시) n이 4이면 한줄에 4개씩 출력합니다.
	
	1부터 10까지의 홀수와 짝수의 총합 각각 구하기
	풀이 절차
	1) 홀수와 짝수의 총합을 저장할 변수(odd, even)를 각각 정의 및 0으로 대입한다.
	2) for 반복문을 이용하여
	   초기식 : int i = 1
	   조건식 : i < 11
	   증감식 : i++
	3) 만약 i가 짝수이면 even에 값을 누적합니다.
	   그렇지 않으면 odd에다 값을 누적합니다.
	4) 짝수 / 홀수의 총합을 출력합니다.    
	
	for 구문과 switch case 구문을 이용하여 다음 문제를 풀어 보세요.
	1부터 10까지의 정수 중에서 
	sum0 = 3 + 6 + 9 = 18
	sum1 = 1 + 4 + 7 + 10 = 22
	sum2 = 2 + 5 + 8 = 15
	가 나오도록 프로그래밍
	출력 결과
	sum0 : 18
	sum1 : 22
	sum2 : 15
	
	while 구문
	
	초기식; // 초기식은 while 외부에 작성;
	while(조건식) {
		// 여기에 수행 할 작업
		증감식;
	}
	
	무한 while 루프 : 반복 회수가 정해져 있지 않을 경우에 사용하는 무한 구문
				   반드시 무한 루프를 빠져 나가기 위한 코드를 작성해야 한다.
					while(true) {
						// 수행 할 작업
						if(조건식) {
							break;
						}
					}		
		
		
  - Day 05 - 
  
    중첩 for 구문 : 2개 이상의 for 구문을 중첩하여 사용하는 구문.
	특징 및 주의사항 : 
	 				  행(row) : 외부에 있는 for	
	 	 			  열(column) : 내부에 있는 for
	 	 			  
	 	 			  제어 변수는 통상적으로 i, j로 사용함.
	 	 			  i와 j를 혼동하여 사용하면 안됨.
	 
	 배열 : 동일한 타입의 데이터를 메모리에 연속적으로 나열해준 데이터.
	 	   배열의 3가지 요소 : 배열의 이름, 타입, 요소의 개수
	       배열의 선언 방법 (new 연산자) : 타입[] 배열이름 = new 타입[크기];
	 			         			int[] exam = new int[20];
	 			         			String[] soshi = new String[9];
	 	   배열의 선언 방법 (초기화 기법) : 타입[] 배열이름 = {값1, 값2, 값3 ...}
	 	   	         				String[] soshi = {"태연", "효연", "티파니"}; // 값이 정확히 정해져 있을 때 사용.
	 	   배열의 특징 : 	배열의 요소 번호는 0부터 시작
	 	   	         	요소를 접근하고자 할 때 대괄호를 사용함.
	 	   	         	요소 1개는 변수 1개와 동급 레벨임.
	 	   	         	요소의 개수는 배열이름.length라는 메소드를 사용하면 됨.
	 	   	         	** 자바에서 대괄호가 나오면 무조건 배열임.
	 	   배열의 장단점 : 	변수 1개로 표현이 되며, 반복문(for 구문)이 가능함.
	 					크기가 정해지고 나면 더 이상 수정이 불가능함. 
	 	   배열의 초기 값 : 일반 변수와는 다르게 배열은 타입마다 디폴트 초기 값이 존재함.
	 	   				byte, short, int, long : 0 
	 	   				float, doble : 0.0
	 	   				char (공백 문자), boolean (false)
	 	   				참고 자료형 (null) 	 
	 	   				
  - Day 06 -
   
  	 다차원 배열 : 대괄호의 개수가 2개 이상인 배열을 말함.
	 			예를 들어서, 대괄호가 2개이면 이차원 배열이라고 함.
	 			일반적인 개발 과정에서는 이차원 배열 정도까지 많이 사용함. 
	 			EX) int[][] arr = new int[2][3] // 2행 3열의 배열 선언 (new 연산자)
	 				arr[0][0] = 1;
	 				int x = arr[0][1] + arr[1][0]; // x = 2 + 4 = 6
	 				
	 				int[][] brr = {{1, 2, 3}, {4, 5}}; (초기화 기법)
	 				가장 외부의 중괄호는 초기화 기법을 위한 중괄호 입니다.
	 				내부에 들어 있는 중괄호는 하나의 행을 의미하는 중괄호 입니다.

	 			이차원 배열의 특징 : 중첩 for 구문을 사용할 수 있습니다.
	 							대괄호가 2개 사용되면 값을 의미하고, 1개이면 메모리 주소를 의미 합니다.
	 							행의 개수는 배열이름.length로 구할 수 있습니다.
	 							열의 개수는 배열이름[i].length로 구할 수 있습니다. (단, i는 행의 번호)
	 							
	 메소드 : 입력된 데이터를 가공/데이터 연산을 수행한 다음 결과물을 되돌려 주는 역할을 하는 소스코드 		
	 		자바에서는 함수라는 이름 대신 메소드라는 용어를 사용 합니다.
	 		메소드는 재사용성 (반복적이고 패턴이 동일한 코드에 대한 중복 지양)을 위하여 사용합니다.
	 		'매개 변수'란 메소드의 외부에서 메소드 내부로 넣어 주는 데이터를 의미 합니다.
	 		'매개 변수'는 인자, 인수, 파라미터 등의 용어로 사용이 됩니다.
	 		
	 		메소드의 3가지 요소 - 메소드 이름, 매개 변수, 반환 타입
	 		메소드의 작성법 - [public] [static] 반환타입 메소드이름([매개변수리스트]) {
	 							// 수행할 작업 명시
	 							[return 반환할 값;]
	 					 }
	 					 
	 					 * 2개 이상의 매개 변수는 콤마를 이용하여 열거합니다.
	 					 * 매개 변수는 필수 사항이 아니므로 명시하지 않을 경우 소괄호만 명시하면 됩니다.
	 					 * return이라는 구문은 메소드를 종료함을 의미하므로, return 구문 이후에 추가 코딩을 하면 안됩니다.
	 					 * 메소드가 값을 반환하지 않을 경우에는 키워드 void를 명시하면 됩니다.
	 					 * void는 no response, empty, vacant 등의 의미로 사용 됩니다.
	 				
	 		메소드의 가이드 라인 - 구현한 메소드를 사용하는 동작을 '호출'이라는 용어를 사용합니다.
	 						 실 매개 변수와 형식 매개 변수는 개수가 동일해야 하고, 타입도 동일해야 합니다. 
	 						 실 매개 변수와 형식 매개 변수의 이름은 서로 달라도 상관이 없습니다.
	 						 메소드의 위치는 반드시 클래스 내부에서만 가능 합니다.
	 						 메소드는 main 메소드와 동급 레벨에서 작성해야만 합니다.
	 						 변수는 소괄호가 없고, 메소드는 반드시 소괄호가 있습니다.
	 						 
	 클래스 : Math.max / min - 최대값, 최소값 구하는 메소드
	 		Math.signum - 양수이면 1, 음수이면 -1, 0이면 0을 출력해주는 메소드
	 		Math.sqrt - 루트(650)
	 	 	   					       																	
  - Day 07 -
  
  	클래스 : Math.abs - 절대 값 변경 / Math.random - 난수 생성 (0.0 <= Math.random() < 1.0)
	 											각 변에 (9-5)를 곱합니다.
	 											0.0 <= (9-5) * Math.random() < (9-5) * 1.0
	 											0.0 <= 4 * Math.random() < 4.0
	 											 
	 											각 변에 5를 더한다.
	 											5.0 <=  4* Math.random() + 5 < 9.0
	 											 
	 											정수형으로 캐스팅 한다.
	 											5.0 <= (int)(4* Math.random() + 5) < 9.0
	 											 
	 											3이상 8 미만의 임의의 난수
	 											3 <= (int)(5 * Math.random() + 3) < 8
	 											 
	 											a이상 b미만의 임의의 난수
	 											a <= (int)((b-a) * Math.random() + a) < b
	 		str.length() - 문자열의 길이
	 		str.charAt(2, 4) - 설정한 위치의 글자를 반환									 
	 
	 메소드 오버로딩 : Add (1, 2);
	 			  Add (3.0, 4.0);
	 			  Add (1, 2, 3);
	 			  
	 			  오버로딩이란 메소드의 이름은 동일하게 작성하되, 매개 변수의 개수나 타입을 다르게 정의하는 것을 말한다.
	 			  메소드 다중 정의라고 합니다.
	 			  해당 메소드로 바로 이동 (Ctrl + 클릭)
	 			  
  - Day 08 -
  
  통장 개설 프로그램 만들기 (김철수, 박영희)
		변수 : 은행 이름(문자열), 예금주(문자열), 계좌번호(숫자), 예치금(숫자)
		김철수 : soobank, sooname, soono, sodeposit 
		박영희 : heebank, heename, heeno, heedeposit 
		
		1. 변수 정의 및 값 할당하기
		2. 해당 변수들을 출력하거나 다른 메소드로 테이터를 넘깁니다.
		3. 위의 문제를 Class를 이용하여 다시 풀어 보세요.
		
		소프트웨어 모델링 : 데이터를 나타내고자 하는 경우, 변수를 갯수 및 데이터 유형을 어떻게 전개해나갈 것인가를 정하는 기법
					   이때 필요한 개념이 Class라는 개념입니다.
		
		객체 지향 프로그래밍(Object Oriented Programming)			   
			C++, 자바 등등
			
		객체 지향 프로그래밍 순서
		1. 클래스 정의(선언)
		2. 객체 생성
		3. 멤버 변수의 값 설정/지정
		4. 데이터 표현 및 연산에 사용하기 등등
		
		Account02.java : 실제 구현할 사용자 정의 클래스
		AccountMain02.java : main 메소드가 있는 클래스
		
		클래스(Class)
			사물의 특성들을 소프트웨어적으로 추상화시켜 모델링해 놓은 것을 말합니다.
			객체를 생성해내기 위한 일종의 템플릿 코드
			기존의 자료형들을 모아서 만드는 새로운 사용자 정의 자료형
		
		클래스의 구성 요소
			변수, 메소드, 생성자 등등
			
		클래스의 생성 방법
			[접근 지정자] class 클래스이름{
				변수들 정의
				메소드들 정의
				생성자들 정의
			}	
		
		객체(object)
			클래스로부터 만들어진 의미가 있는 구체적인 물체
			클래스를 실제 사용할 수 있도록 만들어진 물체(실체)
		
		* 생성자의 이름은 반드시 클래스의 이름과 동일합니다.
		
		객체 생성 방법
			클래스이름 객체이름 ;
			객체이름 = new 생성자이름();
			
			클래스이름 객체이름 = new 생성자이름();
		
		멤버 참조 연산자 : dot(.)
		멤버 변수의 값 설정/지정
			soo.name = "김철수"; // write
			출력(hee.name) ; // read
		
		static 변수/메소드
			모든 객체(인스턴스)가 공유하기 위하여 사용하는 변수/메소드를 말합니다.
			
		자바에서 지원하는 클래스 중에서 대표적인 클래스가 Math 클래스 입니다.
		
		static 특징
			클래스 이름으로 접근이 가능하므로 클래스 변수/메소드라고 합니다.
			main 메소드보다 먼저 메모리에 로딩됩니다.
			초기 값은 인스턴스 변수의 특징과 동일합니다.
			
		통장 2개를 배열로 표현하기
			사람 여러 명에 대한 정보는 배열을 이용하는 것이 편리합니다.
		
		배열 선언
			// 통장 2개를 위한 배열 account를 선언하세요.
			Account02[] account = new Account02[2];
		
		배열과 관련된 객체 생성은 for 구문을 사용하면 됩니다.
			for 구문
				account[i] = new Account02();
				
		AccountMain02_2 클래스		
				
		** 변수에 대한 실습
		Variable.java
		VariableMain.java
		
					지역변수				인스턴스 변수				static 변수
	생성위치			메소드 내부				클래스 내부/메소드 외부에 생성				
	생성시점			메소드 호출시			객체 생성시					main 메소드 호출 이전에 생성 
	기본 값			존재하지 않음			타입별로 존재				타입별로 존재
	초기화 필요성		반드시 필요				경우에 따라서 초기화 필요함
	static 키워드		필요 없음				필요 없음					필요함
	this 키워드		사용 불가				사용 가능					사용 불가	
	멤버 변수			X					O						X 
	목적				메소드 내에서 국소적 사용 	객체가 가지는 어떠한 정보를 저장	모든 객체가 공유
	기타 				매개변수도 지역변수 이다.	non-static 변수			정적변수=클래스변수
	 
	다음 내용은 어떠한 변수로 적당한가요?
	홍길동님의 통장 비밀 번호 : 인스턴스 변수
	동일한 반의 학생들의 담임 선생님 이름 : static 변수
	2개의 메소드에서 공통으로 참조하기 위한 평균(average)이라는 변수 : 인스턴스 변수
	데이터를 임시로 저장하기 위한 변수 : 지역 변수
	
	final 키워드
		불변의 진리 또는 변할 수 없는(수정 불가능한) 값을 지정할 때 사용합니다.
		constant(상수)라고 합니다.
		예시) 원주율 pi = 3.141592	 			  

  - Day 09 -
  
  static 메소드
 	객체와 상관없이 호출될 수 있는 메소드 입니다.
 	static 키워드를 사용합니다.
 	클래스 이름으로 접근이 가능합니다.
 	
 	인스턴스 메소드
 	반드시 객체가 생성이 되어야만 접근이 가능한 메소드 입니다.
 	this 참조 변수 사용이 가능합니다.
 	
 	static 메소드의 특징
 	참조하는			참조되는			특징
 	static 메소드		인스턴스 변수		반드시 객체를 이용하여 .연산자로 접근해야 합니다.	
 					static 변수		static이므로 바로 참조가 가능합니다.
 					static 메소드		static이므로 바로 참조가 가능합니다.
 					인스턴스 메소드		반드시 객체를 이용하여 .연산자로 접근해야 합니다.
 		
 	Math 클래스 
 	수학과 관련된 기능들을 가지고 있는 클래스
 	모든 변수는 static final이라는 키워드가 붙어 있습니다.
 	모든 메소드는 static이라는 키워드가 붙어 있습니다.
 	생성자가 존재하지 않습니다. 	
 	
 	** 접근 지정자(access modifier)는 변수 및 메소드의 접근 범위를 [어디까지 허용할 것인가]를 나타내는 척도 입니다.
 	접근 제어자 또는 접근 제한자라고도 합니다.
 	
 	예시) SNS의 게시글 비공개/공개, 내 통장 비밀번호의 비공개
 	
 	지정 방법
 	변수나 메소드에 다음과 같은 키워드를 사용하면 됩니다.
 	키워드들은 상호 배타적 입니다.
 	private(비공개), 기본(동일 패키지에만 공개), public(공개)
 	'기본'은 default를 말합니다.
 	
	 						private 	기본 		public
	 동일 클래스				가능			가능		가능
	 동일 패키지의 모든 클래스		불가능		가능		가능
	 다른 패키지에 모든 클래스		불가능		불가능	가능
 	
 	private 변수는 직접 변경이 불가능하므로 데이터를 외부에 숨기는 개념입니다.	
 	이러한 용어를 캡슐화라고 합니다.
 	
 	이러한 변수들은 직접 접근이 안되므로, 다른 동작으로 간접 접근해야 합니다.	
 	우리는 입금과 인출이라는 동작으로 값을 바꿔 보도록 합니다.	
 		
 	getter와 setter
 	private 변수는 직접 변경이 불가능 합니다.
 	하지만 경우에 따라서는 간접적인 방법으로 읽거나 쓸 수 있도록 public한 메소드를 제공할 수 있도록 권장합니다.	
 	
 	getter
 	비공개 변수의 값을 읽어 내기 위한 공개 메소드
 	
 	setter
 	비공개 변수의 값을 쓰기 위한 공개 메소드 	
 	
	 		
	 				getter 							setter	
	이름				get + 해당 변수의 첫글자만 대문자		set + 해당 변수의 첫글자만 대문자
	반환타입			해당 변수의 타입						void
	매개변수			없음								1개인데 해당 변수의 타입과 동일	 		
 		
 	this 키워드
 	객체 내에서 자기 자신을 지칭하는 특수한 레퍼런스 변수입니다.
 	객체 생성시 자동으로 생성이 됩니다.	
 	
 	this 용도
 	인스턴스 변수나 메소드임을 강조하기 위하여 사용합니다.
 	매개 변수와 이름이 동일할 때 구분하기 위하여 사용합니다.
 	멤버 메소드를 호출시에도 사용 합니다.
 	this.변수
 	this.메소드()	
 	this();는 생성자를 호출하는 구문입니다.	
 
  - Day 10 - 
  
  	 생성자
	 객체가 heap에 생성된 다음 자바 시스템에 의하여 자동으로 1번만 호출되는 특수한 메소드
	 
	 기본 생성자
	 개발자의 눈에 보이지 않고, 매개 변수가 0개인 생성자를 의미한다.
	 
	 생성자의 목적
	 인스턴스 변수의 값을 초기화 할 용도로 사용 됨.
	 생성되자 마자 무엇인가를 구현하고자 할때 사용 됨.
	 
	 생성자의 특징
	 생성자 오버로딩 
	 생성자는 개발자가 직접 정의할 수 있습니다.
	 개발자가 직접 정의하게 되면 눈에 보이지 않던 생성자는 사라집니다.
	 반환되지 않고 상속되지 않습니다.
	 
	 생성자의 작성 방법
	 이름 : 클래스의 이름과 반드시 동일해야 합니다.
	 매개변수 : 개발자가 임의로 지정하면 됩니다.
	 반환타입 : 명시하지 않음.  
	 
  - Day 12 -
  
  패키지 
	 	유사한 여러 개의 참조 자료형(클래스, 인터페이스, 예외 등)들을 묶어 놓은 폴더의 개념
	 
	 패키지 선언
		 주석문을 제외하고 반드시 소스의 첫 줄에 와야 합니다.
		 단, 기본 패키지는 package 구문을 사용하지 않습니다.
		 package 패키지이름;
	 
	 dot 키워드
	 	.기호는 운영 체제 내에서 폴더 구분자를 의미합니다.
	 
	 import 키워드
		 특정 패키지 내의 클래스를 사용하고자 할 때 사용하는 구문입니다.
		 import 패키지경로.클래스이름;
		 *은 all classes를 의미합니다.
		 java.lang 패키지는 암시적으로 import 됩니다. 
		 단축키 : Ctrl + Shift + O(영문)
		 
	 레퍼런스 사이트
		 https://docs.oracle.com/en/java/javase/12/docs/api/index.html
		 Ctrl + F (찾기 기능)
	 
		 Constructor : 생성자
		 Flelds : 변수
		 Method : 메소드
	 
	 상속(Inheritance)
	 
	 super 키워드
	 	상속을 해주는 수퍼 클래스를 지칭하는 키워드
	 	super.변수
	 	super.메소드
	 	super() : 매개 변수가 없는 생성자
	 	super(int) : 정수 1개를 매개 변수로 하는 생성자
	 	
	 	서브 클래스의 모든 생성자에는 첫 줄에 암시적으로 super(); 구문이 숨어있음. 
	 	만약 개발자가 명시적으로 구현하면 super(); 구문은 이제 사라집니다.
	 	
	 서브가 수퍼 변수에 접근하는 여러가지 방법
	 	1. 접근 지정자를 해제하는 방법 (이 방법은 많이 쓰이지 않음)
	 	2. getter()을 사용하는 방법
	 	3. 생성자 호출을 사용하는 방법
	 	
	 상속과 생성자 간의 관계
	 	수퍼 클래스의 생성자가 먼저 호출이 됩니다.
	 	
	 오버라이딩
	 	수퍼 클래스에서 정의한 메소드의 이름을 그대로 사용하되,
	 	서브의 기준에 맞게 다시 정의하는 것을 의미합니다.
	 	수퍼와 서브의 시그니처(이름, 매개변수, 반환 타입)는 동일해야 합니다.
	 	

	 메소드 은닉화
	 	오버라이딩 하게 되면 수퍼의 메소드가 본의아니게 숨겨지는 현상 	 
         	
         									
  - Day 13 -   
      									
  Object 클래스
  	자바의 클래스 계층도에서 최상위에 있는 클래스
  	
  사용자들의 원활한 코딩을 위하여 미리 구현한 메소드들이 있습니다.
  	hashCode() : 객체 식별을 위하여 만들어 놓은 고유한 정수 값을 의미 합니다.
  	getClass() : 패키지 경로 + 클래스 이름
  	toString() : 객체에 대한 정보를 문자열로 출력해줍니다.
  		getClass() + "@" + hashCode()의 16진수 값
  	
  	** 객체 이름을 출력한다는 것은 암시적으로 toString()메소드를 호출하는 것입니다.
  	toString() 메소드는 개발자가 필요에 의해서 많이 오버라이딩 합니다.
  	
  레퍼런스 형변환
	  RefCasting(수퍼)
	  Book(책_서브)
	  Sawon(사원_서브)
	  RefMain(메인 클래스)
  
  instanceof 연산자
  	특정 객체가 어떠한 클래스로 생성된 것인지를 확인하기 위한 연산자 입니다.
  	연산 결과의 반환 타입은 true 또는, false 입니다.
  	따라서, if 구문에 사용될 수 있습니다.	
  	
  	예시) obj instanceof book
  		객체 obj는 Book 클래스로 만들어진 인스턴스 입니까? 
  	
  승급(UpCasting)
  		암시적 형변환이 이루어 집니다.
  		수퍼클래스이름 객체이름 = new 서브클래스에 대한 생성자();
  		
  강등(DownCasting)
  		반드시 명시적 형변환을 사용해야 합니다.
  		서브클래스이름 객체이름 = (서브클래스이름)수퍼클래스로 생성된 객체;
  		Book mybook = (Book)obj;
  	
  레퍼런스 형변환 사용처
  		컬렉션 처리시 사용됩니다.
  		파일 입출력에 사용됩니다.
  		웹 프로그래밍(jsp) : 회원 가입, 정보 수정 등등
  		스마트폰 개발(안드로이드에는 버튼, 체크박스 등을 object 처리 후 형 변환)
  		
  승급시 변수와 메소드의 접근 범위	
  	항목			수퍼			서브			설명
  	변수			접근 가능		접근	불가능	수퍼 클래스 내의 변수에만 접근이 가능 합니다.
  										서브 클래스 내의 변수는 일시적으로 접근이 불가능 합니다.
  										강등이 이루어 지면 접근이 가능합니다.
  	메소드		있음			없음			어떤 메소드가 수퍼에만 존재하는 경우
  										상속을 받고 있으므로, 수퍼 클래스의 메소드가 실행이 됩니다.
  	메소드		없음			있음			강등을 통해서만 접근이 가능합니다.								
  	오버라이딩		있음			있음			서브 클래스의 메소드가 우선적으로 실행이 됩니다.
  										수퍼 클래스의 메소드는 본의 아니게 숨겨 지는데 이것을 메소드 은닉화 현상이라고 합니다.
  										수퍼의 메소드는 super.메소드이름()으로 명시적 호출할 수 있습니다.
  		
  형 변환 실습	
  	Ref01(메인), Dog(서브), Cat(서브), Animal(수퍼)
  		
  */
}
