package pkg21;

public class Dosirak {
	// is a ���� : ��� ����� �����Դϴ�.
	// has a ����
	private Saram saram; // Saram ��ü
	private String dname; // ���ö� �̸�
	private int price; // �ܰ�
	private String[] banchan; // ���� 3��;
	
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
