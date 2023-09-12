
package array;

public class TwoDArray4 {
     public static void main(String[] args)
    {
        int [][] A=new int[4][5];
        int s=0;
        
        for(int row=0;row<4;row++)
        {
            for(int col=0;col<5;col++)
            {
                A[row][col]=s;
                s++;
            }
        }
        for(int row=0;row<4;row++)
        {
            for(int col=0;col<5;col++)
            {
                System.out.printf("  ", +A[row][col]);
            }
            System.out.println("");
        }
            
        
    }   
}
    

