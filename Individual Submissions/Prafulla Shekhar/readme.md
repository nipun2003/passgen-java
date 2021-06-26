[![MasterHead](https://github.com/prafullashekhar/passgen-java/blob/master/Individual%20Submissions/Prafulla%20Shekhar/images/pass1.png)](https://github.com/prafullashekhar)

# CLI tool to generate password
 - Maven project
 - Generate password of given length
 - Automatically copy generated password in your clipboard


### Prerequisite
- You should have properly set Java_SE (java Surrounding Environment) to use this tool.
- For automatic copy feature to work, your system should have either clipboard or xclip installed in it.
      
      
### About the Tool
- This is a password generator tool to generates password for your services .
- It will automatically get copied in your clipboard so that generated password can be used anywhere .


### How to use :
- Download [passgen.jar](https://github.com/prafullashekhar/passgen-java/blob/master/Individual%20Submissions/Prafulla%20Shekhar/passgen.jar)
   or clone the repository passgen-java and go to (Individual submission/Prafulla Shekhar)
     ```
     git clone https://github.com/hnccbits/passgen-java.git
     ```
     
- Locate the jar
- Run this command on terminal or command prompt giving length of password (as 16 in this case)
- Your password of required length will be generated and it will automatically be copied in you clipboard.
   ```
   java -jar passgen.jar -l 16
   ```

- If length of password is not provided it will generate a password of 8 digits by default
   ```
   java -jar passgen.jar
   ```

- For help give command as help (In case of any wrong argument passed help will be printed)
   ```
   java -jar passgen.jar -help
   ```

### Project Structure :
- This project is completely created in java language with maven
- The project consists of two maven modules
    - [password_generator](https://github.com/prafullashekhar/passgen-java/tree/master/Individual%20Submissions/Prafulla%20Shekhar/password_generator)  this is used to generate the random password of required length.
    - [password_runner](https://github.com/prafullashekhar/passgen-java/tree/master/Individual%20Submissions/Prafulla%20Shekhar/password_runner) this module is used to take user input and print the password returned from password_generator module.




### Generate a secured password in just one command
1. It's unsafe to use similar passwords on various online services as it will make it easily cracked.
2. You should use password of atleast 8 digits and it should must contain upper case, lower case, numbers, and symbols.
3. passgen make it easy for you to generate such secure password with just one command.
