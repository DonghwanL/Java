package polymorphism;

public class Person extends Car{
	private String name; 
	private Car car; // �� �Ѵ�
	
	public Person(String name) {
		this.name = name;
	}

	public void ride(Car car) {
		this.car = car;
		
		System.out.println("���� : " + this.name);
		System.out.println("���� : " + this.car.getPrice());
		System.out.println("���� : " + this.car.getName() + " �ý�");
		
		if (car instanceof Tico) {
			Tico mytico = (Tico)car;
			System.out.println("�ڸ�Ʈ : " + mytico.getComment());
		} else if (car instanceof Spark) {
			Spark myspark = (Spark)car;
			System.out.println("������ : " + myspark.getMaker());
		} else if (car instanceof Cube) {
			Cube mycube = (Cube)car;
			System.out.println("���� : " + mycube.getFuelEfficiency());
		}
	}
}
