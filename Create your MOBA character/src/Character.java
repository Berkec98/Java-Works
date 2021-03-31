import java.util.Scanner;

public class Character {
	private String name;
	private String gender;
	private String characterClass;
	private String race;
	
	public Character (String name, String gender, String characterClass, String race) {
		
		this.setName(name);
		this.setGender(gender);
		this.setCharacterClass(characterClass);
		this.setRace(race);
	}
	public void Skills () {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the Strength of Character?");
        int strength = scan.nextInt();
        System.out.println("What is the Dexterity of Character?");
        int dexterity = scan.nextInt();
        System.out.println("What is the Constitution of Character?");
        int constitution = scan.nextInt();
        System.out.println("What is the Intelligence of Character?");
        int intelligence = scan.nextInt();
        System.out.println("What is the Wisdom of Character?");
        int wisdom = scan.nextInt();
        System.out.println("What is the Charisma of Character?");
        int charisma = scan.nextInt();
        
		System.out.println("STR: " + strength);
		System.out.println("DEX: " + dexterity);
		System.out.println("CON: " + constitution);
		System.out.println("INT: " + intelligence);
		System.out.println("WIS: " + wisdom);
		System.out.println("CHA: " + charisma);
		
		System.out.println("TOTAL: " +(strength+dexterity+constitution+intelligence+wisdom+charisma));
	}
	public void otherClass() {
		System.out.println("Available Character Classes");
		System.out.println("************************");
		System.out.println("Fighter");
		System.out.println("Paladin");
		System.out.println("Ranger");
		System.out.println("Wizard");
		System.out.println("Thief");
		System.out.println("************************");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCharacterClass() {
		return characterClass;
	}
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}

}
