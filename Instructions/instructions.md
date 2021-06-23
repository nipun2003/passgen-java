# Instructions
## Objective -  Build a password generator using java and package it into a jar file

 - Use maven as the build tool
 - Use Oracle Java 11 SE
 - Unless password length is specified the default password lenght is 8
 - Average minimum password length supported on internet is 4 character and so in this project
 - User can pass paramers for the lenghth of password. Say
  ``` Shell
  java -jar jar-file-name.jar -L 5
  ```
  specifies that the password length should be 5 characters


  ### How to approach your objective
   - Learn what are build Tools.
   - What is Gradle and Maven? What are their similarities? What are their differences?
   - What is the difference between jar and war file?
   - What is Manifest File? What id POM File?
   - Should I create a password generator object or should I inherit a password generator class or should I extend a 100% abstract class and add pass gen capabilities to it?
   - What are Package in Java? What is package name 
   - What are Modules in Java?

### Getting Started

-   Create a Hello World Project using maven https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
-   Edit your pom.xml to remember your default package and class so that you don't have to provide packagename everytime in console.