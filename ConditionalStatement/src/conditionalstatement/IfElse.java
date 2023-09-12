
package conditionalstatement;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args)

    {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Enter any integer number :");
        number=input.nextInt();
        if(number>0)
        {
            System.out.println("This is positive number");
        }
        else
            System.out.println("This is Negative number");
        
    }
}
