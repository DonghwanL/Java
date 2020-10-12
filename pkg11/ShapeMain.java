package pkg11;

public class ShapeMain {

	public static void main(String[] args) {
		// "c"(원), "t"(삼각형), "r"(사각형)
		// 원, x 좌표, y 좌표, 반지름
		
		Shape data1 = new Shape("c", 3.0, 4.0, 10.0);
		data1.Display();
		
		// 삼각형, 밑변, 높이
		Shape data2 = new Shape("t", 6.0, 8.0);
		data2.Display();
		
		// 사각형, 밑변, 높이
		Shape data3 = new Shape("r", 4.0, 10.0);
		data3.Display();

	}

}
