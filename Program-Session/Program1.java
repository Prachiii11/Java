import java.util.Scanner;
class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter no 1 :");
		int num1=sc.nextInt();

		System.out.print("enter no 2 :");
		int num2=sc.nextInt();

		int add=num1+num2;
		System.out.println("addition :" + add);
	}
}
