// Science: calculating energy
package BookExcercise;

/**
 *
 * @author boram
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex2_10 
{
    public static void main(String[] args)
    {
        double amountWater;
        double initTemp;
        double finTemp;
        double energyNeeded;
        
        Scanner readInput = new Scanner(System.in);
        DecimalFormat oneDigit = new DecimalFormat("#,##0.0");
        System.out.print("Enter the amount of water in kilograms: ");
        amountWater = readInput.nextDouble();
        
        System.out.print("Enter the initial temperature: ");
        initTemp = readInput.nextDouble();
        
        System.out.print("Enter the final temperature: ");
        finTemp = readInput.nextDouble();
        
        energyNeeded = amountWater * (finTemp - initTemp) * 4184;
        System.out.print("the energy needed is " 
                + oneDigit.format(energyNeeded));
        
        
    }
}
