
package array;
import java.util.*;
public class TwoDArraySum {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int [][] A= new int[2][3];
        int [][] B= new int[2][3];
        int [][] C= new int[2][3];
         //getting Input
        System.out.println("Enter your number for the A matrix : ");
        for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.printf("A[%d][%d]=",row,col);
                A[row][col]= input.nextInt();
            }
        }
        System.out.println("Enter your number for the B matrix : ");
        for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                
                System.out.printf("B[%d][%d]=",row,col);
                B[row][col]= input.nextInt();
            }
        }
        //getting output
        System.out.println("A =  ");
        for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print("\t  "+A[row][col]);             
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("B =  ");
        for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print("\t  "+B[row][col]);
            }
            System.out.println();
        }
        //Adding A+B
        System.out.println();
        System.out.println("A+B = ");
        for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print("\t  "+(A[row][col]+B[row][col]));
            }
            System.out.println();
        }
        
    }
    
}
