import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EmployeeRegistrationForm implements ActionListener{
    JFrame frame;
    JLabel titlelabel,namelabel,agelabel,genderlabel,emaillabel,contactlabel,Deptlabel,addreslabel;
    JTextField namefield,agefield,emailfield,contactfield;
    JRadioButton malebutton,femalebutton;
    JComboBox<String> Deptcombobox;
    ButtonGroup gendergroup;
    JTextArea addressarea;
    JButton submitbtn,resetbtn;

    EmployeeRegistrationForm(){

        frame=new JFrame("Registration Form ");
        frame.setSize(700,750);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        titlelabel=new JLabel("Employee Registration Form");
        titlelabel.setBounds(120,10,500,30);
        titlelabel.setFont(new Font("Times New Roman",Font.BOLD,24));
        frame.add(titlelabel);

        namelabel=new JLabel("Name :");
        namelabel.setBounds(50,80,100,20);
        frame.add(namelabel);
        namefield=new JTextField();
        namefield.setBounds(150,80,300,20);
        frame.add(namefield);

        agelabel=new JLabel("Age :");
        agelabel.setBounds(50,120,100,20);
        frame.add(agelabel);
        agefield=new JTextField();
        agefield.setBounds(150,120,300,20);
        frame.add(agefield);

        genderlabel=new JLabel("Gender :");
        genderlabel.setBounds(50,160,100,20);
        frame.add(genderlabel);
        malebutton=new JRadioButton("male");
        malebutton.setBounds(150,160,80,30);
        frame.add(malebutton);
        femalebutton=new JRadioButton("female");
        femalebutton.setBounds(240,160,80,30);
        frame.add(femalebutton);
        gendergroup=new ButtonGroup();
        gendergroup.add(malebutton);
        gendergroup.add(femalebutton);

        emaillabel=new JLabel("E-mail :");
        emaillabel.setBounds(50,200,100,20);
        frame.add(emaillabel);
        emailfield=new JTextField();
        emailfield.setBounds(150,200,300,20);
        frame.add(emailfield);

        Deptlabel=new JLabel("Departments :");
        Deptlabel.setBounds(50,240,100,20);
        frame.add(Deptlabel);
        String[] departments={"HR","Finance","Marketing","IT"};
        Deptcombobox=new JComboBox<>(departments);
        Deptcombobox.setBounds(150,240,150,20);
        frame.add(Deptcombobox);

        contactlabel=new JLabel("Contact No :");
        contactlabel.setBounds(50,280,100,20);
        frame.add(contactlabel);
        contactfield=new JTextField();
        contactfield.setBounds(150,280,300,20);
        frame.add(contactfield);

        addreslabel=new JLabel("Address :");
        addreslabel.setBounds(50,320,100,20);
        frame.add(addreslabel);
        addressarea=new JTextArea();
        addressarea.setBounds(150,320,300,100);
        frame.add(addressarea);

        submitbtn=new JButton("Submit");
        submitbtn.setBounds(140,450,100,30);
        submitbtn.addActionListener(this);
        frame.add(submitbtn);

        resetbtn=new JButton("Reset");
        resetbtn.setBounds(140,500,100,30);
          resetbtn.addActionListener(this);
        frame.add(resetbtn);

        frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==submitbtn){
            String name=namefield.getText();
            String age=agefield.getText();
            String dept=(String)Deptcombobox.getSelectedItem();
            String email=emailfield.getText();
            String contact=contactfield.getText();
            String address=addressarea.getText();
            String gender=malebutton.isSelected() ?"male":(femalebutton.isSelected()?"female":"");

            JFrame DeatailsFrame=new JFrame("Emplyoee Registered Details");
            DeatailsFrame.setSize(500,400);
            DeatailsFrame.setLayout(new GridLayout(7,1,10,10));

            DeatailsFrame.setLocationRelativeTo(null);

            DeatailsFrame.add(new JLabel("Name :"+name));
            DeatailsFrame.add(new JLabel("age :"+age));
            DeatailsFrame.add(new JLabel("email :"+email));
            DeatailsFrame.add(new JLabel("Gender :"+gender));
            DeatailsFrame.add(new JLabel("department :"+dept));
            DeatailsFrame.add(new JLabel("Contact No :"+contact));
            DeatailsFrame.add(new JLabel("Address :"+address));

            JButton closebutton=new JButton("close");
            closebutton.addActionListener(ev-> DeatailsFrame.dispose());
            DeatailsFrame.add(closebutton);


            DeatailsFrame.setVisible(true);
        }
        else if(e.getSource()==resetbtn)
        {
            namefield.setText("");
            agefield.setText("");
            emailfield.setText("");
            contactfield.setText("");
            addressarea.setText("");
            gendergroup.clearSelection();
            Deptcombobox.setSelectedIndex(0);

        }
    }


    public static void main(String args[]){
        new EmployeeRegistrationForm();
    }

}