package pkg18;
public class GetName2 {

	public static void main(String[] args) {
		final String what = "��ȣ��";
		String str = "��ȣ����ȣ�����缮��ö����ȣ��";
		
		System.out.println("���ڿ� ���� : " + str);
		
		// 1. ī���� ����(cnt)�� �����ϰ� �ʱ�ȭ
		// ã���� �ϴ� �ܾ �߰ߵ� ��ġ(idx) ������ ���� �� �ʱ�ȭ
		// ã���� �ϴ� �ܾ��� ���̿� ���� ������ ���� �� �ʱ�ȭ
		int cnt = 0;
		int idx = 0;
		int len = what.length();
		
		// 2. ���� ���� While �ݺ����� ����Ͽ� ã�� �ܾ �˻� �մϴ�. (indexOf() �޼ҵ�)
		// 3. �ܾ �߰� �Ǿ��ٸ� ī��Ʈ ������ 1 ���� �ݴϴ�.
		// 4. �ܾ �߰� ���� ������ break �������� ���� �����ϴ�. 
		// 5. �߰ߵ� ���ڿ��� �߶� ���� �����ϴ�. (substring() �޼ҵ�)
		
		while(true) { 
			idx = str.indexOf(what); 
			if (idx == -1) { // indextOf�� �˻��� ������ -1 ��ȯ
				System.out.println("�� �̻� �������� �ʽ��ϴ�.");
				break;	
			} else {
				str = str.substring(idx + len);
				System.out.println(str);
				cnt++;
			}
		}
		
		System.out.println("���ڿ� \'" + what + "\'�� " + cnt + "�� �߰ߵǾ����ϴ�.");
		
		
	}

}
