package week1.day2;

public class FibanocciSeries {

	public static void main(String[] args) {
		int n = 8; 
        int firstnumber = 0, secondnumber = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstnumber + " "); 
            int sum = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = sum;
        }
    }
}
