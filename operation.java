import java.util.*;
class operation
{
	static void fibo(int term)
	{
		int t1=0,t2=1,t3=t1+t2;
		System.out.print("Series is:"+t1+"\t"+t2+"\t");
		for(int i=2;i<term;i++)
		{
			System.out.print(t3+"\t");
			t1=t2;
			t2=t3;
			t3=t1+t2;
		}
	}
	static void factorial(int no)
	{
		int res=1;
		for(int i=1;i<=no;i++)
		{
			res*=i;
		}
		System.out.println("Factorial is:"+res);
	}
	static void armstrong(int no)
	{
		int sum=0;
		int temp=no;	
		while(no!=0)
		{
			int dig=no%10;
			sum=sum+(dig*dig*dig);	
			no/=10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is armstrong no....");
		}
		else
		{
			System.out.println(temp+" is not armstrong no....");
		}
	}
	static void prime(int no)
	{
		int flag=1;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println(no+" is prime no....");
		}
		else
		{
			System.out.println(no+" is not prime no....");
		}
	}
	static void even(int no)
	{
		if(no%2==0)
		{
			System.out.println(no+" is even no....");
		}
		else
		{
			System.out.println(no+" is odd no....");
		}
	}
	static void pos(int no)
	{
		if(no>=0)
		{
			System.out.println(no+" is positive no....");
		}
		else
		{
			System.out.println(no+" is negative no....");
		}
	}
	public static void main(String a[])
	{
		int ch;
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n---------------------------\n");
			System.out.println("1.Fibonacci Series\n");
			System.out.println("2.Factorial\n");
			System.out.println("3.Armstrong\n");
			System.out.println("4.Prime\n");
			System.out.println("5.Even odd no\n");
			System.out.println("6.Positive And Negative no\n");
			System.out.println("7.Exit\n");
			System.out.println("Enter your choice:");
			ch=s.nextInt();
			System.out.println("\n---------------------------\n");
			switch(ch)
			{
				case 1:	
						System.out.println("How many term do you want:");
						int term=s.nextInt();
						fibo(term);
						break;
				case 2:	
						System.out.println("Enter the no:");
						int no=s.nextInt();
						factorial(no);
						break;
				case 3:	
						System.out.println("Enter the no:");
						int no1=s.nextInt();
						armstrong(no1);
						break;
				case 4:	
						System.out.println("Enter the no:");
						int no2=s.nextInt();
						prime(no2);
						break;
				case 5:	
						System.out.println("Enter the no:");
						int no3=s.nextInt();
						even(no3);
						break;
				case 6:	
						System.out.println("Enter the no:");
						int no4=s.nextInt();
						pos(no4);
						break;
				case 7:
						System.exit(0);

				default:
						System.out.println("Invalid choice....:");
			}
		}
	}
}