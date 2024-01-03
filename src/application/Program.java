package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Guest;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int qtdRented = scanner.nextInt();
		
		Guest[] vect = new Guest[10];
				
		for (int i = 0; i < qtdRented; i ++) {
			scanner.nextLine();
			System.out.println("RENT #" + (i +1) + " :");
			
			System.out.println("Name: ");
			String name = scanner.nextLine();
			
			System.out.println("E-mail");
			String email = scanner.nextLine();
			
			System.out.println("Wich room? ");
			int room = scanner.nextInt();
			
			vect[room] = new Guest(name, email);
		}
		
		System.out.println("Busy romms:");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}
		
		
		
		scanner.close();

	}

}
