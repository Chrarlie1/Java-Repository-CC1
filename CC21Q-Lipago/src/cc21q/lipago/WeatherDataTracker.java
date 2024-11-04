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

public class WeatherDataTracker {
public static float validateInt(String prompt){
    Scanner scanInt = new Scanner(System.in);
     System.out.println(prompt);
      while(!scanInt.hasNextFloat()){
          scanInt.next();
          System.out.println("Please input only a number.");
        }
 return scanInt.nextFloat();
}
public static void main(String[]args){
    String[] day={"Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday"};  
     float[][] weatherData = {
        { 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0},
     };
     float [] cityTemp = {0,0,0};
     float [] avgTemp = {0,0,0};
     float [] maxTemp = {0,0,0};
     System.out.println("                                Weather Data Tracker");
     System.out.println("------------------------------------------------------------------------------------------");  
     for(int i=0;i<3;i++){ 
      for(int j=0;j<7;j++){  
       cityTemp[i]=validateInt("Please enter the temperature of City "+(i+1)+" on "+(day[j])); 
       while(cityTemp[i]>=100 && cityTemp[i]>=-100){
        cityTemp[i]=validateInt("Please enter a number less than 100 and higher than -100"); 
       }
       weatherData[i][j] = cityTemp[i];
      }
     }    
     System.out.println("------------------------------------------------------------------------------------------");
     System.out.println("                                    Weather Data");
     for(int i=0;i<3;i++){
     System.out.print("       "); 
      for(int d=0;d<day.length;d++){
       System.out.printf("%-13s",day[d]);}
       System.out.println();  
       System.out.print("City "+ (i+1) +"  ");
      for(int j=0;j<7;j++){        
       System.out.printf("%-13s",weatherData[i][j]+" C");
       avgTemp[i] += weatherData[i][j];
       if(maxTemp[i]<weatherData[i][j]){
          maxTemp[i]=weatherData[i][j];
        }
      }System.out.println(); 
       System.out.println("The average temperature for City "+(i+1)+" is "+(avgTemp[i]/7)+" C");
       System.out.println("With the highest temperature being "+maxTemp[i]+" C"); 
       System.out.println("------------------------------------------------------------------------------------------");
     }   
    }
}
