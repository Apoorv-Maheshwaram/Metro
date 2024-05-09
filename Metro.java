import java.util.*;
import java.io.File;

class Metro extends FileOpener {
	static int j=0;
	static Scanner in = new Scanner(System.in);
	static int card = 5000;

	static String blink = "\u001B[5m";
	static String red = "\u001B[31m";
	static String blue = "\u001B[34m";
	static String skblue = "\u001B[36m";
	static String pink = "\u001B[38;5;206m";
	static String litgreen = "\u001B[92m";
	static String bgblack = "\u001B[40m";
	static String bgred = "\u001B[41m";
	static String bggreen = "\u001B[42m";
	static String bgwhite = "\u001B[47m";
	static String boldtext = "\033[1m";
	static String brytred = "\u001B[91m";
	static String brytgreen = "\u001B[92m";
	static String brytblue = "\u001B[94m";
	static String violet = "\033[0;35m";
	static String White = "\u001B[37m";
	static String bgblue = "\u001B[44m";
	static final String cyan = "\u001B[36m";
	static final String green = "\u001B[32m";
	static final String def = "\u001B[0m";
	static final String yellow = "\u001B[33m";
	static final String purple = "\u001B[35m";
	static final String bgyellow = "\u001B[43m";
	static final String black = "\u001B[30m";
	static final String lightBlue = "\u001B[94m";
	static String gold = "\033[38;2;255;215;0m";

	static Login lg = new Login();
	static Metro met = new Metro();

	public static void main(String[] args) {

		System.out.println(red
				+ "                                    ********************************************************************************"
				+ def);
		System.out.print(bgblack + "                                    " + def);
		System.out.println(
				bgblack + bggreen + "                                                                                ");
		System.out.print(bgblack + "                                    " + def);
		System.out.println(bgblack + bggreen + blink
				+ "                           WELCOME TO HYDERABAD METRO                           " + bgblack
				+ "                                        ");
		System.out.print(bgblack + "                                    " + def);
		System.out.println(bgblack + bggreen
				+ "                                                                                " + def);
		System.out.println(red
				+ "                                    ********************************************************************************"
				+ def);
		System.out.println();
		System.out.print(bgblack + "                                                  ");
		System.out.println(bgblue + "              Enter Login Credentials               " + def);
		// System.out.println();

		// System.out.println("Log or Sign up into Hyderabad Metro ");

		System.out.println("Choose the following options");
		// System.out.println("1. Log In 2. Forgot Password");
		System.out.println("1.Log In 2. Sign Up");

		int opt = in.nextInt();
		if (opt == 1) {

			System.out.println("Enter 1 for Log In and 2 for Forgot Password");
			int enter_input = in.nextInt();
			if (enter_input == 1) {
				// login
				login_3();
			} else {

				// Forgot Password
				login();
			}

		} else if (opt == 2) {

			System.out.println("Sign up to begin Hyderabad Metro");
			// sign up
			login_2();
		} else {
			System.out.println("Invalid Input Restart your Booking Process");
			System.exit(2);
		}

		metro_card();

	}

	static void login_3() {
		System.out.println();
		System.out.print(bgblack + "                                                  ");
		System.out.println(bgblue + "              Enter Login Credentials               " + def);
		System.out.println();
		System.out.print("Enter your Mobile Number: ");
		String lgin_Mobilenumber = in.next();
		System.out.println();
		System.out.print("Enter your Password: ");
		String lgin_Password = in.next();

		if (lgin_Mobilenumber.equals(lg.get_MobileNumber())
				&& lgin_Password.equals(lg.get_Login_Password())) {
			System.out.println();
			System.out.println(green + "Log in Successfull" + def);
		} else {
			System.out.println();
			System.out.println(bgred + "Invalid Login Credentials" + def);
			System.out.println();
			System.out.print("Please enter again");
			login_3();
		}
	}

	static void metro_card() {
		System.out.println();
		System.out.print(bgblack + "                                               ");
		System.out.println(bgblue + "               Choose the following options:             " + def);
		System.out.println();
		System.out.println("                                                              1." + violet
				+ " Recharge Metro Card" + def);
		System.out.println(
				"                                                              2." + violet + " Book Ticket" + def);
		System.out.println();
		System.out.print(blue + "Option: " + def);
		int input = in.nextInt();
		if (input == 1 || input == 2) {
			switch (input) {
				case 1: {
					System.out.println(yellow
							+ "                                                            WELCOME TO PAYMENT AGGREGATORS"
							+ def);
					payment_methods();
					break;

				}
				case 2: {
					Book_Ticket();
					break;
				}

			}
		} else {
			System.out.println();
			System.out.println("\u001B[31mYou have entered invalid input\u001B[0m");
			System.out.println();
			metro_card();
		}
	}

