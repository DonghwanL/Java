package pkg08;
public class CarMain01 {

	public static void main(String[] args) {
		Car01 bmw5;
		bmw5 = new Car01();
		
		bmw5.setName("BMW 520i");
		bmw5.setFuel("���ָ�");
		bmw5.setPrice(6330);
		bmw5.setEfficiency(10.9);
		bmw5.Display();
		System.out.println();
		
		Car01 bmw3;
		bmw3 = new Car01();
		
		bmw3.setName("BMW 320D");
		bmw3.setFuel("����");
		bmw3.setPrice(5300);
		bmw3.setEfficiency(14.3);
		bmw3.Display();
		
		System.out.println();
		
//		System.out.println("�迭 �̿��Ͽ� �ۼ�");
//		Car01[] bmw = new Car01[2];
//		
//		for (int i = 0; i < bmw.length; i++) {
//			bmw[i] = new Car01();
//		}
//		
//		bmw[0].getMame = "BMW 520i";
//		bmw[0].fuel = "���ָ�";
//		bmw[0].price = 6330;
//		bmw[0].efficiency = 10.9;
//		bmw[0].Display();
//		System.out.println();
//		
//		bmw[1].name = "BMW 320D";
//		bmw[1].fuel = "����";
//		bmw[1].price = 5300;
//		bmw[1].efficiency = 14.3;
//		bmw[1].Display();
//		
//		for (int i = 0; i < bmw.length; i++) {
//			bmw[i].Display();
		}
	}
