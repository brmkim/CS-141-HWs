// Estimate PI
package ch6;

public class Ex6_14 
{
    public static void main(String[] args) 
    {
        double piVal = 0.0;
        for (int n = 1; n <= 901; n += 100)
        {
            piVal = pi(n);
            System.out.printf("%d \t %.4f\n", n, piVal);
        }
        

    }
    
    public static double pi(int n)
    {
        double val = 0.0;
        
        for (int i = 1, denom = 1; i <= n; i++, denom +=2)
        {
            if (i % 2 == 0)
                val -= 1.0 / denom; 
            else
                val += 1.0 / denom;
        
        }
    
        return 4 * val;
    }
}

    

