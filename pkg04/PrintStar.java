package pkg04;
public class PrintStar {

	public static void main(String[] args) {
		// �� ����ϱ�
		
		int star = 10;		
		
		for(int i = 1; i <= star; i++) {
			System.out.print("*");
			
			if(i%5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println();
		
		
		// n���� ����ϱ�
		int n = 5;
		star = 12;
		
		for(int i = 1; i <= star; i++) {
			System.out.print("*");
			
			if(i%n == 0) {
				System.out.println();
			}
		}
		
		
	}

}
