package pkg02;

public class ArithmeticOperator {

	
	public static void main(String[] args) {
        int TIME = 4000; // 상수 선언
        int second, minute, hour;
       
        // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간을 의미
        hour = TIME / 3600;	// 1
        
        // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간을 의미
        minute = (TIME - hour * 3600) / 60;
        
        second = TIME % 60; // 60으로 나눈 나머지는 초를 의미
       
        System.out.println("초 : " + second);
        System.out.println("분 : " + minute);
        System.out.println("시간 : " + hour);
             
        // 4000초는 1시간, 6분, 40초입니다.
        // 산술 연산자로 시각 구하기 : 4000초를 시간, 분, 초를 구하여 출력해주는 프로그램을 작성하세요.
        
	}

}
