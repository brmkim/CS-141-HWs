// Coversion between feet and meters
package ch6;

public class Ex6_9 
{
    public static void main(String[] args) 
    {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-------------------------------------------------");
        for (double f = 1.0, m = 20.0; f <= 10; f++, m += 5)
        {
            double f2m = footToMeter(f);
            double m2f = meterToFoot(m); 
            System.out.printf("%.1f\t%.3f\t|\t%.1f\t%.3f\t\n", f, f2m, m, m2f);
        }
        
    }
    public static double footToMeter(double foot)
    {
        double meter = 0.305 * foot;        
        return meter;
    }
    public static double meterToFoot(double meter)
    {
        double foot = 3.279 * meter;        
        return foot;
    }
}