	static void payment_methods() {
		System.out.println();
		System.out.println(red
				+ "                                                        Choose the following payment method" + def);
		System.out.println();
		System.out.println("                                                              1." + brytblue + "G"
				+ brytgreen + "p" + yellow + "a" + red + "y" + def);
		System.out.println("                                                              2." + violet + "P" + "h" + "o"
				+ "n" + "e" + def);
		System.out.print("                                                              3." + brytblue + "p" + def
				+ lightBlue + "a" + "y" + "t" + "m" + def);
		System.out.println();
		System.out.print(blue + "Choose: " + def);
		int upi = in.nextInt();
		if (upi == 1 || upi == 2 || upi == 3) {
			switch (upi) {
				case 1: {
					// System.out.print(brytblue + "G" + brytgreen + "p" + yellow + "a" + red + "y"
					// + def);
					System.out.println("                                                             Welcome to Gpay");
					bank_accounts();
					break;

				}
				case 2: {
					// System.out.print(lightBlue+" Paytm"+def);
					System.out.println("                                                             Welcome to phonepay");
					bank_accounts();
					break;
				}
				case 3: {
					// System.out.print(brytblue +" Phonepay"+ def);
					System.out.println(
							"                                                             Welcome to Paytm");
					bank_accounts();
					break;
				}
			}
		} else {
			System.out.print(brytred + "you have entered " + def + brytblue + "invalid input" + def);
			payment_methods();
		}
	}

	static void bank_accounts() {
		System.out.println();
		System.out.println(brytgreen
				+ "                                                          Choose the following bank" + def);
		System.out.println();
		System.out
				.println("                                                              1." + brytblue + " SBI" + def);
		System.out
				.println("                                                              2." + brytred + " HDFC" + def);
		System.out.print(blue + "Choose: " + def);
		int bnks = in.nextInt();
		if (bnks == 1 || bnks == 2) {

			switch (bnks) {
				case 1: {
					System.out.print("                                                              welcome to SBI");
					payment_method obj1 = new payment_method();
					obj1.payments();
					break;
				}
				case 2: {
					System.out.print("                                                              welcome to HDFC");
					payment_method obj2 = new payment_method();
					obj2.payments();
					break;
				}
			}
		} else {
			System.out.print(brytred + "you have entered " + def + brytblue + "invalid input" + def);
			bank_accounts();
		}
		System.out.println("To book your Metro tickets enter yes or no");
		String tickets_input = in.next();
		if (tickets_input.equalsIgnoreCase("yes")) {
			Book_Ticket();
		} else {
			System.out.println("Thank you for Using Metro Application");
		}
	}

	static int temp = 0;

	static void login_2() {
		if (temp == 0) {

			System.out.print(bgblack + "                                                  ");
			System.out.println();
			System.out.println("         Enter 10 digit mobile number to Sign up     " + def);
			System.out.println();
			System.out.print(blue + "Enter: " + def);

			String number = in.next();
			System.out.println();
			if ((number.length() == 10) && ((number.charAt(0) >= '6') && (number.charAt(0) <= '9'))) {
				int count = 0;
				for (int i = 0; i < number.length(); i++) {
					if (number.charAt(i) >= 48 && number.charAt(i) <= 57) {
						count++;
					}

					else {
						System.out.println("Invalid Number");
						login_2();
					}
				}
				if (count == 10) {

					lg.set_MobileNumber(number);
					temp = 1;

				}
			} else {
				System.out.println();
				System.out.println(bgred + White + "Invalid Number" + def);
				System.out.println();
				login_2();
			}
		}

		if (temp == 1) {

			System.out.println("Set up your password");
			System.out.println();
			System.out.println(yellow + "Password must contain a Special Character");
			System.out.println(yellow + "Password must contain a Lower Case");
			System.out.println(yellow + "Password must contain a Upper Case");
			System.out.println(yellow + "Password must contain a Number");
			System.out.println(yellow + "Password must be length of 8 characters" + def);
			System.out.println();
			System.out.print(blue + "Enter your Password: " + def);

			String password = in.next();
			if (password_check(password)) {
				lg.set_Login_Password(password);
				System.out.println();
				System.out.println(green + "Password created successfully" + def);
				System.out.println();
			} else {
				temp = 1;
				System.out.println();
				System.out.println(red + "Password does not meet criteria" + def);
				System.out.println(cyan + "Enter again: " + def);
				System.out.println();
				login_2();

			}

		}
		// else {
		// login_2();
		// }
	}

