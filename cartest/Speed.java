package cartest;

public interface Speed {
	// 속도를 제어해주는 인터페이스
	
	public abstract void speedup(int su); // 가속기(su만큼 누적하기)
	public abstract void speeddown(int su); // 감속기(su만큼 누적하기)

}