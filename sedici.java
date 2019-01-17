import javax.swing.*;

import java.lang.Object;
import java.awt.*;

import java.util.EventObject;
import javax.swing.JLabel;
import java.awt.event.*;
class myframe extends JFrame implements ActionListener{
JLabel e1, e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16, numeromosse;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
int mosse=0;
ImageIcon ico =new ImageIcon("frecciasu.png");
ImageIcon ico2 =new ImageIcon("frecciadx.png");
ImageIcon ico3 =new ImageIcon("frecciagiu.jpg");
ImageIcon ico4 =new ImageIcon("frecciasx.jpg");
public myframe(){ //costruttore
super("Rimetti i numeri in ordine!");
Container c=this.getContentPane();
c.setLayout(new GridLayout(6,6));
b1=new JButton();
b1.setIcon(ico);
b2=new JButton();
b2.setIcon(ico);
b3=new JButton();
b3.setIcon(ico);
b4=new JButton();
b4.setIcon(ico);
b5=new JButton();
b5.setIcon(ico4);
b6=new JButton();
b6.setIcon(ico2);
b7=new JButton();
b7.setIcon(ico4);
b8=new JButton();
b8.setIcon(ico2);
b9=new JButton();
b9.setIcon(ico4);
b10=new JButton();
b10.setIcon(ico2);
b11=new JButton();
b11.setIcon(ico4);
b12=new JButton();
b12.setIcon(ico2);
b13=new JButton();
b13.setIcon(ico3);
b14=new JButton();
b14.setIcon(ico3);
b15=new JButton();
b15.setIcon(ico3);
b16=new JButton();
b16.setIcon(ico3);
e1=new JLabel("  1");
e2=new JLabel("  2");
e3=new JLabel("  3");
e4=new JLabel("  4");
e5=new JLabel("  5");
e6=new JLabel("  6");
e7=new JLabel("  7");
e8=new JLabel("  8");
e9=new JLabel("  9");
e10=new JLabel("  10");
e11=new JLabel("  11");
e12=new JLabel("  12");
e13=new JLabel("  13");
e14=new JLabel("  14");
e15=new JLabel("  15");
e16=new JLabel("  16");
numeromosse=new JLabel("Mosse "+ String.valueOf(mosse));
c.add(new JLabel()); //prima riga
c.add(b1);
c.add(b2);
c.add(b3);
c.add(b4);

c.add(new JLabel());
c.add(b5);//seconda riga
c.add(e1); 
c.add(e2);
c.add(e3);
c.add(e4);
c.add(b6);

c.add(b7); //terza riga
c.add(e5);
c.add(e6);
c.add(e7);
c.add(e8);
c.add(b8);

c.add(b9); //quarta riga
c.add(e9); 
c.add(e10);
c.add(e11);
c.add(e12);
c.add(b10);

c.add(b11); //quinta riga
c.add(e13);
c.add(e14);
c.add(e15);
c.add(e16);
c.add(b12);

c.add(new JLabel()); //sesta riga
c.add(b13);
c.add(b14);
c.add(b15);
c.add(b16);
c.add(numeromosse);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);

setSize(700,700);
setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
                   //metodi
public void actionPerformed(ActionEvent e){
Object pulsantepremuto=e.getSource();
if (pulsantepremuto==b5 || pulsantepremuto==b6) primariga(pulsantepremuto);
if (pulsantepremuto==b7 || pulsantepremuto==b8) secondariga(pulsantepremuto);
if (pulsantepremuto==b9 ||pulsantepremuto==b10) terzariga(pulsantepremuto);
if (pulsantepremuto==b11 ||pulsantepremuto==b12) quartariga(pulsantepremuto);
if (pulsantepremuto==b1 ||pulsantepremuto==b13) primacolonna(pulsantepremuto);
if (pulsantepremuto==b2 ||pulsantepremuto==b14) secondacolonna(pulsantepremuto);
if (pulsantepremuto==b3 ||pulsantepremuto==b15) terzacolonna(pulsantepremuto);
if (pulsantepremuto==b4 ||pulsantepremuto==b16) quartacolonna(pulsantepremuto);
mosse=mosse+1;
numeromosse.setText("Mosse "+String.valueOf(mosse));
}
public void primariga(Object b) {
String a;
if (b==b5) {
a=e1.getText();
e1.setText(e2.getText());
e2.setText(e3.getText());
e3.setText(e4.getText());
e4.setText(a);
}
else  {
a=e4.getText();
e4.setText(e3.getText());
e3.setText(e2.getText());
e2.setText(e1.getText());
e1.setText(a); }
}


public void secondariga(Object b) {
String a;
if (b==b7) {
a=e5.getText();
e5.setText(e6.getText());
e6.setText(e7.getText());
e7.setText(e8.getText());
e8.setText(a);
}
else  {
a=e8.getText();
e8.setText(e7.getText());
e7.setText(e6.getText());
e6.setText(e5.getText());
e5.setText(a); }
}

public void terzariga(Object b) {
String a;
if (b==b9) {
a=e9.getText();
e9.setText(e10.getText());
e10.setText(e11.getText());
e11.setText(e12.getText());
e12.setText(a);
}
else  {
a=e12.getText();
e12.setText(e11.getText());
e11.setText(e10.getText());
e10.setText(e9.getText());
e9.setText(a); }
}
public void quartariga(Object b) {
String a;
if (b==b11) {
a=e13.getText();
e13.setText(e14.getText());
e14.setText(e15.getText());
e15.setText(e16.getText());
e16.setText(a);
}
else  {
a=e16.getText();
e16.setText(e15.getText());
e15.setText(e14.getText());
e14.setText(e13.getText());
e13.setText(a); }
}

public void primacolonna(Object b) {
String a;
if (b==b1) {
a=e1.getText();
e1.setText(e5.getText());
e5.setText(e9.getText());
e9.setText(e13.getText());
e13.setText(a);
}
else  {
a=e13.getText();
e13.setText(e9.getText());
e9.setText(e5.getText());
e5.setText(e1.getText());
e1.setText(a); }
}

public void secondacolonna(Object b) {
String a;
if (b==b2) {
a=e2.getText();
e2.setText(e6.getText());
e6.setText(e10.getText());
e10.setText(e14.getText());
e14.setText(a);
}
else  {
a=e14.getText();
e14.setText(e10.getText());
e10.setText(e6.getText());
e6.setText(e2.getText());
e2.setText(a); }
}

public void terzacolonna(Object b) {
String a;
if (b==b3) {
a=e3.getText();
e3.setText(e7.getText());
e7.setText(e11.getText());
e11.setText(e15.getText());
e15.setText(a);
}
else  {
a=e15.getText();
e15.setText(e11.getText());
e11.setText(e7.getText());
e7.setText(e3.getText());
e3.setText(a); }
}

public void quartacolonna(Object b) {
String a;
if (b==b4) {
a=e4.getText();
e4.setText(e8.getText());
e8.setText(e12.getText());
e12.setText(e16.getText());
e16.setText(a);
}
else  {
a=e16.getText();
e16.setText(e12.getText());
e12.setText(e8.getText());
e8.setText(e4.getText());
e4.setText(a); }
}
}
public class sedici {
public static void main(String[] args){
myframe f=new myframe();
}}


