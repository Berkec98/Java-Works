	public class Rectangle extends Shape{ /* Inherits the properties and functions of the Shape class. */

		private long width;
		private long length;
		public Rectangle(long width,long length){ /* This is the constructor of rectangle */

		this.width=width; 

		this.length=length;

		calcArea(); 
		}
		/* Getters and Setters of variables */
		
		public long getWidth() {
		return width;
	}
		public void setWidth(long width) {
		this.width = width;
		}
		public long getLength() {
		return length;
		}

		public void setLength(long length) {
		this.length = length;
		}

		public void calcArea(){ /* This method multiplies length by width to find the area. */
		this.area=(this.length*this.width);
		}
		public String toString(){ /* It prints the values and field as strings. */

		return "area of rectangle is "+this.getArea()+"\nlength is: "+this.length+"\twidth is: "+this.width;
		}

		}

