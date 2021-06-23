 # Passgen-java Cli Tool
 
 ### This is a simple cli tool which generates random password of default length 8
 
 ### Prerequisite
   For compilation the class your system must install java-jdk 8.0 or above and proper setup of JAVA_HOME environment.
   For run the jar file you must have jre 1.8 or above.
 
 ### How To Use
 
   for using the tool you need to download
   [nipunpassgen.jar](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/NipunKumar/nipunpassgen.jar)
   
   or simply clone the repository and go to individual Submission/Nipun Kumar
      
 ##### In the directory where you have nipunpassgen.jar open terminal and simply run this command
     java -jar nipunpassgen.jar
   
#####  this will return a default 8 digit password.
  ![noflag](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/NipunKumar/snippets/noFlag.png)
  
 ### Length of Password
 ##### you can set the length of password by adding length flag like this
    java -jar nipunpassgen.jar -10.
 #####  here 10 digit password will generated
![length](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/NipunKumar/snippets/length.png)

### Specifiy which type of charachter you want to use
    
  ##### You can specify which type of charchter or digit you want to use for generating the password like this.
      
      java -jar nipunpassgen.jar -10 -ttff.  
   (here t idicates true and f idicates false)
      
   as you can see we use a 2nd flag using some ttff--> 
   The 1st t indicates --> Using the lower case is true
   The 2nd t indicates --> Using the upper case is true
   The 3rd f indicates --> Using the Digit is false
   The 4th f indicates --> Using the Special char is false
      
   so as you can see this in generating the password we can specify the Type of charachter usage
      
![charuse](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/NipunKumar/snippets/charuse.png)
      
### Sample code for getting the output of 15 digit only number password
      
      java -jar nipunpassgen.jar -15 -fftf
![onlydigit](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/NipunKumar/snippets/onlydigit.png)

# Additional Features
### If you don't want to print the password in console.
##### Here is a flag '-c' which is used to copy the password directly to your clipboard.

### Copy the default generated password like this 
       java -jar nipunpassgen.jar -c
 This will copy a random 8 digit password in your clipboard.
 ![clipboard1](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/NipunKumar/snippets/clipboard1.png)
 
 ### Copy the password which length is specified like this
       java -jar nipunpassgen.jar -10 -c
 This will copy a random 10 digit password in your clipboard.
 ![clipboard2](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/NipunKumar/snippets/clipboard2.png)
 
 ### Copy the password which length and specify the char use like this
      java -jar nipunpassgen.jar -12 -ttft -c
  This will copy a random 12 digit password without using digits in your clipboard
  ![clipboard3](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/NipunKumar/snippets/clipboard3.png)
      
