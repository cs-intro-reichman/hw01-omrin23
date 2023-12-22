/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
        // checking if args is greater than zero
        if (args.length > 0) {
            // putting the a, b and c in double variables
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            // calculating the value of x from the equation
            double x = (c - b) / a;

            //primting the equation and the value of x
            System.out.println(a + " * x + " + b + " = " + c);
            System.out.println("x = " + x);
        }
    }
}