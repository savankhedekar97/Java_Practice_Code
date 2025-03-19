class ReverseNo
{
	public static void main(String[]args)
	{
		int a=10;
		int b=20;
		System.out.println("before reverse the number");
		System.out.print(a);
                System.out.print(b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
                System.out.println("After reverse the number");
		System.out.println(a);
		System.out.println(b);


	}

}