package pkg13;

public class EmpSalary {

	public static void main(String[] args) {
		System.out.println("��ǥ �̻� �̸� : " + Employee.ceoname);
		
		Employee hong = new Employee("ȫ�浿", 10000, "����");
		hong.Display();
		
		Employee hee = new Employee("�ڿ���", 10000, "����");
		hee.Display();
		
		Employee kim = new Employee("��ö��", "����");
		kim.Display();
		
		System.out.println(hong.hashCode());
		System.out.println(hee.hashCode());
		System.out.println(kim.hashCode());
		
		System.out.println(hong.getClass());
		System.out.println(hong.toString());
		System.out.println(hong);

	}

}
