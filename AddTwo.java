/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		// checking if args is greater than zero
		if (args.length > 0) {
			// casting the given numbers and putting their combined values in sum
			int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			// printing the sum
			System.out.println(args[0] + " + " + args[1] + " = " + sum);
		}
	}
}
