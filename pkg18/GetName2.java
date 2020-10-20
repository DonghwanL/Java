package pkg18;
public class GetName2 {

	public static void main(String[] args) {
		final String what = "강호동";
		String str = "강호동강호동유재석김철수강호동";
		
		System.out.println("문자열 원본 : " + str);
		
		// 1. 카운터 변수(cnt)를 선언하고 초기화
		// 찾고자 하는 단어가 발견된 위치(idx) 변수를 정의 및 초기화
		// 찾고자 하는 단어의 길이에 대한 변수를 정의 및 초기화
		int cnt = 0;
		int idx = 0;
		int len = what.length();
		
		// 2. 무한 루프 While 반복문을 사용하여 찾을 단어를 검색 합니다. (indexOf() 메소드)
		// 3. 단어가 발견 되었다면 카운트 변수를 1 더해 줍니다.
		// 4. 단어가 발견 되지 않으면 break 구문으로 빠져 나갑니다. 
		// 5. 발견된 문자열은 잘라서 없애 버립니다. (substring() 메소드)
		
		while(true) { 
			idx = str.indexOf(what); 
			if (idx == -1) { // indextOf로 검색시 없으면 -1 번환
				System.out.println("더 이상 존재하지 않습니다.");
				break;	
			} else {
				str = str.substring(idx + len);
				System.out.println(str);
				cnt++;
			}
		}
		
		System.out.println("문자열 \'" + what + "\'은 " + cnt + "번 발견되었습니다.");
		
		
	}

}
