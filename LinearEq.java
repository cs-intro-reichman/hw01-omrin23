/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
        // given equation a * x + b = c, calculate the x and print it
        double x = ( Double.parseDouble(args[2]) - Double.parseDouble(args[1])) / Double.parseDouble(args[0]);

        System.out.println("x =  " + x);
    }
}