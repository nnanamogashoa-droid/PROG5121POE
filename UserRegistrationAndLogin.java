/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.userregistrationandlogin;

/**
 *
 * @author Student
 */
import java.util.Scanner;
import java.util.regex.Pattern;


public class UserRegistrationAndLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //enter the user's name
        System.out.println("Enter your first name: ");
        String fname = input.nextLine();
        
        //enter the user's last name 
        System.out.println("Enter your last name: ");
        String lname = input.nextLine();
        
        /**
     * This method checks if the username is valid.
     * A valid username must:
     * - Be exactly 5 characters long
     * - Contain an underscore (_)
     */
       String username = "";
       boolean validUsername = false;
       while (!validUsername){
           System.out.println("Enter a username (must contain an underscore'_' and be 5 characters long):  ");
           username = input.nextLine();
           if (username.length()==5 && username.contains("_")){
               validUsername = true;
           } else {
               System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
           }
       }
       
       /**
     * This method checks if the password is valid.
     * A valid password must:
     * Be at least 8 characters long
     * Contain at least one uppercase letter
     * Contain at least one number
     * Contain at least one special character
     */
       String password = "";
      boolean validpassword = false;
    
       while (!validpassword){
           System.out.println("Enter a password(8 characters in length, one special character, one number, one uppercase): ");
           password = input.nextLine();
           if (validpassword = false){
               System.out.println("Password is not correctly formatted; please ensure that the password contains at least 8 characters, a capital letter,a number, and a special character.");
           } else{
               validpassword = true;
           }
       }
       
        /**
     * This method checks if the cellphone number is valid.
     * A valid SA number must:
     * - Start with +27
     * - Be 12 characters long
     * - Contain only digits after +27
     * @param cell The cellphone number entered by the user
     * @return true if valid, false if not valid
     */
        String phonenumber = " ";
        boolean validPhonenumber = false;
        while(!validPhonenumber){
            System.out.println("Enter your cellphone nummber (must start with '+27'): ");
            phonenumber = input.nextLine();
            if (phonenumber.startsWith("+27") && phonenumber.length() == 12){
            validPhonenumber =true;
            
                for (int i = 3; i < phonenumber.length(); i++) {
                    if (!Character.isDigit(phonenumber.charAt(i))) {
                    validPhonenumber = false;
                    }
                }
            }else{
                System.out.println("Cellphone number incorrectly formatted or does not contain SA-national code.");
            }
        }
       System.out.println("\n---- Registration Successful! ----");
         System.out.println("First name: "+ fname);
         System.out.println("Last name: "+ lname);
         System.out.println("Username: "+ username);
         System.out.println("Passsword: "+ password);
         System.out.println("Cellphone number: "+ phonenumber);
         
       //Login 
       System.out.println("\n---- Login ----");
       
       while (true) {
            System.out.print("Enter username: ");
            username = input.nextLine();

            System.out.print("Enter password: ");
            password = input.nextLine();

            if (username.equals(username) && password.equals(password)) {
                System.out.println("Welcome " + fname + " " + lname + " it is great to see you again.");
                break;
            } else {
                System.out.println("Username or password incorrect, please try again.");
            }
        }
    }
    // Validation of password  based on given criteria
   private static boolean isValidpassword( String password){
    if (password.length()< 8){
        return false;
    }
    
    boolean hasSpecial = false;
    boolean hasNumber = false;
    boolean hasUpperCase = false;
    
    
    for (int i = 0; i < password.length(); i++){
        char c = password.charAt(i);
        
        if (Character.isUpperCase(c)){
            hasUpperCase= true;
        }else if (Character.isDigit(c)){
            hasNumber = true;
        }else if (!Character.isLetterOrDigit(c)){
            hasSpecial = true;
        }
    }
    return hasSpecial && hasNumber && hasUpperCase;
} 
}
    
