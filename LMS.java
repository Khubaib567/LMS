package oops_concept.democlass;

import java.util.*;

abstract class LMS{
    
    private String user_name;
    private String user_id;
    private String user_pass;
    
    
    public void sign_up(String user_name,String user_id,String user_pass){
        
        this.user_name=user_name;
        this.user_id=user_id;
        this.user_pass=user_pass;
        System.out.println("Your account has been created!");
      
    }
    
   public boolean log_in(String user_id,String user_pass){
        
        if(user_id.equals(this.user_id) && user_pass.equals(this.user_pass))
            return true;
                    
        else
            return false;
      
    }

}

class User extends LMS{

       String subject="OOP";
       public void personal_details(String user_name,String user_id,String user_pass){    
        if(log_in(user_id,user_pass)){
            System.out.println("Welcome "+user_name+" to your LMS portal!");
            System.out.println("Name: "+user_name);
            System.out.println("User_ID: "+user_id);
            
       }            
       else
           System.out.println("Invalid user_name or password! Please try again");
        
       }
        
}



class Student extends User{
   
    int course =1;
    String sem = "2ND SEMESTER";
    public void personal_details(String user_name,String user_id,String user_pass){    
        if(log_in(user_id,user_pass)){
            System.out.println("Welcome "+user_name+" to your LMS portal!");
            System.out.println("Name: "+user_name);
            System.out.println("User_ID: "+user_id);
            System.out.println("Enrolled in Courses: "+course);
            System.out.println("Subject: "+subject);
            System.out.println("Semester: "+sem);
            
       }            
       else
           System.out.println("Invalid user_name or password! Please try again");
        
       }
    
    
}
class Teacher extends User{

    String status = "Course lecturer of OOP course";  
   public void personal_details(String user_name,String user_id,String user_pass){    
        if(log_in(user_id,user_pass)){
            System.out.println("Welcome "+user_name+" to your LMS portal!");
            System.out.println("Name: "+user_name);
            System.out.println("User_ID: "+user_id);
            System.out.println("Subject: "+subject);
            System.out.println("Status: "+status);
            
       }            
       else
           System.out.println("Invalid user_name or password! Please try again");
        
       }
   
}
class Admin extends User{

    String office = "Talpur House";
    String email = "abc123@gmail.com";
    String office_hrs = "10-11am (Wed) 2-3pm (Daily)";
    
    public void personal_details(String user_name,String user_id,String user_pass){    
        if(log_in(user_id,user_pass)){
            System.out.println("Welcome "+user_name+" to your LMS portal!");
            System.out.println("Name: "+user_name);
            System.out.println("User_ID: "+user_id);
            System.out.println("Office: "+office);
            System.out.println("email: "+email);
            System.out.println("office_hrs: "+office_hrs);
            
       }            
       else
           System.out.println("Invalid user_name or password! Please try again");
        
       }
   
}

public class Main{

        public static void main (String []args){
        
          Scanner obj = new Scanner(System.in);
          
          Admin a1 = new Admin();
          
          System.out.println("Enter your name: ");
          String u_name = obj.nextLine();
          System.out.println("Enter your user_id: ");
          String u_id = obj.nextLine();
          System.out.println("Enter your user_pass: ");
          String u_pass = obj.nextLine();
          
          a1.sign_up(u_name, u_id, u_pass);
          
          System.out.println("Do you want to Login? Press Y/N ");
          String opt = obj.nextLine();
          
          if(opt.equals("Y") || opt.equals("y")){
            System.out.println("Enter your user_id: ");
            u_id = obj.nextLine();
            System.out.println("Enter your user_pass: ");
            u_pass = obj.nextLine();
               
            a1.personal_details(u_name,u_id, u_pass);
          
          }
          else
              System.exit(0);
          
        
        }

}