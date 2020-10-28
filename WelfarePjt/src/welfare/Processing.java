package welfare;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Processing {
	private final String COMMA = ",";
	private final int THISYEAR = 2020;
	
	private Map<String, String> mgender = null; // 성별 관련 Map 객체
	private Map<String, String> mreligion = null; // 종교 관련 Map 객체
	private Properties prop_marriage = null; // 결혼 관련 Map 객체
	private Properties area = null; // 지역 관련 Map 객체 
	private Properties prop_job = null; // 직업 코드 관련 Map 객체 
	
	private String FILE_MARRIAGE = "c:\\imsi\\marriage.txt";
	private String FILE_AREA = "c:\\imsi\\code.txt";
	private String FILE_CODE = "c:\\imsi\\복지데이터코드.csv";
	
	public Processing() { // 필요한 객체를 생성
		mgender = new HashMap<String, String>();
		mgender.put("1", "남성");
		mgender.put("2", "여성");
		
		mreligion = new HashMap<String, String>();
		mreligion.put("1", "있음");
		mreligion.put("2", "없음");
		
		prop_marriage = new Properties();
		area = new Properties();
		prop_job = new Properties();
		
		try {
			prop_marriage.load(new FileReader(new File(FILE_MARRIAGE)));
			prop_job.load(new FileReader(new File(FILE_CODE)));
			area.load(new FileReader(new File(FILE_AREA)));
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
			e.printStackTrace();
		}
	}

	public String makeStr(String data) {
		String check = "name,";
		if (data.indexOf(check) == 0) { // 1번째 줄은 column header
			String ret = "name,gender,age,ageg,marriage,religion,income,job,area";
			return ret;
		}
		
		String[] arr = data.split(COMMA);
		
		String name = arr[0]; // 이름
		String gender = arr[1]; // 성별
		
		int birth = Integer.parseInt(arr[2]); // 생년월일
		int age = THISYEAR - birth + 1;
		
		String ageg = ""; // 연령대
		
		if (age >= 60) {
			ageg = "노년";
		} else if (age <= 30) {	
			ageg = "중년";	
		} else {
			ageg = "청년";
		}
		
		String marriage = arr[3]; // 결혼 여부
		String religion = arr[4]; // 종교 유무
		String code_job = arr[5]; // 직업 코드
		String income = arr[6]; // 소득
		String code_religion = arr[7]; // 권역
		

		String imsi = name + COMMA;
		imsi += mgender.get(gender) + COMMA;
		imsi += age + COMMA;
		imsi += ageg + COMMA;
		imsi += prop_marriage.getProperty(marriage) + COMMA;
		imsi += mreligion.get(religion) + COMMA;
		imsi += income + COMMA;
		imsi += prop_job.getProperty(code_job) + COMMA;
		imsi += area.getProperty(code_religion) + COMMA;

		return imsi;
	}
	
}
