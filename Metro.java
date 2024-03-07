import java.util.*;

class Metro {

	int card;

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("WELCOME TO HYDERABAD METRO");
		System.out.println("Enter Login Credentials");
		login();

		metro_card();

	}

	static void metro_card() {
		System.out.println("Choose the following options: ");
		System.out.println("1. Recharge Metro Card 2. Book Ticket ");
		int input = in.nextInt();
		if (input == 1 || input == 2) {
			switch (input) {
				case 1: {
					System.out.println("welcome to payment aggregators");
					payment_methods();
					break;

				}
				case 2: {
					Book_Ticket();
					break;
				}

			}
		} else {
			System.out.println("you have entered invalid input");
			metro_card();
		}
	}

	static void payment_methods() {
		System.out.println();
		System.out.println("choose the following payment method");
		System.out.println("1.Gpay");
		System.out.println("2.paytm");
		System.out.println("3.phonepay");
		int upi = in.nextInt();
		if (upi == 1 || upi == 2 || upi == 3) {
			switch (upi) {
				case 1: {
					System.out.println("welcome to Gpay");
					bank_accounts();
					break;

				}
				case 2: {
					System.out.println("welcome to paytm");
					bank_accounts();
					break;
				}
				case 3: {
					System.out.println("welcome to phonepay");
					bank_accounts();
					break;
				}
			}
		} else {
			System.out.println("you have entered invalid input");
			payment_methods();
		}
	}

	static void bank_accounts() {
		System.out.println("choose the following bank");
		System.out.println();
		System.out.println("1.SBI");
		System.out.println("2.HDFC");
		int bnks = in.nextInt();
		if (bnks == 1 || bnks == 2) {

			switch (bnks) {
				case 1: {
					System.out.println("welcome to SBI");
					Gpay obj1 = new Gpay();
					obj1.payments();
					break;
				}
				case 2: {
					System.out.println("welcome to HDFC");
					Gpay obj2 = new Gpay();
					obj2.payments();
					break;
				}
			}
		} else {
			System.out.println("you have entered invalid input");
			bank_accounts();
		}
	}

	static void login() {

		Login lg = new Login();
		System.out.println("Enter 10 digit mobile number to Sign up");

		String number = in.next();

		if (number.length() == 10) {
			int count = 0;
			for (int i = 0; i < number.length(); i++) {
				if (number.charAt(i) >= 48 && number.charAt(i) <= 57) {
					count++;
				}

				else {
					System.out.println("Invalid Number");
					login();
				}
			}
			if (count == 10) {

				lg.set_MobileNumber(number);
				OTP();

			}
		} else {
			System.out.println("Invalid Number");
			// System.out.println("Please Enter 10 digit valid number");
			login();
		}
	}

	static void OTP() {
		System.out.println("Click 1 to OTP verification");
		String otp;

		int value = in.nextInt();
		if (value == 1) {
			otp = GenerateOTP();
		} else {
			System.out.println("Invalid input. Please provide correct input");
			otp = GenerateOTP();
		}

		System.out.println("Your OTP is: " + otp);
		System.out.println("Enter your otp");

		String userotp = in.next();

		if (otp.equals(userotp)) {
			System.out.println("Log in Successful");

		} else {
			System.out.println("Invalid OTP click 1 to resend otp");
			if (in.nextInt() == 1) {
				OTP();
			} else {

				System.out.println("Please provide valid input");
				OTP();
			}
		}

	}

	static String GenerateOTP() {
		int randomPin = (int) (Math.random() * 9000) + 1000;
		String tempotp = String.valueOf(randomPin);
		return tempotp;

	}

	static int Card_Recharge(int amount) {
		int card = 1000;
		card += amount;

		return card;

	}

	static void Book_Ticket() {
		System.out.println("Choose Your Journey Stations");

		for (int i = 0; i < Stations.redline.length; i++) {
			System.out.println(i + 1 + ". " + Stations.redline[i]);
		}
		for (int i = 0; i < Stations.blueline.length; i++) {
			System.out.println(Stations.redline.length + i + 1 + ". " + Stations.blueline[i]);
		}

		System.out.println("Choose Starting Point:");
		int start = in.nextInt();
		System.out.println("Choose Destination Point:");
		int end = in.nextInt();

		int redline_midindex = 3;
		int blueline_midindex = 15;

		int numofstations = 0;
		if (start <= 9) {
			if (end <= 9) {
				numofstations = Math.abs(start - end);
			} else {
				// int half_staions=Math.abs(start-redline_midindex);
				// int other_stations=Math.abs(end-blueline_midindex);
				numofstations = Math.abs(start - redline_midindex) + Math.abs(end - blueline_midindex);
			}
		} else {
			if (end >= 10) {
				numofstations = Math.abs(start - end);
			} else {
				numofstations = Math.abs(start - blueline_midindex) + Math.abs(end - redline_midindex);
			}
		}
		System.out.println(numofstations);

		int total_fare = fare(numofstations);
		System.out.println(total_fare);
	}

	static int fare(int stations) {
		// int fare=0;
		// if(start>=1 && start<=5 || end>=1 || end<=5 || start>=10 && start<=14 ||
		// end>=10 && end<=14)
		// {
		// if(start>=1 && start<=5 || start>=10 && start<=14)
		// {
		// if(start>=1 && start<=5)
		// fare=fare+Math.abs(5-start)*10;
		// else
		// fare=fare+Math.abs(14-start)*10;
		// }
		// else
		// {
		// if(end>=1 || end<=5)
		// fare=fare+Math.abs(5-end)*10;
		// else
		// fare+=Math.abs(14-end)*10;
		// }
		// }
		// else if(start>=6 && start<=9 || start>=15 && start<=18 ||end>=6 && end<=9 ||
		// end>=15 && end<=18)
		// {
		// if(start>=6 && start<=9 || start>=15 && start<=18)
		// {
		// if(start>=6 && start<=9)
		// fare+=Math.abs(9-start)*15;
		// else
		// fare+=Math.abs(18-start)*15;
		// }
		// else
		// {
		// if(end>=6 && end<=9)
		// fare+=Math.abs(9-end)*15;
		// else
		// fare+=Math.abs(18-end)*15;
		// }
		// }
		// System.out.println(fare);
		return 10 * stations;
	}
}

class Login {

	private String MobileNumber;

	void set_MobileNumber(String MobileNumber) {
		this.MobileNumber = MobileNumber;
	}

}

class Stations {
	static String[] redline = { "Parade_Ground", "Begumpet", "Ameerpet", "Yusafguda", "Jubli_Hills", "Check_Post",
			"Madhapur", "Durgam_Cheruvu", "Hitech_City" };

	static String[] blueline = { "MG_Bus_stand", "Nampally", "Assembly", "Khairatabad", "Panjagutta", "Ameerpet",
			"Moosapet", "KPHB Colony", "Miyapur" };

}

interface bank {
	Scanner sc = new Scanner(System.in);

	void payments();

}

class paytm extends Metro implements bank {
	public void payments() {
		System.out.println("welcome to paytm");
		System.out.println("Enter amount to add.");
		int money = sc.nextInt();
		System.out.println("Total available balance: ");
		System.out.println(Card_Recharge(money));
	}

}

class phonepay extends Metro implements bank {
	public void payments() {
		System.out.println("welcome to phonepay");
		System.out.println("Enter amount to add.");
		int money = sc.nextInt();
		System.out.println("Total available balance: ");
		System.out.println(Card_Recharge(money));
	}
}