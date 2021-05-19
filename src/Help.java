package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Dimension2D;

class Print extends JPanel{
    public void paintComponent(Graphics g){
        g.setFont(new Font("SERIF",Font.PLAIN,18));
        g.drawString("How to play this game ?",300,50);
        g.drawString("1. Have the first player go first",150,100);
        g.drawString("2. Have the second player go second",150,150);
        g.drawString("3. Keep alternating moves until one of the players has drawn a row of three symbols or until it is a tie.",150,200);
        g.drawString("4. Keep practicing",150,250);
        g.drawString("ALL THE BEST!!",300,500);
        setSize(2000,500);
    }
}
public class Help {
    private JFrame f1;
    private JButton b;
    private JPanel p1;
    Print p = new Print();
    public Help(){
        init();
    }
    public void init(){
        f1 = new JFrame("Help");
        f1.setVisible(true);
        f1.setSize(1000,1000);
        f1.getContentPane().setBackground(new Color(255,204,153));
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        p1 = new JPanel();
        p1.setSize(50,1000);
        p1.setBackground(new Color(255,204,153));

        b = new JButton("BACK");
        b.setBounds(550,860,30,55);
        b.setBackground(new Color(0,51,25));
        b.setForeground(Color.WHITE);
        Font ft1 = new Font("SERIF",Font.PLAIN,16);
        b.setFont(ft1);
        b.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent arg0){
                 MainPage obj = new MainPage(); 
                 f1.setVisible(false);
             }
         });
        p1.add(b);
        f1.add(p1,BorderLayout.SOUTH);
        f1.add(p,BorderLayout.CENTER);

    }
    public static void main(String[] args){
        new Help();
    }
}
    
    
