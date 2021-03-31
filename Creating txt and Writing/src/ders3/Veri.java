package ders3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Veri {
    public static void main(String[] args) {
        
        FileOutputStream fos = null;
    
        try {
            fos = new FileOutputStream("dosya.txt",true);
            
            
            String s = "Berke";
            
            byte[] s_array = s.getBytes();
            
            
            fos.write(s_array);
            
         
        } catch (FileNotFoundException ex) {
            System.out.println("File Not found exception oluþtu....");
        } catch (IOException ex) {
            System.out.println("Dosyaya yazilirken bir hata oluþtu...");
        }
   
    }
}
