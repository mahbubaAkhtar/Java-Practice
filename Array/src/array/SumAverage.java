
package array;
import java.util.Scanner;
public class SumAverage {
              public static void main(String[] args)
              {
                  Scanner input=new Scanner(System.in);
                  double [] number=new double[5];
                  double sum=0;
                  System.out.print("Enter your number : ");
                  for(int i=0;i<5;i++)
                  {
                      number[i] =input.nextDouble();
                  }
                  for(int i=0;i<5;i++)
                  {
                      sum=sum+number[i];
                  }
                  System.out.println("The Sum is = " +sum);
                  System.out.println("The Average  is = " +sum/5);
                  
              }
}
