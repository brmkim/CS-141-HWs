// Geometry: intersecting point
package BookExcercise;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex3_25 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        DecimalFormat deci = new DecimalFormat("#,##0.00000");
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        Scanner readInput = new Scanner(System.in);
        
        float x1 = readInput.nextFloat();
        float y1 = readInput.nextFloat();
        float x2 = readInput.nextFloat();
        float y2 = readInput.nextFloat();
        float x3 = readInput.nextFloat();
        float y3 = readInput.nextFloat();
        float x4 = readInput.nextFloat();
        float y4 = readInput.nextFloat();
        
        // Cramer's rule:
        // ax + by = e
        // cx + dy = f
        //
        // x = (ed - bf) / (ad - bc)
        // y = (af - ec) / (ad - bc)
        
        double a = y1 - y2; 
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double first = a * x1;
        double second = b * y1;
        double third = c * x3;
        double fourth = d * y3;
        
        double e = first - second;
        double f = third - fourth;
         
        double denom = ((a * d) - (b * c));
        double x = ((e * d) - (b * f))/ denom;
        double y = ((a * f) - (e * c))/ denom;
        
            
        // define infinity
        double posInfinity = Double.POSITIVE_INFINITY;
        double negInfinity = Double.NEGATIVE_INFINITY;
                   
        if (x != posInfinity && x != negInfinity && y != posInfinity 
                && y != negInfinity)
            System.out.println("The intersecting point is at (" 
                    + deci.format(x) + ", " + deci.format(y) + ")");
        else
            System.out.println("The two lines are parallel");
        
        
        
        // test value 1: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
        // answer: The intersecting point is at (2.88889, 1.1111)
        // test value 2: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
        // answer: The two lines are parallel
    
    
    }
    
}
