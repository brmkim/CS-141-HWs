package BookExcercise;

// convert Celcius to Fahrenheit

/**
 *
 * @author boram
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2_1 
{
    public static void main(String[] args)
    {
        double celcius;
        double fahrenheit;
        DecimalFormat oneDigits = new DecimalFormat("#,##0.0");
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Please enter the degress in Celcius: ");
        celcius = read.nextDouble();
        
        fahrenheit = (9.0 / 5) * celcius + 32;
        
        System.out.println(oneDigits.format(celcius) + " degrees Celcius is"
                + "equivalent to " + oneDigits.format(fahrenheit)
                + " degrees Fahreheit.");
        
    }
    

    
}
