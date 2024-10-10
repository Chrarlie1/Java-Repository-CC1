/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc21q.lipago;

/**
 *
 * @author m307user
 */
public class IcecreamSandwich {   
    String size1 = "small";
    String size2 = "medium";
    String size3 = "large";
    public void whatDoIHave() {                    // Vehicle method
    System.out.println("This is my Ice Cream Sandwich");
  }
}
class Flavor extends IcecreamSandwich {
    String flavor1 = "chocolate"; 
    String flavor2 = "strawberry";
    String flavor3 = "vanilla";
     public static void main(String[] args) {


    Flavor mySandwich = new Flavor();
    mySandwich.whatDoIHave();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(" It is "+mySandwich.size3 + " sized and " + mySandwich.flavor2+" flavored");
}
}