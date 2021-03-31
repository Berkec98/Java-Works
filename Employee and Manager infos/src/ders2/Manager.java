package ders2;

public class Manager extends Employee {
	private int num_of_employees;
	
public Manager(String name,String department, int salary, int num_of_employees) {
	super(name,department,salary);
	this.num_of_employees=num_of_employees;
}
	
public void maasaZam(int miktar) {
	System.out.println(miktar + " tl zam yapýldý.");
}
public void showInfos() {
	super.showInfos();
    System.out.println("Kiþi sayýsý:" + this.num_of_employees);
}
}