	static boolean password_check(String password) {

		// At least 8 characters
		if (password.length() < 8) {
			return false;
		}

		// Contains at least one uppercase letter
		boolean hasUppercase = !password.equals(password.toLowerCase());
		if (!hasUppercase) {
			return false;
		}

		// Contains at least one lowercase letter
		boolean hasLowercase = !password.equals(password.toUpperCase());
		if (!hasLowercase) {
			return false;
		}

		// Contains at least one digit
		boolean hasDigit = password.matches(".*\\d.*");
		if (!hasDigit) {
			return false;
		}

		// Contains at least one special character
		boolean hasSpecial = !password.matches("[A-Za-z0-9 ]*");
		if (!hasSpecial) {
			return false;
		}

		return true;
	}

	static void login() {

		System.out.println("Enter 10 digit mobile number to Sign up");
		System.out.println();
		System.out.print(blue + "Enter: " + def);
		String number = in.next();

		if (number.equals(lg.get_MobileNumber())) {
			System.out.println();
			System.out.println(green + "Proceeding for OTP verification" + def);
			OTP();
		} else {
			System.out.println("Mobile Number does not match  Please enter again");
			login();
		}

	}

	static int otp_count = 0;

	static void OTP() {
		System.out.println(def);
		String otp = "";

		otp = GenerateOTP();
		System.out.println(blue + "Your OTP is: " + def + otp);
		System.out.println();
		System.out.print(blue + "Enter your otp: " + def);
		String userotp = in.next();

		if (otp.equals(userotp)) {
			System.out.println(blue + "Sign up Successful" + def);

		} else {
			System.out.println();
			System.out.println(red + "Invalid OTP. Click 1 to resend OTP" + def);
			otp_count++;
			if (otp_count == 3) {
				System.out.println("You have reached maximum Invalid verifications\n Please try again after 24 hours");
				System.exit(1);
			}

			if (in.nextInt() == 1) {
				OTP();
			} else {

				System.out.println(red + bgblack + " Invalid input" + def);
				System.out.println();
				System.out.println(green + "Sign Up again" + def);
				System.exit(1);
			}
		}

	}

	static String GenerateOTP() {
		int randomPin = (int) (Math.random() * 9000) + 1000;
		String tempotp = String.valueOf(randomPin);
		return tempotp;

	}

	static int Card_Recharge(int amount) {
		// password obj = new password(in.next());

		// card = 1000;
		card += amount;
		return card;

	}

	static String destination;
	static int end;
		//static int final j=0;
	static void Book_Ticket() {
		j++;
		System.out.println();
		System.out.println(gold
				+ "                                                              Choose Your Journey Stations" + def);

		System.out.println();
		for (int i = 0; i < Stations.redline.length; i++) {
			System.out.println("                                                              " + (i + 1) + ". " + red
					+ Stations.redline[i] + def);

		}
		for (int i = 0; i < Stations.blueline.length; i++) {
			System.out.println("                                                              "
					+ (Stations.redline.length + i + 1) + ". " + cyan + Stations.blueline[i] + def);

		}
		System.out.println();
		System.out.print(blue + "Choose Starting Point: " + def);
		j++;
		int start = in.nextInt();
		System.out.println();
		System.out.print(blue + "Choose Destination Point: " + def);

		end = in.nextInt();

		int redline_midindex = 3;
		int blueline_midindex = 15;

		int numofstations = 0;
		if (start <= 9) {
			if (end <= 9) {
				numofstations = Math.abs(start - end);
				destination = Stations.redline[end - 1];
			} else {
				// int half_staions=Math.abs(start-redline_midindex);
				// int other_stations=Math.abs(end-blueline_midindex);
				numofstations = Math.abs(start - redline_midindex) + Math.abs(end - blueline_midindex);
				destination = Stations.blueline[end - Stations.redline.length - 1];
			}
		} else {
			if (end >= 10) {
				numofstations = Math.abs(start - end);
				destination = Stations.blueline[end - Stations.redline.length - 1];
			} else {
				numofstations = Math.abs(start - blueline_midindex) + Math.abs(end - redline_midindex);
				destination = Stations.redline[end - 1];
			}
		}
		System.out.println(numofstations);
		
		int total_fare = fare(numofstations);
		System.out.println();
		System.out.println("Fare: Rs." + total_fare);
		System.out.print(bgblack + "                                               " + def);
		System.out.println(bgblue + "                Choose the following mode of payments       " + def);
		System.out.println();
		System.out.println(
				"                                                              1." + gold + "Metro_card" + def);
		System.out.println("                                                              2." + brytblue + "G"
				+ brytgreen + "p" + yellow + "a" + red + "y" + def);
		System.out.println("                                                              3." + brytblue + "p" + def
				+ lightBlue + "a" + "y" + "t" + "m" + def);
		System.out.println("                                                              4." + violet + "P" + "h" + "o"
				+ "n" + "e" + def);
		// System.out.println("1. " + green + "Metro_card" + def + "\n2. " + cyan +
		// "Gpay" + def + "\n3. " + blue + "Paytm" + def + "\n4. " + yellow + "Phonepay"
		// + def);
		System.out.print(blue + "choose: " + def);
		int num = in.nextInt();
		Fare_payment(total_fare, num);
		//qr();
	}

