package assignment1;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("How many fibonacci numbers you want: ");
		int n = reader.nextInt(); 
		System.out.println("Printing first "+n+" Fibonacci numbers: ");
		fib(n);
		reader.close();
	}
	public static void fib(int n) {
		int x,i;
		int current=1;
		int prev=0;
		System.out.println(current);
		for(i = 2; i <= n; i++) {
		x=current+prev;
		System.out.println(x);
		prev=current;
		current=x;
		}
		
	}
}
