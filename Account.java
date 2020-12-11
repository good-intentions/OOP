package simeon;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double yearInterestRate = 0;
	private Date dateCreated = new Date();
	
	
	Account(){
		setId(0);
		setBalance(0);
	
	}
	Account(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getYearInterestRate() {
		return yearInterestRate;
	}

	public void setYearInterestRate(double yearInterestRate) {
		Account.yearInterestRate = yearInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public static double getMonthlyInterestRate() {
		return yearInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() / 100;
	}
	public void withdraw(double sumToWithdraw){
		if(sumToWithdraw < 0 || balance < sumToWithdraw){
			System.out.println("Error");
			return;
		}
		balance -= sumToWithdraw;
	}
	public void deposit(double sumToDeposit){
		if(sumToDeposit < 0){
			System.out.println("Error");
			return;
		}
		balance += sumToDeposit;
	}
	
}