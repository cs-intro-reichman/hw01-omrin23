/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        // checking if args is greater than zero
        if (args.length > 0) {
            // putting the range values in min and max
            int min = Integer.parseInt(args[0]);
            int max = Integer.parseInt(args[1]);

            // putting the differnce between max and min in range
            int range = max - min;

            // crate three randoms between 0 and 1
            double r1 = Math.random();
            double r2 = Math.random();
            double r3 = Math.random();

            // taking the randoms, multiplying them with the range and
            // adding the min value so we get numbers between the range
            int rnd1 = ( (int) (r1 * range) + min);
            int rnd2 = ( (int) (r2 * range) + min );
            int rnd3 = ( (int) (r3 * range) + min );
            
            // calculating the min value
            int minimum = Math.min(rnd1, rnd2);
            minimum = Math.min(minimum, rnd3);

            // printing the randoms and the minimum
            System.out.println(rnd1 + "\n" + rnd2 + "\n" + rnd3 + "\n" + "The minimal generated number was " + minimum);
        }
	}
}
