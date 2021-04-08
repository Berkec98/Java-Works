
public class VerbalStu extends Student{
 public VerbalStu(int turkish,int math) {
	 super(turkish,math);
 }
 public int gradeCal() {
	 return (getTurkish()*5) + (getMath()*3);
 }
}
