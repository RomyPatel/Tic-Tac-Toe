package classes;
import java.awt.*;
import java.io.File; 
import java.io.IOException;



public class AddFont{
    Font IndieFlower;
    public AddFont(){
        
        try {
              IndieFlower= Font.createFont(Font.TRUETYPE_FONT, new File("IndieFlower-Regular.ttf")).deriveFont(50f);
              
              GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
              ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("IndieFlower-Regular.ttf")));
            } 
        catch (IOException|FontFormatException e) {
               
            }
            
        

    }
}