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
	
	private Map<String, String> mgender = null; // ���� ���� Map ��ü
	private Map<String, String> mreligion = null; // ���� ���� Map ��ü
	private Properties prop_marriage = null; // ��ȥ ���� Map ��ü
	private Properties area = null; // ���� ���� Map ��ü 
	private Properties prop_job = null; // ���� �ڵ� ���� Map ��ü 
	
	private String FILE_MARRIAGE = "c:\\imsi\\marriage.txt";
	private String FILE_AREA = "c:\\imsi\\code.txt";
	private String FILE_CODE = "c:\\imsi\\�����������ڵ�.csv";
	
	public Processing() { // �ʿ��� ��ü�� ����
		mgender = new HashMap<String, String>();
		mgender.put("1", "����");
		mgender.put("2", "����");
		
		mreligion = new HashMap<String, String>();
		mreligion.put("1", "����");
		mreligion.put("2", "����");
		
		prop_marriage = new Properties();
		area = new Properties();
		prop_job = new Properties();
		
		try {
			prop_marriage.load(new FileReader(new File(FILE_MARRIAGE)));
			prop_job.load(new FileReader(new File(FILE_CODE)));
			area.load(new FileReader(new File(FILE_AREA)));
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();
		}
	}

	public String makeStr(String data) {
		String check = "name,";
		if (data.indexOf(check) == 0) { // 1��° ���� column header
			String ret = "name,gender,age,ageg,marriage,religion,income,job,area";
			return ret;
		}
		
		String[] arr = data.split(COMMA);
		
		String name = arr[0]; // �̸�
		String gender = arr[1]; // ����
		
		int birth = Integer.parseInt(arr[2]); // �������
		int age = THISYEAR - birth + 1;
		
		String ageg = ""; // ���ɴ�
		
		if (age >= 60) {
			ageg = "���";
		} else if (age <= 30) {	
			ageg = "�߳�";	
		} else {
			ageg = "û��";
		}
		
		String marriage = arr[3]; // ��ȥ ����
		String religion = arr[4]; // ���� ����
		String code_job = arr[5]; // ���� �ڵ�
		String income = arr[6]; // �ҵ�
		String code_religion = arr[7]; // �ǿ�
		

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
