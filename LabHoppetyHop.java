/**************************
* Author: Micah L + Amie J
*
* Lab Hoppety Hop
****************************/

public class LabHoppetyHop{
   public static void main(String[] args){
   
      int n = 25;
      hoppetyHop(n);
   }
   
   private static void hoppetyHop(int max){
      for (int i = 1; i <= max; i++){
      
         if (i%3==0 && i%5==0){
            System.out.println("Hoppety Hop");
         }
         else if (i%3==0){
            System.out.println("Hoppety");
         }
         else if (i%5==0){
            System.out.println("Hop");
         }
         else 
            System.out.println(i);
      }
   }

}