package polymorphism;

public class Person extends Car{
	private String name; 
	private Car car; // 차 한대
	
	public Person(String name) {
		this.name = name;
	}

	public void ride(Car car) {
		this.car = car;
		
		System.out.println("차주 : " + this.name);
		System.out.println("가격 : " + this.car.getPrice());
		System.out.println("차량 : " + this.car.getName() + " 시승");
		
		if (car instanceof Tico) {
			Tico mytico = (Tico)car;
			System.out.println("코멘트 : " + mytico.getComment());
		} else if (car instanceof Spark) {
			Spark myspark = (Spark)car;
			System.out.println("제조사 : " + myspark.getMaker());
		} else if (car instanceof Cube) {
			Cube mycube = (Cube)car;
			System.out.println("연비 : " + mycube.getFuelEfficiency());
		}
	}
}
