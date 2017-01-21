package BookExcercise;

// Sum the digits in an integer

/**
 *
 * @author boram
 */

import java.util.Scanner;

public class Ex2_6 
{
    public static void main(String[] args)
    {
        int number;
        int n1;
        int n2;
        int n3;
        int sum;
        
        Scanner readInput = new Scanner(System.in);
        
        System.out.println("Enter a number between 0 and 1000: ");
        number = readInput.nextInt();
        n1 = number / 100;
        n2 = number % 100 / 10;
        n3 = number % 10;
        sum = n1 + n2 + n3;
        
        System.out.println("n1: " + n1 + " n2: " + n2 + " n3: " + n3);

        System.out.println("The sum of the digits is: " + sum);
        
        
    }
}
