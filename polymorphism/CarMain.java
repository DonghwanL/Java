package polymorphism;

public class CarMain {

	public static void main(String[] args) {
		Person soo = new Person("김철수");
		
		Car[] carlist = new Car[3]; // 배열 정의
		
		// 승급에 의한 객체 생성
		carlist[0] = new Tico("뉴 티코", 400, "단종");
		carlist[1] = new Spark("뉴 스파크", 500, "현대");
		carlist[2] = new Cube("뉴 큐브", 600, 12.3);
		
		System.out.println("=========================");
		for (int i = 0; i < carlist.length; i++) {
			soo.ride(carlist[i]);
			System.out.println();
		}
		
		
		System.out.println("=========================");
		Car[] cararray = 
			{
				new Tico("뉴 티코", 700, "추억의 명차"),
				new Spark("뉴 스파크2", 800, "삼성"),
				new Cube("뉴 큐브", 900, 12.3)
			};
		
		for (int i = 0; i < cararray.length; i++) {
			soo.ride(cararray[i]);
			System.out.println();
		}
	}

}
