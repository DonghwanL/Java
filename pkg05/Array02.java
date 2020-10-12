package pkg05;

public class Array02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
//		arr[0] = 5;
//		arr[1] = 4;
//		arr[2] = 3;
//		arr[3] = 2;
//		arr[4] = 1;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		//arr2 : 2 4 6 8
		int[] arr2 = new int [4];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 2 * (i + 1);	
			System.out.println("arr[" + i + "] = " + arr2[i]);
		}
		
		// arr2[i] = 2*1+2 = 2*(i+1)
		
		
	}

}
