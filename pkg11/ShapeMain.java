package pkg11;

public class ShapeMain {

	public static void main(String[] args) {
		// "c"(��), "t"(�ﰢ��), "r"(�簢��)
		// ��, x ��ǥ, y ��ǥ, ������
		
		Shape data1 = new Shape("c", 3.0, 4.0, 10.0);
		data1.Display();
		
		// �ﰢ��, �غ�, ����
		Shape data2 = new Shape("t", 6.0, 8.0);
		data2.Display();
		
		// �簢��, �غ�, ����
		Shape data3 = new Shape("r", 4.0, 10.0);
		data3.Display();

	}

}
