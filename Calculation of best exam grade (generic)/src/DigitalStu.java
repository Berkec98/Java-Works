
public class DigitalStu extends Student{
	public DigitalStu(int turkish,int math) {
		super(turkish,math);
	}
	public int gradeCal() {
		return (getTurkish()*3) + (getMath()*5);
	}
	}
