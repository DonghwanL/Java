package pkg18;

import java.util.Arrays;
import java.util.List;

public class MyArrayExam {

	public static void main(String[] args) {
		String[] arr1 = new String[3];
		
		Arrays.fill(arr1, "����ī");
		
		Arrays.fill(arr1, 1, 3, "Ƽ�Ĵ�"); // 1������ 3��° ������ (1~2)
		
		Arrays.fill(arr1, 2, 3, "���"); // 2��° ��Ҹ� ä���
		
		
		printArray(arr1);
		
		
		String[] arr2 = {"����ī", "Ƽ�Ĵ�", "���"};
		String[] arr3 = {"����ī", "Ƽ�Ĵ�", "���", "ȿ��"};
		
		// equals
		System.out.println(Arrays.equals(arr1, arr2));
		boolean bool = Arrays.equals(arr1, arr3);
		System.out.println(bool);
		
		// binarySearch
		int idx = Arrays.binarySearch(arr3,"ȿ��");
		System.out.println("ȿ���� �ε��� : " + idx);
		
		// asList
		String[] arr4 = {"������", "�̼���", "������"};
		List<String> lists = Arrays.asList(arr4);
		System.out.println(lists);
		
		// copyOf
		String[] arr5 = {"������", "�̼���", "������", "���߱�", "������"};
		System.out.println("�迭�� �����ؼ� �� �迭 �����");
		for (int i = 1; i <= 10; i++) {
			String[] arr6 = Arrays.copyOf(arr5, i);
			printArray(arr6);
		}
		System.out.println();
		
		// copyOfRange
		String[] arr7 = Arrays.copyOfRange(arr5, 1, 4);
		printArray(arr7);
		
		// sort
		Arrays.sort(arr5);
		printArray(arr5);
		
		String[] arr8 = {"��", "��", "��", "��", "��"};
		Arrays.sort(arr8, 1, 4); // 1���� 3�������� ����
		printArray(arr8);
		
		// toString
		System.out.println(Arrays.toString(arr5));
	}

	private static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

}
