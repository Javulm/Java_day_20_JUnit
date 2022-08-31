package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
	public static boolean isValidFirstName(String firstName) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
		return pattern.matcher(firstName).matches();
	}
	public static boolean isValidLastName(String lastName) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-zA-z0-9]{2,}$");
		return pattern.matcher(lastName).matches();
	}
	public static boolean isValidPhoneNo(String phoneNo) {
		Pattern pattern = Pattern.compile("^[0-9]{1,2} \\d{10}$");
		return pattern.matcher(phoneNo).matches();
	}
	public static boolean isValidEmail(String email) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
		return pattern.matcher(email).matches();
	}
	public static void main(String[] args) {
		System.out.println(isValidFirstName("Javul"));
		System.out.println(isValidLastName("Mulla"));
		System.out.println(isValidPhoneNo("91 9876543210"));
		System.out.println(isValidEmail("javulmulla8@gmail.com"));
	}
}
