//client side

import java.io.*;
import java.net.*;

class client
{
	public static void main(String a[])throws Exception
	{
		Socket s=new Socket("localhost",4999);
		PrintStream ps=new PrintStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String msg="";
		String msg1="Hi";
		ps.println(msg1);
		while(!((msg1=br.readLine()).equals("bye")))
		{
			System.out.println("Server:"+msg1);
			System.out.print("Enter the message:");
			msg=br1.readLine();
			ps.println(msg);
			if(msg.equals("bye"))
			{
				break;
			}
			
		}
		s.close();
	}
}
