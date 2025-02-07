import java.util.Scanner;
class VovelOrConconent 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter character :");
		char ch=sc.next().charAt(0);

		String ans=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?(ch + " is a vovel"):(ch + " is a consonent");
		System.out.println(ans);
	}
}
