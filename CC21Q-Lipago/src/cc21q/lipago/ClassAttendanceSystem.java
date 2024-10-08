/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc21q.lipago;
import java.util.Scanner; 
/**
 *
 * @author m307user
 */
public class ClassAttendanceSystem {
    public static void main(String[]args){
    Scanner attendanceScanner = new Scanner(System.in);
    int stdntNum=0,stdntAbsent=0, stdntPresent=0;
    char isPresent = 'Y';
    
    System.out.println("Enter the total number of students:"); 
      stdntNum=attendanceScanner.nextInt();
     for (int i = 0; i < stdntNum; i++) {
      System.out.println("Is student" +(i+1)+ " present? (Y/N):");
      stdntNum=attendanceScanner.nextInt();
     }
    
    
    }
}
