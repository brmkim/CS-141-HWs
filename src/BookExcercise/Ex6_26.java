// Palindromic prime
package ch6;


public class Ex6_26 
{

    public static void main(String[] args) 
    {
        int index = 1;
        int numb = 2;
        while (index <= 100)
        {
                if (isPrime(numb) && isPalindromic(numb))
                {
                    if (index % 10 == 0)
                    {
                        System.out.println(numb);
                        index++;
                    }   
                    else
                    {
                        System.out.print(numb + " ");
                        index++;
                    }   
                }
                numb++;
            }
    }
    
    public static boolean isPrime(int n)
    {
        boolean result = false;
        for (int i = 2; i < n; i++)
        {
              if (n % i == 0)
                return false;
        }  
        return true;
    }
    public static boolean isPalindromic(int n)
    {
        boolean result = false;
        String numStr;
        numStr = Integer.toString(n);
        char first;
        char last;
        int len = 0;
        len = numStr.length();
        first = numStr.charAt(0);
        last = numStr.charAt(len - 1);
        
        if (first == last)
            result = true;
        else
            result = false;
        
        return result;
    }
}
