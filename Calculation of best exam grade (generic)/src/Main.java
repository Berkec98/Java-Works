
public class Main {
  public static void main(String[]args) {
	  DigitalStu s1 = new DigitalStu(20,29);
	  DigitalStu s2 = new DigitalStu(10,33);
	  VerbalStu s3 = new VerbalStu(30,10);
	  VerbalStu s4 = new VerbalStu(40,8);
	  
	  DigitalStu first = first(s1,s2);
	  VerbalStu first2 = first(s3,s4);
	  System.out.print("Best Digital Student grade: " + first.gradeCal()+ 
			  "\nBest Verbal Student grade: " + first2.gradeCal());
  }
	  public static <E extends Student> E first(E e1,E e2) {
		  if (e1.gradeCal()> e2.gradeCal()) {
			  return e1;
		  }
		  else {
			  return e2;
		  }
	  }
  }


