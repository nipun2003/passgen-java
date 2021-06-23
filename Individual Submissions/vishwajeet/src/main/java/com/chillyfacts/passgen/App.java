package com.chillyfacts.passgen;

import java.util.*;
//import java.io.*;
import java.util.concurrent.TimeUnit;
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for generating password :");
        System.out.println("Press 2 for setting length. Length should not be less than 4.");
        int userchoice =sc.nextInt();
        switch(userchoice)
        {
        case 1:
        {
            int length=8;
            System.out.println(passgen(length));
            break;
        }
        case 2:
        {
        	int length;
        	do {
            System.out.println("Enter length:");
            length=sc.nextInt();
            
            if(length<4) {
            	System.out.println("wrong input.Please enter length greater than 4");
            }
        	}
            while(length<4);
            	
            
            System.out.println(passgen(length));
            break;
        }
        default:
            System.out.println("wrong input");
            main(args);
        
        }
        sc.close();
    }
    private static char[] passgen(int l) throws InterruptedException
    {
        System.out.println("Generating password using random...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Your new password is:");
        String special="!@#$%^&*_=+-/.?<>";
        String capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String digits="0123456789";

        String mix=special + capital +  small + digits;
        
        //using random method
        Random variable=new Random();
       char[] newpass=new char[l];
        for(int i=0;i<l;i++)
        {
             newpass[i]=mix.charAt(variable.nextInt(mix.length()) );
        }
        return newpass;

    }
    
}