	static int fare(int stations) {
		return 10 * stations;
	}

	static void Fare_payment(int total_fare, int num) {
		int card_password = 1234;
		if (num == 1) {
			System.out.println(
					gold + "                                                             Welcome to metro_card" + def);
			System.out.println();
			System.out.println("Your fare is Rs." + total_fare);
			System.out.println();
			System.out.print(green + "Click ok to proceed: " + def);

			String msg = in.next();
			if (msg.equalsIgnoreCase("ok")) {
				System.out.println();
				System.out.print(blue + "Enter your metro pin: " + def);
				if (in.nextInt() == card_password) {
					card = card - total_fare;
					System.out.println();
					System.out.println(green
							+ "                                                              Transaction was Successful"
							+ def);
					System.out.println("Have a safe journey.");
					if(j==1)
					{
						qr();
						j++;
					}	
					System.out.println("Total clear amount in Metro card is Rs." + card);

				} else {
					System.out.println(red + "Incorrect pin" + def + "\n" + yellow + "Please try again" + def);
					Fare_payment(total_fare, num);
				}
			}
		} else if (num >= 2 && num <= 4) {
			System.out.println();
			System.out.println("Remaining clear amount Rs." + UPI.Fare(total_fare, num));
			System.out.println();
			System.out.println(green + "Transaction was Successful" + def);
			System.out.println();
			System.out.println("Have a safe journey");
			if(j==1)
			{
				qr();
				j++;
			}	

		}

		else {
			System.out.println(
					red + "Invalid input" + def + "\n" + yellow + "Enter yes to restart your payment processing" + def);
			if (in.next().equalsIgnoreCase("yes")) {
				Fare_payment(total_fare, num);

			} else {
				System.exit(0);
			}
		}
		System.out.println();
		System.out.println(yellow + "WANT TO ORDER YOUR FOOD ENTER YES OR NO" + def);
		System.out.println();
		System.out.print(blue + "Choose: " + def);
		String food_input = in.next();
		if (food_input.equalsIgnoreCase("Yes")) {

			Shopping.start();
		} else {

			explore(destination);

			System.out.println("Want to Book Your Tickets again Enter Yes or No");
			String book_again_input = in.next();
			{
				if (book_again_input.equalsIgnoreCase("YES")) {
					Book_Ticket();
				} else {
					System.exit(2);
				}
			}
		}
	}

	static void explore(String destination) {

		System.out.println(cyan + "Explore your Destination Place." + def);
		System.out.println("Enter Yes or No");
		String explore_input = in.next();
		if (explore_input.equalsIgnoreCase("Yes")) {
			System.out.println("Your destination is " + cyan + destination + def);
			destination_details(end);

		} else if (explore_input.equalsIgnoreCase("No")) {
			System.exit(0);
		} else {
			System.out.println(red + "Invalid Input" + def);
			explore(destination);
		}
	}

