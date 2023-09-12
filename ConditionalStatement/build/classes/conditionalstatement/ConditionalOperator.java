
package conditionalstatement;
import java.util.Scanner;
public class ConditionalOperator {
    
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int number1, number2,large;
        System.out.print("Enter two numbers :");
        number1=input.nextInt();
        number2=input.nextInt();
        large=(number1>number2)?number1 : number2;
        System.out.println("Large number :"+large);
    }
    
}
