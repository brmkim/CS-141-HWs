// Business: check ISBN-10
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;

public class Ex3_9 
{
    public static void main(String[] args)
    {
        int isbn = 0;
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        int d6 = 0;
        int d7 = 0;
        int d8 = 0;
        int d9 = 0;
        int d10 = 0;
        char x = 'X';
        
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        Scanner readInput = new Scanner(System.in);
        isbn = readInput.nextInt();
        
        d1 = isbn / 100000000;
        d2 = isbn % 100000000 / 10000000;
        d3 = isbn % 100000000 % 10000000 / 1000000;
        d4 = isbn % 100000000 % 10000000 % 1000000 / 100000;
        d5 = isbn % 100000000 % 10000000 % 1000000 % 100000 / 10000;
        d6 = isbn % 100000000 % 10000000 % 1000000 % 100000 % 10000 / 1000;
        d7 = isbn % 100000000 % 10000000 % 1000000 % 100000 % 10000 % 1000 / 100;
        d8 = isbn % 100000000 % 10000000 % 1000000 % 100000 % 10000 % 1000 % 100
                / 10;
        d9 = isbn % 100000000 % 10000000 % 1000000 % 100000 % 10000 % 1000 % 100
                % 10;
        
        d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8
                + d9 * 9) % 11;
        if (d10 == 10)
            d10 = 'X';
        
        System.out.print("The ISBN-10 number is: " + isbn);
        System.out.printf("%c", d10);
               
        
    }
    
}
