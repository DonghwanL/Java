package Travel;

import java.util.HashMap;
import java.util.Map;

public class TProcessing {
	private final String comma = ",";
	private Map<String, String> mgender = null; // 성별 관련 Map 객체
	private Map<String, String> mgrade = null; // 등급 관련 Map 객체
	
	public TProcessing() {
		mgender = new HashMap<String, String>();
		mgender.put("1", "남성");
		mgender.put("2", "여성");
		
		mgrade = new HashMap<String, String>();
		mgrade.put("1", "VIP");
		mgrade.put("2", "우수");
		mgrade.put("3", "일반");
	}
	
	public String Template(String data) {
		// 데이터의 출력을 위한 기본 메소드
		
		String[] arr = data.split(comma);
		
		String name = arr[0]; // 이름
		String gender = arr[1]; // 성별
		int age = Integer.parseInt(arr[2]); // 나이
		String tplace = arr[3]; // 지역
		int price = Integer.parseInt(arr[4]); // 금액
		String grade = arr[5]; // 등급
		String bstate = arr[6]; // 예약 상태
		String bdate = arr[7]; // 예약 일자
		
		String temp = name + comma;
		temp += mgender.get(gender) + comma;
		temp += age + comma;
		temp += tplace + comma;
		temp += price + comma;
		temp += mgrade.get(grade) + comma;
		temp += bstate + comma;
		temp += bdate;
		
		return temp;
	}

}
