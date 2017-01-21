// Geometry: area of hexagon
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;
import java.text.DecimalFormat;        
public class Ex2_16 
{
    public static void main(String[] args)
    {
        double side;
        double area;
        
        Scanner readInput = new Scanner(System.in);
        DecimalFormat fourDigits = new DecimalFormat("0.0000");
        System.out.print("Enter the length of the side of a hexagon: ");
        side = readInput.nextDouble();
        
        area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " 
                + fourDigits.format(area));
        
    
    
    }
}
