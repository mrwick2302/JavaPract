import java.util.*;
class empdetail
{
	int eid;
	String ename;
	void getEmp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter emp id:");
		eid=s.nextInt();
		System.out.println("Enter emp name:");
		ename=s.next();
	}
	void showEmp()
	{
		System.out.println("Employee id:"+eid);
		System.out.println("Employee name:"+ename);
	}
}
class sal extends empdetail
{
	int sal;
	void getSal()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter emp salary:");
		sal=s.nextInt();
	}
	void showSal()
	{
		System.out.println("Employee Salary:"+sal);
	}
}
class company extends sal
{
	String cname;
	void getCom()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter company name:");
		cname=s.next();
	}
	void showCom()
	{
		System.out.println("Company name:"+cname);
	}
}
class emp
{
	public static void main(String arg[])
	{
		company c=new company();
		c.getEmp();
		c.getSal();
		c.getCom();
		System.out.println("\nplyee details:");
		c.showEmp();
		c.showSal();
		c.showCom();
	}
}