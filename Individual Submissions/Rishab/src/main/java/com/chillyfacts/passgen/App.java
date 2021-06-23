package com.chillyfacts.passgen;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 

{
	//function to print the randomly generated passwords
	private static void printArray(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
	/*function to generate the random characters of a password
	 * converting the ASCII to their respective Characters
	 * 
	 */
	private static char randomCharacter() {
        int rand = (int)(Math.random()*62);
        if(rand <= 9) {
            int number = rand + 48;
            return (char)(number);
        } else if(rand <= 35) {
            int uppercase = rand + 55;
            return (char)(uppercase);
        } else {
            int lowercase = rand + 61;
            return (char)(lowercase);
        }
    }

    public static void main( String[] args )
    {
    	//passing the arguments to main method
    	 try{




             int total = Integer.parseInt(args[1]);

             int length = Integer.parseInt(args[3]);
             
             //the array that store the passwords
            

        String[] randomPasswords = new String[total];
         //storing the passwords

        for(int i = 0; i < total; i++) {
            String randomPassword = "";
            //Randomly generate a character for the password length number of times
            for(int j = 0; j < length; j++) {
                //Add a random lowercase or UPPERCASE character to our randomPassword String
                randomPassword += randomCharacter();
            }
            //Add the random password to your array
            randomPasswords[i] = randomPassword;
        }
        printArray(randomPasswords);
    	 }
    	 //if user need help or there is an error or exception
    	 catch (Exception e){
             System.out.println("passgen -n -l ");
             System.out.println("-n :no of password you want generate");
             System.out.println("-l :length of password you want generate");
             System.out.println("passgen --help : To know the commands");
             System.out.println("passgen.jar -n 10 -l 8 "  );
             System.out.println("It will generate 10 random Passwords of length 8");

         }

    
        
    }
}
