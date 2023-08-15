package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		Retangulo rect = new Retangulo();
		
		System.out.println("Enter rectangle with and height: ");
		rect.width = sc.nextDouble();
		rect.heigth = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();
	}
}
