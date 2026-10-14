package lms_Act;

/**
 *
 * @author Lawrenze
 */
import java.util.Scanner;
        
public class NestedLoginValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cusna = "FumiGanda";
        String cpass = "FumiPamiPuma";
        boolean acclck = false;
        
        System.out.print("Enter Username: ");
            String usna =sc.nextLine();
        
        if(usna.equals(cusna)){
            System.out.print("Enter Password: ");
            String pass = sc.nextLine();
            
            if(pass.equals(cpass)){
                if (!acclck){
                    System.out.println("LOGIN SUCCESFUL");
                }else{
                    System.out.println("ERROR: ACCOUNT LOCKED");
                }
            }else{
                System.out.println("ERROR: INCORRECT PASSWORD");
            }
        }else{
            System.out.println("ERROR: INCORRECT USERNAME");
        }
    }
}
