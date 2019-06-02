package utils;

public final class Utils {
	private Utils() {
		throw new AssertionError();
	}
	
	public static String format(int i) {
        String result = String.valueOf(i);
        if (result.length() == 1) {
            result = "0" + result;
        }
        return result;
    }
}