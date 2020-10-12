package pkg10;

public class Saram03 {
	private String name;
	private String hobby;
	private String blood;
	private double height;
	private double weight;
	
	public Saram03() {
		this.name = "±èÃ¶¼ö";
		this.hobby = "¿µÈ­ °¨»ó";
		this.blood = "AB";
		this.height = 175.2;
		this.weight = 71.3;
	}
	
	public Saram03(String name, double height, double weight, String hobby, String blood) {
		this.name = name;
		this.hobby = hobby;
		this.blood = blood;
		this.height = height;
		this.weight = weight;
	}
	
	public void Display() {
		System.out.println("ÀÌ¸§ : " + this.name);
		System.out.println("Ãë¹Ì : " + this.hobby);
		System.out.println("Ç÷¾×Çü : " + this.blood);
		System.out.println("Å° : " + this.height);
		System.out.println("¸ö¹«°Ô : " + this.weight);
		System.out.println();
	}

}

