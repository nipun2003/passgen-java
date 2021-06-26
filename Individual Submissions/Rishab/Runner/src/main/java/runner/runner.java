package runner;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import generator.Generator;

public class runner {
	// function to print the randomly generated passwords
	private static void printArray(String[] arr) throws IOException {
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}
	//function to automatic copy

	public static void copying(String[] arr) throws IOException {
		for (int i = 0; i < arr.length; i++) {
			StringSelection stringSelection = new StringSelection(arr[i]);

			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, null);

			try {
				Runtime runtime = Runtime.getRuntime();
				Process p = runtime
						.exec(new String[] { "sh", "-c", "echo" + arr[i] + " | xclip -selection clipboard" });
			} catch (Exception e) {
				System.out.print("");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// passing the arguments to main method
		try {

			// the array that store the passwords
			if (args.length == 4) {
				int total = Integer.parseInt(args[1]);

				int length = Integer.parseInt(args[3]);

				String[] randomPasswords = new String[total];
				randomPasswords = Generator.storePassword(total, length);
				runner.copying(randomPasswords);

				printArray(randomPasswords);
			} else if (args.length == 1) {
				System.out.println('\n' + "If you want to generate 'n' number of password" + '\n'
						+ "java -jar passgen.jar -n -l " + '\n' + "-n :number of password you want generate" + '\n'
						+ "-l :length of password you want generate" + '\n'
						+ "passgen.jar --help : To know the commands" + '\n' + "java -jar passgen.jar -n 10 -l 8" + '\n'
						+ "It will generate 10 random Passwords of length 8");

			} else {
				String[] randomPasswords = new String[1];
				randomPasswords = Generator.storePassword(1, 8);
				runner.copying(randomPasswords);

				printArray(randomPasswords);
			}

		}
		// if user need help or there is an error or exception
		catch (Exception e) {

			System.out.println('\n' + "If you want to generate 'n' number of password" + '\n'
					+ "java -jar passgen.jar -n -l " + '\n' + "-n :number of password you want generate" + '\n'
					+ "-l :length of password you want generate" + '\n' + "passgen.jar --help : To know the commands"
					+ '\n' + "java -jar passgen.jar -n 10 -l 8" + '\n'
					+ "It will generate 10 random Passwords of length 8");

		}

	}

}
