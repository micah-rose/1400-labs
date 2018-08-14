/*********************
* Author: Micah L
* 
* Lab: Char
**********************/

public class LabChar{
   public static void main(String[] args){
      char dash;
      dash = '-';
      System.out.printf("Dash: %c%n", dash);
      
      char a = 'a';
      char letter = a;
      char b = ++letter;
      char c = ++letter;
      
      letter += 2;
      char e = letter;
      System.out.printf("Letter:%c A:%c B:%c C:%c E:%c%n",
         letter, a, b, c, e);
      
      char copyrightSign = '\u00A9';
      int copyrightNum = (int) copyrightSign;
      System.out.printf("Copyright sign: %c %d %x%n", 
         copyrightSign, copyrightNum, copyrightNum);
      
      char yen = '¥';
      int yenNum = (int) yen;
      System.out.printf("Yen = %c %d %x%n", yen, yenNum, yenNum);    
      
   }
}