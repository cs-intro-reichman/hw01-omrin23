/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]), b = Double.parseDouble(args[1]), c = Double.parseDouble(args[2]);
        if (a < b + c && b < a + c && c < a + b){
        	System.out.println(args[0] + ", " + args[1] + ", " + args[2] + ": true");
        }
        else{
        	System.out.println(args[0] + ", " + args[1] + ", " + args[2] + ": false");
        }	
	}
}
