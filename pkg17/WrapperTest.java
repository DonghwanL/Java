package pkg17;

public class WrapperTest {

	public static void main(String[] args) {
		System.out.println("int �ִ� �� : " + Integer.MAX_VALUE);
		System.out.println("int ������ ũ�� : " + (Integer.SIZE/8) + "����Ʈ"); // ��Ʈ
		
		System.out.println("long �ִ� �� : " + Long.MAX_VALUE);
		System.out.println("double �ִ� �� : " + Double.MAX_VALUE);
		
		int x = 2147483647;
		System.out.println(++x);
		
		int aa = 1234;
		int bb = 5678;
		int cc = 10;
		
		System.out.println("2���� : " + Integer.toBinaryString(cc));
		
		String imsi = Integer.toOctalString(cc);
		System.out.println("8���� : " + imsi);
		System.out.println("16���� : " + Integer.toHexString(cc));
		
		imsi = "";
		String strA = new String("" + aa); // ���ڸ� ���ڿ��� ����
		System.out.println(strA);
		
		int len = strA.length();
		System.out.println(len);
		
		for (int i = len-1; i >= 0; i--) {
			imsi += strA.charAt(i);
		}
		
		System.out.println(imsi);
		
		// Wrapper Ŭ�������� xxx.valueof() �޼ҵ带 ������ ����
		String strB = String.valueOf(bb);
		
		String temp = imsi + strB;
		System.out.println("��ģ ���ڿ� : " + temp);
		
		int result = Integer.sum(10, 20);
		System.out.println(result);
		
		aa = -10;
		result = Integer.signum(aa);
		System.out.println(result);
		
		// �ڵ�� + �ܰ� + �Ϸ� ��ȣ
		String str = "ABC123����";
		
		// �ܰ��� 100 ���ϱ�
		String code = str.substring(0, 3); // 0�������� 3������
		String a = str.substring(3, 6);
		int b = Integer.valueOf(a);
		b += 100;
		System.out.println(b);
		
		String sno = str.substring(6); // 6���� ����������
		
		String res = code + String.valueOf(b) + sno;
		System.out.println(res);
			
	}

}
