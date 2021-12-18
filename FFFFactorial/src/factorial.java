import java.util.*; 
	
public class factorial {


	  public static int FunFactorial(int num) { 

	        int x;
	        int factorial = 1;  
	    
	  for(x=1;x<=num;x++){  
		  
	      factorial=factorial*x;      // 1(factorial) * 1(x) = 1    1*2 = 2    2*3 = 6    6*4 = 24
	  }  
	       
	    return factorial;
	    
	  } 
	  
	  public static void main (String[] args) {  
    
	    Scanner scan = new Scanner(System.in);
	    int y = scan.nextInt();
	    System.out.print(FunFactorial(y)); 
	  }   
	  
	}

