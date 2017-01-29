// Geometry: two circles
package BookExcercise;

import java.util.Scanner;

public class Ex3_29 
{
    public static void main(String[] args)
    {
        final double SQUARE = 2.0;
        Scanner readInput = new Scanner(System.in);
        
        System.out.print("Enter circle1's center x-, y-coordinates, "
                + "and radius: ");
        double x1 = readInput.nextFloat();
        double y1 = readInput.nextFloat();
        double rad1 = readInput.nextFloat();
        
        System.out.print("Enter circle2's center x-, y-coordinates, "
                + "and radius: ");     
        double x2 = readInput.nextFloat();
        double y2 = readInput.nextFloat();
        double rad2 = readInput.nextFloat();        
        
        // Distance between the two centers:
        double dist = Math.sqrt(Math.pow(x2 - x1, SQUARE) 
                + Math.pow(y2 - y1, SQUARE));
        double r1_r2 = rad1 - rad2;
        double r1Plusr2 = rad1 + rad2;
        
        if (dist <= Math.abs(r1_r2))
            System.out.println("Circle2 is inside circle1");
        else if (dist <= r1Plusr2)
            System.out.println("Circle2 overlaps circle1");
        else 
            System.out.println("Circle2 does not overlap circle1");
    }
    
}
