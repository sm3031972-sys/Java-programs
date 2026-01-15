import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator2 implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclr,bdel,bequ,bp;
    JTextField t1;
    static double a,b,c=0;
    static int operator=0;

    public Calculator2(){
    JFrame frame=new JFrame("Calculator");
    frame.setSize(400,450);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    t1=new JTextField();
    t1.setBounds(80,30,240,40);
    frame.add(t1);

    b1=new JButton("1");
    b1.setBounds(80,70,50,40);
    frame.add(b1);

    b2=new JButton("2");
    b2.setBounds(140,70,50,40);
    frame.add(b2);

    b3=new JButton("3");
    b3.setBounds(200,70,50,40);
    frame.add(b3);
    
    badd=new JButton("+");
    badd.setBounds(260,70,50,40);
    frame.add(badd);

    b4=new JButton("4");
    b4.setBounds(80,120,50,40);
    frame.add(b4);

    b5=new JButton("5");
    b5.setBounds(140,120,50,40);
    frame.add(b5);

    b6=new JButton("6");
    b6.setBounds(200,120,50,40);
    frame.add(b6);

    bsub=new JButton("-");
    bsub.setBounds(260,120,50,40);
    frame.add(bsub);

    b7=new JButton("7");
    b7.setBounds(80,170,50,40);
    frame.add(b7);

    b8=new JButton("8");
    b8.setBounds(140,170,50,40);
    frame.add(b8);

    b9=new JButton("9");
    b9.setBounds(200,170,50,40);
    frame.add(b9);

    bmul=new JButton("*");
    bmul.setBounds(260,170,50,40);
    frame.add(bmul);

    bp=new JButton(".");
    bp.setBounds(80,220,50,40);
    frame.add(bp);

    b0=new JButton("0");
    b0.setBounds(140,220,50,40);
    frame.add(b0);

    bdel=new JButton("del");
    bdel.setBounds(200,220,60,40);
    frame.add(bdel);

    bdiv=new JButton("/");
    bdiv.setBounds(260,220,50,40);
    frame.add(bdiv);

    bclr=new JButton("clr");
    bclr.setBounds(80,270,50,40);
    frame.add(bclr);

    bequ=new JButton("=");
    bequ.setBounds(140,270,170,40);
    frame.add(bequ);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    bp.addActionListener(this);
    badd.addActionListener(this);
    bsub.addActionListener(this);
    bmul.addActionListener(this);
    bdiv.addActionListener(this);
    bdel.addActionListener(this);
    bclr.addActionListener(this);
    bequ.addActionListener(this);
    
  
    
    frame.setVisible(true);
    }


    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1)
          t1.setText(t1.getText().concat("1"));
        
        if(e.getSource()==b2)
          t1.setText(t1.getText().concat("2"));

        if(e.getSource()==b3)
          t1.setText(t1.getText().concat("3"));

        if(e.getSource()==b4)
          t1.setText(t1.getText().concat("4"));

        if(e.getSource()==b5)
          t1.setText(t1.getText().concat("5"));

        if(e.getSource()==b6)
          t1.setText(t1.getText().concat("6"));

        if(e.getSource()==b7)
          t1.setText(t1.getText().concat("7"));

        if(e.getSource()==b8)
          t1.setText(t1.getText().concat("8"));

        if(e.getSource()==b9)
          t1.setText(t1.getText().concat("9"));

        if(e.getSource()==b0)
          t1.setText(t1.getText().concat("0"));

        if(e.getSource()==bp)
          t1.setText(t1.getText().concat("."));

        if(e.getSource()==badd){
          a=Double.parseDouble(t1.getText());
          operator=1;
          t1.setText("");
        }

        if(e.getSource()==bsub){
          a=Double.parseDouble(t1.getText());
          operator=2;
          t1.setText("");
        }
          
        if(e.getSource()==bmul){
          a=Double.parseDouble(t1.getText());
          operator=3;
          t1.setText("");
        }

        if(e.getSource()==bdiv){
          a=Double.parseDouble(t1.getText());
          operator=4;
          t1.setText("");
        }
         
         if(e.getSource()==bequ){
          b=Double.parseDouble(t1.getText());
          switch(operator){
            case 1:
              c=a+b;
              break;
            case 2:
              c=a-b;
              break;
            case 3:
              c=a*b;
              break;
            case 4:
              c=a/b;
              break;

            default:
              c=0;
              break;
          }
          t1.setText(""+c);
         }
          

        if(e.getSource()==bdel){
          String s1=t1.getText();
          t1.setText("");
          for(int i=0;i<s1.length()-1;i++){
            t1.setText(t1.getText()+s1.charAt(i));
          }
        }

        if(e.getSource()==bclr){
          t1.setText("");
        }

    }
    

    public static void main(String args[]){
        Calculator2 f=new Calculator2();
    }

}