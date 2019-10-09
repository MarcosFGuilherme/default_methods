package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		System.out.println("Payment after 3 months:");
		System.out.println("[" + String.format("%.2f", amount) + ", " + months + "]");
		
		sc.close();
	}

}
