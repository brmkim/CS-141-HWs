// Sort three inteers
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;

public class Ex3_8 
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int num3;
        int temp = 0;
        
        
        Scanner readInput = new Scanner(System.in);
        System.out.print("Please enter three integer numbers: ");
        num1 = readInput.nextInt();
        num2 = readInput.nextInt();
        num3 = readInput.nextInt();
        
        if (num1 > num2) 
        {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        if (num2 > num3)
        {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }    
        
        if (num1 > num2)
        {
           temp = num1;
           num1 = num2;
           num2 = temp; 
        }
        
        
                
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        
    }
}
