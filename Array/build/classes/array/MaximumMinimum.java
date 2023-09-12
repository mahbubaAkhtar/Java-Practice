
package array;
import java.util.*;
public class MaximumMinimum {
      public static void main(String[] args)
      {
         Scanner input=new Scanner(System.in);
         double[] number=new double[10];
         double max, min;
         System.out.print("Enter number : ");
         for(int i=0;i<10;i++)
         {
             number[i]=input.nextDouble();
         }
         max=number[0];
         min=number[0];
         for(int i=1;i<10;i++)
         {
            if(max<number[i])
            {
                max=number[i];
            }
            if(min >number[i])
            {
                min=number[i];
            }
         }
         System.out.println("Maximum = " +max);
         System.out.println("Minimum = " +min);
         
      }
    
}
