import java.util.Scanner;
public class RectangleMenu
{
	public static void main(String[] args)
	{
      Scanner input = new Scanner(System.in);
      Rectangle myRectangle = new Rectangle(5,4);
      int selection;
      
      do {
         menuPrompt()
                 
         selection = input.nextInt();     
         switch (selection){
         
            case 1: 
                  System.out.println("Area: " + myRectangle.area());
                  break;
                  
            case 2: 
                  System.out.println("Perimeter: " + myRectangle.perimeter());
                  break;
                  
            case 3: 
                  System.out.println("Length: " +myRectangle.getLength() + " Width: " + myRectangle.getWidth());
                  break;
         
            default:
                  System.out.println("Invalid option");
         }
         
         System.out.println();
         
  
      } while (selection != 0);
      
      System.out.println("Good bye");
	    
  	}
	
	private static void menuPrompt()
	{
	   System.out.println("1 .. area");
		System.out.println("2 .. perimeter");
		System.out.println("3 .. length and width");
		System.out.println("0 .. exit");
		System.out.print("Your choice: ");
	}
}