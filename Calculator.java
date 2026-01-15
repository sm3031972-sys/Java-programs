import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator{

    static double a,b,c=0;
    static int operator=0;

    public Calculator(){
    JFrame frame=new JFrame("Calculator");
    frame.setSize(400,450);
    frame.setLayout(null);

    JTextField t1=new JTextField();
    t1.setBounds(80,30,240,40);
    frame.add(t1);

    JButton b1=new JButton("1");
    b1.setBounds(80,70,50,40);
    frame.add(b1);

    JButton b2=new JButton("2");
    b2.setBounds(140,70,50,40);
    frame.add(b2);

    JButton b3=new JButton("3");
    b3.setBounds(200,70,50,40);
    frame.add(b3);
    
    JButton badd=new JButton("+");
    badd.setBounds(260,70,50,40);
    frame.add(badd);

    JButton b4=new JButton("4");
    b4.setBounds(80,120,50,40);
    frame.add(b4);

    JButton b5=new JButton("5");
    b5.setBounds(140,120,50,40);
    frame.add(b5);

    JButton b6=new JButton("6");
    b6.setBounds(200,120,50,40);
    frame.add(b6);

    JButton bsub=new JButton("-");
    bsub.setBounds(260,120,50,40);
    frame.add(bsub);

    JButton b7=new JButton("7");
    b7.setBounds(80,170,50,40);
    frame.add(b7);

    JButton b8=new JButton("8");
    b8.setBounds(140,170,50,40);
    frame.add(b8);

    JButton b9=new JButton("9");
    b9.setBounds(200,170,50,40);
    frame.add(b9);

    JButton bmul=new JButton("*");
    bmul.setBounds(260,170,50,40);
    frame.add(bmul);

    JButton bp=new JButton(".");
    bp.setBounds(80,220,50,40);
    frame.add(bp);

    JButton b0=new JButton("0");
    b0.setBounds(140,220,50,40);
    frame.add(b0);

    JButton bdel=new JButton("del");
    bdel.setBounds(200,220,60,40);
    frame.add(bdel);

    JButton bdiv=new JButton("/");
    bdiv.setBounds(260,220,50,40);
    frame.add(bdiv);

    JButton bclr=new JButton("clr");
    bclr.setBounds(80,270,50,40);
    frame.add(bclr);

    JButton bequ=new JButton("=");
    bequ.setBounds(140,270,170,40);
    frame.add(bequ);


    
   b1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        t1.setText(t1.getText().concat("1"));
    }
   });
    
    

    

    

    frame.setVisible(true);
    }
    

    public static void main(String args[]){
        Calculator f=new Calculator();
    }

}