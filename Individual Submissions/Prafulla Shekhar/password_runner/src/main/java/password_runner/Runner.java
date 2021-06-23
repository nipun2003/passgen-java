package password_runner;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import password_generator.Password_creater;

public class Runner {

	public static void main(String[] args) {

		// n is the length of the password
		int n = 8;

		try {

			/*
			 * Accepting input in the form as args[0]= command (ie. -l, -help) args[1]=
			 * length of password to be generated
			 */
			if (!args[0].isEmpty()) {

				if (args[0].contentEquals("-l")) {
					n = Integer.parseInt(args[1]);

					/*
					 * Accepting password length greater than 4 and less than 300 n /= 0 will throw
					 * ArithmeticException and it will call help
					 */
					if (n < 4) {
						System.out.println("** it's unsecure to use password less than 4 digits **" + 
					                       "\nyou can use ");
						n = 8;
					} else if (n > 300) {
						System.out.println("** to large password **");
						help();
					}
					printpass(n);
				}else {
					help();
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You can also generate password of your required length" + 
			                   "\ngive command -h for help" +
					           "\n");
			try {
				printpass(8);
			} catch (IOException e1) {
			}

		} catch (Exception e) {
			help();
		}

	}

	/*
	 * use this function to print password and 
	 * get it copied in the clipboard and xclip
	 */
	public static void printpass(int n) throws IOException {

		// generates the random password
		String password = Password_creater.getPassword(n);
		System.out.println("Password: " + password);

		// copy to clipboard
		StringSelection stringSelection = new StringSelection(password);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		// copy to xclip
		Runtime runtime = Runtime.getRuntime();
		Process p = runtime.exec(new String[] { "sh", "-c", "echo" + password + " | xclip -selection clipboard" });

	}

	// function to print the help statements
	public static void help() {

		System.out.println("--help--Input format should be as below" + 
		                   "\njava -jar passgen.jar -l 10" + 
				           "\n" + 
				           "\n(where 10 is length of password in this case)" +
				           "\nThe generated password will automatically get copied" +
		                   "\n");

	}

}
