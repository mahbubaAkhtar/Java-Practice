
package Overloading_Constructor;

public class Teacher {
    
    String name,gender,phone;

     Teacher() {
         
         System.out.println("NO Information here");
    }
     Teacher(String n,String g){
         
         name=n;
         gender=g;
         
     }
     
     Teacher(String n, String g, String p){
         name=n;
         gender=g;
         phone=p;
     }
    
    void displayInformation()
    {
         System.out.println("Name : " +name);
         System.out.println("Gemder : " +gender);
         System.out.println("Phone Number : " +phone);;
    }   
}
