package assignment1;

import java.util.Scanner;
public class booleanString {
	

		public static void main(String[] args) {
		
			int num1;	
			boolean xy,flag;
			String instr;
			
		
			Scanner input = new  Scanner(System.in);
			
			System.out.println("please enter the  input");
			instr = input.nextLine();
					 
		
			xy = isInteger(instr);
			if ( xy )
			{
				System.out.println("Yes integr");
				num1 = Integer.parseInt(instr);
				flag = isOddNumber(num1);
				if ( flag )
					System.out.println("Yes, it is odd number");
				
				else 
					System.out.println("No, it is not odd number");
				flag = isEvenNumber(num1);
				if ( flag )
					System.out.println("Yes, it is even number");
				
				else 
					System.out.println("No, it is not even number");
				flag = isPrimeNumber(num1);
				if ( flag )
					System.out.println("Yes, it is prime");
				
				else 
					System.out.println("No, it is not not prime");
			}
			else 
				System.out.println("No, not integr");
			
			
		}
		
		
		
		public static boolean isInteger(String s) {
		    try { 
		        Integer.parseInt(s); 
		    } catch(NumberFormatException e) { 
		        return false; 
		    } catch(NullPointerException e) {
		        return false;
		    }
		    // only got here if we didn't return false
		    return true;
		}

		public static boolean isOddNumber (int n) {
			if (n % 2 == 0)
				return false;
			else
				return true;
		}
		public static boolean isEvenNumber (int n) {
			if (n % 2 == 0)
				return true;
			else
				return false;
		}

		public static boolean isPrimeNumber (int n) {
			for(int i=2;2*i<n;i++) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
		}

}
