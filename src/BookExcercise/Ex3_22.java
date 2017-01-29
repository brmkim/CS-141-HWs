// Geometry: point in a circle?
package BookExcercise;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex3_22 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        final int SQUARE = 2;
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        int xInput = readInput.nextInt();
        int yInput = readInput.nextInt();
        //int x0 = 10;
        //int y0 = 10;
        int xOrigin = 0;
        int yOrigin = 0;
        double distance = Math.sqrt((Math.pow((xOrigin - xInput), SQUARE)) 
                + Math.pow((yOrigin - yInput), SQUARE));
        
        DecimalFormat oneDecimal = new DecimalFormat("#,##0.0"); 
        System.out.println("Distance between the circle's points and the origin "
                + " is: " + oneDecimal.format(distance));
        
        if (distance <= 10)
        {
            System.out.println("Point (" + oneDecimal.format(xInput) + ", " 
                    + oneDecimal.format(yInput) + ") is in the circle");
            
        }
        else
             System.out.println("Point (" + oneDecimal.format(xInput) 
                     + ", " + oneDecimal.format(yInput) + ") is "
                    + "not in the circle");           
    }
    
}
