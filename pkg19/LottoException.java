package pkg19;

public class LottoException extends Exception{
	private int lotto;
	
	public LottoException(String message, int lotto) {
		super(message); // String message
		this.lotto = lotto;
	}
	
	@Override
	public String toString() {
		String imsi = this.lotto + "는(은) 잘못된 번호 입니다.";
		return super.toString() + "\n" + imsi;
	}
}
