import java.util.*;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float r=sc.nextFloat();

		float pi=22/7f;
		
		float area = pi*r*r;

		System.out.println(area);
	}
}
