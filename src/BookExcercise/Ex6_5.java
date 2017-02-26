// Sort three numbers
package ch6;
import java.util.Scanner;

public class Ex6_5 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter three digits to sort: ");
        Scanner input = new Scanner(System.in);
        int numbs = input.nextInt();
        
        int n1 = numbs / 100;
        int n2 = numbs / 10 % 10;
        int n3 = numbs % 10;
        
        displaySortedNumbers(n1, n2, n3);
        
    }
    
    public static void displaySortedNumbers(int num1, int num2, int num3)
    {
        int smallest = 0;
        int middle = 0;
        int greatest = 0;
        
        if (num1 < num2)
        {
            greatest = num2;
            
            if (num2 < num3)
            {   greatest = num3;
                middle = num2;
                smallest = num1;
            }
            else 
            {
                if (num1 < num3)
                {
                    middle = num3;
                    smallest = num1;
                }
                else
                {
                    middle = num1;
                    smallest = num2;
                }    
            }
        }
        else 
        {
            greatest = num1;
            if (num1 < num3)
            {
                greatest = num3;
                middle = num1;
                smallest = num2;
            }
            else 
            {
                if (num2 < num3)
                {
                    middle = num3;
                    smallest = num1;
                }
                else
                { 
                    middle = num2;
                    smallest = num3;
                }
            }
                            
        }
        System.out.println(smallest + "" + middle + "" + greatest);
    }
    
}
