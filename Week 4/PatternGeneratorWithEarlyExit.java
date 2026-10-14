package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class PatternGeneratorWithEarlyExit {
    public static void main(String[] args) {
        int size = 9;

        for (int i = 1; i <= size; i++) {
            // Skip printing row 3 using continue
            if (i == 4) {
                continue; // Demonstrates 'continue'
            }

            for (int j = 1; j <= i; j++) {
                
                if (j == 6) {
                    break; // Demonstrates 'break'
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
    
    

