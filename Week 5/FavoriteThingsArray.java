package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class FavoriteThingsArray {
    public static void main(String[] args) {
        String fav[] = {"Cats", "Coffee", "Perfume", "Clothes", "Gym"};
        
        for(int i = 0; i <= 4; i++){
            System.out.println(+i+1 +". " +fav[i]);
        }
        System.out.println("\nArray's Total Length: "+ fav.length);
    }
    
}
