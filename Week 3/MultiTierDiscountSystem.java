package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        double purchaseAmount = 900;
        double disc;
        
        if (purchaseAmount < 500){
            disc = 0.0;
        }else if (purchaseAmount < 1000){
            disc = 0.05;
        }else if (purchaseAmount < 1500){
            disc = 0.10;
        }else {
            disc = 0.15;
        }
        
        double discprc = purchaseAmount - (purchaseAmount * disc);
        
        System.out.println("Purchase Amount: "+ purchaseAmount);
        System.out.println("Discount Rate: "+ (disc * 100)+ "%");
        System.out.println("Final Price: "+ discprc);
    }
}
