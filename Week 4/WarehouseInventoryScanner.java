package lms_Act;

/**
 *
 * @author Lawrenze
 */
import java.util.Scanner;
public class WarehouseInventoryScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] whouse = {
            {10, 5, -1, 8},
            {4, 0, 7, -1}
            ,{2, 6, 3, 7},
            {-1, 9, 12, 4}
        };
        
        int cho;
        do{
            System.out.println("\nWarehouse Inventory Menu\n");
            System.out.println("1. View Total inventory");
            System.out.println("2. Find Critically Low Shelf");
            System.out.println("3. Restock Shelf");
            System.out.println("4. Exit");
            
            System.out.print("\nEnter Choice:");
            cho = sc.nextInt();
            
            switch(cho){
                case 1:
                    int tot = 0;
                    for(int[] row : whouse){
                        for(int it : row){
                            if (it == -1)continue;
                            tot += it;
                        }
                    }
                    System.out.println("Total Inventory: "+ tot);
                    break;
                    
                case 2:
                    boolean found = false;
                    for (int i = 0; i < whouse.length; i++) {
                        for (int j = 0; j < whouse[i].length; j++) {
                            if (whouse[i][j] >= 0 && whouse[i][j] < 2) {
                                System.out.println("Critically low shelf found at [" + i + "][" + j + "]");
                                found = true;
                                break; 
                            }
                        }
                        if (found) break; 
                    }
                    if (!found) System.out.println("No critically low shelves found.");
                    break;
                
                case 3:
                     int row, col, amount;
                    while (true) {
                        System.out.print("Enter shelf row (0-" + (whouse.length - 1) + "): ");
                        row = sc.nextInt();
                        System.out.print("Enter shelf column (0-" + (whouse[0].length - 1) + "): ");
                        col = sc.nextInt();
                        if (row >= 0 && row < whouse.length && col >= 0 && col < whouse[0].length) break;
                        System.out.println("Invalid input. Try again.");
                    }
                    System.out.print("Enter restock amount: ");
                    amount = sc.nextInt();
                    whouse[row][col] += amount;
                    System.out.println("Shelf [" + row + "][" + col + "] restocked successfully.");
                    System.out.println("Shelf ["+ row + "][" + col + "] Amount: "+ whouse[2][2] );
                    break;
                
                case 4:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                
            }
            
            
            
            
            
        }while(cho != 4);
        
    }
}
