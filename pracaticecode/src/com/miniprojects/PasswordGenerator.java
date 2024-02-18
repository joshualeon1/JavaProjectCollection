package com.miniprojects;
import java.util.Random;

public class PasswordGenerator{

	public static void main(String[] args) {

		int length = 12; // password length
		
        System.out.println(generatePswd(length));

	}//end Main
	
	static String generatePswd(int len) {
        System.out.println("Your Password:");
        
        //	Separating the different chars into variables:
        String charsUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String charsLow = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!@#$%^&*_=+-/€.?<>)";
        
        //	We gather all of the chars together in the string 'passSymbols' below:
        String passSymbols = charsUp + charsLow + nums + symbols;
        Random rdm = new Random();
        
        //	We'll return our password as an array of chars of length (len) 10 which we initially passed in
        String password = "";
        
        //	The 'rdm.nextInt()' returns a value between 0 and the parameter value given, in our instance below, the parameter is 'passSymbols.length()' which holds a value of '81'
        for (int i = 0; i < len; i++)
            password += passSymbols.charAt(rdm.nextInt(passSymbols.length()));
        return password;
    }//end generatePswd

}//end Class
