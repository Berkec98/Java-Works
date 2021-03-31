
public class Trapezoid extends Quadrilateral{
	public int hei;
	Trapezoid(int a,int b,int c, int d, int e, int f, int g,int h,int hei) {
		setCoordinate(a,b,c,d,e,f,g,h);
		this.hei=hei;
}
	int area() {
		int d1=(int)Math.sqrt((getX1()-getX2())*(getX1()-getX2())+(getY1()-getY2())*(getY1()-getY2()));
		int d2=(int)Math.sqrt((getX3()-getX4())*(getX3()-getX4())+(getY3()-getY4())*(getY3()-getY4()));
		return (int)((d1+d2)*hei)/2;
	}
}
