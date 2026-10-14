package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class NumberSquarePrinter {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            System.out.print("Number: "+ i);
            int sq = i * i;
            System.out.println("    Squared: "+ sq);
        }
    }
}
