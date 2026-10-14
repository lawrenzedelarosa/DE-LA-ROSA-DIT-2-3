package lms_Act;

/**
 *
 * @author Lawrenze
 */
import java.util.Scanner;
public class SumUntilSentinelValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double i = 0;
        double y = 0;
        while( i != -1 ){
            System.out.print("Enter a Number: ");
            i = sc.nextInt();
            
            if(i != -1){
            y = y + i;
            }
            
            
        }System.out.println("\nTotal: "+ y);
    }
}
