// Game: addition quiz
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;

public class Ex3_10 
{
    public static void main(String[] args)
    {
        int num1 = 0;
        int num2 = 0;
        int temp = 0;
        int answer = 0;
        
        // Generate two random three-digit int
        num1 = (int)(Math.random() * 1000);
        num2 = (int)(Math.random() * 1000);
        
        if (num1 < num2)
        {    
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.print
        ("What is " + num1 + " - " + num2 + "? ");
        Scanner readInput = new Scanner(System.in);
        answer = readInput.nextInt();
        
        if (num1 - num2 == answer)
            System.out.println("You are correct!");
        else
        {
            System.out.println("Your answer is wrong.");
            System.out.println(num1 + " - " + num2 + " should be "
            + (num1 - num2));
        }

     } 


}
