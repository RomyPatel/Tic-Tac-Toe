package classes;
 
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
public class Board{
     private JFrame f,f_d;
     private JPanel p;
     private JLabel l,lb;
     private JButton b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9 , b_q , b_r;
     String b1t,b2t,b3t,b4t,b5t,b6t,b7t,b8t,b9t;
     String s1,s2;
     int turn=0,count1,count2;
     boolean c1=false,c2=false,c3=false,c4=false,c5=false,c6=false,c7=false,c8=false,c9=false,check=false;  
     AddFont obj = new AddFont();
     GetNames object = new GetNames();
     public Board(){
         gui();
     }
     
     public void gui(){
         f = new JFrame("tic-tac-toe");
         f.setVisible(true);
         f.setSize(1000,1000);
         f.getContentPane().setBackground(new Color(0,51,25));
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         p = new JPanel(new GridBagLayout());
         p.setBackground(new Color(0,51,25));
         p.setSize(1500,1500);

         s1 = object.pplayer1;
         s2 = object.pplayer2;
         
         l = new JLabel();
         l.setText(s1);
         l.setBounds(1,1,330,130);
         l.setBackground(new Color(0,51,25));
         l.setForeground(new Color(255,204,153));
         l.setFont(obj.IndieFlower); 
         
         b1 = new JButton("1");
         b1.setPreferredSize(new Dimension(120,90));
         b1.setBackground(new Color(255,204,153));
         b1.setOpaque(true);
         Font ft = new Font("SERIF",Font.BOLD,25);
         b1.setFont(ft);
         
         b2 = new JButton("2");
         b2.setPreferredSize(new Dimension(120,90));
         b2.setBackground(new Color(255,204,153));
         b2.setOpaque(true);
         b2.setFont(ft);
         
         b3 = new JButton("3");
         b3.setPreferredSize(new Dimension(120,90));
         b3.setBackground(new Color(255,204,153));
         b3.setOpaque(true);
         b3.setFont(ft);
         
         b4 = new JButton("4");
         b4.setPreferredSize(new Dimension(120,90));
         b4.setBackground(new Color(255,204,153));
         b4.setOpaque(true);
         b4.setFont(ft);
         
         b5 = new JButton("5");
         b5.setPreferredSize(new Dimension(120,90));
         b5.setBackground(new Color(255,204,153));
         b5.setOpaque(true);
         b5.setFont(ft);
         
         b6 = new JButton("6");
         b6.setPreferredSize(new Dimension(120,90));
         b6.setBackground(new Color(255,204,153));
         b6.setOpaque(true);
         b6.setFont(ft);
         
         b7 = new JButton("7");
         b7.setPreferredSize(new Dimension(120,90));
         b7.setBackground(new Color(255,204,153));
         b7.setOpaque(true);
         b7.setFont(ft);
         
         b8 = new JButton("8");
         b8.setPreferredSize(new Dimension(120,90));
         b8.setBackground(new Color(255,204,153));
         b8.setOpaque(true);
         b8.setFont(ft);
         
         b9 = new JButton("9");
         b9.setPreferredSize(new Dimension(120,90));
         b9.setBackground(new Color(255,204,153));
         b9.setOpaque(true);
         b9.setFont(ft);
         
         b_q = new JButton("Quit");
         b_q.setBounds(800,860,130,75);
         b_q.setBackground(new Color(0,51,25));
         b_q.setForeground(Color.WHITE);
         Font ft1 = new Font("SERIF",Font.PLAIN,16);
         b_q.setFont(ft1);

         b_r = new JButton("Restart");
         b_r.setBounds(60,860,130,75);
         b_r.setBackground(new Color(0,51,25));
         b_r.setOpaque(true);
         b_r.setForeground(Color.WHITE);
         //Font ft1 = new Font("SERIF",Font.PLAIN,16);
         b_r.setFont(ft1);
         
         
         GridBagConstraints c =new GridBagConstraints();
         c.insets = new Insets(6,6,6,6);
         c.gridx=0;
         c.gridy=1;
         p.add(b1,c);
         
         c.gridx=3;
         c.gridy=1;
         p.add(b2,c);
         
         c.gridx=6;
         c.gridy=1;
         p.add(b3,c);
         
         c.gridx=0;
         c.gridy=2;
         p.add(b4,c);
         
         c.gridx=3;
         c.gridy=2;
         p.add(b5,c);
         
         c.gridx=6;
         c.gridy=2;
         p.add(b6,c);
         
         c.gridx=0;
         c.gridy=3;
         p.add(b7,c);
         
         c.gridx=3;
         c.gridy=3;
         p.add(b8,c);
         
         c.gridx=6;
         c.gridy=3;
         p.add(b9,c);
         
         b1.addActionListener(new Action1());
         b2.addActionListener(new Action2());
         b3.addActionListener(new Action3());
         b4.addActionListener(new Action4());
         b5.addActionListener(new Action5());
         b6.addActionListener(new Action6());
         b7.addActionListener(new Action7());
         b8.addActionListener(new Action8());
         b9.addActionListener(new Action9());
         p.add(l);
         f.add(p);
         f.add(p,BorderLayout.CENTER);
     }
     
    
     class Action1 implements ActionListener{
         public void actionPerformed(ActionEvent ae){
             b1.setPreferredSize(new Dimension(100,70));
             if(!c1){
               if((turn%2)==0){
                  b1.setText("O"); 
                  l.setText(s2);
               }
               else{
                   b1.setText("X");
                   l.setText(s1); 
               }
               turn++;
             }
             c1=true;
             winner();
         }
         
     }
     class Action2 implements ActionListener{
         public void actionPerformed(ActionEvent ae){
             b2.setPreferredSize(new Dimension(100,70));
             if(!c2){
               if((turn%2)==0){
                  b2.setText("O"); 
                  l.setText(s2);
               }
               else{
                   b2.setText("X"); 
                   l.setText(s1);
               }
               turn++;
             }
             c2=true;
             winner();
         }
         
     }
     class Action3 implements ActionListener{
         public void actionPerformed(ActionEvent ae){
             b3.setPreferredSize(new Dimension(100,70));
             if(!c3){
               if((turn%2)==0){
                  b3.setText("O"); 
                  l.setText(s2);
               }
               else{
                   b3.setText("X");
                   l.setText(s1); 
               }
               turn++;
             }
             c3=true;
             winner();
         }
         
     }
     class Action4 implements ActionListener{
         public void actionPerformed(ActionEvent ae){
             b4.setPreferredSize(new Dimension(100,70));
             if(!c4){
               if((turn%2)==0){
                  b4.setText("O"); 
                  l.setText(s2);
               }
               else{
                   b4.setText("X"); 
                   l.setText(s1);
               }
               turn++;
             }
             c4=true;
             winner();
         }
     }
     class Action5 implements ActionListener{
         public void actionPerformed(ActionEvent ae){
             b5.setPreferredSize(new Dimension(100,70));
             if(!c5){
               if((turn%2)==0){
                  b5.setText("O"); 
                  l.setText(s2);
               }
               else{
                   b5.setText("X"); 
                   l.setText(s1);
               }
               turn++;
             }
             c5=true;
             winner();
         }
     }
     class Action6 implements ActionListener{
         public void actionPerformed(ActionEvent ae){
             b6.setPreferredSize(new Dimension(100,70));
             if(!c6){
               if((turn%2)==0){
                  b6.setText("O"); 
                  l.setText(s2);
               }
               else{
                   b6.setText("X");
                   l.setText(s1); 
               }
               turn++;
             }
             c6=true;
             winner();
         }
     }
     class Action7 implements ActionListener{
         public void actionPerformed(ActionEvent ae){
             b7.setPreferredSize(new Dimension(100,70));
             if(!c7){
               if((turn%2)==0){
                  b7.setText("O");
                  l.setText(s2); 
               }
               else{
                   b7.setText("X");
                   l.setText(s1); 
               }
               turn++;
             }
             c7=true;
             winner();
         }
     }
     class Action8 implements ActionListener{
         public void actionPerformed(ActionEvent ae){
             b8.setPreferredSize(new Dimension(100,70));
             if(!c8){
               if((turn%2)==0){
                  b8.setText("O");
                  l.setText(s2); 
               }
               else{
                   b8.setText("X");
                   l.setText(s1); 
               }
               turn++;
             }
             c8=true;
             winner();
         }
     }
     class Action9 implements ActionListener{
         public void actionPerformed(ActionEvent ae){
             b9.setPreferredSize(new Dimension(100,70));
             if(!c9){
               if((turn%2)==0){
                  b9.setText("O"); 
                  l.setText(s2);
               }
               else{
                   b9.setText("X");
                   l.setText(s1); 
               }
               turn++;
             }
             c9=true;
             winner();
         }
     }
 
