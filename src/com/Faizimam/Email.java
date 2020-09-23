package com.Faizimam;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String companyName="BuilderBob";
    private String department;
    private int mailBoxCapacity=500;
    private int Deafultlength=10;
    private String alternateEmail;



    //Create a constructor to retrive first and Last name
    Email(String FirstName,String LastName){
        this.firstName=FirstName;
        this.lastName=LastName;
     //   System.out.println("First Name :"+this.firstName+"\n"+"Last Name : "+this.lastName);
        System.out.println("=========================================================================================== ");
        //to retrive the dept. infro from user
        this.department=getDepartment();
       // System.out.println("Your Department :"+this.department);
        //to retrive the random password
        this.password=randomPassword(Deafultlength);
       // System.out.println("Your Password :"+this.password);
        //to generate E-mail
        email=firstName.toLowerCase()+ lastName.toLowerCase()+"@"+companyName+".com";
     //   System.out.println("Your Email :"+email);
    }

    private String getDepartment(){
        Scanner s=new Scanner(System.in);
        System.out.println("The Department Code :");
        System.out.println("Enter "+"1 "+"for Sales");
        System.out.println("Enter "+"2 "+"for Development");
        System.out.println("Enter "+"3 "+"for Accounting");
        System.out.println("Enter "+"4 "+"for More");
        System.out.println();
        System.out.println("Department-->");
        int option=s.nextInt();
        if(option==1){return "Sales";}
        else if(option==2){return "Development";}
        else if(option==3){return "Accounting";}
        //else if(option==4){return "Change Password";}
        else{return "Thanku For Visiting";}
    }
    //to generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$&";
        char[] password =new char[length];
        for(int i=0;i<length;i++){
            int rand= (int) (Math.random()*passwordSet.length());
             password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // set the alternate Email (Setter)
    public void setaltEmail(String altemail){
        this.alternateEmail=altemail;
    }
    //change password option(Setter)
    public void setPassword(String password){
         this.password=password;
    }
    //set user wish mailcapacity
    public void setMailBoxCapacity(int mailBoxCapacity){
        this.mailBoxCapacity=mailBoxCapacity;
    }
  public String getAlternateEmail(){return alternateEmail;}
  public String getPassword(int length){return password;}
  public int getMailBoxCapacity(){return mailBoxCapacity;}

  public String showInfo(){
      System.out.println("=============================================================================================");
        return "First Name :"+firstName+"\nLast Name :"+lastName+
                "\nDepartment :"+department+
                "\nEmail :"+email+
                "\nMailBox Capacity :"+mailBoxCapacity +"mb";

  }

}
