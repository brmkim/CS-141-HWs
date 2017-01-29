// Financial: compare costs
package BookExcercise;

import java.util.Scanner;

public class Ex3_33 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner readInput = new Scanner(System.in);
       
        System.out.print("Enter weight and price for package1: ");
        float weight1 = readInput.nextFloat();
        float price1 = readInput.nextFloat();
        System.out.print("Enter weight and price for package2: ");
        float weight2 = readInput.nextFloat();
        float price2 = readInput.nextFloat();

        float comparison1 = price1 / weight1;
        float comparison2 = price2 / weight2;
        
        if (comparison1 > comparison2)
            System.out.println("Package 2 has a better price");
        else if (comparison1 < comparison2)
            System.out.println("Package 1 has a better price");
        else
            System.out.println("Two packages have the same price");
        
        

    }
    
}
