package pkg06;

public class MyDeviation {

	public static void main(String[] args) {
        //�ʱ�ȭ ������� �迭�� �����Ѵ�.
        int[] arr = {10, 30, 40, 80};

        double result = deviation(arr);
        System.out.println("��� : " + result );
	}
	
	static double deviation(int[] arr) {
		int total = 0; // ������ �����ִ� ����
		
		for (int i = 0; i < arr.length; i++) {
			total += arr[i]; // �迭 ����� ������ ���Ѵ�.
		}
		
		double imsi = 0.0; // �л��� ���ϱ� ���� �ӽ� ����
		double average = (double)total / arr.length; // ���
		
		for (int i = 0; i < arr.length; i++) {
			// �迭�� ��ҿ� ����� ���̸� ���� ��Ų��.
			imsi += Math.pow((arr[i] - average), 2.0);
		}
		
		imsi /= arr.length;
		
		return Math.sqrt(imsi);
		
		
		/*
		 
			ǥ�� ���� ���ϴ� ����
			ǥ�� ����(standard deviation)�� ���ϼ���.
			 
			1) ����� ���Ѵ�.
			    ��� = ����(160)/arr.length = 160/4 = 40
			 
			2) (���� - ���)�� ������ ��� ������Ų��.
			    900 + 100 + 0 + 1600 = 2600 
			 
			3) 2)�� ����� ������ ������
			    2600/arr.length = 650
			 
			4) 3)�� ��Ʈ�� �����.
			    ��Ʈ 650 = 25.4950975 
			    ��Ʈ : Math.sqrt( 650 ) 
		
		 */
	
	}

}
