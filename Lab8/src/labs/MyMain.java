package labs;

public class MyMain 
{
   public static void main (String args[]) 
{
   int[] myArray = new int[1]; 
   try 
   {
         System.out.println("Before valid array assignment");
         myArray[15] = 15;
         System.out.println("Before invalid array assignment");
         myArray[15] = 15;
         // statement below not executed!
         System.out.println("After array exception");
   }
   catch(ArrayIndexOutOfBoundsException e) 
   {
         System.out.println("An array index error has occured");
   }
}
} // end class MyMain



