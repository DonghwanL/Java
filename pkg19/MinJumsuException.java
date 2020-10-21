package pkg19;

public class MinJumsuException extends Exception {
	private String comment;

	public MinJumsuException(String comment) {
		this.comment = comment;
	}

	@Override
	public String getMessage() {
		return "메시지 : " + this.comment;
	}

	@Override
	public String toString() {
		return "예외 문자열 : " + this.comment;
	}

}
