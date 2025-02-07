import java.util.Scanner;
class BMI 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter weight in pounds :");
		float weight= sc.nextFloat();

		System.out.print("enter height :");
		float height=sc.nextFloat();

		double kg=0.45359237*weight;
		double meter=0.0254*height;

		double bmi=kg/(meter*meter);
		System.out.println("BMI is : "+ bmi);
	}
}
