package com.codingdojo;

public class BankTest {

	public static void main(String[] args) 
	{
		//Create 3 bank accounts
		Account account1= new Account();
		Account account2= new Account();
		Account account3= new Account();
		
		// - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
		
		account1.deposit(1000);
		//System.out.println("Total balance of account1 is : "+ account1.getBalance());
		account2.deposit(2000);
		account3.deposit(3000);

		// Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
		
		account1.withdraw(100);
		System.out.println("Total balance of account1 is : "+ account1.getBalance());
		account2.withdraw(200);
		System.out.println("Total balance of account2 is : "+ account2.getBalance());
		account3.withdraw(300);
		System.out.println("Total balance of account3 is : "+ account3.getBalance());
		System.out.println(account2.getSavingsBalance());
		
		System.out.println("Total number of accounts created so far is :" +Account.getAccounts());
	}

}
