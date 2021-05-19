package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;

class MyPanel extends JPanel{
    AddFont obj = new AddFont();
    public void paintComponent(Graphics g){
        g.setFont(obj.IndieFlower); 
        g.drawString("P L A Y",410,300);
        g.setColor(new Color(255,204,153));
        g.drawRect(410,250,155,70);
        g.setColor(Color.BLACK);
        g.drawString("HOW TO PLAY",410,400);
        g.setColor(new Color(255,204,153));
        g.drawRect(410,350,155,70);
        g.setColor(Color.BLACK);
        g.drawString("CREATE ACCOUNT",320,500);
        g.setColor(new Color(255,204,153));
        g.drawRect(320,450,380,70);
    }
}
public class Menue  implements MouseListener,MouseMotionListener{
    
    MyPanel p = new MyPanel(); 
    int x,y;
    public Menue(){
        p.repaint();
        p.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me){
    }
    public void mousePressed(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        if(x>410&&x<565&&y>250&&y<320){
            GetNames object1 = new GetNames();
        }
        if(x>410&&x<565&&y>350&&y<420){
            Help object2 = new Help();
        }
        if(x>320&&x<700&&y>450&&y<520){
            RegisteredNames object3 = new RegisteredNames();
            try{
             object3.input();
            }catch(IOException ie){}
        }
        
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void mouseDragged(MouseEvent e) {
    }
    public void mouseMoved(MouseEvent e) {
    }
}
   