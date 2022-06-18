package com.dxytech.services;


import java.util.Random;
import java.util.Scanner;

import com.dxytech.models.Employee;

public class CredentialService {
    public String generatePassword(){
         String password = new String();
         String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
         String specialCharacters = "!@#$";
         String numbers = "1234567890";
         Random randomGenerator = new Random();
            //any modifier is not allowed?? why??
            for(int i = 0; i< 9; i++){
                int charChoice = randomGenerator.nextInt(4);
                switch (charChoice) {
                    case 0:
                    password += capitalCaseLetters.charAt(randomGenerator.nextInt(26));
                    break;
                    case 1:
                    password += lowerCaseLetters.charAt(randomGenerator.nextInt(26));
                    break;
                    case 2:
                    password += specialCharacters.charAt(randomGenerator.nextInt(3));
                    break;
                    case 3:
                    password += numbers.charAt(randomGenerator.nextInt(10));
                    break;

                        
                
                    default:
                        break;
                }
            }
        return password;
    }
    public String generateEmailAddress(Employee newRecruit){
        String emailId = newRecruit.getEmployeeFirstName().toLowerCase()+newRecruit.getEmployeeLastName().toLowerCase();
        System.out.println("----Generating Email ID----");
        System.out.println();
        System.out.println("Please enter department from the following:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        try(Scanner departmentScanner = new Scanner(System.in)){
            switch(departmentScanner.nextInt()){
                case 1:
                newRecruit.setDepartment("Technical");
                emailId += "@tech.dxytech.com";
                break;
                case 2:
                newRecruit.setDepartment("Administrative");
                emailId += "@admin.dxytech.com";
                break;
                case 3:
                newRecruit.setDepartment("Human Resource");
                emailId += "@hr.dxytech.com";
                break;
                case 4:
                newRecruit.setDepartment("Legal");
                emailId += "@legal.dxytech.com";
                break;
                default:
                System.out.println("Error in input choice");
                break;
            }

        }catch(Exception e){
            System.err.println("Error Occured in I/O Operations: "+e.getMessage());
        }
        return emailId;

    }
    public void showCredentials(Employee newRecruit){
        System.out.printf("Dear %s, your generated credentials are as follows:\n", newRecruit.getEmployeeFirstName());        
        System.out.println();
        System.out.printf("Email ---> \"%s\"\n",newRecruit.getEmailId());
        System.out.printf("Password ---> \"%s\"\n",newRecruit.getPassword());
        


    }
}
