import java.util.Scanner;
class Loan 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("   LOAN CALCULATOR   ");
		System.out.println();
		System.out.println("Enter the amount : ");
		float amount = sc.nextFloat();
		System.out.println("Enter the ROI : ");
		float roi = sc.nextFloat();
		System.out.println("enter the Tenure(months) : ");
		int month = sc.nextInt();

		String str = (month/12)+"."+(month%12);
		float con = Float.parseFloat(str);
		System.out.println();
		System.out.println("LOAN CALCULATION");
		System.out.println("Principal amount "+amount);
		System.out.println("ROI "+roi+"%");
		System.out.println("Tenure : "+month+"months");

		float intYear = amount*roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest : "+totalInter);
		float outStanding = amount+totalInter;
		System.out.println("total outstanding amount : "+(outStanding));
		System.out.println("Emi : "+(outStanding/month)+"rs");
	}
}
