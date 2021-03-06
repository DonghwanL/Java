package pkg03;

public class note {
	
	/*
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
	
	
	
	
	
	 
	*/
}
