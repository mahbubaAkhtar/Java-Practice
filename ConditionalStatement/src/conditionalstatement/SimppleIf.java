
package conditionalstatement;
import java.util.Scanner;

public class SimppleIf {
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
    }
    
}
