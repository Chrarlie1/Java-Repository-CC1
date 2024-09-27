/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Lipago, Charlie C. CC2-1Q-Group A
 */
import java.util.Scanner;  

public class GroceryCalculator {
    public static void main(String[]args){ 
        Scanner charlieScanner = new Scanner(System.in);
              
        int item1Price, item1Quantity, item2Price, item2Quantity, item3Price, item3Quantity;
        int subTotal, finalTotal;
        float discount, salesTax;
        
        System.out.println("Enter the price of item 1:");  
         item1Price = charlieScanner.nextInt();
        System.out.println("Enter the quantity of item 1");  
         item1Quantity = charlieScanner.nextInt();
        
        System.out.println("Enter the price of item 2:");  
         item2Price = charlieScanner.nextInt();
        System.out.println("Enter the quantity of item 2");  
         item2Quantity = charlieScanner.nextInt();
        
        System.out.println("Enter the price of item 3:");  
         item3Price = charlieScanner.nextInt();
        System.out.println("Enter the quantity of item 3");  
         item3Quantity = charlieScanner.nextInt();

        subTotal = (item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Price * item3Quantity);
        discount = (float) (0.05 * subTotal);
        salesTax = (float) (0.12 * (subTotal-discount));
        finalTotal = (int) (salesTax+(subTotal-discount));
        
        System.out.println("Subtotal       :"+ subTotal);
        System.out.println("Discount       :"+ discount);
        System.out.println("Sales Tax      :"+ salesTax);
        System.out.println("Final Total    :"+ finalTotal);
    }
}
