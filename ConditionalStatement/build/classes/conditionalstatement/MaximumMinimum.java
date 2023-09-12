
package conditionalstatement;
import java.util.Scanner;
public class MaximumMinimum {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int number1,number2;
        System.out.print("Number1 :");
        number1=input.nextInt();
        System.out.print("Number2 :");
        number2=input.nextInt();
        if(number1>number2)
        {
            System.out.println("number1 = Maximu");
        }
        else if(number1<number2)
        {
            System.out.println("number2 = Maximu");
        }
        else if(number1==number2)
        {
           System.out.println("Two numbers are equal"); 
        }
        else
        {
            System.out.println("Not a number");
        }
    }
    
}
