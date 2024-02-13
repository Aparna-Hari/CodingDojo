package com.codingdojo;

import java.util.Random;
import java.util.Scanner;

public class Account 
{
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private long accountNumber;
    
    
    
	// CONSTRUCTOR
    // Be sure to increment the number of accounts
    public Account()
    {
    	accounts++;
    	getRandomAccountNumber();
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
	public double getCheckingBalance() 
	{
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getAccounts() {
		return accounts;
	}

	public static void setAccounts(int accounts) {
		Account.accounts = accounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static void setTotalMoney(double totalMoney) {
		Account.totalMoney = totalMoney;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	//Create a private method that returns a random ten digit account number.
	
	private long getRandomAccountNumber() 
	{
		Random random = new Random();
		
		
		accountNumber = (long) (random.nextDouble() * 9_000_000_000L) + 1_000_000_000L;
			
		
		System.out.println(" Acc No. generated is : " + accountNumber);
		return accountNumber;
	}
    

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
	public double deposit(double amount) 
	{
		System.out.println("Please choose checkings or savings account you want to deposit to:");
		Scanner scanner =new Scanner(System.in);
		
		String accountType =scanner.next();
		
		if((accountType.equals("checking")) || (accountType.equals("checkings")))
		{
				
		 checkingBalance=checkingBalance+amount;
		}
		else 
		{
			savingsBalance = savingsBalance+amount;
			
		}
		 
		 totalMoney += checkingBalance+savingsBalance;
		 
		 System.out.println("total balance of all accounts is :" + totalMoney);
		 return totalMoney;
		
	}
	
	// withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
	
	public double withdraw(double amount)
	{
		System.out.println("Please choose checkings or savings account you want to withdraw from:");
		Scanner scanner =new Scanner(System.in);
		
		String accountType =scanner.next();
		
		if((accountType.equals("checking")) || (accountType.equals("checkings")))
		{
				
		 checkingBalance=checkingBalance-amount;
		}
		else 
		{
			savingsBalance = savingsBalance-amount;
			
		}
		 
		totalMoney -= amount;
		
		System.out.println("remaining balance of all accounts is :" + totalMoney);
		return totalMoney;
	}
	
	
    // getBalance
    // - display total balance for checking and savings of a particular bank account
	public double getBalance()
	{
		return checkingBalance+savingsBalance;
	}
}
