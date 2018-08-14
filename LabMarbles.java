/******************
* Author: Micah L
*
* Lab: Marbles
********************/

import java.util.Scanner;

public class LabMarbles {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Color: ");
      String color1 = input.nextLine();
      System.out.printf("Number of %s marbles: ", color1);
      int number1 = input.nextInt();
      input.nextLine(); // clean up
      
      System.out.print("Color: ");
      String color2 = input.nextLine();
      System.out.printf("Number of %s marbles: ", color2);
      int number2 = input.nextInt();
      input.nextLine(); // clean up
      
      System.out.print("Color: ");
      String color3 = input.nextLine();
      System.out.printf("Number of %s marbles: ", color3);
      int number3 = input.nextInt();
      input.nextLine(); // clean up
      System.out.println();
      
      String colorTitle = "Color";
      String numTitle = "Number of Marbles";
      
      System.out.printf("%-12s %2s%n", colorTitle, numTitle);
      System.out.println("------------ ------------------");
      System.out.printf("%-12s %2s%n", color1, number1);
      System.out.printf("%-12s %2s%n", color2, number2);
      System.out.printf("%-12s %2s%n", color3, number3);
        
   }
}