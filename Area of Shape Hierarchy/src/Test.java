	import java.util.ArrayList; /* Import the Arraylist because we will create an Arraylist. */

	public class Test{

	public static void main(String[] args) {

	ArrayList<Shape> list=new ArrayList<Shape>(); 

	Shape circle= new Circle(5,5,2); /* Create a circle and enter values */
	Shape rectangle= new Rectangle(10,6);  /* Create a rectangle and enter values */
	list.add(circle); /* adds to the list */
	list.add(rectangle);

	for(int i=0;i<list.size();i++){

	System.out.println(list.get(i).toString()); /* Prints the properties of the circle and rectangle. */

	}

	}

	}

