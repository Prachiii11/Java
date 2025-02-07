import java.util.Scanner;
class Switch2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***********************WELCOME*******************");
		System.out.println();
		System.out.println("1.Monday");
		System.out.println("2.Tuesday");
		System.out.println("3.Wednesday");
		System.out.println("4.Thursday");
		System.out.println("5.Friday");
		System.out.println("6.Saturday");
		System.out.print("7.Monday");
		System.out.println();
		System.out.print("Choose the option");
		int opt= sc.nextInt();
        
		switch(opt)
		{
			case 1:
			{
				System.out.println("Practice maths");
				break;
			}
			case 2:
			{
				System.out.println("Improve english speaking");
				break;
			}
			case 3:
			{
				System.out.println("Read history of chhatrapati Shivaji Maharaj");
				break;
			}
			case 4:
			{
				System.out.println("Learn marathi vyakran");
				break;
			}
			case 5:
			{
				System.out.println("Practice sketching");
				break;
			}
			case 6:
			{
				System.out.println("Explore geography");
				break;
			}
			case 7:
			{
				System.out.println("Its holiday..Enjoyy!!!!!!!!!!");
				break;

			}
			default:
			{
				System.out.println("invalid input");
				break;
			}

		}
	}
}
