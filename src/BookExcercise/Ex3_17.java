// Game: scissor, rock, paper
package BookExcercise;

import java.util.Random;
import java.util.Scanner;

public class Ex3_17 
{
    public static void main(String[] args)
    {
        // Two ways to generate random numbers ranged from 0 to 2:
        // 1. import java.util.Random;
        //    Random generator = new Random();
        //    int randomIndex = generator.nextInt(3) - 1;
        //
        // 2. import java.util.concurrent.ThreadLocalRandom;
        //    ThreadLocalRandom.current().nextInt(min, max + 1);
        //
        // Int is exclusive of the max value 
        // (therefore next.Int(3) - 1 and nextInt(min, max + 1))

        int input = 0;
        int computer = 0;
        
        Random generator = new Random();
        computer = generator.nextInt(3);
        
        Scanner readInput = new Scanner(System.in);
        System.out.print("scissor(0), rock(1), paper(2): ");
        input = readInput.nextInt();
        
        System.out.print("The computer is " + computer + ". ");
        System.out.print("You are " + input + ". ");
        
        if (input < computer)
            System.out.print("You lost.");
        else if (computer < input)
            System.out.print("You won.");
        else
            System.out.print("It's a draw.");
                
                
        
        
        
        
    }
}
