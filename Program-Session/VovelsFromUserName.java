import java.util.Scanner;
class VovelsFromUserName 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		String str=sc.nextLine().toLowerCase();

		for(int i=0 ; i<str.length();i++){
			 char ch=str.charAt(i);

			 if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
				 System.out.println(ch + " ");
			 }
	}
}
}
