package pkg08;
public class Car01 {
	static String country = "Germany";
	
	private String name;
	private String fuel;
	private int price;
	private double efficiency;
	
	public String getName() {
		return name;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String _fuel) {
		fuel = _fuel;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int _price) {
		price = _price;
	}
	
	public double getEfficiency() {
		return efficiency;
	}
	
	public void setEfficiency(double _efficiency) {
		efficiency = _efficiency;
	}
	
	
	void Display() {
		System.out.println("제조국 : " + country);
		System.out.println("이름 : " + name);
		System.out.println("연료 : " + fuel);
		System.out.println("연비 : " + efficiency + "km/L");
		System.out.println("가격 : " + price + "만원");
	}

	
}
