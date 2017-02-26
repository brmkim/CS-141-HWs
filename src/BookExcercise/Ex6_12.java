// Display characters
package ch6;
import java.util.Scanner;

public class Ex6_12 
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters (1 to z): ");
        String chars = input.next();
        char ch1 = chars.charAt(0);
        char ch2 = chars.charAt(1);
        System.out.print("Specify the number to print each line: ");
        int number = input.nextInt();
        
        printChars(ch1, ch2, number);
        System.out.println("");
    }
    
    public static void printChars(char ch1, char ch2, int numberPerLine)
    {
        //int intVal1 = ch1 + 0;
        //int intVal2 = ch2 + 0;
        int counter = 1;
        for (char i = ch1; i <= ch2; i++)
        {
            if (counter % numberPerLine == 0)
            {
                System.out.println(i + " ");
                counter++;
            }
            
            else
            {
                System.out.print(i + " ");
                counter++;
            }
        }
    }
}    
    /* Someone else's answer:
        https://gist.github.com/marce11o/9e592a9b14937e2b15a6 */
    // 6.12  print characters
//	public static void printChars(char ch1, char ch2, int numberPerLine) {
//		int counter = 1;
//		while(true) {
//			System.out.print(ch1 + " ");
//			ch1++;
//			if(ch1 > ch2) break;
//			if (counter % numberPerLine == 0) System.out.println();
//			counter++;
//		}
//		
//	}
    //*/

