// Geometry: points in triangle?
package BookExcercise;

import java.util.Scanner;

public class Ex3_27 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        float xCord = readInput.nextFloat();
        float yCord = readInput.nextFloat();
        
        float x1 = 0;
        float y1 = 100;
        float x2 = 200;
        float y2 = 0;

        // The formular for the triangle's hypotenuse line 
        //  y = mx + b, where 
        float m = (y2 - y1) / (x2 - x1);
        //  m = (0 - 100) / (200 - 0) = -100 / 200 = -1/2 = -0.5
        //  y = -0.5*x + 100;
        //  
        //
        // The length of the hypotenuse line
        // c^2 = 100^2 + 200^2 = 10000 + 40000
        // c = sqrt(50000)
        float y = m * xCord + 100;
        float x = yCord / m + 100;
                          
        if (x >=0 && y >=0 )
            System.out.println("The point is in the triagle");
        else
            System.out.println("The point is not in the triagle");
            
        
        
        
    }
    
}
