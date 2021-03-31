
public class Square extends Quadrilateral {
	
	Square(int a,int b,int c, int d, int e, int f, int g,int h) {
		setCoordinate(a,b,c,d,e,f,g,h);
	}
	
	int area() {
		int d = (int)Math.sqrt((getX1()-getX2())*(getX1()-getX2()) + (getY1()-getY2())*(getY1()-getY2()));
		return d*d;
	}

}
