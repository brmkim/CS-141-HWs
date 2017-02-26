// Math: approximate the square root
package ch6;

public class Ex6_22 
{
    public static void main(String[] args) 
    {
        long numb = 5; // test value
        sqrt(numb);
    }
    public static double sqrt(long n)
    {
        double nextGuess = 0.0;
        double lastGuess = 0.0;
        double diff = 1.0;
        double guess = (1 + n / 1) / 2;
        int count = 1;
        while (guess - getGuess(guess, n) > 0.0001)
        {   
            
            guess = getGuess(guess, n);
            System.out.printf(count + ") guess: %.5f\n", guess);
            count++;
        }
       
        return nextGuess;
      
    }
    public static double getGuess (double guess, long n)
    {
        return (guess + n / guess) / 2;
    }
    
}
// PE 6.22 approximate square root
//	public static double sqrt(long n) {
//		double theGuess = n / 1 + 1 / 2;
//		int count = 1;
//		
//		while (theGuess - getGuess(theGuess, n) > 0.0001) {
//			theGuess = getGuess(theGuess, n);
//			System.out.println(count + ": theGuess = " + theGuess);
//			count++;
//		}
//		return theGuess;
		/*
		
		divide original number by the guess (1), then add the guess,
		then divide all that by 2
		
		save that result to compare later
		
		put the result back into the operation...
		divide the original number by result, add the last result,
		and divide all that by 2
		
		compare this new result to the last result...
		
		keep doing this until the difference is 0.0001
		
		*/
        //}
	
//	public static double getGuess(double guess, long n) {
//		return (guess + n / guess) / 2;
//	}
//	