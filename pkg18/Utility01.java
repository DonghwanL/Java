package pkg18;

import java.util.Random;

public class Utility01 {

	public static void main(String[] args) {
		Random rand = new Random();
		int total = 0;
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
			total += arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("รัวี : " + total);

	}

}
