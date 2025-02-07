import java.util.Scanner;
class CalculateTip{
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter Subtotal: ");
		int subTotal=sc.nextInt();

		System.out.print("enter tip :");
		int tip=sc.nextInt();

		tip=subTotal*15/100;
		System.out.println(tip);
		
	}
}
