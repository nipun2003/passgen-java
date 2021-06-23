package password_generator;

public interface generator_blueprint {

	public static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
	public static final String CHAR_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String CHAR_DIGITS = "01234567890123456789012345";
	public static final String CHAR_SPECIAL = "!!@@@@@##$%&&**()_+-=[]???";

	final String[] CHAR_BOX = { CHAR_LOWER, CHAR_UPPER, CHAR_DIGITS, CHAR_SPECIAL };

}
