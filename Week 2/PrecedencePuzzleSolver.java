package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;

        // Expression 1
        // Predicted: true (since 5 + 10 > 15 is false, but 15 >= 15 is true)
        System.out.println((a + b > c) || (c >= 15));

        // Expression 2
        // Predicted: 30 (since ++a happens before multiplication)
        System.out.println(++a * 5);

        // Expression 3
        // Predicted: false (because relational > logical precedence)
        System.out.println(a + b > c && b < c);
        
        //I missed that ++a executes before expression 3, changing the value of a first
    }
}
