package com.Faizimam;

public class Main {

    public static void main(String[] args) {
        Email obj=new Email("Faiz","Imam");
        System.out.println(obj.showInfo());
        System.out.println("============================================================================================");
        obj.setPassword("Faiz Imam");
        //System.out.println("Your Changed Password :"+obj.getPassword(length));
    }

}
