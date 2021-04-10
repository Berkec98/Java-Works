
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class crewri {
    public static void main(String[] args) {
       
        FileOutputStream fos;
    
        try {
            fos = new FileOutputStream("C:\\Users\\hp kasa\\eclipse-workspace\\Creating and Writing to txt\\dosya.txt",true);
            String s = "Hello! My name is berke! Nice to meet you!";
            byte[] s_array = s.getBytes();
            fos.write(s_array); 
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        } catch (IOException ex) {
            System.out.println("There was an error writing to the file.");
        }
    }
}