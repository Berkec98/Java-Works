
public class Rectangle extends Quadrilateral {
	
	Rectangle(int a,int b,int c, int d, int e, int f, int g,int h) {
		setCoordinate(a,b,c,d,e,f,g,h);}
	int area() {
		
		int d1=(int)Math.sqrt((getX1()-getX2())*(getX1()-getX2()) + (getY1()-getY2())*(getY1()-getY2()));
		int d2=(int)Math.sqrt((getX1()-getX4())*(getX1()-getX4()) + (getY1()-getY4())*(getY1()-getY4()));
		return d1*d2;
	}

}
