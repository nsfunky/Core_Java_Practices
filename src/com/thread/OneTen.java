package com.thread;

import java.applet.Applet;
import java.awt.*;

public class OneTen extends Applet implements Runnable
{
	Thread m1,m2;
	int i,j;
	public OneTen()
	{
		i=1;
		j=10;
		setBackground(Color.pink);
		m1=new Thread(this,"A");
		m2=new Thread(this,"B");
		m1.start();
		m2.start();
	}
	public void paint(Graphics g)
	{
		g.setFont(new Font("TimesRoman",Font.BOLD,30));
		setForeground(Color.blue);
		g.drawString(String.valueOf(i),50,100);
		g.drawString(String.valueOf(j),250,100);
	}
	public void run()
	{
		for(;;)
		{
			try
			{
				Thread.sleep(1000);
				if(Thread.currentThread()==m1)
				{
					i++;
					if(i>10)
						i=1;
				}
				else if(Thread.currentThread()==m2)
				{
					j--;
					if(j<1)
						j=10;
				}
			}
			catch(Exception e)
			{
			}
		repaint();
		}
	}
}

/*
<html>
<applet code="OneTen.class"
height=300
width=300>
</applet>
</html>
*/
