package pkg06;

public class Method05 {
	
	static int arrsum(int[] abcd) {
		int total = 0;
		for (int i = 0; i < abcd.length; i++) {
			total += abcd[i];
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		// �迭 ��ҵ��� ������ ���� �ִ� arrsum �޼ҵ� ����
		
		int[]arr = {10, 20, 30};
		int result = arrsum(arr);
		
		System.out.println("���� : " + result);

	}

}
