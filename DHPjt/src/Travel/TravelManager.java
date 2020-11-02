package Travel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Travel ��ü�� �����ϴ� Ŭ���� 
public class TravelManager {

	// ��ü�� �����ϰ� �ִ� �÷���
	private List<Travel> travels = null;

	public TravelManager() {
		travels = new ArrayList<Travel>();
		this.addData();
		this.discount();
	}

	public boolean compareTime(String name) {
		// �� ��¥�� ���Ͽ� ������ִ� �޼ҵ�

		Date date = new Date();
		String format = "yyyy/MM/dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String nowDate = sdf.format(date);
		boolean bool = false;
		 
		for (Travel trl : this.travels) {
			if (trl.getName().equals(name)) {

				String targetDate = trl.getBdate();

				try {
					Date firstDate = sdf.parse(targetDate);
					Date secondDate = sdf.parse(nowDate);

					long calDate = firstDate.getTime() - secondDate.getTime();
					long calDateDays = calDate / (24 * 60 * 60 * 1000);
					calDateDays = Math.abs(calDateDays);

					if (calDateDays >= 30) {
						bool = false;
					} else {
						bool = true;
					}

				} catch (ParseException e) {
					e.printStackTrace();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return bool;
	}

	private void discount() {
		// ��޿� ���� ������ ��� �޼ҵ�

		double percent = 0.0; // ������
		double discount = 0.0; // ���ε� �ݾ�
		double result = 0.0; // ���� �ݾ�

		for (Travel trl : this.travels) {
			double price = trl.getPrice();

			if (trl.getGrade().equals("VIP")) {
				percent = 8 * 0.01;
				discount = price * percent;
				result = price - discount;

				trl.setPrice(result);

			} else if (trl.getGrade().equals("���")) {
				percent = 5 * 0.01;
				discount = price * percent;
				result = price - discount;

				trl.setPrice(result);
			}
		}
	}

	public void addData() {
		// ���� �����͸� �߰����ִ� �޼ҵ�
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("./src/TravelData/TourlistF.txt"));

			String temp = "";
			while ((temp = br.readLine()) != null) {
				this.setData(temp);
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

	private void setData(String bean) {
		// ��ó�� �Ϸ�� �����͸� Travel ��ü�� ���� �� �÷��ǿ� �߰�

		String[] arr = bean.split(",");

		Travel trl = new Travel();

		trl.setName(arr[0]);
		trl.setGender(arr[1]);
		trl.setAge(Integer.parseInt(arr[2]));
		trl.setTplace(arr[3]);
		trl.setPrice(Integer.parseInt(arr[4]));
		trl.setGrade(arr[5]);
		trl.setBstate(arr[6]);
		trl.setBdate(arr[7]);

		this.travels.add(trl);
	}

	public List<Travel> viewAll() {
		// ��ü �����͸� ����
		return this.travels;
	}

	public List<Travel> viewGrade(int grade) {
		// �ش� ���ڿ� �ش��ϴ� ��޸� ��ȸ�Ͽ� ��ȯ

		List<Travel> lists = new ArrayList<Travel>();

		for (Travel trl : this.travels) {
			if (grade == 1) { // VIP
				if (trl.getGrade().equals("VIP")) {
					lists.add(trl);
				}
			} else if (grade == 2) { // ���
				if (trl.getGrade().equals("���")) {
					lists.add(trl);
				}
			} else { // �Ϲ�
				if (trl.getGrade().equals("�Ϲ�")) {
					lists.add(trl);
				}
			}
		}

		return lists;
	}

	public List<Travel> viewPage(int beginRow, int endRow) {
		// Ư�� ������ ����� ��ȯ
		List<Travel> lists = new ArrayList<Travel>();

		for (int i = (beginRow - 1); i <= (endRow - 1); i++) {
			lists.add(this.travels.get(i));
		}

		return lists;
	}

	public int booking(Travel Bean) {
		// �ش� �����͸� �߰�

		if (this.travels.add(Bean)) {
			return 1;
		} else {
			return -1;
		}
	}

	public int update(Travel Bean) {
		// �ش� �����͸� ����

		for (Travel trl : this.travels) {
			if (trl.getName().equals(Bean.getName())) {
				trl.setTplace(Bean.getTplace());
				trl.setPrice(0);
				trl.setBstate("���� ���");
				break;
			}
		}
		return 1;
	}

	public int cancel(String name) {
		// �ش� ������ ���(����)
		Date date = new Date();
		String format = "yyyy/MM/dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String nowDate = sdf.format(date);

		int check = 0;

		for (Travel trl : this.travels) {
			if (trl.getName().equals(name)) {
				trl.setGender("-");
				trl.setAge(0);
				trl.setTplace("-");
				trl.setPrice(0);
				trl.setGrade("-");
				trl.setBstate("���� ���");
				trl.setBdate(nowDate);

				check = 1;
			}

		}
		return check;
	}

	public Travel viewOne(String name) {

		Travel bean = null;

		for (Travel trl : this.travels) {
			if (trl.getName().equals(name)) {
				bean = trl;
				break;
			}
		}
		return bean;
	}
}
