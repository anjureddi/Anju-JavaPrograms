package assignment1;
import java.util.Scanner;
import assignment1.basiccalculator;
public class calculatorclient {
		
	public static void main(String[] args) {
		
	int num1;
	int num2;
	String operation;
	Scanner input = new  Scanner(System.in);
	
	System.out.println("please enter the first number");
	num1 = input.nextInt();
	 
	System.out.println("please enter the second number");
	num2 = input.nextInt();
	
	 Scanner op = new Scanner(System.in);
	 
	 System.out.println("please enter the operation");
	 operation = op.next();
	 
	 basiccalculator myCalc = new basiccalculator();
	 
	 if  (operation.equals("+"))
	 {
		 int sum = myCalc.add(num1, num2);
		 System.out.println("your answer is " +sum);	 
	 }
	 
	 
	 if  (operation.equals("-"))
	 {
		 int sub = myCalc.substract(num1, num2);
		 System.out.println("your answer is " +sub);	 
	 }
	 
	 
	 if  (operation.equals("*"))
	 {
		 int multi = myCalc.multiple(num1, num2);
		 System.out.println("your answer is " +multi);	 
	 }
	 
	 
	 if  (operation.equals("/"))
	 {
		 int division = myCalc.divide(num1, num2);
		 System.out.println("your answer is " +division);	 
	 }
	 
	}
}

