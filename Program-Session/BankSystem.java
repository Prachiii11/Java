import java.util.Scanner;
class BankSystem 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String username1=null;
		String password1=null;
		String address=null;
		long contact=0;
		double balance=0.0;

		for(; ;){
			System.out.println();
			System.out.println("***************WELCOME*************");
			System.out.println("***************Laxmi Chit Fund******");
			System.out.println();
			System.out.println("1.Exesting User");
			System.out.println("2.Create Account");
			System.out.print("Enter an option :");
			int opt=sc.nextInt();
			System.out.println();
			if(opt==1){
				if(username1==null){
					System.out.println("CREATE YOUR ACCOUNT FIRST");
					continue;
				}

				System.out.println("  LOGIN  ");
				System.out.println();

				for(int i=3 ; i>=3 ; i--){
					System.out.println();
					System.out.print("Username");
					String username=sc.next();
					System.out.print("Password :");
					String password =sc.next();
					if(username.equals(username1)&& password.equals(password1)){
						home:
						for(; ;)
						{
							System.out.println();
						System.out.println("HOME PAGE");
						System.out.println();
						System.out.println("1.DEPOSIT");
						System.out.println("2.WITHDRAW");
						System.out.println("3.CHECK BALANCE");
						System.out.println("4.MINI STATEMENT");
						System.out.println("5.LOGOUT");
						System.out.println();
						System.out.print("Enter an option :");
						int opt1=sc.nextInt();
						switch(opt1)
						{ 
							case 1:{
								System.out.println("DEPOSIT");
								System.out.println();
								System.out.print("Enter the amount :");
								double depositAmt=sc.nextDouble();
								balance +=depositAmt;
								System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
								System.out.println();
								break;
							}
							case 2:{
								System.out.println("WITHDRAW");
								System.out.println();
								System.out.print("Enter the amount :");
								double withdraw=sc.nextDouble();
								System.out.print("Enter the pin");
								String password3= sc.next();
								if(password3.equals(password1))
								{
									if(withdraw <= balance){
										balance -=withdraw;
										System.out.println("Withdraw success");
									}
									else{
										System.out.println("INSUFFICENT FUNDS");
									}
								}
								else{
									System.out.print("WRONG PIN");
								}
								break;
							}
							case 3:{
								System.out.println("CHECK BALANCE");
								System.out.println();
								for(int j=3 ; j>=1 ; j--)
								{
									System.out.println();
									System.out.print("ENTER THE PIN :");
									String password2=sc.next();
									if(password2.equals(password1)){
										System.out.println("ACCOUNT BALANCE : " + balance + "rs");
										continue home;
									}
									else{
										System.out.println("WRONG PIN");
										System.out.println("Attempt left :"+(j-1));
									}
								}
								System.out.println("YOUR ACCOUNT HAS BEEN LOCKED FOR 24 HOURS");
								System.exit(0);
								break;
							}
							case 5:{
								System.out.println("THANK YOU FOR USING OUR APP");
								System.out.println("VISIT AGAIN");
								System.exit(0);
							}
						}
						}
					}
					else{
						System.out.println("INVALID CRED");
						System.out.println("Attempt left :" +(i-1));
					}
				}
				System.out.println("THANK YOU AND NEVER VISIT AGAIN");
				System.exit(0);

			}
			else if(opt==2){
				System.out.println();
				System.out.println("Account CREATION");
				System.out.print("Username :");
				username1=sc.next();
				System.out.print("Password :");
				password1=sc.next();
				System.out.print("Address :");
				sc.nextLine();
				address=sc.nextLine();
				System.out.println("Contact :");
				contact=sc.nextLong();
				System.out.println("Deposit amount :");
				balance=sc.nextDouble();
				System.out.println();
				System.out.println("ACCOUNT CREATED SUCCESSFULLYY");
			}
			else{
				System.out.println("INVALID OPTION");
			}
		}
				
	}
}
