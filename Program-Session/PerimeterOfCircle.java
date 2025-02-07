import java.util.Scanner;
class PerimeterOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter radius :");
		float r=sc.nextFloat();

		float pi=22f/7f;

		float perimeter=2*pi*r;
		System.out.println("perimeter of circle is : " + perimeter);
	}
}
