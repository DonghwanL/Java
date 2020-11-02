package Travel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Travel 객체를 관리하는 클래스 
public class TravelManager {

	// 전체를 저장하고 있는 컬렉션
	private List<Travel> travels = null;

	public TravelManager() {
		travels = new ArrayList<Travel>();
		this.addData();
		this.discount();
	}

	public boolean compareTime(String name) {
		// 두 날짜를 비교하여 계산해주는 메소드

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
		// 등급에 따른 할인율 계산 메소드

		double percent = 0.0; // 할인율
		double discount = 0.0; // 할인된 금액
		double result = 0.0; // 최종 금액

		for (Travel trl : this.travels) {
			double price = trl.getPrice();

			if (trl.getGrade().equals("VIP")) {
				percent = 8 * 0.01;
				discount = price * percent;
				result = price - discount;

				trl.setPrice(result);

			} else if (trl.getGrade().equals("우수")) {
				percent = 5 * 0.01;
				discount = price * percent;
				result = price - discount;

				trl.setPrice(result);
			}
		}
	}

	public void addData() {
		// 실제 데이터를 추가해주는 메소드
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
		// 전처리 완료된 데이터를 Travel 객체에 저장 후 컬렉션에 추가

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
		// 전체 데이터를 리턴
		return this.travels;
	}

	public List<Travel> viewGrade(int grade) {
		// 해당 숫자에 해당하는 등급만 조회하여 반환

		List<Travel> lists = new ArrayList<Travel>();

		for (Travel trl : this.travels) {
			if (grade == 1) { // VIP
				if (trl.getGrade().equals("VIP")) {
					lists.add(trl);
				}
			} else if (grade == 2) { // 우수
				if (trl.getGrade().equals("우수")) {
					lists.add(trl);
				}
			} else { // 일반
				if (trl.getGrade().equals("일반")) {
					lists.add(trl);
				}
			}
		}

		return lists;
	}

	public List<Travel> viewPage(int beginRow, int endRow) {
		// 특정 페이지 목록을 반환
		List<Travel> lists = new ArrayList<Travel>();

		for (int i = (beginRow - 1); i <= (endRow - 1); i++) {
			lists.add(this.travels.get(i));
		}

		return lists;
	}

	public int booking(Travel Bean) {
		// 해당 데이터를 추가

		if (this.travels.add(Bean)) {
			return 1;
		} else {
			return -1;
		}
	}

	public int update(Travel Bean) {
		// 해당 데이터를 수정

		for (Travel trl : this.travels) {
			if (trl.getName().equals(Bean.getName())) {
				trl.setTplace(Bean.getTplace());
				trl.setPrice(0);
				trl.setBstate("예약 대기");
				break;
			}
		}
		return 1;
	}

	public int cancel(String name) {
		// 해당 예약을 취소(삭제)
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
				trl.setBstate("예약 취소");
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
