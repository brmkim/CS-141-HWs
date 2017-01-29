// Science: day of the week
package BookExcercise;

import java.util.Scanner;

public class Ex3_21 
{
    public static void main(String[] args)
    {
        int h;
        int q;
        int m;
        int year;
        int j;
        int k;
        
        Scanner readInput = new Scanner(System.in);
        
        System.out.print("Enter year (e.g., 2012): ");
        year = readInput.nextInt();
        j = year / 100;
        k = year % 100;
        
        System.out.print("Enter month (1-12): ");
        m = readInput.nextInt();
        if (m == 1)
        {
            m = 13;
            j -= -1;
            k -= -1;        
        }
        if (m == 2)
        {
            m = 14;
            j -= -1;
            k -= -1;
        }                   
        
        System.out.print("Enter the day of the month (1-31): ");
        q = readInput.nextInt();
        
        h = ((q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7);
        System.out.println(h);
        
        switch (h)
        {
            case 0: System.out.println("Day of the week is Saturday"); break;
            case 1: System.out.println("Day of the week is Sunday"); break;
            case 2: System.out.println("Day of the week is Monday"); break;
            case 3: System.out.println("Day of the week is Tuesday"); break;
            case 4: System.out.println("Day of the week is Wednesday"); break;
            case 5: System.out.println("Day of the week is Thursday"); break;
            case 6: System.out.println("Day of the week is Friday");
            
        }
        
        
        
        
        
        
    }
}
