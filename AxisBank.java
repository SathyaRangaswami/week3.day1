package week3.day1.assignment;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit from axis bank deposit method");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();
	}

}
