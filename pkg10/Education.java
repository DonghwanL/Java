package pkg10;

public class Education {
		private String name;
		private String subject;
		private double fee;
		private double addfee;
		
		// final : ���� ���� (fix)
		private final String sosok = "IT ���� ����";
		private final double add_refund = 3000;
		
		public Education(String name, String subject, double fee) {
			this.name = name;
			this.subject = subject;
			this.fee = fee;
			this.addfee();
		}
		
		private void addfee() {
			if (this.subject.equalsIgnoreCase("JAVA")) {
				this.addfee = this.fee * 0.25 + this.add_refund;
			} else if (this.subject.equalsIgnoreCase("JDBC")) {
				this.addfee = this.fee * 0.20 + this.add_refund;
			} else if (this.subject.equalsIgnoreCase("JSP")) {
				this.addfee = this.fee * 0.15 + this.add_refund;
			}
		}
		
		public void Display() {
			System.out.println("������ : " + this.name);
			System.out.println("���� ���� : " + this.sosok);
			System.out.println("���� ���� : " + this.subject);
			System.out.println("������ : " + this.fee);
			System.out.println("ȯ�ޱ� : " + this.addfee);
		}

	}

