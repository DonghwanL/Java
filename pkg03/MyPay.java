package pkg03;

public class MyPay {

	public static void main(String[] args) {
		/* 
		�ӱ� ���
		8�ð� ������ �ñ��� 5000���̰�, 8�ð� �ʰ��п� ���ؼ��� 1.5���� �ñ��� �����ϴ� �˹ٰ� �ִ�.
		���� �� 5�ð� �ٹ��̸� �ӱ� = 5000 * 5 =  25000�̴�.
				15�ð� �ٹ��̸� �ӱ� = 5000 * 8 + 5000 * 1.5 * 7  = 92500�̴�. 
		��� ����) 15�ð� �ٹ����� �ӱ��� 92500�Դϴ�.		
		*/
		
        int RATE = 5000; //�⺻ �ñ�
        double pay; // �ӱ�
        int hours; // �ٹ� �ð�
        double FIRST = 8.0; // �б� �ð�
        
        hours = 5; 
        
        if(hours > 8) { 	
        	pay = RATE * FIRST + (int)(1.5 * RATE * (hours - FIRST)); 
        } else {
        	pay = RATE * hours;
        }
        System.out.printf("�ӱ��� " + (int)pay + "�Դϴ�.\n");
        
        
        /*
         �ٹ� �ð�   �⺻ �ñ� 
		1 ~ 10      5,000��
		11 ~ 20     �⺻ �ñ��� 1.5�� 
		21 �̻�     �⺻ �ñ��� 2.0�� 
        */
        double SECOND = 20.0;
        pay = 0.0;
        FIRST = 10.0; // �б�, �ð�
        
        hours = 15;
        
        if(hours < FIRST) {
        	pay = RATE * hours;  	
        } else if (hours < SECOND) {
        	pay = (10 * RATE + (int)((hours - 10) * RATE * 1.5));  
		} else if (hours <= 21) {
			pay = (10 * RATE + (int)((hours - 10) * RATE * 1.5));  
		}
        System.out.printf("�ӱ��� " + (int)pay + "�Դϴ�. \n" );
        
        
        /*
          5�ð� �ٹ�  = 5000 * 5 =  25,000��
		  15�ð� �ٹ�  = 5000 * 10 + 5000 * 1.5 * 5 = 87,500��
   		  25�ð� �ٹ�  = 5000 * 10 + 5000 * 1.5 * 10 + 5000 * 2.0 * 5 = 175,000��		
			
         */
        
        // 	for ������ ����Ͽ� ���� ������ Ǯ�� ������. (1*2 + 2*3 + 3*4 + �� + 100*101 = 343400)
        
        int total = 0;
        
        for (int i = 1; i < 101; i++) {
        	total += i*(i+1);
        }
        System.out.println("���� : " + total);
	}

}
