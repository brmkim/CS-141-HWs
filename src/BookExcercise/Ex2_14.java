// Health application: computing BMI
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex2_14 
{
    public static void main(String[] args)
    {
        final double lbToKg = 0.45359237;
        final double inchToMeter = 0.0254;
        double weightInKg;
        double weightInLb;
        double heightInMeters;
        double heightInInches;
        double bmi;
        
        Scanner readInput = new Scanner(System.in);
        DecimalFormat fourDecimalPts = new DecimalFormat("#,##0.0000");
        System.out.print("Enter weight in pounds: ");
        weightInLb = readInput.nextDouble();
        System.out.print("Enter height in inches: ");
        heightInInches = readInput.nextDouble();
        
        weightInKg = weightInLb * lbToKg;
        heightInMeters = heightInInches * inchToMeter;
        bmi = weightInKg / Math.pow(heightInMeters, 2);
        System.out.println("BMI is " + fourDecimalPts.format(bmi));
    }

}
