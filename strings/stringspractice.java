package com.Suva.strings;

import java.util.Scanner;

public class stringspractice {

public static void main ( String[] args) {
	Scanner sc = new Scanner(System.in);
    String s; //declaration of a string
    
 System.out.println("Enter a String: ");
 s=sc.next();
 
 System.out.println("\nHello " +s);
 System.out.println("\nLet's extract characters from the above string: \n");
 
 //To find the length of a string and to print each characters in the string
 for (int i=0; i< s.length(); i++)
 {
	 System.out.println(s.charAt(i));
 }
 
 //to print a string in upper and lower case
 System.out.println("\nTo upper case: "+ s.toUpperCase());
 System.out.println("To lower case "+ s.toLowerCase());
 
 //To concatenate a string
 String str1 = s.concat(" Arjun");  //str.concat is a function
 System.out.println("\nConcatenated string is: "+str1);
 
 //To replace a char in a string
 String str2=null;
 for (int i=0; i < str1.length(); i++)
 {
	 if ( str1.contains("u"))
	 {
		 str2 = str1.replace('u','i');
	 }
 }
 System.out.println("\nAfter replacing a char, the string is: "+str2);
	 }
 }
