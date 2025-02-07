import java.util.Scanner;
class Operator2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter character :");
		char ch=sc.next().charAt(0);

		String op=((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?
			((ch>='a' && ch<='z')?(ch + "is a lower case character"):
			 (ch +"is a upper case character")):
			((ch>='0' && ch<='9')?(ch + "is a digit"):
			(ch + "is a special character"));

		System.out.println(op);
	}
}
