

public class QuadTest {
   public static void main(String[]args) {
	   
	   Square square = new Square(10,20,30,40,50,60,70,80);
	   Rectangle rectangle = new Rectangle(10,20,30,40,50,60,70,80);
	   Paralellogram paralel = new Paralellogram(10,20,30,40,50,60,70,80,5);
	   Trapezoid trapezoid = new Trapezoid (10,20,30,40,50,60,70,80,5);
	   System.out.println(square.area());
	   System.out.println(rectangle.area());
	   System.out.println(paralel.area());
	   System.out.println(trapezoid.area());
   }
}
