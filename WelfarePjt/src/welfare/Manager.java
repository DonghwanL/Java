package welfare;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
	private static double total_sum = 0.0; // ����ġ�� ������ ��� �ҵ��� ����
	private static double missing = 0.0; // ����ġ ������ �Ǽ�

	// Welfare ��ü���� ����(�߰�/����/����/��ȸ ��)���ִ� Ŭ����

	// ��ü�� �����ϰ� �ִ� �÷���
	private List<Welfare> welfares = null;

	public Manager() {
		welfares = new ArrayList<Welfare>();
		this.FillData();

		System.out.println("�� �ҵ��� : " + Manager.total_sum);
		System.out.println("����ġ ���� : " + Manager.missing);
		System.out.println("������ ���� : " + this.welfares.size());

		this.FillNaN(); // NaN : Not a Number
	}

	private void FillNaN() {
		// �ҵ� �÷��� ���� ����ġ�� ��� ������ ��ü�� �ݴϴ�.
		double bunja = Manager.total_sum;
		double bunmo = this.welfares.size() - Manager.missing;
		double average = bunja / bunmo;

		System.out.println(average);

		// �ҵ��� 0�� �࿡ ���Ͽ� ������ �ݴϴ�.
		for (Welfare wel : this.welfares) {
			if (wel.getIncome() == 0.0) {
				wel.setIncome(average);
			}
		}
	}

	private void FillData() {
		// ���� �����͸� �߰����ִ� �޼ҵ�
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("c:\\imsi\\����������Clean.csv"));

			String imsi = "";
			while ((imsi = br.readLine()) != null) {
				this.MakeData(imsi);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (br != null) {
					br.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private void MakeData(String bean) {
		// �� �� ������ �����Ͽ� welfare ��ü�� ���� �� �÷��ǿ� �߰��� �ݴϴ�.
		// 1��° ���� header�̹Ƿ�, ���� �������� �մϴ�.

		if (bean.indexOf("name,") == 0) {
			return;
		}

		String[] arr = bean.split(",");

		Welfare wel = new Welfare();
		wel.setName(arr[0]);
		wel.setGender(arr[1]);
		wel.setAgeg(arr[3]);
		wel.setMarriage(arr[4]);
		wel.setReligion(arr[5]);
		wel.setJob(arr[7]);
		wel.setArea(arr[8]);

		// ������ ���� �߻��� �⺻ ������ ä�� �־� �ֱ�
		try {
			wel.setAge(Integer.parseInt(arr[2]));
		} catch (NumberFormatException e) {
			wel.setAge(0);
		}

		try { // �ҵ�
			wel.setIncome(Integer.parseInt(arr[6]));

			// �� ����ġ���� ���� ������ ���⼭ �ϼ���.
			Manager.total_sum += Double.parseDouble(arr[6]);

		} catch (NumberFormatException e) {
			wel.setIncome(0);

			// ����ġ ������ +1 �մϴ�.
			Manager.missing += 1.0;
		}

		this.welfares.add(wel);
	}

	public List<Welfare> SelectAll() {
		return this.welfares;
	}

	public List<Welfare> SelectAll(int su) {
		// �ش� ���ڿ� �´� ������ ��ȸ�Ͽ� ��ȯ�մϴ�.
		// ����Ʈ �ڷ� ������ ���� �մϴ�.
		// Ȯ�� for�� �̿��Ͽ�, �ش� ���ǿ� �´� ������ ã�� ���ϴ�.
		// ����Ʈ �ڷ� ������ �߰��մϴ�.
		// ��ȯ �մϴ�.

		List<Welfare> sublist = new ArrayList<Welfare>();

		for (Welfare wel : this.welfares) {
			if (su == 1) { // ����
				if (wel.getGender().equals("����")) {
					sublist.add(wel);
				}
			} else { // ����
				if (wel.getGender().equals("����")) {
					sublist.add(wel);
				}
			}
		}

		return sublist;
	}

	public List<Welfare> SelectAll(int beginRow, int endRow) {
		// Ư�� �������� ���� ����� ��ȸ�Ͽ� ��ȯ�մϴ�.
		// ����Ʈ �ڷ� ������ ���� �մϴ�.
		// �Ϲ� for�� ����Ͽ� (beginRow-1)���� ()���� ���� �մϴ�.
		// ��ȯ �մϴ�.

		List<Welfare> sublist = new ArrayList<Welfare>();

		for (int i = (beginRow - 1); i <= (endRow - 1); i++) {
			sublist.add(this.welfares.get(i));
		}

		return sublist;
	}

	public int Insert(Welfare welfare) {
		// �ش� Bean ��ü�� �÷��ǿ� �߰� �մϴ�.
		boolean bool = this.welfares.add(welfare);

		if (bool == true) {
			return 1;
		} else {
			return -1;
		}
	}

	public Welfare SelectOne(String name) {
		// �ش� �̸��� �´� Bean ��ü�� ��ȯ �մϴ�.
		// Bean ��ü�� �����մϴ�.
		// Ȯ�� for�� ����Ͽ� �ش� �̸��� ��ġ�ϴ� ���� ã�Ƽ�, Bean ��ü�� �����մϴ�.
		// break �������� ���� �����ϴ�.
		// �ش� Bean ��ü�� ��ȯ �մϴ�.

		Welfare bean = null; // ��ȯ���� Bean ��ü

		for (Welfare wel : this.welfares) {
			// wel : �� 1���� ���� �ǹ��ϴ� ��ü

			if (wel.getName().equals(name)) {
				// �߰ߵ�
				bean = wel;
				break; // �߰��� �Ǿ����Ƿ� ���� ����
			}
		}

		return bean;
	}

	public int Update(Welfare bean) {
		// �ش� �����Ϳ� ���Ͽ� ���� �մϴ�.
		// �⺻ Ű�� ����� ���� �� ����, �ʼ� ������ �÷��� ���մϴ�.
		// �⺻ Ű�� ���� �� �� �����ϴ�.
		// Ȯ�� for�� �̿��Ͽ� �ܼ� ��ü�� �̸��� �Ű� ���� bean�� �̸��� �����ϸ�
		// ��� �÷����� setter�� �̿��Ͽ� ġȯ�ϵ��� �մϴ�.
		// ����� ��ȯ �մϴ�.

		for (Welfare wel : this.welfares) {
			if (wel.getName().equals(bean.getName())) {
				wel.setAge(bean.getAge());
				wel.setAgeg(bean.getAgeg());
				wel.setArea(bean.getArea());
				wel.setGender(bean.getGender());
				wel.setIncome(bean.getIncome());
				wel.setJob(bean.getJob());
				wel.setMarriage(bean.getMarriage());
				wel.setReligion(bean.getReligion());
			}
		}

		return 1;
	}

	public int Delete(String name) {
		for (Welfare wel : this.welfares) {

			if (wel.getName().equals(name)) {
				this.welfares.remove(wel);
				break;
			}
		}
		return 1;
	}

	public void FileSave() {
		// �ش� �÷����� ���Ϸ� �����մϴ�.
		// ���� �̸� �߰�, '������'�� ����, '��������' �� ����

		String pathname = "c:\\imsi\\����������Finished.csv";

		FileWriter fw = null;
		BufferedWriter bw = null;

		// Ȯ�� for�� ����Ͽ�
		// �ܼ� ��ü���� ���ڿ��� ���� �մϴ�
		// bw.write() �޼ҵ带 �̿��Ͽ� ���Ͽ� ����մϴ�.

		try {
			fw = new FileWriter(new File(pathname));
			bw = new BufferedWriter(fw);

			for (Welfare wel : this.welfares) {
				bw.write(wel.toString());
				bw.newLine();
			}

			System.out.println("���� ���� �Ϸ�");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public Map<String, List<Object>> AgegGrouping() {
		Map<String, List<Object>> mymap = new HashMap<String, List<Object>>();

		for (Welfare wel : this.welfares) {
			String ageg = wel.getAgeg();

			if (mymap.containsKey(ageg)) {
				// �ش� ���ɴ밡 �ִ� ���
				List<Object> mylist = mymap.get(ageg);

				mylist.set(0, (Double) mylist.get(0) + wel.getIncome());
				mylist.set(1, (Integer) mylist.get(1) + 1);

				mymap.put(ageg, mylist);

			} else { // ���� ���
				List<Object> mylist = new ArrayList<Object>();
				mylist.add(wel.getIncome()); // 0���� ��
				mylist.add(1); // 1���� ��

				mymap.put(ageg, mylist);
			}
		}

		return mymap;
	}

	public Map<String, Integer> Religion() {
		// ���� ������ �������� ��ȯ�� �ݴϴ�.
		// Ȯ�� for�� ����Ͽ�
		// ���� �÷��� key�� �� ��ü�� ����� �ݴϴ�.

		Map<String, Integer> mymap = new HashMap<String, Integer>();

		for (Welfare wel : this.welfares) {
			String religion = wel.getReligion();

			if (mymap.containsKey(religion)) {
				mymap.put(religion, mymap.get(religion) + 1);
			} else {
				mymap.put(religion, 1);
			}
		}

		return mymap;
	}
}
