package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean isValidUserName(String firstName) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
		return pattern.matcher(firstName).matches();
	}
	public static void main(String[] args) {
		String str1 = "Javul";
		 System.out.println(isValidUserName(str1));
	}
}
