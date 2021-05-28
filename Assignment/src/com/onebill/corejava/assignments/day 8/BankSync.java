package com.onebill.corejava.assignments.day8;

import java.util.Scanner;

class MinAmountException extends Exception {
	public MinAmountException(String s) {
		super(s);
	}
}

class LowBalanceException extends Exception {
	public LowBalanceException(String s) {
		super(s);
	}
}

class NegativeAmountException extends Exception {
	public NegativeAmountException(String s) {
		super(s);
	}
}

public class BankSync{
	static int balance = 0;
	synchronized static void deposit(int depo) {
		balance+=depo;
		System.out.println("Deposit Success\nUpdated Balance : " + balance);
	}
	synchronized static void withdraw(int withd) {
		balance -= withd;
		System.out.println("Withdraw Success\nUpdated Balance : Rs." + balance);
	}

	public static void main(String[] args) {
		StringBuilder Transactionlog = new StringBuilder();
		Scanner s = new Scanner(System.in);
		int exit = 0;
		while (exit == 0) {
			System.out.println(
					"Welcome To The Bank\nEnter Your Choice \n1.Deposit\n2.Withdraw\n3.Transaction History\n4.Show Balance\n5.exit\n");
			int ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter the amount to deposit: ");
				int depo = s.nextInt();
				new Thread() {
					public void run() {
						deposit(depo);						
						Transactionlog.append("Deposit : Rs." + depo + "\n");
					};
				}.start();
				break;
			case 2:
				System.out.print("Enter the amount to withdraw: ");
				int withd = s.nextInt();
				if (balance < withd || balance < 1000) {
					try {
						throw new LowBalanceException("Not Enough balance to withdraw");
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} else if (!(balance - 1000 > 0) || !(balance - withd > 1000)) {
					try {
						throw new MinAmountException("You must have minimum balance amount of Rs.1000 in your account");
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} else if (withd < 0) {
					try {
						throw new NegativeAmountException("Don't enter negative values");
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} else {
					new Thread() {
						public void run() {
							withdraw(withd);						
							Transactionlog.append("Withdrawl : Rs." + withd + "\n");
						};
					}.start();					
				}

				break;
			case 3:
				System.out.println("Transactions History \n");
				System.out.println(Transactionlog);
				break;
			case 4:
				System.out.println("Current Balance is : Rs." + balance );
				break;
			case 5:
				exit = 1;
				break;
			}

		}
	}

}
