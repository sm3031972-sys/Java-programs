import javax.swing.*;
class Windows
{
Windows()
{
JFrame f=new JFrame("registration form !!");
f.setSize(300,300);
f.setLayout(null);

JLabel label=new JLabel("enter number ");
label.setBounds(50,100,10
0,30);
f.add(label);

JTextField userText=new JTextField();
userText.setBounds(150,100,150,30);
f.add(userText);

f.setVisible(true);
}
public static void main(String args[])
{
Windows w=new Windows();
}
}
