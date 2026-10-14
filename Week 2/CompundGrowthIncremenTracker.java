package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class CompundGrowthIncremenTracker {
    public static void main(String[] args) {
        double bal = 500;
        
        bal += 250;
        System.out.println("After Deposit: "+ bal);
        bal *= 1.05;
        System.out.println("After Growth: "+ bal);
        bal *= 1.05;
        System.out.println("After Another Growth: "+ bal);
        
        int count = 2;
        System.out.println("count++ :"+ count++);
        System.out.println("After count++ : "+ count++);
        
        count = 2;
        System.out.println("\n++count :"+ ++count);
        System.out.println("After ++count : "+ ++count);
        
        // Explanation:
        // count++ → returns old value, then increments.
        // ++count → increments first, then returns new value.
    }   
}
