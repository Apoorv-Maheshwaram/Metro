import java.util.*;
class Metro
{

	int card;

	static Scanner in=new Scanner(System.in);
	
	public static void main(String [] args)
	{
		
		System.out.println("WELCOME TO HYDERABAD METRO");
		System.out.println("Enter Login Credentials");
		login();
		

		System.out.println("Choose the following options: ");
		System.out.println("1. Recharge Matro Card 2. Book Ticket ");
		int input=in.nextInt();
		
		switch(input)
		{
			case 1:
			{
				System.out.println("Eneter amount to add.");
				int money=in.nextInt();
				System.out.println("Total available balance: ");
				System.out.println(Card_Recharge(money));
				break;
			}
			case 2:
			{
				Book_Ticket();
				break;
			}

		}
	}


static void login()
	{

		Login lg=new Login();
		System.out.println("Enter 10 digit mobile number to Sign up");
		
		String number=in.next();
		
		if(number.length()==10)
		{
			int count=0;
			for(int i=0;i<number.length();i++)
			{
				if(number.charAt(i)>=48 && number.charAt(i)<=57)
				{
					count++;
				}
			
				else
				{
					System.out.println("Invalid Number");
					login();
				}
			}
			if(count==10)
			{

				lg.set_MobileNumber(number);
				OTP();
				
			}
		}
		else
		{
			System.out.println("Invalid Number");
			//System.out.println("Please Enter 10 digit valid number");
			login();
		}
	}

static void OTP()
	{
		System.out.println("Click 1 to OTP verification");
				String otp;
				
				int value=in.nextInt();
				if(value==1)
				{
					otp=GenerateOTP();
				}
				else
				{
					System.out.println("Invalid input. Please provide correct input");
					otp=GenerateOTP();
				}
				
				System.out.println("Your OTP is: "+otp);
				System.out.println("Enter your otp");

				String userotp=in.next();
				
				if(otp.equals(userotp))
				{
					System.out.println("Log in Successful");
					
				}
				else
				{
					System.out.println("Invalid OTP click 1 to resend otp");
					if(in.nextInt()==1)
					{
						OTP();
					}
					else
					{

						System.out.println("Please provide valid input");
						OTP();
					}
				}
		
	}	

static String GenerateOTP()
	{
		int randomPin   =(int) (Math.random()*9000)+1000; 
        	String tempotp  = String.valueOf(randomPin); 
        	return tempotp;

	}

static int Card_Recharge(int amount)
	{
		int card=1000;
		card+=amount;	
		
		return card;

	}


static void Book_Ticket()
	{
		System.out.println("Choose Your Journey Stations");

		for(int i=0;i<Stations.redline.length;i++)
		{
			System.out.println(i+1+". "+Stations.redline[i]);
		}
		for(int i=0;i<Stations.blueline.length;i++)
		{
			System.out.println(Stations.redline.length+i+1+". "+Stations.blueline[i]);
		}
		
		System.out.println("Choose Starting Point:");
		int start=in.nextInt();
		System.out.println("Choose Destination Point:");
		int end=in.nextInt();

		if(start<=Stations.redline.length)
		{

		}
		else
		{
			
		}

	}


}

class Login
{

	private String MobileNumber;
	
	void set_MobileNumber(String MobileNumber)
	{
		this.MobileNumber=MobileNumber;
	}


}
class Stations
{
	static String [] redline={"Parade_Ground","Begumpet","Ameerpet","Yusafguda","Jubli_Hills","Check_Post","Madhapur","Durgam_Cheruvu","Hitech_City"};

	static String[] blueline={"MG_Bus_stand","Nampally","Assembly","Khairatabad","Panjagutta","Ameerpet","Moosapet","KPHB Colony","Miyapur"};


}