// Occurences of a specified character
package ch6;
import java.util.Scanner;

public class Ex6_23
{
    public static void main(String[] args) 
    {
        String strInput;
        String temp;
        char a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");               
        strInput = input.next();
        System.out.print("Enter a character you'd like to count: ");
        temp = input.next();
        a = temp.charAt(0);
        System.out.print("Number of times the letter \"" + a + "\" appears in " 
                + strInput + ": ");
        System.out.println(count(strInput, a));
   
    }
    public static int count(String str, char a)
    {
        int cnt = 0;
        int len = 0;
        
        len = str.length();
        str = str.toLowerCase();
        
        for (int i = 0; i < len; i++)
        {
            boolean match = false;
            if (str.charAt(i) == a)
                cnt++;
        }    
        
        return cnt;
    }
}
