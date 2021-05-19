import java.awt.*;
public class GetFontList{
    public static void main(String args[]){
    String[] s =Toolkit.getDefaultToolkit().getFontList();
    int l=s.length;
    for(int i=0;i<l;i++){
    System.out.print(s[i]+" ");    
    }
    
   }
    
} 
    