	static void destination_details(int end) {
		switch (end) {
			case 1:
				System.out.println(cyan + "Parade Ground is your destination station" + def);
				System.out.println("Yashodha Hospital");
				System.out.println("JBS Bus Stand");
				System.out.println("Parade Ground");
				System.out.println("Gymkhana cricket stadium.");
				break;
			case 2:
				System.out.println(cyan + "Begumpet is your destination station" + def);
				System.out.println("MMTS services");
				System.out.println("Lifestyle shopping mall");
				break;
			case 3:
			case 15:
				System.out.println(cyan + "Ameerpet is your destination station" + def);
				if (end <= 9) {
					System.out.println("Interchange here for Blue Metro Line");
				} else {
					System.out.println("Interchange here for Red Metro Line");
				}
				break;
			case 4:
				System.out.println(cyan + "Yusafguda is your destination station" + def);
				System.out.println("Sri Kotla Vijaya Bhaskar Reddy Stadium");
				break;
			case 5:
				System.out.println(cyan + "Jubli_Hills is your destination station" + def);
				System.out.println("Annapurna Studios");
				break;
			case 6:
				System.out.println(cyan + "Check_Post is your destination station" + def);
				System.out.println("Peddamma Thalli Temple");
				break;
			case 7:
				System.out.println(cyan + "Madhapur is your destination station" + def);
				System.out.println("AB's - Absolute Barbecues");
				System.out.println("Hotel Daspalla");
				System.out.println("Prost");
				System.out.println("36 Downtown Brew Pub");
				break;
			case 8:
				System.out.println(cyan + "Durgam_Cheruvu is your destination station" + def);
				System.out.println("Krishe Sapphire");
				System.out.println("GF mandi");
				System.out.println("BR Hitech Theatre");
				break;
			case 9:
				System.out.println(cyan + "Hitech_City is your destination station" + def);
				System.out.println("Cyber towers");
				System.out.println("E-galleria");
				System.out.println("PVR icon");
				System.out.println("Broadridge Building");
				System.out.println("National Institute of Fashion Technology");
				break;
			case 10:
				System.out.println(cyan + "MG_Bus_stand is your destination station" + def);
				System.out.println("MGBS bus services");
				System.out.println("Osmania medical college");
				System.out.println("Imlibun park");
				break;
			case 11:
				System.out.println(cyan + "Nampally is your destination station" + def);
				System.out.println("Nampally Railway station");
				break;
			case 12:
				System.out.println(cyan + "Assembly is your destination station" + def);
				System.out.println("Potti Sreeramulu Telugu University");
				System.out.println("Telangana State Archaeology Museum");
				System.out.println("Public gardens");
				System.out.println("Telugu Likitha kala bhavan");
				break;
			case 13:
				System.out.println(cyan + "Khairatabad is your destination station" + def);
				System.out.println("Lumbini park");
				System.out.println("NTR garden");
				System.out.println("Prasad Multiplex");
				break;
			case 14:
				System.out.println(cyan + "Panjagutta is your destination station" + def);
				System.out.println("Next galleria mall");
				System.out.println("PVR cinemas");
				break;
			case 16:
				System.out.println(cyan + "Moosapet is your destination station" + def);
				System.out.println("Sangeetha Restaurant & Bar");
				System.out.println("K.G.N Kalyani Biryani");
				break;
			case 17:
				System.out.println(cyan + "KPHB Colony is your destination station" + def);
				System.out.println("Lulu mall");
				System.out.println("JNTUH");
				System.out.println("Manjeera Trinity Corporate");
				break;
			case 18:
				System.out.println(cyan + "Miyapur is your destination station" + def);
				System.out.println("GSM mall multiplex");
				System.out.println("SVM grand miyapur");
				System.out.println("Ameenpur lake");
				break;
			default:
				System.out.println(red + "Invalid destination station" + def);
				break;
		}

	}
}

class Login {

	private String MobileNumber = "9502432561";
	private String Login_Password = "Vamshi@3107";

	void set_MobileNumber(String MobileNumber) {
		this.MobileNumber = MobileNumber;
	}

	String get_MobileNumber() {
		return MobileNumber;
	}

	void set_Login_Password(String Login_Password) {
		this.Login_Password = Login_Password;
	}

