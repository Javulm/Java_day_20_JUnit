package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	static Pattern pattern = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
	public static boolean isValidUserName(String testExpression) {
		Matcher m = pattern.matcher(testExpression);
		if (m.matches()) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String str1 = "Javul";
		 System.out.println(isValidUserName(str1));
	}
}
