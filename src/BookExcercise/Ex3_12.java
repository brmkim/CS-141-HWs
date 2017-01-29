// Palindrome number
package BookExcercise;

import java.util.Scanner;

public class Ex3_12 
{
    public static void main(String[] args)
    {
        int numWhole;
        int num1;
        int num3;
        
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        numWhole = readInput.nextInt();
        
        num1 = numWhole / 100;
        num3 = numWhole % 10;
        
        if (num1 == num3)
            System.out.println(numWhole + " is a palindrome");
        else
            System.out.println(numWhole + " is not a palindrome");
        
        
    }
}
