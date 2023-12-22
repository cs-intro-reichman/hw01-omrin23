/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// checking if args is greater than zero
		if (args.length > 0) {
			// putting the coins value into quaters and cents using dividing and modulo
			int quarters = Integer.parseInt(args[0]) / 25;
			int cents = Integer.parseInt(args[0]) % 25;

			// printing the quaters and the cents
			System.out.println("Use " + quarters + " quarters and " + cents + " cents");
		}
	}
}