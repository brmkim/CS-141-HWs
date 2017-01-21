// Algebra: solve quadratic equations
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;

public class Ex3_1 
{
    public static void main(String[] args)
    {
        double a;
        double b;
        double c;
        double discriminant;
        double r1;
        double r2;
        
        Scanner readInput = new Scanner(System.in);
  
        System.out.print("Enter a, b, c: ");
        a = readInput.nextDouble();
        b = readInput.nextDouble();
        c = readInput.nextDouble();
        discriminant = Math.pow(b,2) - (4 * a * c);
        r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
       
        if (discriminant > 0)
        {    System.out.println("The eqation has two roots: "
              + r1 + " and " + r2);
        }
        else if (discriminant == 0)
        {    System.out.println("The eqation has one root: " + r1);
        }
        else 
        {
            System.out.println("The equation has no real roots.");
        }
      
    }
}
