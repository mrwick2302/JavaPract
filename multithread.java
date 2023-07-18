class tdemo extends Thread
{
	public void run()
	{	
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		finally
		{
			System.out.println("Executed....");
		}
	}
}
class assignment_3
{
	public static void main(String a[])
	{
		tdemo t=new tdemo();
		tdemo t2=new tdemo();
		t.start();
		//t2.start();	
	}
}