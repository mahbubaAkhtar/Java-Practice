
package conditionalstatement;

import java.util.Scanner;

public class Practic3 {
    public static void main(String[] args) {
        int mina,rina,tina;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter minas age : ");
        mina=input.nextInt();
        System.out.println("Enter rinas age : ");
        rina=input.nextInt();
        System.out.println("Enter tinas age : ");
        tina=input.nextInt();
        if(mina>rina && mina>tina)
        {
            System.out.println("Mina is younges");
        }
        else if(mina<rina && rina>tina)
        {
            System.out.println("Rina is younges");
        }
        else if(mina<tina && rina<tina)
        {
            System.out.println("Tina is younges");
        }
        
    }
    
}
