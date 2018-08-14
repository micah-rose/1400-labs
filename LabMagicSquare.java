/*********************************************************** 
* Author: Micah Lund
*
* MagicSquare : Determine whether a given two-dimensional
* integer array is a magic square.
************************************************************/
 public class LabMagicSquare { 
   public static void main (String[] args) {   
   
   int[][] square = {
      {23, 6, 19, 2, 15},
      {4, 12, 25, 8, 16},
      {10, 18, 1, 14, 22},
      {11, 24, 7, 20, 3},
      {17, 5, 13, 21, 9},
      };
   
    
   
   
   boolean result = isMagicSquare(square);
   System.out.printf("The square %s a magic square%n",
      (result ? "is" : "is not"));
   //determines wheter the given square is a magic square.
   }
   
   private static boolean isMagicSquare(int[][] square) {
      int n = square.length;
      int total = total(square[0]);
      
      //check rows       
      for (int i = 1; i <= n; i++) {
         if (total(square[i]) != total) 
            return false;
      }
      
      //check columns
      for (int col = 0; col < n; col++ ) {
         int sum = 0;
         for (int row = 0; row < n; row++ ) {
            sum += square[row][col];
         }
         if (sum != total)
            return false;
      } 
      
      //check diagonals
      int sum = 0;
      for (int i = 0; i < n; i++){
         sum += square[i][i];
      }
      if (sum != total)
         return false;  
     
      // TODO    
      return true; // if we make it to the end it is a magic square         
   }
         
   private static int total(int[] intArray) {
      int sum = 0;
      for (int el : intArray) {
         sum += el;  
      } 
      return sum;  
   }    

}