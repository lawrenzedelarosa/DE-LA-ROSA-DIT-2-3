package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class ClassStatisticsCalculator {
    public static void main(String[] args) {
        int scr[] = {84, 86, 74, 93, 98, 84, 78, 88};
        
        int sum = 0;
        for(int i = 0; i <= 7; i++){
            sum += scr[i];
        }System.out.println("Sum: "+ sum);
        
        double ave = sum / 8;
        System.out.println("Average: "+ ave);
        
        int low = scr[0];
        for(int i = 0; i<=7; i++){
            
            if(low > scr[i]) {
                low = scr[i];
            }
            
        }System.out.println("Lowest Score: "+ low);
        
        int hi = scr[0];
        for(int i = 0; i<=7; i++){
            
            if(hi < scr[i]) {
                hi = scr[i];
            }
            
        }System.out.println("Highest Score: "+ hi);
        
    }
}
