package com.Suva.strings;

import java.util.Scanner;

public class vowelsconsocount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		System.out.println("Enter the String: ");
		n=sc.next();
		int vowels=0, conso=0;
		
		// To count number of vowels and consonants in a string
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			vowels++;
		else if (ch >= 'A' && ch <= 'Z') 
				conso++;
		}
		System.out.println("Total vowels are: " + vowels);
		System.out.println("Total consonants are: " + conso);
	}			
}
