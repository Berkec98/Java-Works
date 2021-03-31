package ders4;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Inpu {

    public static void main(String[] args)  {
        
        FileOutputStream fos = null;
        
        try {
            fos = new FileOutputStream("dosya6.txt", true);
        
  fos.write(65);
  fos.write(78);
  fos.write(60);
          
             
            
            
        }  
         catch (FileNotFoundException e) {
            System.out.println("File bulunamadý....");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluÅŸtu...");
        }
        
    }
}




        
        
        


