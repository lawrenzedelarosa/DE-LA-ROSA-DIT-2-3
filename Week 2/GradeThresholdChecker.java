package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class GradeThresholdChecker {
    public static void main(String[] args) {
        double ave = 86.5;
        int abs = 3;
        
        boolean pass = (ave >= 75 && abs <= 3) || (ave >= 90);
        
        if(pass){
            System.out.println("PASS: Meets grade and attendance requirements.");
        }else {
            System.out.println("FAIL: Does not meet grade or attendance requirements.");
        }
    }
}
