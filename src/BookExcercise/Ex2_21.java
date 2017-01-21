// financial application: calculate future investment value

package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex2_21 
{
    public static void main(String[] args)
    {
        double investmentAmount;
        double monthlyIneterestRate;
        int numberOfYears;
        double futureInvestmentValue;
        
        Scanner readInput = new Scanner(System.in);
        DecimalFormat twoDigits = new DecimalFormat("#,##0.00");
        
        System.out.print("Enter investment amount: ");
        investmentAmount = readInput.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        monthlyIneterestRate = readInput.nextDouble();
        System.out.print("Enter number of years: ");
        numberOfYears = readInput.nextInt();
        
        
        futureInvestmentValue = investmentAmount * 
                Math.pow((1 + monthlyIneterestRate), (numberOfYears * 12));     
        System.out.println("Accumulated value is $" 
                + twoDigits.format(futureInvestmentValue));
        
        

    }
}
