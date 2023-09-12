
package beginnerjava;
import java.util.*;
public class FactorialNumber {
    public static void main(String[] args)
    {
        Scanner input=new  Scanner(System.in);
        int num,fact=1;
        System.out.print("Enter any positive numbber : ");
        num=input.nextInt();
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
            System.out.print(" *"+i);
            
        }
        System.out.println("\n");
        System.out.println("Factorial of this number : "+fact);
    }
    
}
