package hncc.nipunapps.runner;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

import hncc.nipunapps.library.PasswordGenerator;

public class RunnerModule {
    private static final hncc.nipunapps.library.PasswordGenerator passwordGenerator =new PasswordGenerator();
    public static void main(String[] args) {
        int length;
        try{
            if(args.length==0) {
                /* This will invoke when no any flag passing
                 * This will generate a random 8 digit password
                 */
                System.out.println("The password is : " + passwordGenerator.generatePassword() + "\n\n");
                help();
            }
            else if(args.length==1) {
                /* The length of argument is 1
                 * that means user passes a single argument
                 */
                if (args[0].equals("-h")) {
                    /* this method simply print all the instruction related
                     * how to use the jar file and how to handle the arguments
                     */
                    printHelp();
                } else if (args[0].equals("-l")) {

                    /* User can simply pass the argument -l
                     * In this argument we ask from user the length of password
                     * When user provide the length than we can simply generate the password
                     */
                    length=takeInputLength();
                    passwordGenerator.setLength(length);
                    System.out.println("The password is : " + passwordGenerator.generatePassword());
                } else if(args[0].equals("-c")){
                    copyToClipBoard();
                } else{
                    /* Instead of using -l
                     * user can simply set the length by using the flag -10
                     * In this case the length of password automatic set 10.
                     */
                    String strlen = args[0];
                    length = Integer.parseInt(strlen.substring(1));
                    passwordGenerator.setLength(length);
                    System.out.println("The password is : " + passwordGenerator.generatePassword());
                }
            }
            else if(args.length==2){
                /* The length of argument is 2
                 * that means user passes 2 arguments.
                 */
                if (args[0].equals("-l")) {
                    /* User can simply pass the argument -l
                     * In this argument we ask from user the length of password
                     * When user provide the length than we can simply generate the password
                     */
                    length=takeInputLength();
                }
                else {
                    /* Instead of using -l
                     * user can simply set the length by using the flag -10
                     * In this case the length of password automatic set 10.
                     */
                    String strlen = args[0];
                    length = Integer.parseInt(strlen.substring(1));
                }
                passwordGenerator.setLength(length);
                if(args[1].equals("-c")){
                    copyToClipBoard();
                }
                else {
                    if (args[1].length() != 5) {
                        help();
                    } else {
                        String bool = args[1].substring(1);
                        setCharUse(bool);
                        System.out.println("The password is : " + passwordGenerator.generatePassword());
                    }
                }
            }
            else if(args.length==3){
                /* User Passes all the argument .
                 * No any default condition can be added.
                 */
                if (args[0].equals("-l")) {
                    /* User can simply pass the argument -l
                     * In this argument we ask from user the length of password
                     * When user provide the length than we can simply generate the password
                     */
                    length=takeInputLength();
                }
                else {
                    /* Instead of using -l
                     * user can simply set the length by using the flag -10
                     * In this case the length of password automatic set 10.
                     */
                    String strlen = args[0];
                    length = Integer.parseInt(strlen.substring(1));
                }
                passwordGenerator.setLength(length);
                if (args[1].length() != 5) {
                    help();
                } else {
                    String bool = args[1].substring(1);
                    setCharUse(bool);
                }
                if(args[2].equals("-c")){
                    copyToClipBoard();
                }
                else {
                    printHelp();
                }
            }
        } catch (Exception e) {
            help();
        }
    }
    private static void help(){
        /* This method simply show the user that how
         * they can access the help menu.
         */
        System.out.println("\n\t Something Went Wrong\nType\t java -jar nipunpassgen.jar -h\t for mor info");
        System.exit(0);
    }
    private static void printHelp(){
        /* This method simply print the instructions
         * about how to use and how to set the flags
         * for give more information with us.
         */
        System.out.println("\n\n\t\t\t ----HELP---\n\n" +
                "\nYou can set the length of password like this \n" +
                "\t java -jar nipunpassgen.jar -l  (where l is length of password) \n\n" +
                "\nYou can also specifiy the which type of word your want to use like this-->\n" +
                "\t Type java -jar nipunpassgen.jar -l -tttt \n " +
                "Here 1st t will set uselowercase true  \t 2nd t set useUppercase true\n" +
                "\t 3rd t set useDigit True \t and 4th t set useSpecial Char true\n" +
                "You can use 't' or 'T' for setting the true and 'f' or 'F' for setting the false\n" +
                "You can pass -c flag at the end of command for directly copy the password in your\n" +
                "clipboard without showing in console like this \t java -jar nipunpassgen.jar -c \t this will copy a\n" +
                "random 8 digit password in your clipboard .");
    }

