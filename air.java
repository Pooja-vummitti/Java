import java.io.*;
import java.util.*;

class customer{
 

    customer(int customer_id,String first_name,String last_name ,int phone_no,int age,String Gender,String email,String address,String passengerstype)
    {
        //this.customer(customer_id, first_name, last_name, phone_no, age, Gender, email, address, passengerstype);
        System.out.println("hello pooja");
    }


    // public void passengers()
    // {
    //     int customer_id;
    //     String first_name ;
    //     String last_name ;
    //     int phone_no;
    //     int age;
    //     String Gender;
    //     String email;
    //     String address;
    //     String passengerstype;

       
    // }

    

    public void getdata( int customer_id,String first_name,
    String last_name ,int phone_no,int age,String Gender,
    String email,String address,String passengerstype)
    {
//         Scanner cus= new Scanner(System.in);
//         // System.out.println("Enter the customer id:");
//         //customer_id=cus.nextInt();

//         // System.out.println("Enter the First_name:");
//         // first_name=cus.next();


        
//         // System.out.println("Enter the Last_name:");
//         // last_name=cus.next();

//         // System.out.println("Enter the age:");
//         // age=cus.nextInt();

//         // System.out.println("Enter the Gender:");
//         // Gender=cus.next();

    
//         // System.out.println("Enter the email:");
//         // email=cus.next();
       
//         // System.out.println("Enter the phone no:");
//         // phone_no=cus.nextInt();

        
//         // System.out.println("Enter the address:");
//         // address=cus.next();

//         // System.out.println("Enter the Passenger type:");
//         // passengerstype=cus.next();
   
    
  //  cus.close();
}
    public void display(int customer_id,String first_name,String last_name ,int phone_no,int age,String Gender,String email,String address,String passengerstype)
     {
       System.out.println("Roll no = " + customer_id);
         System.out.println("First name"+first_name);
        System.out.println("Last name "+last_name);
         System.out.println("Age "+age);
         System.out.println("Gender"+Gender);
       System.out.println("Email "+email);
         System.out.println("Phone no "+phone_no);
        System.out.println("address "+address);
         System.out.println("Type"+passengerstype);
    }
    public void newpassengersdisplay()
    {

    }
}


 class employee{
    int emp_id;
    String first_name;
    String last_name;
    int age;
   String Gender;
    String email;
    int phone_no;
    String address;
    int salary;
    String types;
    public void inputemployee()
    {

    }
    public void typescount()
    {

    }
    public void emmployeetype()
    {
        
    }
    public void employeesattendence()
    {

    }
    public void  topsalary()
    {

    }
}

class airline{
    int airline_id;
    String date;
    String airline_name;
    int Contact;
    String email;
    String from;
    String to;
    String totalkms;
    String service;
    String status;
    public void input_arlines()
    {

    }
    public void statusofairplane()
    {

    }
    public void sendtoservice()
    {

    }
    public void planestofly()
    {
    }
    public void flightschdeules()
    {

    }
}

class Billing{
    int Billing_id;
    String airline_name;
    int amount;
    String email;
    String type;
    public void revenue()
    {

    }
    public void topbills()
    {

    }
    public void airlinetopbilling()
    {

    }
    public void billingtypes()
    {
       // international pasenger;
    }
    
}

 class Booking{
    int Booking_id;
    int customer_id;
    String destinationname;
    String sourcename;
    int amount;
    String meal;
    int noofpassenger;
    public void emergencybooking()
    {

    }
    public void advancebooking()
    {

    }
    public void cancelbooking()
    {

    }
    public void mostbooking()
    {

    }
    public void schedules()
    {

    }
}

 class flight{
    int flight_id;
    int customer_id;
    String arrival_time;
    String departure_time;
    String source;
    String destination;
    String pilot_name;
    int time;
    int status ;
    String timedelay;
    public void inputdetails()
    {

    }
public void inputflightschdeules()
{

}
public void delaythedeparture()
{

}
public void timedelaay()
{
//if timedelay is 1 is 0 if no timedelay
}

}

class services{
   
    String wheel_chair;
    String food;
   int Booking_id;
   String spl_services;
   public void inputservices()
   {

   }
   public void servicetypes()
   {

   }
   public void foodorders()
   {

   }
   public void specialservices()
   {

   }
}


 class admin{
   String admin_name;
   String admin_pass;
   boolean status;
   public void passengerlist()
   {
   
   }
   public void services()
   {
       
   }
   public void flight()
   {
       
   }
   public void employee()
   {
       
   }
   public void booking()
   {
       
   }
   public void billing()
   {
       
   }
   public void airline()
   {
       
   }
   
}
public class air{
    public static void main(String args[])
    {
        System.out.println("customer details");
        customer obj1= new customer(1,"Pooja","v",123,25,"F","Poojav@gmail.com","24th cross","student");
        obj1.display();
        
    
    }

}




