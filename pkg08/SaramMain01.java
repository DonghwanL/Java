package pkg08;

public class SaramMain01 {

	public static void main(String[] args) {
		
		Saram01 soo;
		soo = new Saram01();
		
		Saram01 hee;
		hee = new Saram01();
		
		soo.name = "±èÃ¶¼ö";
		soo.height = 172.5;
		soo.weight = 72.5;
		soo.hobby = "´ç±¸";
		soo.blood = "AB";
		
		hee.name = "¹Ú¿µÈñ";
		hee.height = 163.2;
		hee.weight = 47.3;
		hee.hobby = "¿µÈ­ °¨»ó";
		hee.blood = "O";
		
		soo.Display();
		System.out.println();
		
		hee.Display();
		System.out.println();
		
		Saram01[] saram = new Saram01[2];
		
		for (int i = 0; i < saram.length; i++) {
			saram[i] = new Saram01();
		}
		
		saram[0].name = "±èÃ¶¼ö";
		saram[0].height = 172.5;
		saram[0].weight = 72.5;
		saram[0].hobby = "´ç±¸";
		saram[0].blood = "AB";
		
		saram[1].name = "¹Ú¿µÈñ";
		saram[1].height = 163.2;
		saram[1].weight = 47.3;
		saram[1].hobby = "¿µÈ­ °¨»ó";
		saram[1].blood = "O";
		
		for (int i = 0; i < saram.length; i++) {
			saram[i].Display();
		}

	}

}
