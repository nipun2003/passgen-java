package hncc.nipunapps.library;

import java.util.ArrayList;
import java.util.Random;

import hncc.nipunapps.library.interfaces.CharDigits;

public class PasswordGenerator implements CharDigits {

    // Default Length of password is 8
    private int length=8;
    public void setLength(int length) {
        // User can set length of password using Obj.setLenth(length)
        this.length = length;
    }

    // By default this class generates the password with usage all the character
    private Boolean useLower=true, useUpper=true, useDigit=true, useSpecialChar=true;

    // Empty constructor
    public PasswordGenerator() {
    }

    // Constructor which takes all type of char usage boolean
    public PasswordGenerator(Boolean useLower, Boolean useUpper, Boolean useDigit, Boolean useSpecialChar) {
        this.useLower = useLower;
        this.useUpper = useUpper;
        this.useDigit = useDigit;
        this.useSpecialChar = useSpecialChar;
    }

    /* Overriding the Chardigits methods
     * Any one who use this class must set the chars and digits
     */
    @Override
    public String getDigit() {
        return "0123456789";
    }

    @Override
    public String getLowercase() {
        return "abcdefghijklmnopqrstuvwxyz";
    }

    @Override
    public String getSpecialChar() {

        return "!@#$%^&*()_+~?";
    }

    @Override
    public String getUpperCase() {
        String upperCase = getLowercase().toUpperCase();
        return upperCase;
    }
    // Arraylist which contain all catagories of using in generating the password
    private  final ArrayList<String> charChats=new ArrayList<>();
    private String generatePassword(){
        /* The method which generates the password
         * If the length is less than 4 method don't generate any password
         * Method use Random for generating the password
         */
        if(length<4){
            return "You must create at least 4 digit password";
        }
        char[] password=new char[length];
        Random random = new Random(System.nanoTime());

        // Collection of categories
        getCharUses();
        // Building the password
        String specialChar=getSpecialChar();
        for(int i=0;i<length;i++){
            /* We add all catagories such as lower case
             * upper case , digits and Special char string in a Arraylist
             */
            String charChat;
            /* The random simply takes any of cases string and
             * put them in charChat string since this work
             * is done by random so every time in charchat string
             * different type of case will stored.
             */
            charChat= charChats.get(random.nextInt(charChats.size()));
            /* We again use random for getting
             * a random character from charChat string .
             */
            password[i]=charChat.charAt(random.nextInt(charChat.length()));
        }
        // Returning the password
        return new String(password);
    }
    private void getCharUses(){
        /* This method set the Arraylist

         */
        charChats.clear();
        if(useUpper){
            charChats.add(getUpperCase());
        }
        if(useLower){
            charChats.add(getLowercase());
        }
        if(useDigit){
            charChats.add(getDigit());
        }
        if(useSpecialChar){
            charChats.add(getSpecialChar());
        }
    }

    /* User can set all the cases in runtime
     * with the help of these setters
     */
    public void setUseLower(Boolean useLower) {
        this.useLower = useLower;
    }

    public void setUseUpper(Boolean useUpper) {
        this.useUpper = useUpper;
    }

    public void setUseDigit(Boolean useDigit) {
        this.useDigit = useDigit;
    }

    public void setUseSpecialChar(Boolean useSpecialChar) {
        this.useSpecialChar = useSpecialChar;
    }
}