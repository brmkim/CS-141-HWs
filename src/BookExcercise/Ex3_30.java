// Current time
package BookExcercise;

import java.util.Scanner;

public class Ex3_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // ------------From Listing 2.7--------------
        
        // Obtatin the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        
        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;
        
        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        
        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;
        
        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        //-------------------------------------------
    
      
        Scanner readInput = new Scanner(System.in);
        
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = readInput.nextInt();
        
        // Compute the current hour -- changed for Ex3.30
        long currentHour = (totalHours + offset) % 24;
        
        System.out.print("The current time is ");
        
        if (currentHour > 12)
        {
            currentHour -= 12;
            System.out.println(currentHour + ":" + currentMinute + ":" 
                + currentSecond + " PM ");
        }
        else
            System.out.println(currentHour + ":" + currentMinute + ":" 
                + currentSecond + " AM ");
    }
    
}
