
public abstract class Student {
	private int turkish;
	private int math;
	
public Student(int turkish,int math) {
	this.turkish=turkish;
	this.math=math;
}
public int getTurkish() {
	return turkish;
}
public void setTurkish(int turkish) {
	this.turkish=turkish;	
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math=math;	
}
abstract int gradeCal();
}



