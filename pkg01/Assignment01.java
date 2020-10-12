package pkg01;

public class Assignment01 {

	public static void main(String[] args) {
		int x = 5;
		
		x += 3;
		System.out.println("x : " + x);
		
		x *= 4;
		System.out.println("x : " + x);
		
		x %= 5;
		System.out.println("x : " + x);
		
		x -= 1;
		System.out.println("x : " + x);
		
		x += 7;
		System.out.println("x : " + x);
		
		
		int total = 0;
		// 복합 대입 연산자를 이용하여 1부터 10까지의 총합인 55를 total 변수에 저장하는 프로그램을 작성
		
		total += 1; total += 2; total += 3; total += 4; total += 5;
		total += 6; total += 7; total += 8; total += 9; total += 10;
		
		System.out.println("total : " + total);
		System.out.println("");
		
		

		// 삼각형 면적 = 밑변(base) * 높이(height) / 2
		// 원의 면적 = 원주율 (3.14) * 반지름 * 반지름
		
		double tarea, base, height;
	
		base = 4.0;
		height = 5.0;
		tarea = base*height/2.0;
		
		System.out.println("밑변 : " + base + ", " + "높이 : " + height);
		System.out.println("면적 : " + tarea);
		System.out.println("");
		
		double xpos, ypos, radius, area, PI;
		
		xpos = 3.0;
		ypos = 4.0;
		radius = 10.0;
		PI = 3.14;
		area = PI * radius * radius;
		
		System.out.println("원의 중심 : (" + xpos + ", " + ypos + ")");
		System.out.println("반지름 : " + radius);
		System.out.println("면적 : " + area);
		 
		
	}

}
