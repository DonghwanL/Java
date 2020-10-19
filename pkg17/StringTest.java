package pkg17;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("SEOUL");
		String str2 = new String("korea");
		
		String stemp;
		
		stemp = str1.toLowerCase() + " " + str2.toUpperCase();
		System.out.println(stemp);
		
		StringBuffer sb = new StringBuffer(stemp);
		
		StringBuffer result = sb.reverse();
		System.out.println(result);
		
		StringBuffer str3 = new StringBuffer("abcd");
		
		result = str3.insert(2, "xx");
		System.out.println(result);
		
		result = result.delete(3, 5);
		System.out.println(result);
		
		result = result.reverse();
		System.out.println(result);
		
		String str4 = "대한민국";
		String str5 = "화이팅";
		
		String temp = str4.concat(str5);
		System.out.println(temp);
		
		String files = "a.XLS/b.ppt/c.doc/d.xls";
		
		String[] filename = files.split("/");
		
		// startwith, endswith
		System.out.println("a.xls".endsWith(".xls")); 
		System.out.println("b.ppt".endsWith(".xls"));
		
		// 메소드 체이닝
		for (int i = 0; i < filename.length; i++) {
			if (filename[i].toLowerCase().endsWith(".xls")) {
				System.out.println(filename[i]);
			} 
		}
		
	}

}
