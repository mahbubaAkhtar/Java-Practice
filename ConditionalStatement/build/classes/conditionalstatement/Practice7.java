
package conditionalstatement;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int year;
        System.out.println("Enter any year : ");
        year=input.nextInt();
        if(((year % 4 == 0)&&(year % 100!=0)) || (year % 400 ==0))
        {
           System.out.println("Leap Year");
       }
       else
       {
           System.out.println("Not Leap Year");
       }
    }
    
}
