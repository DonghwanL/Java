package pkg21;

public class Dosirak {
	// is a 관계 : 모든 사람은 동물입니다.
	// has a 관계
	private Saram saram; // Saram 객체
	private String dname; // 도시락 이름
	private int price; // 단가
	private String[] banchan; // 반찬 3개;
	
	public Dosirak(Saram saram, String dname, int price, String[] banchan) {
		this.saram = saram;
		this.dname = dname;
		this.price = price;
		this.banchan = banchan;
	}

	public Saram getSaram() {
		return saram;
	}

	public String getDname() {
		return dname;
	}

	public int getPrice() {
		return price;
	}

	public String[] getBanchan() {
		return banchan;
	}
	
}
