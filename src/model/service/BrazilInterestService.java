package model.service;

public class BrazilInterestService {
	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double payment(double amount, int months ) {
		double payment = 0.0;
		payment = amount * Math.pow((1 + interestRate / 100), months);
		return payment;
	}
}
