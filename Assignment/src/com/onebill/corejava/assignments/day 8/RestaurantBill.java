package com.onebill.corejava.assignments.day8;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantBill {

	public static void main(String[] args) {
		ArrayList<String> menu=new ArrayList<String>();
		ArrayList<Integer> price=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		menu.add("Rice");
		menu.add("Dosa");
		menu.add("Briyani");
		menu.add("Chicken Fry");
		menu.add("Mutton Fry");
		menu.add("Fish Fry");
		price.add(60);
		price.add(20);
		price.add(150);
		price.add(60);
		price.add(120);
		price.add(25);
		System.out.println("Welcome to Our Restaurant\nHere is our menu");
		ArrayList<Integer> order=new ArrayList<Integer>(); 
		int i=1;
		for(String s1:menu) {
			System.out.println(i+". "+s1);
			i++;
		}
		System.out.println("Select your choice of food : (enter 0 to exit)");
		int temp=1;
		while(temp!=0) {
			int v=s.nextInt();
			if(v==0)
				temp=0;
			else
				order.add(v-1);
		}
//		System.out.println(order);
		int total=0;
		for(Integer j:order) {
			total+=price.get(j);
		}
		System.out.println("Your Bill amount is Rs."+total);
		System.out.println("Order Successfull! \nEnjoy your meal........");
		
	}

}
