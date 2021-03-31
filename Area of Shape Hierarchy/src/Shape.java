public abstract class Shape { /* We create an abstract class to modeling objects with common properties. */
	
	/* Welcome to Calculate Circle and Rectangle area Program.
	 * You give the width and length, the program gives you an shape's area.
	 * User friendly.
	 * @author Berke Cakirlar
	 * @version 1.0
	 * @since 2020-11-10 */

		protected double area;

		public double getArea(){ /* This method returns area */

		return this.area;
		}
		
		public abstract void calcArea();

		public String toString(){ /* The toString () method can be used when you want to represent an object as a string. */

		return "area is "+this.area;

		}
		
}

