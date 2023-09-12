
package Object_Method_Cnstructor;

public class Teacher {
      String name,gender,phone_No;
      
      Teacher(){
          System.out.println("No value ");
      }
      
      Teacher(String n, String g,String p){    //parametrized constructor
          name=n;
          gender=g;
          phone_No=p;
      }
      
//      void setInformation(String n, String g,String p){    //Parametrized Method
//          name=n;
//          gender=g;
//          phone_No=p;
//      }
      
      
      void displayInformation(){                 // method
          
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("Phone : " +phone_No);
        System.out.println("\n\n");
      }
      
    
}
