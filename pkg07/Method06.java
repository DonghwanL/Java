package pkg07;

public class Method06 {
	
	/*
	 ���� ���ϱ�
	 1���� 10������ ������ ���Ͽ� ����ϴ� �޼ҵ� sum �ۼ�
	 ��, ���� ��ȯ���� �ʰ� �޼ҵ� ���ο��� ����ϵ��� �մϴ�.
	 
	 hap �޼ҵ� : sum �޼ҵ�� ������ ������ �����ϰ� ��ȯ���ִ� �޼ҵ�.
	 */

	public static void main(String[] args) {
		int su = 10;
		int result = hap(su);
		System.out.println("��� 01 : " + result);
		sum(su);
	}
	
	static void sum(int x) {
		int result = 0;
		
		for (int i = 1; i <= x; i++) {
			result += i;
		}
		
		System.out.println("��� 02 : " + result);
	}
	
	
	static int hap(int x) {
		int result = 0;
		
		for (int i = 1; i <= x; i++) {
			result += i;
		}
		
		return result;
	}
	
	
}
