/* Written by Berke Cakirlar 20161701027 */

/* I am testing with main method */

public class Test {
	public static void main(String[] args) {
		Person person = new Person("Triss","Merigold",25,"She");
		Employee employee = new Employee("Sigismund","Dijkstra",37,"He","Staff");
		Student student = new Student("Keira","Metz",19,"She","undergraduate");
		
		person.showInfos();
		employee.showInfos();
		student.showInfos();
	}

}
