import java.awt.*;
class Registration extends Frame
{
TextField t1,t2,t3,t4,t5;
Label l1,l2,l3,l4,l5;
Button b1;
Registration()
{
super("LOGIN PAGE");
t1=new TextField(5);
t2=new TextField(5);
t3=new TextField(5);
t4=new TextField(5);
t5=new TextField(5);
l1=new Label("NAME");
l2=new Label("email");
l3=new Label("address");
l4=new Label("phone no");
l5=new Label("state");
b1=new Button("LOGIN");
setLayout(new GridLayout(6,5));
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
add(l5);
add(t5);
add(b1);
}
public static void main(String args[])
{

Registration r1=new Registration();
r1.setSize(50,50);
r1.setVisible(true);
r1.setLocation(40,40);
}
}