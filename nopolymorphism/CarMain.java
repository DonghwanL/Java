package nopolymorphism;

public class CarMain {

	public static void main(String[] args) {
		Person soo = new Person("��ö��");
		
		Tico tico = new Tico("Ƽ��", 100, "�۽��ϴ�.");
		soo.ride(tico);
		System.out.println("===========================");
		
		Person hee = new Person("�ڿ���");
		Spark spark = new Spark("����ũ", 200, "GM ���");
		hee.ride(spark);
		System.out.println("===========================");
		
		Person minsik = new Person("�ֹν�");
		// ��ȸ�� ��ü ����
		minsik.ride(new Cube("ť��", 300, 24.1)); 
		System.out.println("===========================");

	}

}
