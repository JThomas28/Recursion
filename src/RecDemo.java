/**
 * This class contains a few recursive methods
 * 
 * @author JonathanThomas
 * @version 2/5/2016
 */
public class RecDemo {
    /**
     * Do not allow instantiation of constructor
     */
    public RecDemo() {
        // no code needed here
    }

    /**
     * Calculate factorial of given parameter. 0! = 1
     * 
     * @param n
     *            is the int whose factorial is to be computed. n is never
     *            negative.
     * @return n!
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return (n * factorial(n - 1));
        }
    }

    /**
     * Determine the fibonacci number for the given parameter.
     * 
     * @param n
     *            is the int whose fibonacci sequence is to be computed. n is
     *            never negative
     * @return fibonacci number for n.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    /**
     * Determine if the given String is a palindrome, by looking only at the
     * first and last character of the String.
     * 
     * @param s
     *             is string to analyze
     * @return true if s is palindrome, false else
     */
    public static boolean isPal(java.lang.String s) {
        if (s.isEmpty()) {
            return true;
        }
        else if (s.length() == 1) {
            return true;
        }
        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            // if first letter is same as last
            return isPal(s.substring(1, s.length() - 1));
        }
        else {
            return false;
        }
    }

    /**
     * Create a palindrome of the form "xxx$xxx" where the number of x's before
     * and after the $ are equal to the given parameter.
     * 
     * @param n
     *            - number of x's on each side of the $. n is never negative
     * @return the palindrome
     */
    public static java.lang.String mkPal(int n) {
        if (n == 0) {
            return "$";
        }
        else {
            return ("x" + mkPal(n - 1) + "x");
        }
    }
}
