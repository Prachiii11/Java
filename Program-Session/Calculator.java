import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter no1 :");
		float n1=sc.nextInt();

		System.out.print("enter no2 :");
		float n2=sc.nextInt();


		System.out.print("enter Operator :");
		char op=sc.next().charAt(0);

		float ans=0;

		ans=(op=='+')?(n1+n2):
			(op=='-')?(n1-n2):
			(op=='*')?(n1*n2):
			(op=='/')?(n1/n2):
			(op=='%')?(n1%n2):0.000001f;

		String output= n1 + " " + op + " " + n2 + " = " +ans;

		if(!(ans == 0.000001f))
			System.out.println(output);

	}
}
