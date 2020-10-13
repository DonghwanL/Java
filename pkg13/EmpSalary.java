package pkg13;

public class EmpSalary {

	public static void main(String[] args) {
		System.out.println("대표 이사 이름 : " + Employee.ceoname);
		
		Employee hong = new Employee("홍길동", 10000, "영업");
		hong.Display();
		
		Employee hee = new Employee("박영희", 10000, "구매");
		hee.Display();
		
		Employee kim = new Employee("김철수", "구매");
		kim.Display();
		
		System.out.println(hong.hashCode());
		System.out.println(hee.hashCode());
		System.out.println(kim.hashCode());
		
		System.out.println(hong.getClass());
		System.out.println(hong.toString());
		System.out.println(hong);

	}

}
