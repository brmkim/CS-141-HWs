// Game: heads or tails

package BookExcercise;

import java.util.Scanner;

public class Ex3_14 
{
    public static void main(String[] args)
    {
        int x = (Math.random()<0.5)?0:1;
        int guess;
        
        Scanner readInput = new Scanner(System.in);
        System.out.print("Guess the flip of the coin toss. Enter 0 for head or"
                + "1 for tail): ");
        guess = readInput.nextInt();
        
        if (guess == x)
            System.out.println("Your guess is correct!");
        else
            System.out.println("Sorry, your guess is incorrect!");
            
        
        
        
    }
}
