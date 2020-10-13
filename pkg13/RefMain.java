package pkg13;

public class RefMain {

	public static void main(String[] args) {
		// 이전 방식
		Book java = new Book("자바", 100);
		Sawon kim = new Sawon("김철수", "영업");
		
		// 레퍼런스 형변환 (승급)
		RefCasting ref01 = new Book("JSP", 200);
		RefCasting ref02 = new Sawon("박영희", "판매");
		
		Display(ref01); // 책
		Display(ref02); // 사원

	}
	
	// 매개 변수 obj는 보편적이고 두루뭉실하게 적용할 수 있는 이름으로 사용 권장.
	private static void Display(RefCasting obj) {
//		System.out.println(obj);
		if (obj instanceof Book) {
			System.out.println("책 입니다.");
			
			Book mybook = (Book)obj; // 강등 (오리지널 원래 타입으로 만들기 위해 명시적 형변환이 필요함)
			System.out.println("책 이름 : " + mybook.getName());
			System.out.println("단가 : " + mybook.getPrice());
			
		} else if (obj instanceof Sawon) {
			System.out.println("사원 입니다.");
			
			Sawon sawon01 = (Sawon)obj; // 강등
			System.out.println("사원 이름 : " + sawon01.getName());
			System.out.println("부서명 : " + sawon01.getDepartment());
			
			
		} else {
			System.out.println("다릅니다.");
		}
	}

}
