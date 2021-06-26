package password_generator;

import java.util.Random;

public class Password_creater implements generator_blueprint {

	// function to generate password from CHAR_BOX form interface generator_blueprint
	private static String generator(int password_length) {

		StringBuilder password = new StringBuilder(password_length);

		Random random = new Random(System.nanoTime());

		for (int i = 0; i < password_length; i++) {
			password.append(CHAR_BOX[random.nextInt(4)].charAt(random.nextInt(26)));
		}

		return new String(password);
	}

	/*
	 * function to generate password through private function generator use this
	 * public getPassword() function to return password as String
	 */
	public static String getPassword(int password_length) {
		String s = new String(generator(password_length));
		return s;

	}

}
