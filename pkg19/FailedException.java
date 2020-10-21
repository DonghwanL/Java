package pkg19;

public class FailedException extends Exception {
	private String comment;
	
	public FailedException(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String getMessage() {
		return "�޽��� : " + this.comment;
	}
	
	@Override
	public String toString() {
		return "���� ���ڿ� : " + this.comment;
	}

}
