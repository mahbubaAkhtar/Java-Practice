
package beginnerjava;
import java.util.*;
public class PrimeNumber2 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int num,m,n,count=0;
        System.out.print("Enter initial number :");
        m=input.nextInt();
        System.out.print("Enter Ending number : ");
        n=input.nextInt();
        for(int i=m;i<=n;i++)
        {
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
            count=0;
        }
        
    
}
}
