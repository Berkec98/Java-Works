
public class CharacterTest {

	public static void main(String[] args) {
		Character karakter = new Character("Draugr","Male","Fighter","Human");
		System.out.println("Name: " + karakter.getName());
		System.out.println("Gender: " + karakter.getGender());
		System.out.println("Character Class: " + karakter.getCharacterClass());
		System.out.println("Race: " + karakter.getRace());
		System.out.println();
		
		karakter.Skills(); 
		karakter.otherClass();
		
		
		}
}
