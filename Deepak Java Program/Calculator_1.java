import java.util.*;
class Calculator_1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char choice;
		do{

		System.out.println("enter you number 1");
		int num_1=sc.nextInt();
		System.out.println("enter you number 2");
		int num_2=sc.nextInt();
		System.out.println("Main Menu: \n1.Addition\n2.Substraction\n3.multiplication\n4.division\n5.Exit\n");
		choice=sc.next().charAt(0);
		int ans;
		switch(choice)
		{
			case 1:
				ans=num_1+num_2;
				System.out.println(ans);
				break;
			case 2:
				ans=num_1-num_2;
				System.out.println(ans);
				break;
			case 3:
				ans=num_1*num_2;
				System.out.println(ans);
				break;
			case 4:
				ans=num_1/num_2;
				System.out.println(ans);
				break;
			case 5:
				System.exit(0);
				break;
			default :
				System.out.println("invalid");
				break;
			
			
		}

	}
	while(choice!=5);
		
}
}
