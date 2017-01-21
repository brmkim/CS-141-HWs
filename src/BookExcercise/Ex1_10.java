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
public class Ex1_10 {
   public static void main(String[] arg){
       double Kms = 14;
       double Mins = 45;
       double Secs = 30;
       double ConvertToHour = Mins / 60 + Secs / 360;
       double KmsToMiles = 1 /1.6 * Kms;
       double AverageMPH = KmsToMiles / ConvertToHour;
       System.out.print("Miles run: ");
       System.out.println(KmsToMiles);
       System.out.print("Avrerage Speed in Miles per Hour is ");
       System.out.print(AverageMPH);
       System.out.println("(mph)");
   }    
}
