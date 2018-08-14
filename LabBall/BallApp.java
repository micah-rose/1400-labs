/**********************
* Author: Micah L
*
* Lab: Ball
**********************/

import java.util.Scanner;

public class BallApp {
   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      Ball myBall = new Ball();
      
      myBall.setSize(5);
      System.out.printf("Size of ball: %.0f%n", myBall.getSize());

      myBall.roll();
      
      myBall.bounce(14);
      
      myBall.setSize(7);
      System.out.printf("New ball size: %.0f%n", myBall.getSize());
   }
}