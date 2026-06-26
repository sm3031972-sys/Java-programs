import java.awt.*;
import java.awt.event.*;
public class RegistrationFormStudent implements ActionListener{
    Frame frame;
    Label titlelabel,rolllabel,prnlabel,namelabel,agelabel,birthdatelabel,genderlabel,courselabel,
          branchlabel,clglabel,emaillabel,contactlabel,hobbylabel,addreslabel;
    TextField rollfield,prnfield,namefield,agefield,birthdatefield,clgfield,emailfield,
              contactfield,hobbyfield;
    TextArea addressarea;
    Choice genderchoice,coursechoice, branchchoice; 
    Button SubmitBtn,ResetBtn;

    RegistrationFormStudent() {
        frame=new Frame("Student Registration Form");
        frame.setSize(700,750);
        frame.setLayout(null);
             
        titlelabel=new Label("Student Registration Form");
        titlelabel.setBounds(150,30,400,30);
        frame.add(titlelabel);

        rolllabel=new Label("ROll No :");
        rolllabel.setBounds(50,80,100,20);
        frame.add(rolllabel);
        rollfield=new TextField();
        rollfield.setBounds(200,80,200,20);
        frame.add(rollfield);

        prnlabel=new Label("PRN NO :");
        prnlabel.setBounds(50,120,100,20);
        frame.add(prnlabel);
        prnfield=new TextField();
        prnfield.setBounds(200,120,200,20);
        frame.add(prnfield);
        
        namelabel=new Label("Name:");
        namelabel.setBounds(50,160,100,20);
        frame.add(namelabel);
        namefield=new TextField();
        namefield.setBounds(200,160,200,20);
        frame.add(namefield);

        agelabel=new Label("Age :");
        agelabel.setBounds(50,200,100,20);
        frame.add(agelabel);
        agefield=new TextField();
        agefield.setBounds(200,200,200,20);
        frame.add(agefield);

        birthdatelabel=new Label("Birth Date(dd/mm/yy) :");
        birthdatelabel.setBounds(50,240,100,20);
        frame.add(birthdatelabel);
        birthdatefield=new TextField();
        birthdatefield.setBounds(200,240,200,20);
        frame.add(birthdatefield);

        genderlabel=new Label("Gender :");
        genderlabel.setBounds(50,280,100,20);
        frame.add(genderlabel);
        genderchoice=new Choice();
        genderchoice.setBounds(200,280,200,20);
        genderchoice.add("MALE");
        genderchoice.add("FEMALE");
        genderchoice.add("OTHER");
        frame.add(genderchoice);

        courselabel=new Label("Course :");
        courselabel.setBounds(50,320,100,20);
        frame.add(courselabel);
        coursechoice=new Choice();
        coursechoice.setBounds(200,320,200,20);
        coursechoice.add("B.tech");
        coursechoice.add("BSC");
        coursechoice.add("BCA");
        coursechoice.add("MBA");
       frame.add(coursechoice);

        branchlabel=new Label("Branch :");
        branchlabel.setBounds(50,360,100,20);
        frame.add(branchlabel);
        branchchoice=new Choice();
        branchchoice.setBounds(200,360,200,20);
        branchchoice.add("CSE");
        branchchoice.add("Mechanical");
        branchchoice.add("Electrical");
        branchchoice.add("Civil");
        frame.add(branchchoice);

        clglabel=new Label("Colleg Name :");
        clglabel.setBounds(50,400,100,20);
        frame.add(clglabel);
        clgfield=new TextField();
        clgfield.setBounds(200,400,200,20);
        frame.add(clgfield);

        emaillabel=new Label("E-mail :");
        emaillabel.setBounds(50,440,100,20);
        frame.add(emaillabel);
        emailfield=new TextField();
        emailfield.setBounds(200,440,200,20);
        frame.add(emailfield);

        contactlabel=new Label("Contact No :");
        contactlabel.setBounds(50,480,100,20);
        frame.add(contactlabel);
        contactfield=new TextField();
        contactfield.setBounds(200,480,200,20);
        frame.add(contactfield);

        hobbylabel=new Label("Hobby :");
        hobbylabel.setBounds(50,520,100,20);
        frame.add(hobbylabel);
        hobbyfield=new TextField();
        hobbyfield.setBounds(200,520,200,20);
        frame.add(hobbyfield);

        addreslabel=new Label("Address :");
        addreslabel.setBounds(50,560,100,20);
        frame.add(addreslabel);
        addressarea=new TextArea();
        addressarea.setBounds(200,560,250,80);
        frame.add(addressarea);

        SubmitBtn=new Button("Submit");
        SubmitBtn.setBounds(200,660,80,30);
        SubmitBtn.addActionListener(this);
        frame.add(SubmitBtn);

        ResetBtn=new Button("Reset");
        ResetBtn.setBounds(200,700,80,30);
        ResetBtn.addActionListener(this);
        frame.add(ResetBtn);

        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==SubmitBtn){
            String rollno=rollfield.getText();             
            String prnno=prnfield.getText();
            String name=namefield.getText();
            String age=agefield.getText();
            String gender=genderchoice.getSelectedItem();
            String course=coursechoice.getSelectedItem();
            String branch=branchchoice.getSelectedItem();
            String clg=clgfield.getText();
            String email=emailfield.getText();
            String contact=contactfield.getText();
            String hobby=hobbyfield.getText();
            String address=addressarea.getText();

            String info="Student Details:\n"+"\n"
                        +"Roll No : " + rollno + "\n"
                        +"PRN No : " + prnno + "\n"
                        +"Name : " + name + "\n"
                        +"Age : " + age + "\n"
                        +"Gender : " + gender + "\n"
                        +"Course : " + course + "\n"
                        +"Branch : " + branch + "\n"
                        +"College Name : " + clg + "\n"
                        +"Email : " + email + "\n"
                        +"Contact No : " + contact + "\n"
                        +"Hobby : " + hobby + "\n"
                        +"Address : " + address;

            Dialog dialog=new Dialog(frame,"Submitted Data",true);
            TextArea ta=new TextArea(info,20,50);
            ta.setEditable(false);
            dialog.add(ta);
            dialog.setSize(500,500);
            
            dialog.setVisible(true);

            
        }
        else if(ae.getSource()==ResetBtn)
        {
            rollfield.setText("");
            prnfield.setText("");
            namefield.setText("");
            agefield.setText("");
            birthdatefield.setText("");
            emailfield.setText("");
            contactfield.setText("");
            clgfield.setText("");
            hobbyfield.setText("");
            addressarea.setText("");
            genderchoice.select(0);
            coursechoice.select(0);
            branchchoice.select(0);

        }
    }


    public static void main(String args[]){
        RegistrationFormStudent r=new RegistrationFormStudent();
    }


          
}