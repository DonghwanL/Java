package pkg21;

import java.util.List;

public class Dosirakhtml {
	private List<Dosirak> lists = null;
	
	public Dosirakhtml(List<Dosirak> lists) {
		this.lists = lists;
	}

	public void Delivery() {
		System.out.println("����/�����/���ö��̸�/�ܰ�/����1/����2/����3");
		
		for(Dosirak dosirak : lists) {
			String imsi = "";
			imsi += dosirak.getSaram().getName() + "/";
			imsi += dosirak.getSaram().getAddress() + "/";
			imsi += dosirak.getDname() + "/";
			imsi += dosirak.getPrice() + "/";
			
			// ���� �ڷ��� : ��ü, �迭, �������̽� -> toString
			for (String banchan : dosirak.getBanchan()) {
				imsi += banchan + "/";
			}
			
			System.out.println(imsi);
		}


		
	}
}
