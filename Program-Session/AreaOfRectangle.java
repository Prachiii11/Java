import java.util.Scanner;
class AreaOfRectangle
{
	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.print("enter length :");
		float len=sc.nextFloat();

		System.out.print("enter breadth : ");
		float breadth=sc.nextFloat();

		float area=len*breadth;
		System.out.println("Area of rectangle is :" + area);
		
	}
}
