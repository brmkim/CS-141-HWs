// Game: craps
package ch6;
import java.util.*;
public class Ex6_30 
{      
    public static void main(String[] args) 
    { // set a variable with three values: 0 (lose), 1 (win), and 2 (continue)
        boolean sameNum = false;
        boolean win = false;
        boolean lose = false;
        
        //First roll
        int sum1 = roll();
        if ( initValueEval(sum1) != 2 ) // if the initial roll results in win/lose
        {
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        else // if the status is to continue
        { 
           int sum2 = roll();
           int rVal = valueEval(sum1, sum2);
        
            while ( rVal == 2)
            {
                if (rVal == 1)
                    System.exit(0);
                else
                {
                    sum1 = sum2;
                    sum2 = roll();   
                    rVal = valueEval(sum1, sum2);
                    
              
                }
            }
        }
            System.out.println("Thanks for playing!");
            System.exit(0);
       
        
    }
    public static int roll()
    {   // roll two dice and get the sum        
        int dice1 = (int) (1 + Math.random() * 6);
        int dice2 = (int) (1 + Math.random() * 6);
        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        
        return sum;
    }
    public static int initValueEval(int n)
    {
        int returnVal = 0; //0 for lose, 1 for win, 2 for continue
        if (n == 7 || n == 11)
        {
            System.out.println("You win");
            returnVal = 1;
        }
        else if (n == 2 || n == 3 || n == 12)
        {
            System.out.println("Crap");
            System.out.println("You lose");
            returnVal = 0;
        }
        else
        {
            System.out.println("point is " + n);
            returnVal = 2;
        }   
        return returnVal;
    }
    
    public static int valueEval(int sum1, int sum2)
    {
        int returnVal = 0;
        if (isSame(sum1, sum2))
        {
            System.out.println("your last two rolls (" + sum1 +", " + sum2 
                    + ") are the same.");
            System.out.println("You win");
            returnVal = 1;
        }
        else if (sum2 == 7)
        {
            System.out.println("Crap! You lose");
            returnVal = 0;
        }
        else
        {
            System.out.println("point is " + sum2);
            returnVal = 2;
        }
        return returnVal;
                
    }
    public static boolean isSame(int n, int m)
    {   // see if the the new dice value is the same as the previous
        boolean result = false;
        
        if (n == m)  // two values are the same
            result = true;
        else
            result = false;
       
        return result;
    }
}
