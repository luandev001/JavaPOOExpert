package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Client c1 = new Client("Maria", "Maria@gmail.com");
		Client c2 = new Client("Maria", "Maria@gmail.com");
		
		String s1 = new String("test");
		String s2 = new String("test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		
		
		
		sc.close();

	}

}
