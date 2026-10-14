package lms_Act;

/**
 *
 * @author Lawrenze
 */
import java.util.Scanner;
public class ATMTransactionAuthorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cusna = "Fumi";
        int cpin = 5364;
        double bal = 25000;
        String tier = "";
        double fee = 0;
        boolean sufbal = false;
        boolean withlim = false;
        double newbal = 0;
        
        
        System.out.print("Enter Username: ");
        String usna = sc.nextLine();
        System.out.print("Enter 4 digit PIN: ");
        int pin = sc.nextInt();
        
        if((usna.equals(cusna)) && (pin == cpin)){
            if (bal < 10000){
                tier = "Bronze";
            }else if (bal < 20000){
                tier = "Silver";
            }else if (bal < 30000){
                tier = "Gold";
            }else {
                tier = "Platinum";
            }
            
            System.out.print("Enter Withdrawal Amount: ");
            double witha = sc.nextDouble();
            
             sufbal = witha <= bal;
            
            if (sufbal){
                if (tier.equals("Bronze"))withlim = witha <= 5000;
                else if (tier.equals("Silver"))withlim = witha <= 10000;
                else if (tier.equals("Gold"))withlim = witha <= 20000;
                else if (tier.equals("Platinum"))withlim = witha <= 50000;
                
                
                switch(tier){
                    case "Bronze": fee = witha * 0.03; break;
                    case "Silver": fee = witha * 0.02; break;
                    case "Gold": fee = witha * 0.01; break;
                    case "Platinum": fee = witha * 0.005; break;
                }
                
               newbal = bal - witha - fee;
                
            }else{
                sufbal = false;
            }
            if (sufbal && withlim){
                    System.out.println("\nAPPROVED ("+ tier +" Tier)");
                    System.out.println("Transaction Fee: "+fee);
                    System.out.println("Remaining Balance: "+ newbal);
                }else{
                    System.out.println("\nDENIED");
                    if (sufbal == false)System.out.println("Insufficient Balance");
                    if (withlim == false){
                        System.out.println("Exceeds daily limit for "+ tier +" tier.");
                    }
            }
            
        }else{
            System.out.println("\nINCORRECT USERNAME OR PIN");
            
        }
        
        
        
        }
    }

