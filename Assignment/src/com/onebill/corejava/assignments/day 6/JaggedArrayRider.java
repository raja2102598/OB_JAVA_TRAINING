package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

public class JaggedArrayRider {

	public static void main(String[] args) {
		int[][] riders = new int[2][];
		riders[0] = new int[5];
		riders[1] = new int[5];
		Scanner sc = new Scanner(System.in);
		int j=0;
		int exit=1;
		while(exit==1) {
		System.out.println("Are you a rider ?\n ( 1: Yes  0: No)");
		int rider_choice = sc.nextInt();
		int km;
		if(rider_choice==1) {
			System.out.println("Enter your choice\n (1: WeekDays 2 :WeekEnds 3:Display");
			int ch1 = sc.nextInt();
			switch(ch1) {
			case 1 :
				System.out.println("Enter your Km :");
				km = sc.nextInt();
				riders[0][j]=km;
				j++;
				break;
			case 2 :
				System.out.println("Enter your Km :");
				km = sc.nextInt();
				riders[1][j]=km;
				j++;
				break;
			case 3:
				System.out.println(" Week Days Riders Km's");
				for(int i=0;i<riders[0].length;i++)
					System.out.print(" "+riders[0][i]);
				System.out.println();
				System.out.println(" Week End Riders Km's");
				for(int i=0;i<riders[1].length;i++)
					System.out.print(" "+riders[1][i]);
				System.out.println();
				break;
			default :
				System.out.println("Wrong choices");
				break;
			}
		}
		else 
			exit=0;
		}
	}

}