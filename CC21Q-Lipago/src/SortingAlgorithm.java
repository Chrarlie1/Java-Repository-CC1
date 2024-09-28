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
public class SortingAlgorithm {
    public static void main(String[]args){
        Scanner chScanner = new Scanner(System.in); 
        int sortAmount = 0, temp = 0;
        int numToBeSort[];
        System.out.println("Welcome to My Number Sorter");
        System.out.println("How many numbers do you want to sort?");
        sortAmount = chScanner.nextInt();
        
        numToBeSort = new int[sortAmount];
        System.out.println("Enter number ");
          for (int i = 0; i < sortAmount; i++) 
        {
            numToBeSort[i] = chScanner.nextInt();
        }
        chScanner.close();
        
         for (int i = 0; i < sortAmount; i++) 
        {
            for (int j = i + 1; j < sortAmount; j++) { 
                if (numToBeSort[i] > numToBeSort[j]) 
                {
                    temp = numToBeSort[i];
                    numToBeSort[i] = numToBeSort[j];
                    numToBeSort[j] = temp;
                }
            }
        }
         
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < sortAmount - 1; i++)        
            System.out.print(numToBeSort[i] + ", ");       
                System.out.print(numToBeSort[sortAmount - 1]);
}    
}
