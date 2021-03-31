
public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {

		this.setLength(length);
		this.setWidth(width);
	}

	public Rectangle ( ) {
		this.length = 0;
		this.width = 0;
	}
	

	public String isSquare() {
		if (length == width) {
			return "This object is a square.";
		}
			else {
				return "This object is not a square.";
			}
		}
	
	public void getArea( ) {
		System.out.println("The area of square is " + length * width);
	}
	
	public String toString() {
		return "A new object defined." + "\nLength: " + length + "\nWidth: " + width + "\n" + isSquare() ;
	}
	
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	

}
