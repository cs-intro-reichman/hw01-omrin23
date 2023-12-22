/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// checking if args is greater than zero
		if (args.length > 0) {
			// putting the values of the sides in double variables
			double a = Double.parseDouble(args[0]), b = Double.parseDouble(args[1]), c = Double.parseDouble(args[2]);

			// checking f all the options are correct
			if (a < b + c && b < a + c && c < a + b){
				// printing true
				System.out.println(args[0] + ", " + args[1] + ", " + args[2] + ": true");
			}
			else{
				// printing false
				System.out.println(args[0] + ", " + args[1] + ", " + args[2] + ": false");
			}
        }	
	}
}
