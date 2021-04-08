package ders2;

public class Employee {
	private String name;
	private String department;
	private int salary;
	
public Employee (String name, String department, int salary) {
	this.name=name;
	this.department=department;
	this.salary=salary;
}
	
public void showInfos() {
	System.out.println("Name: " + this.name);
	System.out.println("Departmant: " + this.department);
    System.out.println("Salary: " + this.salary);

}
}
