package Travel;

import java.util.HashMap;
import java.util.Map;

public class TProcessing {
	private final String comma = ",";
	private Map<String, String> mgender = null; // ���� ���� Map ��ü
	private Map<String, String> mgrade = null; // ��� ���� Map ��ü
	
	public TProcessing() {
		mgender = new HashMap<String, String>();
		mgender.put("1", "����");
		mgender.put("2", "����");
		
		mgrade = new HashMap<String, String>();
		mgrade.put("1", "VIP");
		mgrade.put("2", "���");
		mgrade.put("3", "�Ϲ�");
	}
	
	public String Template(String data) {
		// �������� ����� ���� �⺻ �޼ҵ�
		
		String[] arr = data.split(comma);
		
		String name = arr[0]; // �̸�
		String gender = arr[1]; // ����
		int age = Integer.parseInt(arr[2]); // ����
		String tplace = arr[3]; // ����
		int price = Integer.parseInt(arr[4]); // �ݾ�
		String grade = arr[5]; // ���
		String bstate = arr[6]; // ���� ����
		String bdate = arr[7]; // ���� ����
		
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
