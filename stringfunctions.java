package assignment1;

public class stringfunctions {

	public static void main(String[] args) {
		
	String x="This is input string"	;
	String a=" ";
	String[]output = x.split(a);
	System.out.println( );
	System.out.println("Part1:"+output[0]);
	System.out.println("Part2:"+output[1]);
	System.out.println("Part3:"+output[2]);
	System.out.println("Part4:"+output[3]);
    System.out.println();
  //split program
    StringBuilder Part1= new StringBuilder();
    StringBuilder Part2= new StringBuilder();
    StringBuilder Part3= new StringBuilder();
    StringBuilder Part4= new StringBuilder();
    
    Part1.append (output[0]);
    Part2.append (output[1]);
    Part3.append (output[2]);
    Part4.append (output[3]);
 //   System.out.println(Part1.reverse());
   // System.out.println(Part2.reverse());
  //  System.out.println(Part3.reverse());
    //System.out.println(Part4.reverse());
    String y=Part1.reverse()+" "+Part2.reverse()+" "+Part3.reverse()+" "+Part4.reverse();
    System.out.println(y);
	 //String reverse
    String z= output[0]+"%20"+output[1]+"%20"+output[2]+"%20"+output[3];
    System.out.println(z);
	}
	
	
	
}
