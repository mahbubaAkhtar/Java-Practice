
package beginnerjava;
import java.util.*;
public class MultiplicationTableAgain {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int num,m,n;
        System.out.print("Enter initial number :");
        m=input.nextInt();
        System.out.print("Enter Final number : ");
        n=input.nextInt();
        for(int j=m;j<=n;j++)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(j+ "X" +i + "=" +j*i);
            }
            System.out.println("\n\n");
        }
    }
    
}
