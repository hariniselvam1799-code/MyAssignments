package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 10;
		boolean isPrime =true;
		if (n<=1) {
			isPrime = false;
		} else {
             for (int i = 2; i < n; i++) {
            	 if(n%i==0) {
            		 isPrime = false;
            		 break;
            	 }
             }
		}
        if(isPrime)  {
        	System.out.println( n + " is a prime number");
        }
        else {  	
        	System.out.println( n + " is not a prime number");
        	}
	}
}

