package com.bridgelabz;

import java.util.regex.Pattern;
@FunctionalInterface
interface UserDetailsValidationFI {
    boolean userDetails(String regex, String details);
    static void result(UserDetailsValidationFI ref, String regex, String details) {
        if (ref.userDetails(regex, details)) {
            System.out.println(details+ " is Valid Detail");
        }
        else {
            System.out.println(details+ " is Invalid Detail");
        }
    }
}
public class UserRegistrationLambdaExpression {
        public static void main(String[] args) {
            //		lambda expression to implement above functional interface abstract method.
            UserDetailsValidationFI userdetails = (regex, details) -> Pattern.matches(regex,details);
            System.out.println("first Name: ");
            UserDetailsValidationFI.result(userdetails,"^[A-Z][a-zA-Z]{2,}$","Javul" );
            UserDetailsValidationFI.result(userdetails,"^[A-Z][a-zA-Z]{2,}$","Javul.1" );
            System.out.println("Last Name: ");
            UserDetailsValidationFI.result(userdetails,"^[A-Z][a-zA-Z]{2,}$","Mulla" );
            UserDetailsValidationFI.result(userdetails,"^[A-Z][a-zA-Z]{2,}$","Mulla.1" );
            System.out.println("Phone No: ");
            UserDetailsValidationFI.result(userdetails,"^[0-9]{1,2} \\d{10}$","91 9876543210" );
            UserDetailsValidationFI.result(userdetails,"^[0-9]{1,2} \\d{10}$","91 9876543" );
            System.out.println("Email Address: ");
            UserDetailsValidationFI.result(userdetails,"^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?","javulmulla8@gmail.com" );
            UserDetailsValidationFI.result(userdetails,"^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?","javul.mulla@.gmail.com" );
            System.out.println("Password: ");
            UserDetailsValidationFI.result(userdetails,"^[A-Z][a-zA-Z1-9]{5,}[@$^][1-9]+$","Javulm@123");
            UserDetailsValidationFI.result(userdetails,"^[A-Z][a-zA-Z1-9]{5,}[@$^][1-9]+$","javulmulla");
        }
    }
