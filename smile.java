import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class smile extends Applet{
	public void paint(Graphics g)
	{
		g.drawOval(10,10,40,15);
		g.drawOval(90,10,40,15);
		g.drawLine(70,20,70,50);
		g.drawArc(40,50,50,20,180,180);
	}
}