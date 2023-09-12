
package array;
import java.util.Scanner;
public class TwoDArray3 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int [][] A=new int[4][5];
        System.out.println("Enter your input for A matrix :");
        for(int row=0;row<4;row++)
        {
            for(int col=0;col<5;col++)
            {
                A[row][col]=input.nextInt();
            }
        }
        System.out.println("A =  ");
        for(int row=0;row<4;row++)
        {
            for(int col=0;col<5;col++)
            {
                System.out.print("\t  "+A[row][col]);             
            }
            System.out.println();
        }
    }
    
}
