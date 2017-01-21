package BookExcercise;

// Compute the volume of a cylinder

/**
 *
 * @author boram
 */

import java.util.Scanner;

public class Ex2_2 
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        double radius;
        double length;
        double area;
        double volume;
        
        Scanner readInput = new Scanner(System.in);
        
        System.out.println("Enter the radius and length of a cylinder: ");
        radius = readInput.nextFloat();
        length = readInput.nextFloat();
        
        area = Math.pow(radius, 2) * PI;
        volume = area * length;
        
        System.out.println("The area is " + area);
        System.out.println("The volumd is " + volume);
    }       
}
