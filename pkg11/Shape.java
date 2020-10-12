package pkg11;
public class Shape {
	//공통 사항 
	private String type; //타입 문자("c"(원), "t"(삼각형), "r"(사각형))
	private String typeName; //한글 이름(원, 사각형, 삼각형)
	private double area ; //면적
	
	//삼각형과 사각형
	private double width; //밑변
	private double height ; //높이
	private double diagonal ; // 대각선
	
	//원(circle)
	private double xpos;//x 좌표
	private double ypos; //y 좌표
	private double radius ; //반지름
	private double perimeter ; //둘레
	
	public Shape(String type, double xpos, double ypos, double radius) {
		this.type = type ;
		this.typeName = "원" ;
		this.xpos = xpos ;
		this.ypos = ypos ;
		this.radius = radius ;
		this.calc01();
	}
	private void calc01() {
		//원과 관련 업무 처리 용도
		this.perimeter = 2 * Math.PI * this.radius ;
		this.area = Math.PI * Math.pow(this.radius, 2.0) ;
	}
	public Shape(String type, double width, double height) {
		this.type = type ;
		if (type.equals("t")) {
			this.typeName = "삼각형" ;
		} else {
			this.typeName = "사각형" ;
		}
		this.width = width ;
		this.height = height ;
		this.calc02();
	}
	private void calc02() {
		//삼사각형에 대한 업무 처리 용도
		if (type.equals("t")) {
			this.area = this.width * this.height / 2.0 ;
		} else {
			this.area = this.width * this.height ;
			this.diagonal = Math.sqrt(Math.pow(this.width, 2.0) + Math.pow(this.height, 2.0) ) ;
		}
	}
	public void Display() {		
		System.out.println("유형 : " + this.typeName);
		
		if (type.equals("c")) {
			System.out.println("반지름 : " + this.radius);
			System.out.printf("원둘레 : %.2f\n", this.perimeter); 
		} else {
			System.out.println("밑변 : " + this.width);
			System.out.println("높이 : " + this.height);
		}
		
		System.out.printf("면적 : %.2f\n", this.area);

		if (type.equals("c")) {
			System.out.println("중심 : (" + this.xpos + ", " + this.ypos + ")");
		}
		if (type.equals("r")) {
			System.out.printf("대각선 길이 : %.2f\n", this.diagonal);
		} 
		System.out.println();
	}
}