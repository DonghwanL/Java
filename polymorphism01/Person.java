package polymorphism01;

public class Person {
	private String name ; //�̸�
	private int age ;//����
	private String address ; //�ּ�
	private String phone ; //��ȭ ��ȣ
	private int type ; // ����(1), ������(2), �л�(3)
	
	@Override
	public String toString() {
		String imsi = "" ;
		imsi += "�̸� : " + this.name + "\n" ;
		imsi += "���� : " + this.age + "\n" ;
		imsi += "�ּ� : " + this.address + "\n" ;
		imsi += "��ȭ ��ȣ : " + this.phone + "\n" ;
		
		String mytype = "" ;
		if (this.type == 1) {
			mytype = "����" ;
		}else if (this.type == 2) {
			mytype = "������" ;
		} else {
			mytype = "�л�" ;
		}
		
		imsi += "Ÿ�� : " + mytype + "\n" ;
		return imsi;
	}

	public Person() {}	
	public Person(String name, int age, String address, String phone, int type) {
		this.name = name ;
		this.age = age ;
		this.address = address ;
		this.phone = phone ;
		this.type = type ;		
	}

}
