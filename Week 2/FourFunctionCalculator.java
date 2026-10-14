package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class FourFunctionCalculator {
    public static void main(String[] args) {
        int fin = -7;
        int sen = 10;
        
        System.out.println("Addition: "+ (fin+sen));
        System.out.println("Subtraction: "+ (fin-sen));
        System.out.println("Multiplication: "+ (fin*sen));
        System.out.println("Division: "+ (fin/sen));
        System.out.println("Modolus: "+ (fin%sen));
        
        /*Division and modulus behave differently with negative numbers.
         For example, -7 / 10 gives 0 (truncated toward zero),
         and -7 % 10 gives -7 (remainder keeps the sign of the dividend).*/
               
    }
}
