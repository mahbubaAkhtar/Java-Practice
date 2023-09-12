
package beginnerjava;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      int num, count=0;
      System.out.print("Enter any positive number : ");
      num=input.nextInt();
      for(int i=2;i<num;i++)
      {
          if(num%2==0)
          {
              count++;
              break;
          }
      }
      if(count==0)
      {
          System.out.println("Prime Number");
      }
      else
      {
          System.out.println("Not Prime Number");
      }
    }
    
}
