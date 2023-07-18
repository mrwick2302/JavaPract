interface display
{
	public void disp();
}
interface print
{
	public void show();
}
class demo implements display,print
{
	public void disp()
	{
		System.out.println("Display call....");
	}
	public void show()
	{
		System.out.println("Show call....");
	}
	public static void main(String a[])
	{
		demo d=new demo();
		d.disp();
		d.show();
	}	
}