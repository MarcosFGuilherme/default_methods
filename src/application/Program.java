package application;

import java.util.Scanner;

import model.interfaces.InterestService;
import model.service.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new UsaInterestService(1.0);
		
		System.out.println("Contract : [" + String.format("%.2f", amount) + ", " + months + "]");
		System.out.println("Payment after 3 months:");
		System.out.println(String.format("%.2f", is.payment(amount, months)));
		
		sc.close();
	}

}