	String get_Login_Password() {
		return Login_Password;
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

class payment_method extends Metro implements bank {
	public void payments() {
		System.out.println();
		System.out.println();
		System.out.print(blue + "Enter your password: " + def);
		password obj = new password(in.next());

	}

}

class password extends payment_method {
	private String pass;
	static int v = 0;
	String g = "1234";
	static int n = 1;
	static password obj = new password();

	password() {
	}

	password(String pass1) {
		if (n == 1) {
			if (this.g.equals(pass1)) {
				System.out.println();
				System.out.print(cyan + "Enter amount to add: " + def);
				int money = in.nextInt();
				System.out.println();
				System.out.print(cyan + "Total available balance: " + def);
				System.out.println(Card_Recharge(money));

			} else {
				System.out.println();
				System.out.println(bgred + "you have entered invalid password" + def);
				v = v + 1;
				if (v % 3 == 0) {
					n++;
					System.out.println(red + "you have reached your max attempts" + def);
					System.out.println("Enter your new password");
					obj.change_pas(sc.next());
				}
				payment_method obj = new payment_method();
				obj.payments();
			}
		} else {
			if (obj.get_pas().equals(pass1)) {
				System.out.println();
				System.out.println(cyan + "Enter amount to add: " + def);
				int money = in.nextInt();
				System.out.println(yellow + "Total available balance: " + def);
				System.out.println(Card_Recharge(money));

			} else {
				System.out.println(red + "you have entered invalid password" + def);
				v = v + 1;
				if (v % 3 == 0) {
					n++;
					System.out.println(red + "you have reached your max attempts" + def);
					System.out.println(yellow + "enter your new password" + def);
					obj.change_pas(sc.next());
				}
				payment_method obj = new payment_method();
				obj.payments();
			}

		}

	}

	String get_pas() {
		return pass;
	}

	void change_pas(String pass1) {
		this.pass = pass1;

	}

}

abstract class SBI_bank_fare {
	static Scanner in = new Scanner(System.in);
	static int base_amount = 15000;
	static int pin = 1234;
}

abstract class HDFC_bank_fare {
	static int base_amount = 17000;
	static int pin = 1234;
}

class UPI {
	static Scanner in = new Scanner(System.in);

	static final String cyan = "\u001B[36m";
	static final String green = "\u001B[32m";
	static final String def = "\u001B[0m";
	static final String yellow = "\u001B[33m";
	static final String purple = "\u001B[35m";
	static String blue = "\u001B[34m";
	static String red = "\u001B[31m";

	static int balance = 0;

	public static int Fare(int fare, int input) {
		if (input == 2) {
			// gpay
			System.out.println();
			System.out.println(
					green + "                                                              Welcome to Gpay" + def);
			System.out.println();
			System.out.println("Your metro fare is Rs." + fare);
			System.out.println("                                                             Choose your bank Account");
			System.out.println();
			System.out
					.println("                                                               1." + cyan + "SBI" + def);
			System.out
					.println("                                                               2." + cyan + "HDFC" + def);
			System.out.println();
			System.out.print(blue + "Choose: " + def);
			int inp = in.nextInt();
			if (inp == 1) {

				System.out.println(cyan + "Enter your pin: " + def);

				if (in.nextInt() == SBI_bank_fare.pin) {

					SBI_bank_fare.base_amount = SBI_bank_fare.base_amount - fare;
					balance = SBI_bank_fare.base_amount;
				} else {
					System.out.println(red + "Invalid PIN" + def + "\n" + yellow + "Please re-enter your pin" + def);
					Fare(fare, input);
				}

			} else if (inp == 2) {
				System.out.println(cyan + "Enter your pin" + def);
				if (in.nextInt() == HDFC_bank_fare.pin) {

					HDFC_bank_fare.base_amount = HDFC_bank_fare.base_amount - fare;
					balance = HDFC_bank_fare.base_amount;
				} else {
					System.out.println(red + "Invalid PIN" + def);
					System.out.println(yellow + "Please re-enter your pin" + def);
					Fare(fare, input);
				}
			} else {
				System.out.println(red + "Invalid Input" + def);
				System.out.println(yellow + "Enter again" + def);
				Fare(fare, input);
			}

		} else if (input == 3) {
			// paytm

			System.out.println(purple + "Welcome to Paytm\n" + def + " Your metro fare is Rs." + fare);
			System.out.println("Choose your bank\n" + cyan + " 1. SBI\n 2. HDFC" + def);
			int inp = in.nextInt();
			if (inp == 1) {
				System.out.println();
				System.out.print(purple + "Enter your pin: " + def);

				if (in.nextInt() == SBI_bank_fare.pin) {

					SBI_bank_fare.base_amount = SBI_bank_fare.base_amount - fare;
					balance = SBI_bank_fare.base_amount;
				} else {
					System.out.println(red + "Invalid PIN" + def);
					System.out.println(yellow + "Please re-enter your pin" + def);
					Fare(fare, input);
				}

			} else if (inp == 2) {
				System.out.println(cyan + "enter your pin" + def);
				if (in.nextInt() == HDFC_bank_fare.pin) {

					HDFC_bank_fare.base_amount = HDFC_bank_fare.base_amount - fare;
					balance = HDFC_bank_fare.base_amount;
				} else {
					System.out.println(red + "Invalid PIN" + def);
					System.out.println(yellow + "Please re-enter your pin" + def);
					Fare(fare, input);
				}
			} else {
				System.out.println(red + "Invalid Input" + def);
				System.out.println(yellow + "Enter again" + def);
				Fare(fare, input);
			}

		} else {
			// phonepay
			System.out.println(blue + "Welcome to Phonepay\n" + def + " Your metro fare is Rs." + fare);
			System.out.println("Choose your bank\n" + cyan + " 1. SBI\n 2. HDFC" + def);
			int inp = in.nextInt();
			if (inp == 1) {
				System.out.println(blue + "Enter your pin" + def);
				if (in.nextInt() == SBI_bank_fare.pin) {

					SBI_bank_fare.base_amount = SBI_bank_fare.base_amount - fare;
					balance = SBI_bank_fare.base_amount;
				} else {
					System.out.println(red + "Invalid PIN" + def);
					System.out.println(yellow + "Please re-enter your pin" + def);
					Fare(fare, input);
				}

			} else if (inp == 2) {
				System.out.print(blue + "Enter your pin: " + def);
				if (in.nextInt() == HDFC_bank_fare.pin) {

					HDFC_bank_fare.base_amount = HDFC_bank_fare.base_amount - fare;
					balance = HDFC_bank_fare.base_amount;
				} else {
					System.out.println(red + "Invalid PIN" + def);
					System.out.println(yellow + "Please re-enter your pin" + def);
					Fare(fare, input);
				}
			} else {
				System.out.println(red + "Invalid Input" + def);
				System.out.println(yellow + "Enter again" + def);
				Fare(fare, input);
			}

		}
		return balance;
	}
}

class FileOpener {
	static void qr() {
		try {
			String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\QR1.jpg";
			File file = new File(path);

			if (file.exists()) {
				Process pro = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + path);
				pro.waitFor();
			} else {
				System.out.println("File does not exist");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Shopping {

	// static String def = "\u001B[0m";
	static String blink = "\u001B[5m";
	static String red = "\u001B[31m";
	// static String green = "\u001B[32m";
	// static String yellow = "\u001B[33m";
	static String blue = "\u001B[34m";
	// static String purple = "\u001B[35m";
	static String skblue = "\u001B[36m";
	static String pink = "\u001B[38;5;206m";
	static String litgreen = "\u001B[92m";
	static String bgblack = "\u001B[40m";
	static String bgred = "\u001B[41m";
	static String bggreen = "\u001B[42m";
	static String bgwhite = "\u001B[47m";
	static String boldtext = "\033[1m";
	static String brytred = "\u001B[91m";
	static String brytgreen = "\u001B[92m";
	static String brytblue = "\u001B[94m";
	static String violet = "\033[0;35m";
	static String White = "\u001B[37m";
	static String bgblue = "\u001B[44m";
	static final String cyan = "\u001B[36m";
	static final String green = "\u001B[32m";
	static final String def = "\u001B[0m";
	static final String yellow = "\u001B[33m";
	static final String purple = "\u001B[35m";

	static Scanner sc = new Scanner(System.in);
	static int k = 0;
	static int food_bill = 0;

	static void start() {
		System.out.println();
		System.out.println(blue + "Select a Cafe from the following Cafes" + def);
		System.out.println(red + "1. Tandoor Cafe Menu\n" + green + "2. Italian Cafe Menu\n" + yellow
				+ "3. Mexican Cafe Menu\n" + purple + "4. Continental Cafe Menu" + def);
		System.out.println();
		System.out.print("Option: ");
		int cafe_input = sc.nextInt();
		if (cafe_input >= 1 && cafe_input <= 4) {
			switch (cafe_input) {
				case 1: {
					food_bill += cafe_1();
					break;
				}
				case 2: {
					food_bill += cafe_2();

					break;
				}
				case 3: {
					food_bill += cafe_3();
					break;
				}
				case 4: {
					food_bill += cafe_4();
					break;
				}
			}
			System.out.println(blue + "Want to add more items? Enter Yes:" + def);
			System.out.println();
			System.out.println(red + "To generate bill enter No: " + def);
			System.out.println();
			System.out.print(cyan + "Choose: " + def);
			if (sc.next().equalsIgnoreCase("yes")) {
				start();

			} else {
				food_payment();
			}

		} else {
			System.out.println("Please provide a valid Input");
			start();
		}

	}

	static int cafe_1() {
		System.out.println(blue + "Your destination is waiting to order food" + def);
		System.out.println();
		System.out.println(green + "Tandoor Cafe Menu" + def);
		System.out.println();
		System.out.println(yellow + "VEG:" + def);
		System.out.println(yellow + "1. Paneer Tikka-----------------------250" + def);
		System.out.println(yellow + "2. Tandoori Stuffed Mushroom----------260" + def);
		System.out.println(yellow + "3. Mushroom & Babycorn Galotee--------320" + def);
		System.out.println(purple + "NON-VEG:" + def);
		System.out.println(purple + "4. Chicken Tikka----------------------260" + def);
		System.out.println(purple + "5. Hariyali Murgh Tikka---------------280" + def);
		System.out.println(purple + "6. Shami Kebab------------------------300" + def);
		System.out.println();
		System.out.print("Please select an item: ");

		int choice = sc.nextInt();
		if (choice == 1) {
			k = 250;
		} else if (choice == 2) {
			k = 260;
		} else if (choice == 3) {
			k = 320;
		} else if (choice == 4) {
			k = 260;
		} else if (choice == 5) {
			k = 280;
		} else if (choice == 6) {
			k = 300;
		}
		return k;

	}

	static int cafe_2() {
		System.out.println(blue + "Your destination is waiting to order food" + def);
		System.out.println();
		System.out.println(green + "Italian Cafe Menu" + def);
		System.out.println();
		System.out.println(yellow + "STARTERS:" + def);
		System.out.println(yellow + "1. Bruschetta-------------------------180" + def);
		System.out.println(yellow + "2. Caprese Salad----------------------200" + def);
		System.out.println(purple + "PASTA:" + def);
		System.out.println(purple + "3. Spaghetti Aglio e Olio-------------250" + def);
		System.out.println(purple + "4. Fettuccine Alfredo-----------------280" + def);
		System.out.println(red + "PIZZA:" + def);
		System.out.println(red + "5. Margherita Pizza-------------------300" + def);
		System.out.println(red + "6. Pepperoni Pizza--------------------320" + def);
		System.out.println();
		System.out.print("Please select an item: ");

		int choice = sc.nextInt();
		if (choice == 1) {
			k = 180;
		} else if (choice == 2) {
			k = 200;
		} else if (choice == 3) {
			k = 250;
		} else if (choice == 4) {
			k = 280;
		} else if (choice == 5) {
			k = 300;
		} else if (choice == 6) {
			k = 320;
		}
		return k;

	}

	static int cafe_3() {
		System.out.println(blue + "Your destination is waiting to order food" + def);
		System.out.println();
		System.out.println(green + "Mexican Cafe Menu" + def);
		System.out.println();
		System.out.println(yellow + "APPETIZERS:" + def);
		System.out.println(yellow + "1. Guacamole--------------------------220" + def);
		System.out.println(yellow + "2. Queso Fundido----------------------250" + def);
		System.out.println(purple + "MAIN COURSE:" + def);
		System.out.println(purple + "3. Chicken Enchiladas-----------------300" + def);
		System.out.println(purple + "4. Beef Tacos-------------------------280" + def);
		System.out.println(red + "DESSERTS:" + def);
		System.out.println(red + "5. Churros----------------------------150" + def);
		System.out.println(red + "6. Tres Leches Cake-------------------180" + def);
		System.out.println();
		System.out.print("Please select an item: ");

		int choice = sc.nextInt();
		if (choice == 1) {
			k = 220;
		} else if (choice == 2) {
			k = 250;
		} else if (choice == 3) {
			k = 300;
		} else if (choice == 4) {
			k = 280;
		} else if (choice == 5) {
			k = 150;
		} else if (choice == 6) {
			k = 180;
		}
		return k;

	}

	static int cafe_4() {
		System.out.println(blue + "Your destination is waiting to order food" + def);
		System.out.println();
		System.out.println(green + "Continental Cafe Menu" + def);
		System.out.println();
		System.out.println(yellow + "APPETIZERS:" + def);
		System.out.println(yellow + "1. Caesar Salad----------------------200" + def);
		System.out.println(yellow + "2. French Onion Soup-----------------220" + def);
		System.out.println(purple + "MAIN COURSE:" + def);
		System.out.println(purple + "3. Grilled Salmon--------------------350" + def);
		System.out.println(purple + "4. Beef Burger-----------------------300" + def);
		System.out.println(red + "DESSERTS:" + def);
		System.out.println(red + "5. Cheesecake------------------------180" + def);
		System.out.println(red + "6. Tiramisu--------------------------220" + def);
		System.out.println();
		System.out.print("Please select an item:");
		int choice = sc.nextInt();
		if (choice == 1) {
			k = 200;
		} else if (choice == 2) {
			k = 220;
		} else if (choice == 3) {
			k = 350;
		} else if (choice == 4) {
			k = 300;
		} else if (choice == 5) {
			k = 180;
		} else if (choice == 6) {
			k = 220;
		}
		return k;
	}

	static void food_payment() {
		System.out.println(blue + "Your total bill is: " + food_bill + def);
		System.out.println();
		System.out.println(White + bgblack + "Choose the following mode of payments" + def);
		System.out.println("1. " + green + "Metro_card" + def + "\n2. " + cyan + "Gpay" + def + "\n3. " + blue + "Paytm"
				+ def + "\n4. " + yellow + "Phonepay" + def);

		int num = sc.nextInt();
		Metro.Fare_payment(food_bill, num);
	}
}//709
//private String MobileNumber = "8142039689";
	//private String Login_Password = "Apoorv@8142";

