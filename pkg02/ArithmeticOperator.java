package pkg02;

public class ArithmeticOperator {

	
	public static void main(String[] args) {
        int TIME = 4000; // ��� ����
        int second, minute, hour;
       
        // 60���� ���� ���� �ٽ� 60���� ���� ���� �ð��� �ǹ�
        hour = TIME / 3600;	// 1
        
        // 60���� ���� ���� �ٽ� 60���� ���� ���� �ð��� �ǹ�
        minute = (TIME - hour * 3600) / 60;
        
        second = TIME % 60; // 60���� ���� �������� �ʸ� �ǹ�
       
        System.out.println("�� : " + second);
        System.out.println("�� : " + minute);
        System.out.println("�ð� : " + hour);
             
        // 4000�ʴ� 1�ð�, 6��, 40���Դϴ�.
        // ��� �����ڷ� �ð� ���ϱ� : 4000�ʸ� �ð�, ��, �ʸ� ���Ͽ� ������ִ� ���α׷��� �ۼ��ϼ���.
        
	}

}
