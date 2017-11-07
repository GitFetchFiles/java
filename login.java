import java.awt.*;
class Login extends Frame
{
TextField t1,t2;
Label l1,l2;
Button b1;
Login()
{
super("LOGIN PAGE");
t1=new TextField(5);
t2=new TextField(5);
l1=new Label("USER NAME");
l2=new Label("PASSWORD");
b1=new Button("LOGIN");
setLayout(new GridLayout(3,2));
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
}
public static void main(String args[])
{
Login l4=new Login();
l4.setSize(50,50);
l4.setVisible(true);
l4.setLocation(40,40);
}
}