    private static int takeInputLength(){
        /* This method take input, the length of password
         * from user.
         */
        int length;
        System.out.println("Enter Length of password");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        return length;
    };

    private static void setCharUse(String bool){
        /* This method take the string which lenth is 4 and contain only t of f.
         * Here t indicates true and f indicates false.
         * The method set which type of char user wants in the passwordGenerator class for generating the password.
         */

        if(bool.charAt(0)=='t' || bool.charAt(0)=='T'){
            /* At the 0'th index char 't' simply represent
             * in generating the password lower case can be used.
             */

            passwordGenerator.setUseLower(true);
        }
        else if(bool.charAt(0)=='f' || bool.charAt(0)=='F') {
            /* At the 0'th index char 'f' simply represent
             * in generating the password lower case cannot be used.
             */
            passwordGenerator.setUseLower(false);
        }
        else {
            /* If user type any other letter instead of 't' of 'f'
             * programme simply display there is some error pls
             * check the help menu for more info.
             */
            help();
        }

        if(bool.charAt(1)=='t' || bool.charAt(1)=='T'){
            /* At the 1'th index char 't' simply represent
             * in generating the password upper case can be used.
             */
            passwordGenerator.setUseUpper(true);
        }
        else if(bool.charAt(1)=='f' || bool.charAt(1)=='F') {
            /* At the 1'th index char 'f' simply represent
             * in generating the password upper case cannot be used.
             */
            passwordGenerator.setUseUpper(false);
        }
        else {
            help();
        }
        if(bool.charAt(2)=='t' || bool.charAt(2)=='T'){
            /* At the 2'th index char 't' simply represent
             * in generating the password digits can be used.
             */
            passwordGenerator.setUseDigit(true);
        }
        else if(bool.charAt(2)=='f' || bool.charAt(2)=='F') {
            /* At the 2'th index char 'f' simply represent
             * in generating the password digits cannot be used.
             */
            passwordGenerator.setUseDigit(false);
        }
        else {
            help();
        }
        if(bool.charAt(3)=='t' || bool.charAt(3)=='T'){
            /* At the 3'th index char 't' simply represent
             * in generating the password special character can be used.
             */
            passwordGenerator.setUseSpecialChar(true);
        }
        else if(bool.charAt(3)=='f' || bool.charAt(3)=='F') {
            /* At the 3'th index char 'f' simply represent
             * in generating the password special character cannot be used.
             */
            passwordGenerator.setUseSpecialChar(false);
        }
        else {
            help();
        }
    }

    private static void copyToClipBoard(){
        /* This method generates a random password String
         * and copy it in clipboard instead of printing the password
         */
//		taking password in a string
        String password= passwordGenerator.generatePassword();

        /* For copying in windows
         * This will copy the password in clipboard in windows
         */
//		Initialising the toolkit and clipboard
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();

//		clipboard.setContents takes to argument 1st is the string which has to store and 2nd is the name of clipboard owner
        StringSelection selection=new StringSelection(password);
        clipboard.setContents(selection,null);

        /* For copying in linux distribution
         * This will copy the password in xclip in linux
         */
        Runtime runtime=Runtime.getRuntime();
        Process p=null;
        try {
            p=runtime.exec(new String[]{"sh","-c","echo"+password+" | xclip -selection clipboard"});
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Password copied into clipboard");
    }
}
