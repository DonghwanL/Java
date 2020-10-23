package pkg21;

import java.util.List;

public class Dosirakhtml {
	private List<Dosirak> lists = null;
	
	public Dosirakhtml(List<Dosirak> lists) {
		this.lists = lists;
	}

	public void Delivery() {
		System.out.println("고객명/배송지/도시락이름/단가/반찬1/반찬2/반찬3");
		
		for(Dosirak dosirak : lists) {
			String imsi = "";
			imsi += dosirak.getSaram().getName() + "/";
			imsi += dosirak.getSaram().getAddress() + "/";
			imsi += dosirak.getDname() + "/";
			imsi += dosirak.getPrice() + "/";
			
			// 참조 자료형 : 객체, 배열, 인터페이스 -> toString
			for (String banchan : dosirak.getBanchan()) {
				imsi += banchan + "/";
			}
			
			System.out.println(imsi);
		}


		
	}
}
