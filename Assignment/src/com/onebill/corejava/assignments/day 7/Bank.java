package com.onebill.corejava.assignments.day7;

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

public class Bank {
	static int balance = 0;

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
				balance += depo;
				System.out.println("Deposit Success\nUpdated Balance : " + balance);
				Transactionlog.append("Deposit : Rs." + depo + "\n");
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
					Transactionlog.append("Withdrawl : Rs." + withd + "\n");
					balance -= withd;
					System.out.println("Withdraw Success\nUpdated Balance : Rs." + balance);
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
