/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cc21q.lipago;

import java.util.Scanner;
/**
 *
 * @author Bloi
 */
public class RestaurantOrderSystem {
    public static void main(String[]args){
    Scanner userInput= new Scanner(System.in);
    
    int totalAmount, quantity, orderNum , orderPrice=0;
    String item ="";
    boolean doneOrdering=false, validAmount=false;
    
    do{
    System.out.println("Hello and Welcome to our Restaurant \n");
    System.out.println("1.Burger    - PHP 100");
    System.out.println("2.Fries     - PHP  50");
    System.out.println("3.Soda      - PHP  30");
    System.out.println("4.Ice Cream - PHP  45");
    System.out.println("5.Exit  \n");
    
    System.out.println("What would you like to order?");
    
    orderNum= userInput.nextInt();
    switch(orderNum){
     case 1:
      orderPrice=100;
      item="Burger";
       doneOrdering=true;
        break;
     case 2:
      orderPrice=50;
      item="Fries";
       doneOrdering=true;
        break;
     case 3:
      orderPrice=30;
      item="Soda";
       doneOrdering=true;
        break;
     case 4:
      orderPrice=45;
      item="Ice Cream";
       doneOrdering=true;
        break;
     case 5:   
      System.out.println("Thank you For Ordering!");    
       System.exit(0);
     default:
       System.out.println("Invalid, please choose only from the menu.  \n"); 
      }   
    }while(!doneOrdering); 
    do{
    System.out.println("How many of this Item would you like to order ?");
     quantity= userInput.nextInt();
    if(quantity<1){
      System.out.println("You must order at least 1 of the item."); 
    }
    if(quantity>100){
      System.out.println("We do not have enough stock, please order an amount less than 100.");
    }
    if(quantity>1 && quantity<100){
      validAmount=true;  
    }
    }while(!validAmount);
    totalAmount =(orderPrice*quantity);
    
    System.out.println("You ordered "+item+"."); 
    System.out.println("The final price for your order is  : "+totalAmount+" PHP"); 
    System.out.println("Please proceed to checkout."); 
    
    
    }   
}