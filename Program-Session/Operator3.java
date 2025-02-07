import java.util.Scanner;
class Operator3 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a no:");
		int num=sc.nextInt();


		//String op=(num%2==0)?("HiTwo"):((num%5==0)?("HiiFive"):((num%2==0 && num%5==0)?("divisible by both"):("not divisible by both")));
		

		String op=((num%2==0)||(num%5==0))?((num%2==0 && num%5==0)?("divisible by both"):((num%2==0)?("HiiTwo"):("HiiFive"))):("not divisible by any");
		System.out.println(op);
	}
}
