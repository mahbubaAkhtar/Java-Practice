
package beginnerjava;
import java.util.Scanner;;
public class ForLoop3 {
    public static void main(String[] args)
    {
        int sum=0 ;
        for (int i = 0; i <= 10; i++) 
        {
            sum=sum+i;  
        }
        System.out.println("Sum = "+sum);
        Scanner input=new Scanner(System.in);
        int m,n, s=0;
        System.out.print("Enter initial number : ");
        m=input.nextInt();
        System.out.print("Write the number to you as much as you want to take the nuber : ");
        n=input.nextInt();
        for(int j=m; j<=n; j++)
        {
            s=s+j;
        }
        System.out.println("Total = "+s);
    }
    
}
