// Find the number of days in a month
package BookExcercise;

import java.util.Scanner;

public class Ex3_11 
{
    public static void main(String[] args)
    {
        int month = 0;
        int year = 0;
        int days = 0;
        int days28 = 28;
        int daysLeap = 29;
        int days30 = 30;
        int days31 = 31;
        boolean isLeapYear = false;
        
        
        System.out.print("Enter a month and a year: ");
        Scanner readInput = new Scanner(System.in);
        month = readInput.nextInt();
        year = readInput.nextInt();
        
        isLeapYear= (year % 4 == 0 && year % 100 != 0) 
                || (year % 400 == 0);
        
        // switch statement for translating the month number to month string
        switch (month)
        {
            case 1: System.out.print("January "); days = days31; break;
            case 2: System.out.print("February "); 
                    if (isLeapYear == true)
                        days = daysLeap;
                    else
                        days = days28;
                                
                    break;
            case 3: System.out.print("March "); days = days31; break;
            case 4: System.out.print("April "); days = days30; break;
            case 5: System.out.print("May "); days = days31; break;
            case 6: System.out.print("June "); days = days30; break;
            case 7: System.out.print("July "); days = days31; break;
            case 8: System.out.print("August "); days = days31; break;
            case 9: System.out.print("September "); days = days30; break;
            case 10: System.out.print("October "); days = days31; break;
            case 11: System.out.print("November "); days = days30; break;
            case 12: System.out.print("December "); days = days31;
                    
        }
        
        
        System.out.print(year + " had " + days + " days");
           
    }
}
