// Geometry: point position
package BookExcercise;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex3_32 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner readInput = new Scanner(System.in);
        DecimalFormat oneDec = new DecimalFormat("#,##0.0");
       
        System.out.print("Enter three points for p0, p1, and p2: ");
        float x0 = readInput.nextFloat();
        float y0 = readInput.nextFloat();
        float x1 = readInput.nextFloat();
        float y1 = readInput.nextFloat();
        float x2 = readInput.nextFloat();
        float y2 = readInput.nextFloat();
        float result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        
        System.out.print("(" + oneDec.format(x2) + ", " + oneDec.format(y2) 
                + ")" +" is");
        
        if (result > 0)
            System.out.print(" on the left side of the line ");
        else if (result < 0)
            System.out.print(" on the right side of the line ");
        else
            System.out.print(" on the line ");
        
        
        System.out.println("from " + "(" + oneDec.format(x0) + ", " 
                + oneDec.format(y0) + ")" +" to " + "(" + oneDec.format(x1)
                + ", " + oneDec.format(y1) + ")");
          
          
    }
    
    
}
