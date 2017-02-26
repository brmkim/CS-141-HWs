// Emirp -- prime, emirp
package ch6;

public class Ex6_27 
{
    public static void main(String[] args) 
    {
        System.out.println("The first 100 emirps:");
        
            for (int i = 10, count = 0; count < 100; i++)
            {
                String iReverse = "";
                String iStr = Integer.toString(i);
                int len = iStr.length();
                
                for (int j = len - 1; j >= 0; j--)
                {
                    iReverse += iStr.charAt(j);
                }    
                    
                int iRevInt = Integer.parseInt(iReverse);
             
                if (isPrime(i) && isPrime(iRevInt) && (i != iRevInt))
                {
                    System.out.print(i + " ");
                    count++;
                    if (count % 10 == 0)
                        System.out.println("");
                }
            }
    }
    public static boolean isPrime(int n)
    {
        boolean result = false;
        for (int i = 2; i <= (n / 2); i++)
        {
              if (n % i == 0)
                return false;
        }  
        return true;
    }   
}
