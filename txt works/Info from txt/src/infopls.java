import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class infopls {
	public static void main(String[]args) {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream ("C:\\Users\\hp kasa\\eclipse-workspace\\Creating and Writing to txt\\dosya.txt");
			int x;
			for (x=0;x<50;x++) {        // does not work perfectly.
				System.out.print((char)fis.read());
			}	
		}
		catch (FileNotFoundException ex) {
			System.out.println("txt can not found!");
		}
		catch (IOException ex) {
			System.out.println("There is a error while writing.");
		}
	}
}
