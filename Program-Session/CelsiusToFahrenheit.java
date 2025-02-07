import java.util.Scanner;
class CelsiusToFahrenheit
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.print(" enter celsius in degree :");
		double celsius=sc.nextDouble();

		double farenheit=(9.0/5)*celsius+32;

		System.out.println("temp in fahrenheit is :" + farenheit);
	}
}
