/**********************
* Author: Micah L
*
* Lab: Ball
**********************/

public class Ball {  

   private double size;
   public void setSize(double s){
      
     if (size >=0){
        size = s;
     }
   }

   public void roll() {
      System.out.println("Rolling...");
   }
   
   public void bounce(int numberOfBounces) {
      System.out.println("Ball is bouncing " + numberOfBounces + " times");
   }
   
   public double getSize(){
      return size;
   }   
}