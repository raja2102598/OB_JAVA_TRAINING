package com.onebill.corejava.basics.assignments.day1;

public class Truthtable {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("| P \t| Q\t| P&Q\t| P|Q\t| P^Q\t|");
//		System.out.println("|  \t| \t| \t| \t|\t|");
		System.out.println("-----------------------------------------");
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				System.out.println("| "+ChangeToTF(j)+"\t| "+ChangeToTF(i)+"\t| "+ChangeToTF(i&j)+" \t| "+ChangeToTF(i|j)+" \t| "+ChangeToTF(i^j)+"\t|");
			}
		}
		System.out.println("-----------------------------------------");
		
	}
	public static String ChangeToTF(int value) {
		if(value==0) {
			return "F";
		}else {
			return "T";
		}
	}

}
