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
		// Tourlist ������ �о�ͼ� ��ó���� ���� (��ó�� �Ϸẻ : TourlistF�� ����)

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

			System.out.println("�۾��� �Ϸ� �Ǿ����ϴ�.");

		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("����� ���� �߻�");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("��Ÿ ���� �߻�");
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