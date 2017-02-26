// Check password
package ch6;
import java.util.Scanner;

public class Ex6_18 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Password Rules: a password must ");
        System.out.println("- have at least eight characters.");
        System.out.println("- consists of only letters and digits.");
        System.out.println("- contain at least two digits.");
        
        System.out.print("Please enter password you'd like to use: ");
        String pw = input.next();
        checkPW(pw);
    
    }
    
    public static void checkPW(String pw)
    {
        int len = pw.length();
        boolean isLetter = false;
        boolean isDigit = false;
        
        char ch;
        // check length
        if (len < 8)
            System.out.println("Inalid Password: a password must have at least"
                    + " eight characters!!");
        else
        {
            int dCounter = 0;
                
            // check if letters and/or digits                   
            for (int i = 0; i < len; i++)
            {
                // check if contains at least two digits
                ch = pw.charAt(i);
                isLetter = Character.isLetter(ch);
                isDigit = Character.isDigit(ch);
                
                if (isLetter)
                    ;
                else if (isDigit)
                    dCounter++;
                else
                {
                    System.out.println("Inalid Password: a password consists of"
                            + " only letters and digits!!");
                }    
            }    
                if (dCounter < 2)
                    System.out.println("Inalid Password: a password must"
                            + " contain at least two digits!!");
                else if ((isLetter || isDigit) && dCounter > 3)
                    System.out.println("Valid Password: you may use the"
                            + " password you entered.");
            }
        }
    
}
