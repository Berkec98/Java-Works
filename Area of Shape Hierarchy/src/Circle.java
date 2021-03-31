
public class Circle extends Shape{ /* Inherits the properties and functions of the Shape class. */

private long centerX;
private long centerY;
private double radius;

public Circle(long x,long y,double r){  /* This is the constructor of circle */

this.centerX=x; 
this.centerY=y;
this.radius=r;

calcArea();

}

public void calcArea(){  /* This method is used to calculate area. */

this.area=(3.14519*this.radius*this.radius); 

}

public String toString(){ /* Prints the properties of the Circle as strings. */

return "Area of circle is "+this.getArea()+"\nradius: "+this.radius+"\tx-coordinate: "+this.centerX+"\ty-coordinate: "+this.centerY;
}

/* Getters and Setters of variables */

public long getCenterX() {

return centerX;
}

public void setCenterX(long centerX) {

this.centerX = centerX;
}

public long getCenterY() {

return centerY;

}

public void setCenterY(long centerY) {

this.centerY = centerY;

}

public double getRadius() {

return radius;
}
public void setRadius(double radius) {

this.radius = radius;
}
}


