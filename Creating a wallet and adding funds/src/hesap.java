	/* Hesap olu�turma ve hesaba ekstra bakiye y�kleme */

public class hesap {
		   
	      private String name;
	      private double balance;
	      
	      public hesap (String name, double balance) {
	    	  this.name = name;
	    	  
	    	  if (balance > 0.0) {
	    		  this.balance = balance;
	    	  }
	    	  }
	    	public void deposit (double depositAmount) {
	    		if (depositAmount > 0.00) {
	    			balance = balance + depositAmount;
	    		}
	    	}
	      
	    	public double getBalance() {
	    		return balance;
	    	}
	    	public void setName(String name) {
	    		this.name = name;
	    	}
	    	public String getName() {
	    		return name;
	    	}
	      }
	     


