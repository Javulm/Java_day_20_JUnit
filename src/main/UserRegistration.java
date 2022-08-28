package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean isValidfirstName(String firstName) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
		return pattern.matcher(firstName).matches();
	}
	public static boolean isValidlastName(String lastName) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
		return pattern.matcher(lastName).matches();
	}
	public static boolean isValidPhoneNo(String phoneNo) {
		Pattern pattern = Pattern.compile("^[0-9]{1,2} \\d{10}$");
		return pattern.matcher(phoneNo).matches();
	}
	public static void main(String[] args) {
		System.out.println(isValidfirstName("Javul"));
		System.out.println(isValidlastName("Mulla"));
		System.out.println(isValidPhoneNo("91 9876543210"));
	}
}
