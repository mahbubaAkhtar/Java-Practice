
package conditionalstatement;
import java.util.Scanner;
public class ElseIfLadder {
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int number;
      System.out.print("Enter any integer number :");
      number=input.nextInt();
      if(number>0)
      {
          System.out.println("This is Positive number");
      }
      else if(number<0)
      {
          System.out.println("This is Nagetive number");
      }
            else
      {
          System.out.println("This number is equal to Zero ");
      }
  }
    
}
