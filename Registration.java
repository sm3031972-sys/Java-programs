import javax.swing.*;
import java.awt.event.*;
public class Registration
{
Registration()
{
JFrame frame=new JFrame("Registration Form !!");
frame.setSize(400,350);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);

JLabel namelabel=new JLabel("Name");
namelabel.setBounds(50,50,100,20);
frame.add(namelabel);

JTextField namefield=new JTextField();
namefield.setBounds(150,50,150,20);
frame.add(namefield);

JLabel phonelabel=new JLabel("Phone No ");
phonelabel.setBounds(50,90,100,20);
frame.add(phonelabel);

JTextField phonefield=new JTextField();
phonefield.setBounds(150,90,150,20);
frame.add(phonefield);


JLabel emaillabel=new JLabel("E-mail");
emaillabel.setBounds(50,130,100,20);
frame.add(emaillabel);

JTextField emailfield=new JTextField();
emailfield.setBounds(150,130,150,20);
frame.add(emailfield);

JButton registerbtn=new JButton("Register");
registerbtn.setBounds(0,230,100,20);
frame.add(registerbtn);

registerbtn.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String name=namefield.getText();
String phone=phonefield.getText();
String email=emailfield.getText();

namefield.setText(name);
phonefield.setText(phone);
email
field.setText(email);
}
});


frame.setVisible(true);
}
public static void main(String args[])
{
Registration r=new Registration();
}
}



