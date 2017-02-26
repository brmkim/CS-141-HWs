// Math: pentagonal numbers
package ch6;

public class Ex6_1 {

    public static void main(String[] args) 
    {
       System.out.println("The first 100 pentagonal numbers are:");
       getPentagonalNumber(100);
       System.out.print("");
       
       
    }
    
    public static int getPentagonalNumber (int n)
    {
        int numb = 0;
        for (int i = 1; i < (n + 1); i++)
        {    numb = (i * ((3 * n) - 1)) / 2;
          if ( i % 10 == 0)
            System.out.println(numb);
           else
            System.out.print(numb + " "); 
        }
        return numb;
    }
    
}
