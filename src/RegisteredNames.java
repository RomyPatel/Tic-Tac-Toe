package classes;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisteredNames{
        static String p1,p2;
        static int i1=0,i2=0;
        boolean kn1,kn2;
        static int crea1=0,crea2=0;
       
    public void input() throws IOException {
        
        p1 = JOptionPane.showInputDialog(" Player1 enter your name");
        p2 = JOptionPane.showInputDialog(" Player2 enter your name");
        kn1=p1.isEmpty();
        kn2=p2.isEmpty();
        if(!kn1){
             i1=1;
             createFile1();
         }
        if(!kn2){
             i2=1;
             createFile2();
         }
        if(crea1==1){//for player1
          FileWriter fip1 = new FileWriter("name1.txt",true);
          PrintWriter pw1 = new PrintWriter(fip1);
             for(int i=0; i<p1.length(); i++)
             {
                 pw1.print(p1.charAt(i));
             }
          pw1.print(" ");
          pw1.close();
        }
        if(i1==1 && crea1==1){
            JOptionPane.showMessageDialog(null,p1+" now you have an account!");
        }
        else if(i1==1 && crea1==0){
            JOptionPane.showMessageDialog(null," p1 User name taken!");
        }
        else{JOptionPane.showMessageDialog(null,"Player1 you don't have an account!");}       
        if(crea2==1){//for player2
          FileWriter fip2 = new FileWriter("name2.txt",true);
          PrintWriter pw2 = new PrintWriter(fip2);
             for(int i=0; i<p2.length(); i++)
             {
                 pw2.print(p2.charAt(i));
             }
          pw2.print(" ");
          pw2.close();
        }
        if(i2==1 && crea2==1){
                JOptionPane.showMessageDialog(null,p2+" now you have an account!");
        }
        else if(i2==1 && crea2==0){
            JOptionPane.showMessageDialog(null,"p2 User name taken!");
        }
        else{JOptionPane.showMessageDialog(null,"Player2 you don't have an account!");}       
    }
    public void createFile1(){
        try{
            File myobj = new File(p1);
            if(myobj.createNewFile()){
                crea1 =1;
                FileWriter myWriter = new FileWriter(p1);
                myWriter.write("0");
                myWriter.close();
            }
            else{
                crea1 =0;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void createFile2(){
        try{
            File myobj = new File(p2);
            if(myobj.createNewFile()){
                crea2 =1;
                FileWriter myWriter = new FileWriter(p2);
                myWriter.write("0");
                myWriter.close();
            }
            else{
                crea2 =0;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}