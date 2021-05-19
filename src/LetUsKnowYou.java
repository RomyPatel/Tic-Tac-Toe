package classes;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class LetUsKnowYou extends GetNames{
    AddFont obj = new AddFont();
   
    private JButton b1,b1_p;
    private JLabel l1,l2;
    
    Boolean c1,c2;
    public LetUsKnowYou(){
        con();
    }
    public void con(){
        remove();
        
        
        l1 = new JLabel(" ");
        l2 = new JLabel(" ");
        l1.setText(pplayer1 + " - 0");
        l2.setText(pplayer2 + " - X");
        
        l1.setForeground(new Color(0,25,51));
        l1.setFont(obj.IndieFlower); 
        l1.setBounds(400,270,800,130);
    
        
        l2.setForeground(new Color(0,25,51));
        l2.setFont(obj.IndieFlower); 
        l2.setBounds(400,350,800,100);       

        b1 = new JButton("Next");
        b1.setBounds(650,510,130,75);
        b1.setBackground(new Color(0,51,25));
        b1.setOpaque(true);
        Font ft = new Font("SERIF",Font.BOLD,25);
        b1.setFont(ft);
        b1.setForeground(new Color(255,204,153));
        b1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent arg0){
                 Board object1 = new Board();
                 object1.show();
                 f.setVisible(false);
             }
         });

        b1_p = new JButton("Before");
        b1_p.setBounds(250,510,130,75);
        b1_p.setBackground(new Color(0,51,25));
        b1_p.setOpaque(true);
        Font ft1 = new Font("SERIF",Font.BOLD,23);
        b1_p.setFont(ft1);
        b1_p.setForeground(new Color(255,204,153));
        b1_p.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent arg0){
                 GetNames object1 = new GetNames();
                 
                 f.setVisible(false);
             }
         });
        
        f.add(l1);
        f.add(l2);
        f.add(b1);
        f.add(b1_p);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void show(){
            new LetUsKnowYou();      
    }
}