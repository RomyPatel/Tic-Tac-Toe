package classes;
 
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GetNames{
     JFrame f;
     private JButton b,b_p;
     private JLabel l1,l2,lb,lb1,lb2;
     private JPanel p;
     static int i=1,oi1,oi2,conf1=0,conf2=0;
     boolean k1,k2;
     AddFont obj = new AddFont();
     RegisteredNames ob = new RegisteredNames();
     JTextField player1,player2;
     static String pplayer1,pplayer2;
     public GetNames(){
         init();
     }
     public void init(){
         f = new JFrame("Let us know you ");
         f.getContentPane().setBackground(new Color(255,204,153));
         f.setSize(1000,1000);                                    
         lb = new JLabel("LET US KNOW YOU ");
         lb.setForeground(new Color(0,25,51));
         lb.setFont(obj.IndieFlower);
         lb.setBounds(260,120,660,130);
         b = new JButton("Next");
         b.setBounds(550,550,130,60);
         b.setBackground(new Color(0,51,25));
         b.setOpaque(true);
         Font ft = new Font("SERIF",Font.PLAIN,18);
         b.setForeground(Color.WHITE);
         b.setFont(ft);
         b_p = new JButton("Before");
         b_p.setBounds(248,550,129,59);
         b_p.setBackground(new Color(0,51,25));
         b_p.setOpaque(true);
         b_p.setForeground(Color.WHITE);
         Font ft1 = new Font("SERIF",Font.PLAIN,16);
         b_p.setFont(ft1);
         l1 = new JLabel("Player 1 - ");
         l1.setBounds(230,330,330,130);
         l1.setForeground(new Color(0,25,51));
         l1.setFont(obj.IndieFlower); 
         lb1 = new JLabel(" ");
         lb1.setBounds(460,330,290,130);
         l2 = new JLabel("Player 2 - ");
         l2.setBounds(230,410,330,130);
         l2.setForeground(new Color(0,25,51));
         l2.setFont(obj.IndieFlower);
         lb2 = new JLabel(" ");
         lb2.setBounds(460,410,290,130);
         f.getContentPane().setLayout(new FlowLayout());
         oi1=ob.i1;
         oi2=ob.i2;
         if(i==1 && oi1==0 && oi2==0){
               pplayer1 = JOptionPane.showInputDialog(" Player1 enter your name");
               try{
                read1();
               }catch(IOException ie){}
               if(conf1==1){
                JOptionPane.showMessageDialog(null,"Hiiii "+pplayer1);   
               }
               pplayer2 = JOptionPane.showInputDialog(" Player2 enter your name");
               try{
                read2();
               }catch(IOException ie){}
               if(conf2==1){
                JOptionPane.showMessageDialog(null,"Hiiii "+pplayer2);   
               }
               i=0;
         }
         if(i==1 && oi1==1 && oi2==0){
               pplayer1=ob.p1;
               JOptionPane.showMessageDialog(null,"Hiiii "+pplayer1);
               pplayer2 = JOptionPane.showInputDialog(" Player2 enter your name");
               try{
                read2();
               }catch(IOException ie){}
               if(conf2==1){
                JOptionPane.showMessageDialog(null,"Hiiii "+pplayer2);   
               }
               i=0;
         }
         if(i==1 && oi1==0 && oi2==1){
               pplayer2=ob.p2;
               JOptionPane.showMessageDialog(null,"Hiiii "+pplayer2);
               pplayer1 = JOptionPane.showInputDialog(" Player1 enter your name");
               try{
                read1();
               }catch(IOException ie){}
               if(conf1==1){
                JOptionPane.showMessageDialog(null,"Hiiii "+pplayer1);   
               }
               i=0;
         }
         if(i==1 && oi1==1 && oi2==1){
               pplayer1=ob.p1;
               JOptionPane.showMessageDialog(null,"Hiiii "+pplayer1);
               pplayer2=ob.p2;
               JOptionPane.showMessageDialog(null,"Hiiii "+pplayer2);
               i=0;
         } 
         k1=pplayer1.isEmpty();
         k2=pplayer2.isEmpty();
         if(k1){
             JOptionPane.showMessageDialog(null,"Player1 please enter your name.");
             pplayer1 = JOptionPane.showInputDialog(" Player1 enter your name");
         }
         if(k2){
             JOptionPane.showMessageDialog(null,"Player2 please enter your name.");
             pplayer2 = JOptionPane.showInputDialog(" Player2 enter your name");
         }
         lb1.setText(pplayer1);
         lb2.setText(pplayer2);
         player1 = new JTextField(" ");
         player2 = new JTextField(" ");
         player1.setBackground(Color.WHITE);
         player1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
         player1.setBounds(445,370,270,52);
         player2.setBackground(Color.WHITE);
         player2.setBorder(BorderFactory.createLineBorder(Color.WHITE));
         player2.setBounds(445,440,270,52);
         f.add(lb1);
         f.add(lb2);
         f.add(l1);
         f.add(l2);
         f.add(lb);
         f.add(player1);
         f.add(player2);
         f.add(b);
         f.add(b_p);
         f.setLayout(null);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         b.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent arg0){
                 LetUsKnowYou object1 = new LetUsKnowYou();
                 f.setVisible(false);
             }
         });
         b_p.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent arg0){
                 MainPage object2 = new MainPage();
                 f.setVisible(false);
             }
         });
     }
     public void register(){
         new GetNames();
     }
     
     public void read1() throws IOException{
         File f1 = new File("name1.txt");
         String[] words1=null;  
         FileReader fr1 = new FileReader(f1); 
         BufferedReader br1 = new BufferedReader(fr1); 
         String s1;
         String input=pplayer1;
         while((s1=br1.readLine())!=null)   
         {
          words1=s1.split(" ");  
           for (String word1 : words1) 
           {
                  if (word1.equals(input))   
                  {
                    conf1=1;    
                  }
           }
          }
          
     }
     public void read2() throws IOException{
         File f2 = new File("name2.txt");
         String[] words2=null;  
         FileReader fr2 = new FileReader(f2); 
         BufferedReader br2 = new BufferedReader(fr2); 
         String s2;
         String input=pplayer2;
         while((s2=br2.readLine())!=null)   
         {
          words2=s2.split(" ");  
           for (String word2 : words2) 
           {
                  if (word2.equals(input))   
                  {
                    conf2=1;    
                  }
           }
          }
          
     }
     public void remove(){
         f.getContentPane().remove(lb1);
         f.getContentPane().remove(lb2);
         f.getContentPane().remove(l1);
         f.getContentPane().remove(l2);
         f.getContentPane().remove(lb);
         f.getContentPane().remove(player1);
         f.getContentPane().remove(player2);
         f.getContentPane().remove(b);
         f.getContentPane().remove(b_p);
     }
}