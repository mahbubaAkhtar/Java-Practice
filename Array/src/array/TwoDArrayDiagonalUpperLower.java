
package array;
import java.util.Scanner;
public class TwoDArrayDiagonalUpperLower {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int[][] A= new int[3][3];
        int sumOfDiagonal=0;
        int sumOfUpper=0;
        int sumOfLower=0;
        //getting input
        System.out.println("Enter Your input for the A matrix :");
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.printf("A[[%d][%d]=", row,col);
                A[row][col]=input.nextInt();
            }
        }
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                if(row==col)
                {
                    sumOfDiagonal=sumOfDiagonal+A[row][col];
                }
                if(row<col)
                {
                    sumOfUpper=sumOfUpper+A[row][col];
                }
                if(row>col)
                {
                    sumOfLower=sumOfLower+A[row][col];
                }
            }
        }
        System.out.println("Sum of the diagonal = "+sumOfDiagonal);
        System.out.println("Sum of the upper = "+sumOfUpper);
        System.out.println("Sum of the lower = "+sumOfLower);
       
    }
    
}
