package com.Faizimam;

public class Main {

    public static void main(String[] args) {
        Email obj=new Email("Faiz","Imam");
        System.out.println(obj.showInfo());
        System.out.println("============================================================================================");
        System.out.println("To change Password Enter--> a");
        System.out.println("To Add Alternate Email Enter--> b");

        char option = s.next().charAt(0);
        if (option == 'a') {
            System.out.println("Enter New Password :");
            obj.setPassword(s.next());
            System.out.println("Your New Password :"+obj.getPassword());
        }
        if(option=='b'){
            System.out.println("Enter your Alternate Email :");
            obj.setaltEmail(s.next());
            System.out.println("Your Alternate Email :"+obj.getAlternateEmail());
      
       }

    }
}
