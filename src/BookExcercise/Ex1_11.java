package BookExcercise;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boram
 */
public class Ex1_11 {
    public static void main(String[] arg){
        double birthRate = 7.0 / 60;
        double deathRate = 13.0 / 60;
        double immigrantRate = 45.0 / 60;
        long currentPopulation = 312032486;
        int secondsInYear = 60 * 60 * 24 * 365;
        double populationRateOfGrowth = currentPopulation + ((birthRate - 
                deathRate + immigrantRate) * secondsInYear);
        
        System.out.println("The projected rate of growth of population "
                + "in the next five years "
                + "according to the U.S. Census Bureau: ");
        System.out.println(populationRateOfGrowth);
        
        
    }
    
}
