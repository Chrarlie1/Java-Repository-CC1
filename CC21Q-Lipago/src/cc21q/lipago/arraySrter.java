/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc21q.lipago;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author m307user
 */
public class arraySrter {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    //Array Size Initialization
        
        Integer arr[]=new Integer[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
            arr[i]=sc.nextInt();
        }
        
        int temp = 0;    //Temporary variable to store the element
        
         for (int i = 0; i < arr.length; i++)   //Holds each Array element
         {     
            for (int j = i+1; j < arr.length; j++)    //compares with remaining Array elements
            {     
               if(arr[i] > arr[j]) //Compare and swap
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(""+ arr[i] + " ");    
        }    
    }
}

