package pkg05;

public class MyArr02 {

	public static void main(String[] args) {
		// ������ ���� �迭�� ����ð� ����ϼ���. a[0] = 10, a[1] = 20, a[2] = 30
		
		int[] a = new int [3];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = 10 * (i + 1);    
			System.out.println("arr[" + i + "] = " + a[i]);
		}
		
		// ���� : b  : 3, 8, 13, 18, ..., 98 
		
		int[] b = new int [98/5+1];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = 5 * i + 3;
			System.out.println("arr[" + i + "] = " + b[i]);
		}
		
		// 92, 82, 72 ...12, 2
		
		int[] c = new int [92/10+1];
		
		for (int i = 0; i < b.length; i++) {
			c[i] = -10 * i + 92;
			System.out.println("arr[" + i + "] = " + c[i]);
		}

	}
}
