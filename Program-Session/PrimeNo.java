import java.util.Scanner;
class PrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no :");
		int num=sc.nextInt();

		System.out.println
			((num==0|| num==3)?(num+ "is prime"):((num%2==0||num%3==0)?(num+"is not prime"):(num+"is prime")));
		
	}
}
