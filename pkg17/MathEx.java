package pkg17;

public class MathEx {

	public static void main(String[] args) {
		double d1 = -12.3456;
		double d2 = 34.56;
		
		double result = Math.abs(-11.22);
		System.out.println(result);
		
		System.out.println("���밪 : " + Math.abs(d1));
		System.out.println("���� : " + Math.PI);
		System.out.println("���Ϸ� ��� : " + Math.E);
		
		System.out.println("2�� 3�±� : " + Math.cbrt(8));
		System.out.println("�ø� : " + Math.ceil(d1));
		System.out.println("���� : " + Math.floor(d1));
		System.out.println("ū �� : " + Math.max(12, 15));
		System.out.println("���� �� : " + Math.min(10, 20));
		System.out.println("2�� 10�� : " + Math.pow(2, 10));
		
		
		System.out.println("���� : " + Math.random());
		System.out.println("�ݿø� : " + Math.round(12.59));
		// ����� 1, ������ -1, 0�� 0���� ���
		System.out.println("��ȣ �� : " + Math.signum(-12.3)); 
		System.out.println("��Ʈ : " + Math.sqrt(16));
		
		// �� ���� ���� 3, 4��� �� �� ���� �� ���� ���̴� ? 5.0
		
		double x = 3.0;
		double y = 4.0;
		double z = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0));
		System.out.println("z : " + z);
		
		// ���� �� ���� 13.0�̰�, ª�� ���� 5.0�̶�� �� �� ������ ���� ����	
		z = 13.0;
		y = 5.0;
		x = Math.sqrt(Math.pow(z, 2.0) - Math.pow(y, 2.0));
		System.out.println("x : " + x);
		
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		System.out.println("aa : " + Math.abs(d1));
		

	}

}
