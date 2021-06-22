package runner;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import generator.Generator;

public class runner {
		//function to print the randomly generated passwords
	private static void printArray(String[] arr) throws IOException {
		for (int i = 0; i < arr.length; i++) {
			StringSelection stringSelection = new StringSelection(arr[i]);

			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);
			Runtime runtime = Runtime.getRuntime();
			Process p = runtime.exec(new String[] { "sh", "-c", "echo" + arr[i] + " | xclip -selection clipboard" });
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		// passing the arguments to main method
		try {
             
			int total = Integer.parseInt(args[1]);

			int length = Integer.parseInt(args[3]);

			// the array that store the passwords

			String[] randomPasswords = new String[total];
			randomPasswords = Generator.storePassword(total, length);

			printArray(randomPasswords);
		}
		// if user need help or there is an error or exception
		catch (Exception e) {
			String[] randomPasswords = new String[1];
			randomPasswords = Generator.storePassword(1, 8);

			printArray(randomPasswords);
			
			System.out.println('\n'+"If you want to generate 'n' number of password"+'\n'+"java -jar passgen.jar -n -l " + '\n' + "-n :number of password you want generate" + '\n'
					+ "-l :length of password you want generate" + '\n' + "passgen.jar --help : To know the commands" + '\n'
					+ "java -jar passgen.jar -n 10 -l 8" + '\n' + "It will generate 10 random Passwords of length 8");

		}

	}

}
