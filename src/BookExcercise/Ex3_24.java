// Game: pick a card
package BookExcercise;

import java.util.Random;
import java.util.Scanner;

public class Ex3_24 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Random genNumb = new Random();
        int rank = genNumb.nextInt(13) + 1;
        int suit = genNumb.nextInt(4) + 1;
        
        System.out.print("The card you picked is ");
        switch(rank)
        {
            case 1: System.out.print(" Ace of "); break;
            case 2: System.out.print(" 2 of "); break;
            case 3: System.out.print(" 3 of "); break;
            case 4: System.out.print(" 4 of "); break;
            case 5: System.out.print(" 5 of "); break;
            case 6: System.out.print(" 6 of "); break;
            case 7: System.out.print(" 7 of "); break;
            case 8: System.out.print(" 8 of "); break;
            case 9: System.out.print(" 9 of "); break;
            case 10: System.out.print(" 10 of "); break;
            case 11: System.out.print(" Jack of "); break;
            case 12: System.out.print(" Queen of "); break;
            case 13: System.out.print(" King of "); break;
            
                
        }
          
        switch (suit)
        {
            case 1: System.out.println("Clubs"); break;
            case 2: System.out.println("Diamonds"); break;
            case 3: System.out.println("Hearts"); break;
            case 4: System.out.println("Spades"); 
            
        }
        
        System.out.print("(Generated numbers: " + rank +"  "+ suit + " )");

    }
    
}
