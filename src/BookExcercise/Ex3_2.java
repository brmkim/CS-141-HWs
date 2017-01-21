// Game: add three numbers
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;

public class Ex3_2 
{
    public static void main(String[] args)
    {
        int num1 = (int)(System.currentTimeMillis() % 10);
        int num2 = (int)(System.currentTimeMillis() / 7 % 10);
        int num3 = (int)(System.currentTimeMillis() / 3 % 10);
        Scanner readInput = new Scanner(System.in);
        
        System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");
        
        int answer = readInput.nextInt();
        //int answer = num1 + num2 + num3;
     
        System.out.println(num1 + " + " + num2 + " + " + num3  + " = " + answer 
                + " is " + (num1 + num2 + num3 == answer));
        
    }
}
