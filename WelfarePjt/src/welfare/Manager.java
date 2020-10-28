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
	private static double total_sum = 0.0; // 결측치를 제외한 모든 소득의 총합
	private static double missing = 0.0; // 결측치 데이터 건수

	// Welfare 객체들을 관리(추가/수정/삭제/조회 등)해주는 클래스

	// 전체를 저장하고 있는 컬렉션
	private List<Welfare> welfares = null;

	public Manager() {
		welfares = new ArrayList<Welfare>();
		this.FillData();

		System.out.println("총 소득합 : " + Manager.total_sum);
		System.out.println("결측치 개수 : " + Manager.missing);
		System.out.println("데이터 개수 : " + this.welfares.size());

		this.FillNaN(); // NaN : Not a Number
	}

	private void FillNaN() {
		// 소득 컬럼에 대한 결측치를 평균 값으로 대체해 줍니다.
		double bunja = Manager.total_sum;
		double bunmo = this.welfares.size() - Manager.missing;
		double average = bunja / bunmo;

		System.out.println(average);

		// 소득이 0인 행에 대하여 수정해 줍니다.
		for (Welfare wel : this.welfares) {
			if (wel.getIncome() == 0.0) {
				wel.setIncome(average);
			}
		}
	}

	private void FillData() {
		// 실제 데이터를 추가해주는 메소드
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("c:\\imsi\\복지데이터Clean.csv"));

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
		// 한 줄 정보를 분해하여 welfare 객체에 저장 후 컬렉션에 추가해 줍니다.
		// 1번째 줄은 header이므로, 빠져 나가도록 합니다.

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

		// 숫자형 오류 발생시 기본 값으로 채워 넣어 주기
		try {
			wel.setAge(Integer.parseInt(arr[2]));
		} catch (NumberFormatException e) {
			wel.setAge(0);
		}

		try { // 소득
			wel.setIncome(Integer.parseInt(arr[6]));

			// 미 결측치들의 총합 누적은 여기서 하세요.
			Manager.total_sum += Double.parseDouble(arr[6]);

		} catch (NumberFormatException e) {
			wel.setIncome(0);

			// 결측치 갯수를 +1 합니다.
			Manager.missing += 1.0;
		}

		this.welfares.add(wel);
	}

	public List<Welfare> SelectAll() {
		return this.welfares;
	}

	public List<Welfare> SelectAll(int su) {
		// 해당 숫자에 맞는 성별만 조회하여 반환합니다.
		// 리스트 자료 구조를 정의 합니다.
		// 확장 for를 이용하여, 해당 조건에 맞는 성별만 찾아 냅니다.
		// 리스트 자료 구조에 추가합니다.
		// 반환 합니다.

		List<Welfare> sublist = new ArrayList<Welfare>();

		for (Welfare wel : this.welfares) {
			if (su == 1) { // 남성
				if (wel.getGender().equals("남성")) {
					sublist.add(wel);
				}
			} else { // 여성
				if (wel.getGender().equals("여성")) {
					sublist.add(wel);
				}
			}
		}

		return sublist;
	}

	public List<Welfare> SelectAll(int beginRow, int endRow) {
		// 특정 페이지에 대한 목록을 조회하여 반환합니다.
		// 리스트 자료 구조를 정의 합니다.
		// 일반 for를 사용하여 (beginRow-1)부터 ()까지 추출 합니다.
		// 반환 합니다.

		List<Welfare> sublist = new ArrayList<Welfare>();

		for (int i = (beginRow - 1); i <= (endRow - 1); i++) {
			sublist.add(this.welfares.get(i));
		}

		return sublist;
	}

	public int Insert(Welfare welfare) {
		// 해당 Bean 객체를 컬렉션에 추가 합니다.
		boolean bool = this.welfares.add(welfare);

		if (bool == true) {
			return 1;
		} else {
			return -1;
		}
	}

	public Welfare SelectOne(String name) {
		// 해당 이름에 맞는 Bean 객체를 반환 합니다.
		// Bean 객체를 생성합니다.
		// 확장 for를 사용하여 해당 이름과 일치하는 행을 찾아서, Bean 객체에 대입합니다.
		// break 구문으로 빠져 나갑니다.
		// 해당 Bean 객체를 반환 합니다.

		Welfare bean = null; // 반환해줄 Bean 객체

		for (Welfare wel : this.welfares) {
			// wel : 각 1개의 행을 의미하는 객체

			if (wel.getName().equals(name)) {
				// 발견됨
				bean = wel;
				break; // 발견이 되었으므로 빠져 나감
			}
		}

		return bean;
	}

	public int Update(Welfare bean) {
		// 해당 데이터에 대하여 수정 합니다.
		// 기본 키는 절대로 같을 수 없고, 필수 사항인 컬럼을 말합니다.
		// 기본 키는 변경 할 수 없습니다.
		// 확장 for를 이용하여 단수 객체의 이름과 매개 변수 bean의 이름이 동일하면
		// 모든 컬럼들을 setter를 이용하여 치환하도록 합니다.
		// 결과를 반환 합니다.

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
		// 해당 컬렉션을 파일로 저장합니다.
		// 본인 이름 추가, '김유신'행 삭제, '선덕여행' 행 수정

		String pathname = "c:\\imsi\\복지데이터Finished.csv";

		FileWriter fw = null;
		BufferedWriter bw = null;

		// 확장 for를 사용하여
		// 단수 객체들을 문자열로 결합 합니다
		// bw.write() 메소드를 이용하여 파일에 기록합니다.

		try {
			fw = new FileWriter(new File(pathname));
			bw = new BufferedWriter(fw);

			for (Welfare wel : this.welfares) {
				bw.write(wel.toString());
				bw.newLine();
			}

			System.out.println("파일 저장 완료");

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
				// 해당 연령대가 있는 경우
				List<Object> mylist = mymap.get(ageg);

				mylist.set(0, (Double) mylist.get(0) + wel.getIncome());
				mylist.set(1, (Integer) mylist.get(1) + 1);

				mymap.put(ageg, mylist);

			} else { // 없는 경우
				List<Object> mylist = new ArrayList<Object>();
				mylist.add(wel.getIncome()); // 0번에 들어감
				mylist.add(1); // 1번에 들어감

				mymap.put(ageg, mylist);
			}
		}

		return mymap;
	}

	public Map<String, Integer> Religion() {
		// 종교 유무의 갯수들을 반환해 줍니다.
		// 확장 for를 사용하여
		// 종교 컬럼을 key로 맵 객체를 만들어 줍니다.

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
