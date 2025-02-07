import java.util.Scanner;
class Cylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter radius of cylinder :");
		float r=sc.nextFloat();

		System.out.print("enter lenght of cylinder :");
		float height=sc.nextFloat();

		double area=3.14*r*r;
		double volume=area*height;

		System.out.println(" Area of cylinder is : " + area);
		System.out.println(" volume of cylinder is :" + volume);
	}
}
