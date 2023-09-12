
package beginnerjava;
import java.util.Scanner;
public class ForLoopEvenOdd {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int i,m,n,sum=0;
        System.out.print("Enter initial number : ");
        m=input.nextInt();
        System.out.print("Write the number to you as much as you want to take the nuber : ");
        n=input.nextInt();
        for(i=m; i<=n; i++)
        {
            if(i%2==0)
            {
                sum= sum + i;
                System.out.print("  "+i);
            }
        }
        System.out.println("\n");
        System.out.println("Sum is = " +sum);
        System.out.println("\n");
        
        int j,s,r,total=0;
        System.out.print("Enter initial number : ");
        s=input.nextInt();
        System.out.print("Write the number to you as much as you want to take the nuber : ");
        r=input.nextInt();
        for(j=s; j<=r; j++)
        {
            if(j%2 !=0)
            {
                 total= total + j;
                System.out.print("  "+j);
            }
        }
        System.out.println("\n");
        System.out.println("Total is = " +total);
        
    }
    
}
