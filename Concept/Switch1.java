import java.util.Scanner;
class Switch1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number :");
		int num=sc.nextInt();

		switch(num){

			case 1:
			{
				System.out.println("case 1");
				break;
			}
			case 2:
			{
				System.out.println("case 2");
				break;
			}
			case 3:
			{
				System.out.println("case 3");
				break;
			}
			default:
			{
				System.out.println("invaiid input");
				break;
			}


		}
	}
}
