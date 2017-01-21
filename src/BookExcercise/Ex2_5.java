package BookExcercise;

// Financial application: calculate tips

/**
 *
 * @author boram
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex2_5 
{
    public static void main(String[] args)
    {
        float subtotal;
        float gratuityRate;
        float gratuity;
        float total;
        
        Scanner readInput = new Scanner(System.in);
        DecimalFormat twoDigits = new DecimalFormat("#,##0.00");
       
        System.out.println("Please enter the subtotal and gratuity rate: ");
        subtotal = readInput.nextFloat();
        gratuityRate = readInput.nextFloat();
        
        gratuity = subtotal * (gratuityRate / 100);
        total = subtotal + gratuity;
        
        System.out.println("The gratuity is $" + twoDigits.format(gratuity)
        + " and total is $" + twoDigits.format(total));
        


        
    }
}
