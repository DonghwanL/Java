package pkg09;

public class SaramMain02 {

	public static void main(String[] args) {
		// Saram02 클래스에 대한 객제 생성 후
		// getter, setter를 사용하여 프로그래밍
		
		Saram02 soo = new Saram02();
		
		soo.setName("김철수");
		soo.setHobby("영화 감상");
		soo.setBlood("AB");
		soo.setHeight(173.2);
		soo.setWeight(71.2);
		soo.setBool(true);
		
		showData(soo); // 호출
	}

	private static void showData(Saram02 human) {
		System.out.println("이름 : " + human.getName());
		System.out.println("취미 : " + human.getHobby());
		System.out.println("혈액형 : " + human.getBlood());
		System.out.println("키 : " + human.getHeight());
		System.out.println("몸무게 : " + human.getWeight());
		System.out.println("진위값 : " + human.getBool());
	}

}
