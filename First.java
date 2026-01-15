import javax.swing.*;
import java.awt.event.*;
class First 
{
First()
{
JFrame f=new JFrame("login page");

f.setSize(300,300);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



JLabel l=new JLabel("username :");
l.setBounds(50,50,100,30);
f.add(l);

JTextField t=new JTextField();
t.setBounds(150,50,150,30);
f.add(t);

JLabel p=new JLabel("Password : ");
p.setBounds(50,100,100,30);
f.add(p);

JPasswordField pt=new JPasswordField();
pt.setBounds(150,100,150,30);
f.add(pt);

JButton login=new JButton("LOGIN");
login.setBounds(150,150,100,login0);
f.add(login);

login.addActionListner(new ActionListner())
{
void actiomPerformed(ActionEvent e)
{
String username=t.getText();
String Password=pt.getPassword();
}
}

f.setVisible(true);
}
public static void main(String args[])
{
First f=new First();
}
}