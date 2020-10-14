package nopolymorphism;

public class Person { 
	private String name; // ����
	private Tico tico; // ������ ���� Ƽ��
	private Spark spark; // ������ ���� ����ũ
	private Cube cube; // ������ ���� ť��
	
	public Person(String name) {
		this.name = name;
	}
	
	public void ride(Tico tico) {
		this.tico = tico;
		
		System.out.println("���� : " + this.name);
		
		// ���������� �״�� ���
//		System.out.println("���� : " + tico.getPrice() + "��");
//		System.out.println("���� : " + tico.getName() + " �ý�");
//		System.out.println("�ڸ�Ʈ : " + tico.getComment());
		
		// �ν��Ͻ� ������ ��Ҵٰ� ����ϱ�
		System.out.println("���� : " + this.tico.getPrice() + "��");
		System.out.println("���� : " + this.tico.getName() + " �ý�");
		System.out.println("�ڸ�Ʈ : " + this.tico.getComment());
	}

	public void ride(Spark spark) {
		this.spark = spark;
		
		System.out.println("���� : " + this.name);
		System.out.println("���� : " + this.spark.getPrice() + "��");
		System.out.println("���� : " + this.spark.getName() + " �ý�");
		System.out.println("������ : " + this.spark.getMaker());
	}

	public void ride(Cube cube) {
		this.cube = cube;
		
		System.out.println("���� : " + this.name);
		System.out.println("���� : " + this.cube.getPrice() + "��");
		System.out.println("���� : " + this.cube.getName() + " �ý�");
		System.out.println("���� : " + this.cube.getFuelEfficiency());
	}
	
}
