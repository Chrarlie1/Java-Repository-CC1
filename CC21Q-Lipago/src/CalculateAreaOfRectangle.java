/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m307user
 */
public class CalculateAreaOfRectangle {
    public static void main(String[]args){
        
        int length, width, area, perimeter;
        length = 20;
        width= 10 ;
        area= length*width;
        perimeter = 2 *(length + width);
            
        System.out.println("A rectangular garden with a length of "+ length + 
        " meters and width of "+ width +" meters, will have an area of "
        + area + " meters squared and a perimeter of "+ perimeter + " meters.");
            
    }
}
