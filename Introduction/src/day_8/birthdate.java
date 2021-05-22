package day_8;

public class birthdate {
	int dd,mm;
	public birthdate() {
		dd=19;
		mm=04;
	}
	public void wish() {
		System.out.println("Birthday Of Swaroop Is On "+dd+"/"+mm);
	}
	public static void main(String[] args) {
		birthdate b1 = new birthdate();
		b1.wish();
	}
}
