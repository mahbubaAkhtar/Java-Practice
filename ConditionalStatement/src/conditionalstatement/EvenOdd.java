package conditionalstatement;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Enter any integer number");
        number=input.nextInt();
        if(number%2==0)
        {
            System.out.println("This is Even number");
        }
        
        else
            
        {
            System.out.println("This is Odd number");
        }
    
}
}
