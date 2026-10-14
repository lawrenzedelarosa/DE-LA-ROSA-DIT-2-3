/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms_Act;

/**
 *
 * @author Lawrenze
 */
public class TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        String name = "Fumi's Sari-sari Store";
        String bili = "Cream'o Crinkles";
        String bili2 = "Cheezy na pula";
        int quan[] = {3, 2};
        int prc[] = {10 , 35};
        double total[] = {0,0};
        double fital;
        
        System.out.println(""+ name);
        System.out.println("");
        System.out.println("Items: "+ bili);
        System.out.println("Price: "+prc[0]);
        System.out.println("Quantity: "+ quan[0]);
        
        total[0] = prc[0] * quan[0];
        System.out.println("Total: "+ total[0]);
        
        System.out.println("");
        System.out.println("Items: "+ bili2);
        System.out.println("Price: "+prc[1]);
        System.out.println("Quantity: "+ quan[1]);
        
        total[1] = prc[1] * quan[1];
        System.out.println("Total: "+ total[1]);
        System.out.println("");
        
        fital = total[0] + total[1];
        System.out.println("TOTAL AMOUNT: "+ fital);
        
        
    }
    
}
