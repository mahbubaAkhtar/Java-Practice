
package conditionalstatement;

import java.util.Scanner;



public class Practice1 {
    public static void main(String[] args) {
        double length , breadth;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length : ");
        length=input.nextDouble();
        System.out.println("Enter breadth : ");
        breadth=input.nextDouble();
        
        if(length == breadth)
        {
            System.out.println("Square");
        }
        else
        {
            System.out.println("Rectangle");
        }
        
    }
    
}
