// Financial application: calculate interes

package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;
        
public class Ex2_20 
{
    public static void main(String[] args)
    {
        final int MONTHLY = 1200;
        double balance;
        double annualInterestRate;
        double interest;
        
        Scanner readInput = new Scanner(System.in);
        
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = readInput.nextDouble();
        annualInterestRate = readInput.nextDouble();
        
        interest = balance * (annualInterestRate / MONTHLY);
        System.out.println("The interest is: " + interest);
        
        
        
        
    }
}
