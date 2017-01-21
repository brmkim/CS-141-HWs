// Cost of Driving
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex2_23 
{
    public static void main(String[] args)
    {
        double distance;
        double mpg;
        double pricePerGallon;
        double costOfDriving;
        
        Scanner readInput = new Scanner(System.in);
        DecimalFormat twoDigits = new DecimalFormat("#,##0.00");
        
        System.out.print("Enter the driving distance: ");
        distance = readInput.nextDouble();
        System.out.print("Enter miles per gallon: ");
        mpg = readInput.nextDouble();
        System.out.print("Enter price per gallon: ");
        pricePerGallon = readInput.nextDouble();
        
        costOfDriving = distance * (1 / mpg) * pricePerGallon;
        System.out.print("The cost of driving is $" + twoDigits.format(costOfDriving));
        
        
    }
}
