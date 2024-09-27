/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Lipago, Charlie C.
 */
public class GroceryCalculatorWithIfElse {
    public static void main(String[]args){
        Scanner charlieGrocery = new Scanner(System.in);
        int purchaseAmount = 0, discountedPrice = 0, finalPrice = 0;
        float discountAmount = 0;
        
          System.out.println("Enter the total purchase amount: ");
            purchaseAmount = charlieGrocery.nextInt();  
            
        if (purchaseAmount < 1000){
          discountAmount = (float) 0;
          discountedPrice = (int) (purchaseAmount*discountAmount); 
          finalPrice=(int)(purchaseAmount-discountedPrice);
        } 
        if (purchaseAmount >= 1000 && purchaseAmount <= 5000){
          discountAmount = (float) 0.05;
          discountedPrice = (int) (purchaseAmount*discountAmount); 
          finalPrice=(int)(purchaseAmount-discountedPrice);
        } 
        if  (purchaseAmount >= 5001 && purchaseAmount <= 10000){
          discountAmount = (float) 0.10;
          discountedPrice = (int) (purchaseAmount*discountAmount); 
          finalPrice=(int)(purchaseAmount-discountedPrice);
        } 
        if  (purchaseAmount > 10000){
          discountAmount = (float) 0.15;
          discountedPrice = (int) (purchaseAmount*discountAmount); 
          finalPrice=(int)(purchaseAmount-discountedPrice);
        } 
        
       System.out.println("Discount Applied for your price is " + (int)(discountAmount*100) +"%");
       System.out.println("Total Discount:                    " + discountedPrice); 
       System.out.println("Final Price after discount:        " + finalPrice); 
       
}
}
