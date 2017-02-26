// Reverse a string
package BookExcercise;

import java.util.Scanner;

public class Ex5_46 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a string: ");
        
        Scanner input = new Scanner(System.in);
        String line = input.next();
        
        int len = line.length();
        
        for (int i = len-1; i >= 0; i--)
        {
            //String reverse = "";
            char reverse = line.charAt(i);
            System.out.print(reverse);
           
        }
        System.out.println();
    }
    
}
