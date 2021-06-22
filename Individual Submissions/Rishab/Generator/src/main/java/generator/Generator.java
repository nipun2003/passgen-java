package generator;

public class Generator {
	private static char randomCharacter() {
		int rand = (int) (Math.random() * 77);
		if (rand <= 9) {
			int number = rand + 48;
			return (char) (number);
		} else if (rand <= 24) {
			int special = rand + 23;
			return (char) (special);
		} else if (rand <= 50) {
			int uppercase = rand + 40;
			return (char) (uppercase);
		} else {
			int lowercase = rand + 46;
			return (char) (lowercase);
		}
	}
	public static String[] storePassword(int total,int length) {
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
       return randomPasswords;
   	 }
	

}
