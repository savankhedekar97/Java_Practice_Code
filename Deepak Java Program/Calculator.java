import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you number 1");
		int num_1=sc.nextInt();
		System.out.println("enter you number 2");
		int num_2=sc.nextInt();
		System.out.println("enter the operation you want (+,-,*,/)");
		String op=sc.next();
		int ans;
		switch(op)
		{
			case"+":
				ans=num_1+num_2;
				System.out.println(ans);
				break;
			case"-":
				ans=num_1-num_2;
				System.out.println(ans);
				break;
			case"*":
				ans=num_1*num_2;
				System.out.println(ans);
				break;
			case"/":
				ans=num_1/num_2;
				System.out.println(ans);
				break;
			default:
				System.out.println("invalid operation selected");
				break;
			
		}

	}
		
}
