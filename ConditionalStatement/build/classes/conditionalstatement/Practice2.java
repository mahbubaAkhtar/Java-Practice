
package conditionalstatement;

import java.util.Scanner;


public class Practice2 {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your input for a : ");
        a=input.nextInt();
        System.out.println("Enter your input for b : ");
        b=input.nextInt();
        if(a<b)
        {
            System.out.println("b is greater");
        }
        else if(a>b)
        {
            System.out.println("a is greater");
        }
        else if(a==b)
        {
            System.out.println("a equal b");
        }
        
        else
            System.out.println("not a number");
    }
    
}
