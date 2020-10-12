package pkg11;
public class Shape {
	//���� ���� 
	private String type; //Ÿ�� ����("c"(��), "t"(�ﰢ��), "r"(�簢��))
	private String typeName; //�ѱ� �̸�(��, �簢��, �ﰢ��)
	private double area ; //����
	
	//�ﰢ���� �簢��
	private double width; //�غ�
	private double height ; //����
	private double diagonal ; // �밢��
	
	//��(circle)
	private double xpos;//x ��ǥ
	private double ypos; //y ��ǥ
	private double radius ; //������
	private double perimeter ; //�ѷ�
	
	public Shape(String type, double xpos, double ypos, double radius) {
		this.type = type ;
		this.typeName = "��" ;
		this.xpos = xpos ;
		this.ypos = ypos ;
		this.radius = radius ;
		this.calc01();
	}
	private void calc01() {
		//���� ���� ���� ó�� �뵵
		this.perimeter = 2 * Math.PI * this.radius ;
		this.area = Math.PI * Math.pow(this.radius, 2.0) ;
	}
	public Shape(String type, double width, double height) {
		this.type = type ;
		if (type.equals("t")) {
			this.typeName = "�ﰢ��" ;
		} else {
			this.typeName = "�簢��" ;
		}
		this.width = width ;
		this.height = height ;
		this.calc02();
	}
	private void calc02() {
		//��簢���� ���� ���� ó�� �뵵
		if (type.equals("t")) {
			this.area = this.width * this.height / 2.0 ;
		} else {
			this.area = this.width * this.height ;
			this.diagonal = Math.sqrt(Math.pow(this.width, 2.0) + Math.pow(this.height, 2.0) ) ;
		}
	}
	public void Display() {		
		System.out.println("���� : " + this.typeName);
		
		if (type.equals("c")) {
			System.out.println("������ : " + this.radius);
			System.out.printf("���ѷ� : %.2f\n", this.perimeter); 
		} else {
			System.out.println("�غ� : " + this.width);
			System.out.println("���� : " + this.height);
		}
		
		System.out.printf("���� : %.2f\n", this.area);

		if (type.equals("c")) {
			System.out.println("�߽� : (" + this.xpos + ", " + this.ypos + ")");
		}
		if (type.equals("r")) {
			System.out.printf("�밢�� ���� : %.2f\n", this.diagonal);
		} 
		System.out.println();
	}
}