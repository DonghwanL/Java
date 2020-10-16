package enumtest;

public class EnumTest {

	public static void main(String[] args) {
		Shoes shoe1 = new Shoes("³ªÀÌÅ°", 235, ShoesType.RUNNING);
		shoe1.Display();
		
		int[] arr = {10, 20};
		for(int item : arr) {
			System.out.println(item);
		}
		
		ShoesType[] mylist = ShoesType.values();
		for(ShoesType item : mylist) {
			System.out.println(item);
			System.out.println(item.ordinal());
		}
	}

}
