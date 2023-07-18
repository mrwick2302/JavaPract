//Server side

import java.io.*;
import java.net.*;

class server{
	public static void main(String a[])throws Exception
	{
		ServerSocket ss=new ServerSocket(4999);
		System.out.println("Waiting...");
		Socket s=ss.accept();
		System.out.println("Connected...");
		PrintStream ps=new PrintStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		String msg="";
		String msg1="Hey";
		while(!((msg1=br.readLine()).equals("Bye")))
		{
			System.out.println("Server:"+msg1);
			System.out.print("Enter the Message :");
			msg=br1.readLine();
			ps.println(msg);
			if(msg.equals("Bye"))
			{
				break;
			}
		}
	s.close();
	}
}
