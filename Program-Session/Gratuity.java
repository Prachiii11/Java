import java.util.Scanner;
class Gratuity 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);

		System.out.print("enter bill: ");
		float bill=sc.nextFloat();

		System.out.print("enter tip :");
		float tipRate=sc.nextFloat();


		float tipamount=(tipRate*bill)/100;
		float totalBill=bill+tipamount;

		System.out.println(" the total bill is :" + totalBill);
		System.out.println(" the total tip amount is : " + tipamount);




	}
}

