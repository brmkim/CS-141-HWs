// Population projection
package BookExcercise;

/**
 *
 * @author boram
 */
import java.util.Scanner;

public class Ex2_11 
{
    public static void main(String[] args)
    {
        final int SECONDS_IN_YEAR = 60 * 60 * 24 * 365;
        double birthInSeconds = 7.0;
        double deathInSeconds = 13.0;
        double immigInSeconds = 45.0;
        double population = 312032486;
        double newPopulation;
        int yearNum;
        double birthNumb =  SECONDS_IN_YEAR / birthInSeconds;
        double deathNumb = SECONDS_IN_YEAR / deathInSeconds;
        double immigNumb = SECONDS_IN_YEAR / immigInSeconds;
        
        Scanner readInput = new Scanner(System.in);
        
        //for (int i = 0; i <= 5; i++)
        //{
        //    population += birthNumb - deathNumb + immigNumb;
        //    System.out.println("At year " + i + ", population is projected to "
        //    + (int)population);
        //}
        
        System.out.print("Enter the number of years: ");
        yearNum = readInput.nextInt();
        
        for (int i = 0; i < yearNum; i++)
        {
            population = population + birthNumb - deathNumb + immigNumb;
            
        }
        System.out.println("The population in " + yearNum 
                + " years is " + (int) population);
    }
}
                