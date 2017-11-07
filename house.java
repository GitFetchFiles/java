import java.awt.*;
import java.applet.*;

public class house extends Applet
{
	public void paint(Graphics gp)
	{
		int[] x={150,300,225};
		int[] y={150,150,25};
		gp.drawRect(150,150,150,200);
		gp.drawRect(200,200,50,50);
		gp.drawOval(200,75,50,50);
		gp.drawPolygon(x,y,3);
	}
	public static void main(String args[])
	{
		house obj=new house();
	}
}