![passgen](https://github.com/vishwajeet-hash/passgen-java/blob/passgen-project/Individual%20Submissions/vishwajeet/images/Strong-Password-Generator.jpg)

# Passgen-java cli/cmd tool 

* This is a tool created using maven to generate a random password of default length 8. <br>
* It allows the user to get a password of default length. <br>
* The password generated is protected and secure and it gets copied to the clipboard by default.<br>

## Why maven?

![passgen](https://github.com/vishwajeet-hash/passgen-java/blob/passgen-project/Individual%20Submissions/vishwajeet/images/maven.jpeg)

Maven is a project management tool which makes our work easier by providing us :
 * Builds
 * Documentation
 * Dependencies
 * Releases
 * Project structure
and many more.It basically helps the developer from not doing many things manually.<br>
To know more about Maven follow the [link](https://maven.apache.org/)

 

### Prerequisite :

* For compilation of the class your system must install java-jdk 8.0 or above and proper setup of JAVA_HOME environment. For run  the jar file you must have jre 1.8 or above.

### How To Use

 * For using the tool you need to download passgen-0.0.1-SNAPSHOT.jar file<br>or simply clone the repository and go to individual Submission/vishwajeet/target

* In the directory where passgen-0.0.1-SNAPSHOT.jar is present open terminal and simply run this commands:
 ```java
 java -jar passgen-0.0.1-SNAPSHOT.jar -g
 ```
 
This will return a default 8 digit password.
![example](https://github.com/vishwajeet-hash/passgen-java/blob/passgen-project/Individual%20Submissions/vishwajeet/images/output1.PNG)

* You can generate a desired length of password by setting a flag "-l" and giving the desired length
```java
  java -jar passgen-0.0.1-SNAPSHOT.jar -l 9
```
![example](https://github.com/vishwajeet-hash/passgen-java/blob/passgen-project/Individual%20Submissions/vishwajeet/images/output2.PNG)

---
---

## AUTHOR :

#### NAME - Vishwajeet Kumar Singh <br>
#### Github profile- [Click here](https://github.com/vishwajeet-hash)
