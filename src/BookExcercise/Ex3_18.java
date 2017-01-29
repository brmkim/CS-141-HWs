// Cost of shipping
package BookExcercise;

import java.util.Scanner;

public class Ex3_18 
{
    public static void main(String[] args)
    {
        double inputWeight;
        double cost = 0.0;
        
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter the weight of the package (in lb): ");
        inputWeight = readInput.nextDouble();
        
        if (0 < inputWeight && inputWeight <= 1)
        {
            cost = 3.5;
            System.out.print("The shipping cost is " + cost + " dollars.");
        }    
             
        else if (1 < inputWeight && inputWeight <= 3)
        {
            cost = 5.5;
            System.out.println("The shipping cost is " + cost + " dollars.");
        }    
        else if (3 < inputWeight && inputWeight <= 10)
        {
            cost = 8.5;
            System.out.println("The shipping cost is " + cost + " dollars.");
        } 
        else if (10 < inputWeight && inputWeight <= 20)
        {
            cost = 10.5;
            System.out.println("The shipping cost is " + cost + " dollars.");
        } 
        else if (50 < inputWeight)
            System.out.println("The package cannot be shipped");
        else
            System.out.println("The package cannot be shipped");
  

        
        
    }
}
