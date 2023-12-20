/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

		int N = max - min;
        double r1 = Math.random();
        double r2 = Math.random();
        double r3 = Math.random();

        int rnd1 = ( (int) (r1 * N) + min);
        int rnd2 = ( (int) (r2 * N) + min );
        int rnd3 = ( (int) (r3 * N) + min );
        
        int minimum = Math.min(rnd1, rnd2);
        minimum = Math.min(minimum, rnd3);
        System.out.println(rnd1 + "\n" + rnd2 + "\n" + rnd3 + "\n" + "The minimal generated number was " + minimum);
	}
}
