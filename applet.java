import java.awt.*;
import java.applet.*;

public class slip3_java2 extends Applet implements Runnable
{
	int y=400;
	Thread th=null;

	public void paint(Graphics g)
	{
		int r=(int)(Math.random()*255);
		int gr=(int)(Math.random()*255);
		int b=(int)(Math.random()*255);
		Color c=new Color(r,gr,b);
		g.setColor(c);
		g.fillOval(200,y,100,100);
	
	} 
	public void init()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		try
		{
			int i=1;
			while(true)
			{
				if(y>0 && i==1)
				{
					y=y-5;
					repaint();
					th.sleep(100);
				}
				else if(y<=0 && i==1)
				{
					i=2;
				}
				else if(y<=400 && i==2)
				{
					y=y+5;
					repaint();
					th.sleep(100);
				}
				else
				{
					i=1;
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
/<applet code="slip3_java2.class" width=400 height=400></applet>/