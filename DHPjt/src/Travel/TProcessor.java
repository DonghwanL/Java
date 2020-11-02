package Travel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TProcessor {
	public static void main(String[] args) {
		// Tourlist 파일을 읽어와서 전처리를 수행 (전처리 완료본 : TourlistF로 저장)

		FileReader fr = null;
		BufferedReader br = null;

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		File src = new File("./src/TravelData/Tourlist.txt");
		File dst = new File("./src/TravelData/TourlistF.txt");

		try {
			fr = new FileReader(src);
			br = new BufferedReader(fr);

			fw = new FileWriter(dst);
			bw = new BufferedWriter(fw);

			TProcessing tpro = new TProcessing();

			String imsi = "";
			while ((imsi = br.readLine()) != null) {
				String result = tpro.Template(imsi);
				bw.write(result);
				bw.newLine();
			}

			System.out.println("작업이 완료 되었습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("기타 예외 발생");
			e.printStackTrace();

		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}

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
}