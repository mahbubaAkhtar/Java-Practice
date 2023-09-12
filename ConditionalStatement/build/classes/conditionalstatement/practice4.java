
package conditionalstatement;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        int cl ,attendance,total;
    Scanner input= new Scanner(System.in);
      System.out.println("enter class number : ");
      cl=input.nextInt();
      System.out.println("enter Attendance : ");
      attendance=input.nextInt();
      total=((attendance*100)/cl);
        System.out.println(total);
      if(total>=75)
      {
          System.out.println("Student is allow for exam");
      }
      else
      {
          System.out.println("Student is not aallow for exam");
      }
          
          
          
    }
    
    
}
