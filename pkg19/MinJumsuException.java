package pkg19;

public class MinJumsuException extends Exception {
	private String comment;

	public MinJumsuException(String comment) {
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
