import java.util.*;
interface base
{
	public void read(float x);
	public void calculate();
	public void display();
}
class sphere implements base
{
	protected float r,vol;
	public void read(float x)
	{
		r=x;
	}
	public void calculate()
	{
		vol=3.14f*r*r*r*4/3;
	}
	public void display( )
	{
		System.out.println("volume=" + vol);
	}
}
class hemisphere implements base
{
	protected float r,vol;
	public void read(float x)
	{
		r=x;
	}
	public void calculate()
	{
		vol=3.14f*r*r*r*2/3;
	}
	public void display()
	{
		System.out.println("volume=" + vol);
	}
}
class hemisp
{
	public static void main( String ags[])
	{
		float x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		x=sc.nextFloat();
		sphere s=new sphere();
		s.read(x);
		s.calculate();
		System.out.println("sphere:");
		s.display();
		hemisphere h=new hemisphere();
		h.read(x);
		h.calculate();
		System.out.println("Hemisphere");
		h.display();
	}
}