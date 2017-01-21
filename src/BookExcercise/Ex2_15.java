// Geometry: distance of two points
package BookExcercise;

/**
 *
 * @author boram
 */
import java.math.*;
import java.util.Scanner;

public class Ex2_15 
{
    public static void main(String[] args)
    {
        double x1;
        double x2;
        double y1;
        double y2;
        double distance;
        
        Scanner readInput = new Scanner(System.in);
        
        System.out.print("Enter x1 and y1: ");
        x1 = readInput.nextDouble();
        y1 = readInput.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = readInput.nextDouble();
        y2 = readInput.nextDouble();
        
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
        System.out.print("The distance between the two points is: " + distance);
        
        
        
}   }
