/*********************
* Author: Micah L
*
* Lab: Party Guests
**********************/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class LabPartyGuests{
   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      ArrayList<String> guestList = new ArrayList<String>(); 
      Random rand = new Random();
   
      int numberOfGuests = 4;
   
      System.out.println("Please enter " + numberOfGuests + " guests: ");
   
      for(int i = 1; i <= numberOfGuests; i++){
   
         System.out.printf("guest%d: ", i);
         guestList.add(input.nextLine());
      }
      
      System.out.printf("\nGuest List: %s", guestList);
      System.out.printf("%n%s can't come.", guestList.remove(rand.nextInt(numberOfGuests)));
      System.out.printf("%nUpdated guest list: %s", guestList);
   }
}