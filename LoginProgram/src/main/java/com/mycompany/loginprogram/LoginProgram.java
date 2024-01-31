/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginprogram;

/**
 *
 * @author Tyson
 */
import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        String username = "testuser";
        String pass = "testpass";

        // Code for 3 attempts
        try (Scanner scanner = new Scanner(System.in)) {
            // Code for 3 attempts
            for (int attempt = 1; attempt <= 3; attempt++) {
                System.out.println("Attempt " + attempt);
                
                // Input your username
                System.out.print("Enter username: ");
                String enteredUsername = scanner.nextLine();
                
                // Input your password
                System.out.print("Enter password: ");
                String enteredPassword = scanner.nextLine();
                
                if (username.equals(enteredUsername) && pass.equals(enteredPassword)) {
                    System.out.println("Login successful!");
                    break; // Exit the loop if credentials are correct
                } else {
                    System.out.println("Login failed. Please try again.");
                }
            }
        }
    }
}
