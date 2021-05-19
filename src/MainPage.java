package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {
    JFrame f;
    private JPanel p,p_s;
    private JLabel lb;
    private JButton b;
    
    Menue ob = new Menue();
    AddFont obj = new AddFont();
    
    public MainPage(){
        init();
    }
    public void init(){
        f = new JFrame("Main Page");
        f.setVisible(true);
        f.setSize(1000,1000);
        f.getContentPane().setBackground(new Color(255,204,153));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lb = new JLabel("TIC - TAC - TOE",JLabel.CENTER);
        lb.setForeground(new Color(0,25,51));
        lb.setFont(obj.IndieFlower); 
        p = new JPanel();
        p.setBackground(new Color(255,204,153));
        p.setSize(5000,5000);
        p.add(lb);
        b = new JButton("Q U I T");  
        b.setBounds(550,1000,130,60);
        b.setBackground(new Color(255,204,153));
        b.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                   System.exit(0);
                }
        });
        p_s = new JPanel();
        p_s.setBackground(new Color(255,204,153));
        p_s.setSize(5000,5000);
        p_s.add(b);
        f.add(ob.p);
        f.add(p,BorderLayout.NORTH);
        f.add(p_s,BorderLayout.SOUTH);
        
    }
public static void main(String[] args){
        new MainPage();
    }
}