     public void getText(){
         
         b1t=b1.getText();
         b2t=b2.getText();
         b3t=b3.getText();
         b4t=b4.getText();
         b5t=b5.getText();
         b6t=b6.getText();
         b7t=b7.getText();
         b8t=b8.getText();
         b9t=b9.getText();
     } 
      
     public void winner(){
        getText();
        if((b1t=="X" && b4t=="X" && b7t=="X")||(b2t=="X" && b5t=="X" && b8t=="X")||(b3t=="X" && b6t=="X" && b9t=="X")||
           (b1t=="X" && b5t=="X" && b9t=="X")||(b3t=="X" && b5t=="X" && b7t=="X")||(b1t=="X" && b2t=="X" && b3t=="X")||
           (b4t=="X" && b5t=="X" && b6t=="X")||(b7t=="X" && b8t=="X" && b9t=="X")){
            update2();
            lb = new JLabel(" ",JLabel.CENTER);
            lb.setText(s2+" wins! ");
            check = true;
       }
       if((b1t=="O" && b4t=="O" && b7t=="O")||(b2t=="O" && b5t=="O" && b8t=="O")||(b3t=="O" && b6t=="O" && b9t=="O")||
          (b1t=="O" && b5t=="O" && b9t=="O")||(b3t=="O" && b5t=="O" && b7t=="O")||(b1t=="O" && b2t=="O" && b3t=="O")||
           (b4t=="O" && b5t=="O" && b6t=="O")||(b7t=="O" && b8t=="O" && b9t=="O")){
            update1();
            lb = new JLabel(" ",JLabel.CENTER);
            lb.setText(s1+" wins! ");
            check = true;
       }
       if(c1&&c2&&c3&&c4&&c5&&c6&&c7&&c8&&c9){
            
            lb = new JLabel("It's a tie ",JLabel.CENTER);
            check = true;
            
       }
       if(check){
        b_q.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                   System.exit(0);
              }
        });
        b_r.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent arg0){
                 MainPage obj = new MainPage(); 
                 f_d.setVisible(false);
             }
         });

        lb.setForeground(Color.BLACK);
        lb.setBounds(400,100,800,130);
        lb.setFont(obj.IndieFlower);
        f_d = new JFrame("Winner");
        f_d.setVisible(true);
        f_d.setSize(1000,1000);
        f_d.getContentPane().setBackground(new Color(255,204,153));
        f_d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(false);
        f_d.add(b_q);
        f_d.add(b_r);
        f_d.add(lb);
       }
       
     }
     
     public static void main(String args[]){
         new Board();
     }
     public void update1(){
      if(object.conf1 ==1){      
            try{  
                int a;
                FileReader fr = new FileReader(s1); 
                a=fr.read() ;
                count1=Character.getNumericValue(a);
                count1++;
                fr.close();
                }
             catch(IOException ie){}
             try{
                 FileWriter fw = new FileWriter(s1);
                 fw.write(new Integer(count1).toString());
                 fw.close();
                 }
              catch(IOException ie){} 
        }
     }
     public void update2(){
      if(object.conf2 ==1){      
            try{  
                int a;
                FileReader fr = new FileReader(s2); 
                a=fr.read() ;
                count2=Character.getNumericValue(a);
                count2++;
                fr.close();
                }
             catch(IOException ie){}
             try{
                 FileWriter fw = new FileWriter(s2);
                 fw.write(new Integer(count2).toString());
                 fw.close();
                 }
              catch(IOException ie){} 
        }
     }
 }
 