package pkg21;

import java.util.ArrayList;
import java.util.List;

public class DosirakMain {

	public static void main(String[] args) {
		
		// �� ��ö��
		Saram soo = new Saram("��ö��", "���� ������"); 

		String[] banchan1 = new String[] { "��� �", "��ġ", "��ȣ�� ������" };
		Dosirak dosirak1 = new Dosirak(soo, "��ȭ ���ö�", 10000, banchan1);

		// ���ö� ������ �����ϱ� ���� �÷���
		List<Dosirak> lists = new ArrayList<Dosirak>();
		lists.add(dosirak1);
		
		
		// �� �ڿ���
		lists.add(new Dosirak(
					new Saram("�ڿ���", "��� ������"),
					"���޷� ���ö�",
					7000,
					new String[] {"��� �Ķ���", "��", "���� ��ġ"} ));
					
		
		Dosirakhtml html = new Dosirakhtml(lists);
		html.Delivery();
		}
	}

