import java.util.Scanner;

public class JavaLessonTwo
{
   static Scanner userInput = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      System.out.print("your favorite number: ");
      
      if (userInput.hasNextInt())
      {
      
         int numberEntered = userInput.nextInt();
         
         System.out.println("You entered " + numberEntered);
         
         int numEnteredTimes2 = numberEntered + numberEntered;
         System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
         
         int numEnteredTimesSelf = numberEntered * numberEntered;
         System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);
         
         int numEnteredDivide2 = numberEntered / 2;
         System.out.println(numberEntered + " / 2 = " + numEnteredDivide2);
         
          int numEnteredRemainder = numberEntered % 2;
         System.out.println(numberEntered + " % 2 = " + numEnteredRemainder);
         
         numberEntered +=2;
         numberEntered -=2;
         
         numberEntered --;
         numberEntered ++;
         
         int numberABS = Math.abs(numberEntered);
         int whichIsBigger = Math.max(5, 7);
         
         double numSqrt = Math.sqrt(5.23);
         
         int randomNumber = (int) (Math.random() * 11);
         System.out.println("Random Number " + randomNumber);
      
      } else {
      
         System.out.println("Enter an integer next time");
         
      }
      
      
   }
}