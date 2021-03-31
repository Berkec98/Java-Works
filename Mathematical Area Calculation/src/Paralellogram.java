
public class Paralellogram extends Quadrilateral{
	private int hei;
	Paralellogram(int a,int b,int c, int d, int e, int f, int g,int h,int hei) {
		setCoordinate(a,b,c,d,e,f,g,h);
		this.hei=hei;
	}
	int area() {
		int d1=(int)Math.sqrt((getX1()-getX2())*(getX1()-getX2()) + (getY1()-getY2())*(getY1()-getY2()));
		return d1*hei;
		
	}
	

}
