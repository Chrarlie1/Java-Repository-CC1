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
public class PasswordValidationSystem {
    public static void main(String[] args){
        
    String password="";
    boolean notValidated=true;
    Scanner passScan = new Scanner(System.in);
    
    while(notValidated=true){
    System.out.println(" Please Input Your Password: ");
      password=passScan.nextLine();
     if(!password.matches(".*[A-Z].*" )&& !password.matches(".*[a-z].*")&&!password.matches("\\d+")&&password.length()<8){
     System.out.println("Pease input at least 1 uppercase letter and 1 lowercase letter. Try Again.");
     System.out.println("Password should have at least 8 characters. Try Again.");
     System.out.println("Pease input at least 1 digit number. Try Again.");
     continue;}
     else{ 
     notValidated=false;} 
    
    }
    System.out.println("Your Password Is Valid!"); 
    }
  }
      

