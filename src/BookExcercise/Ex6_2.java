// Sum the digits in an integer
package ch6;

import java.util.Scanner;

public class Ex6_2 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        long numb = input.nextLong();
        sumDigits(numb);
    }
    
    public static int sumDigits(long n)
    {
        
        int sum = 0;
        int temp = 0;
        
        String len = String.valueOf(n);
        int length = len.length();
        
        int a = (int) (n % 10);
        sum += a;
        temp = (int) (n / 10);
        for (int i = (length - 2); i >= 0; i--)
        {
            int b = (int) (temp % 10);
            sum += b;
            temp = (int) (temp / 10);
        }
 
        System.out.print(sum);
        return sum;
    }
}
