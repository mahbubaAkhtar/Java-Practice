
package Encapsulation;

public class Main {
    public static void main(String [] args)
    {
        StudentClass mahbuba = new StudentClass();    
        mahbuba.setID("201-35-3049");
        mahbuba.setNAME("Mst.Mahbuba Akhtar");
        
        StudentClass lamia = new StudentClass();
        lamia.setID("201-35-3069");
        lamia.setNAME("Lamia Dewan Sathi");
        
        System.out.println(mahbuba.getID());
        System.out.println(mahbuba.getNAME());
        System.out.println(lamia.getID());
        System.out.println(lamia.getNAME());
        
    }
    
}
