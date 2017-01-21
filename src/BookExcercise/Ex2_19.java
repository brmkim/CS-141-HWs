// Geometry: area of a triangle
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex2_19 
{
    public static void main(String[] args)
    {
        double x1;
        double x2;
        double x3;
        double y1;
        double y2;
        double y3;
        double side1;
        double side2;
        double side3;
        double s;
        double area;
        
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        x1 = readInput.nextDouble();
        y1 = readInput.nextDouble();
        x2 = readInput.nextDouble();
        y2 = readInput.nextDouble();
        x3 = readInput.nextDouble();
        y3 = readInput.nextDouble();
        
        side1 = Math.abs(x2 - x1); 
        side2 = Math.abs(y2 - y1);
        side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        //s = (side1 + side2 + side3) / 2;
        area = Math.abs( (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
        
        System.out.println("side1: " + side1);
        System.out.println("side2: " + side2);
        System.out.println("side3: " + side3);
        //System.out.println("s: " + s);
        System.out.println("area: " + area);
        
        DecimalFormat oneDigit = new DecimalFormat("#,##0.0");
        System.out.print("The area of the triangle is " + oneDigit.format(area));
        
        //1.5 -3.4 4.6 5 9.5 -3.4
        
        
        
    }
}
