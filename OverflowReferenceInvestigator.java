package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class OverflowReferenceInvestigator {
    public static void main(String[] args) {
        byte i = 127;
        i++;
        System.out.println("Byte Overflow: "+ i);   
        
        String a = new String("Fumi");
        String b = new String("Fumi");
        
        System.out.println("\na==b: "+ (a==b));
        System.out.println("a.equals(b): "+ a.equals(b));
       /* '==' checks if both variables refer to the same object in memory.
        '.equals()' checks if the text content is the same. */
        
       int st[] = {10, 20, 30};
       int nd[] = st;
       
       System.out.println("\nOriginal: "+ st[0]);
       nd[0] = 50;
       
        System.out.println("First: "+ st[0]);
        System.out.println("Second: "+ nd[0]);
    }
}
