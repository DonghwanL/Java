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
		// ���� ���� �����ڸ� �̿��Ͽ� 1���� 10������ ������ 55�� total ������ �����ϴ� ���α׷��� �ۼ�
		
		total += 1; total += 2; total += 3; total += 4; total += 5;
		total += 6; total += 7; total += 8; total += 9; total += 10;
		
		System.out.println("total : " + total);
		System.out.println("");
		
		

		// �ﰢ�� ���� = �غ�(base) * ����(height) / 2
		// ���� ���� = ������ (3.14) * ������ * ������
		
		double tarea, base, height;
	
		base = 4.0;
		height = 5.0;
		tarea = base*height/2.0;
		
		System.out.println("�غ� : " + base + ", " + "���� : " + height);
		System.out.println("���� : " + tarea);
		System.out.println("");
		
		double xpos, ypos, radius, area, PI;
		
		xpos = 3.0;
		ypos = 4.0;
		radius = 10.0;
		PI = 3.14;
		area = PI * radius * radius;
		
		System.out.println("���� �߽� : (" + xpos + ", " + ypos + ")");
		System.out.println("������ : " + radius);
		System.out.println("���� : " + area);
		 
		
	}

}
