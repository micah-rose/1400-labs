/*****************************
* Author: Micah L
*
* Lab: Time Table - Ultimate
*****************************/

public class LabTimeTableUltimate{

    
   public static void main(String[] args){
   
   for (int i = 1; i <= 10; i += 2){
   
      for (int j = 1; j <= 10; j++){
   
         System.out.printf("%2d * %d = %-2d",  j, i, j*i);
         System.out.printf("%10d * %d = %-2d%n", j, i+1, j*(i+1));
      
      }
      
         System.out.println();
   
   }
   
   }
   
}