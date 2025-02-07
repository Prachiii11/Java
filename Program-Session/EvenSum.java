import java.util.Scanner;
class EvenSum 
{
	public static void main(String[] args) 
	{
		System.out.print("enter the number :");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int sum=0;

		while(num>0){
			int rem= num%10;
			if(rem%2==0){
			sum+=rem;
			}
			num/=10;
		}
		System.out.println(sum);
		System.out.println(dup);
	}
}
