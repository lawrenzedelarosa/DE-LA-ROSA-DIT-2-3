package lms_Act;

/**
 *
 * @author Lawrenze
 */
import java.util.Scanner;
import java.util.Arrays;
public class SearchSortMiniTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scr[] = {84, 86, 74, 93, 98, 84, 78, 88};
        
        System.out.print("Enter a Score to search: ");
        int scor = sc.nextInt();
        boolean fnd = false;
        int ind = -1;
        
        
        for(int i = 0; i < scr.length; i++){
            if(scr[i] == scor){
                fnd = true;
                ind = i;
                break;
            }
        }
        
        if(fnd){
            System.out.println("Score "+ scor + " found at index "+ ind);
        }else{
            System.out.println("Score "+ scor + " not found.");
        }
        
        int sortscr[] = Arrays.copyOf(scr, scr.length);
        Arrays.sort(sortscr);
        
        System.out.println("\nOriginal Array: "+ Arrays.toString(scr));
        System.out.println("Sorted Array: "+ Arrays.toString(sortscr));
    }
}
