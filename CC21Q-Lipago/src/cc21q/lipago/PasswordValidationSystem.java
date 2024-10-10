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
    public static void main(String[] args) {
    String password="";

    Scanner passScan = new Scanner(System.in);
    
    System.out.println(" Please Input Your Password: ");
      password=passScan.nextLine();
    while (!password.hasNext("123456789abcdefgh")){
        System.out.println(" Please Input Your Password: ");
      password=passScan.nextLine();
    }
    
    
    
    
}
}
