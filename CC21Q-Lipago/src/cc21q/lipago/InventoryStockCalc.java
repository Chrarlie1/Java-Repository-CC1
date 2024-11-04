/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cc21q.lipago;
import java.util.Scanner;
/**
 *
 * @author Charlie_PC
 */

public class InventoryStockCalc {

public static int validateInt(String prompt){
    Scanner scanInt = new Scanner(System.in);
     System.out.println(prompt);
      while(!scanInt.hasNextInt()){
          scanInt.next();
          System.out.println("Please input only a number.");
        }
 return scanInt.nextInt();
}

    public static void main(String[]args){
     int[] stockLevel = new int[10];
     int[] priceAmount = new int[10];
     int[] totalPrice = new int[10] ;
     int totalInv =0;
     int stockSize = stockLevel.length;
     int stockValue=0;
     int priceValue=0;
     
     System.out.println("Welcome to our Inventory calculator");
     System.out.println("------------------------------------------------------------------------------------------");  
     
     for(int i=0;i<stockSize;i++ ){
       stockValue=validateInt("Please enter the amount of stock for product "+(i+1));       
        stockLevel[i]= stockValue;
     } 
     
     for(int i=0;i<stockSize;i++ ){
       priceValue=validateInt("Please enter the listed price of product "+(i+1));
        priceAmount[i]= priceValue;
     }      
  
     System.out.println("------------------------------------------------------------------------------------------");   
     System.out.println("We currently have the following stock:");
     
     for(int i=0;i<stockSize;i++ ){
       System.out.println(" We have "+ stockLevel[i] +" stock of Product "+(i+1)+" that is worth: P "+priceAmount[i]);
     } 
     System.out.println("------------------------------------------------------------------------------------------");   
      for(int i=0;i<stockSize;i++ ){
       totalPrice[i] = stockLevel[i]*priceAmount[i];
       System.out.println(" The total price of Product "+(i+1)+(" is: P ")+totalPrice[i]+"");
     }
     System.out.println("------------------------------------------------------------------------------------------");   
      for(int b=0;b<totalPrice.length;b++){
       totalInv+=totalPrice[b];
     }
     System.out.println(" The total price of all Products are: P "+ totalInv);   
    }
}
