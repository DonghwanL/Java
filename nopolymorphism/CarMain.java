package nopolymorphism;

public class CarMain {

	public static void main(String[] args) {
		Person soo = new Person("김철수");
		
		Tico tico = new Tico("티코", 100, "작습니다.");
		soo.ride(tico);
		System.out.println("===========================");
		
		Person hee = new Person("박영희");
		Spark spark = new Spark("스파크", 200, "GM 대우");
		hee.ride(spark);
		System.out.println("===========================");
		
		Person minsik = new Person("최민식");
		// 일회용 객체 생성
		minsik.ride(new Cube("큐브", 300, 24.1)); 
		System.out.println("===========================");

	}

}
